package com.android.cy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvPushTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvPushTime = (TextView) findViewById(R.id.tvPushTime);

        findViewById(R.id.setTimeLayout).setOnClickListener(view -> {

            TimeRangePickerDialog dialog = new TimeRangePickerDialog(MainActivity.this, tvPushTime.getText().toString(), new TimeRangePickerDialog.ConfirmAction() {
                @Override
                public void onLeftClick() {
                }

                @Override
                public void onRightClick(String startAndEndTime) {
                    tvPushTime.setText(startAndEndTime);
                }
            });

            dialog.show();

        });
    }
}
