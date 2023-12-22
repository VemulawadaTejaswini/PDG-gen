import java.io.IOException;
import java.lang.Integer;
import java.lang.System;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        String week[] = new String[7];
        week[0] = "Tuesday";
        week[1] = "Wednesday";
        week[2] = "Thursday";
        week[3] = "Friday";
        week[4] = "Saturday";
        week[5] = "Sunday";
        week[6] = "Monday";

        while (s.hasNext()) {
            int month = s.nextInt();
            int day = s.nextInt();
            if(month == 0 && day == 0) break;

            Date date = DateFormat.getDateInstance().parse("2004/" + month + "/" + day);

            //フォーマットパターンを指定して表示する
            SimpleDateFormat sdf = new SimpleDateFormat("F");
            int week_int = Integer.parseInt(sdf.format(date));
            System.out.println(week[week_int]);
        }
    }
}