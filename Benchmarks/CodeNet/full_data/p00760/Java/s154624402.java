import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        int dai = 20 * 10;
        int sho = dai - 5;

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            int days = 0;
            int year = sc.nextInt();
            int mth = sc.nextInt();
            int day = sc.nextInt();

            if ( 1000 < year || 10 < mth || 20 < day ) {
                break;
            }
            //生まれた年
            if (year % 3 == 0) {
                days += 20 - day + 1;
                for (int j = mth + 1; j <= 10; j++) {
                    days += 20;
                }
            } else {
                if (mth % 2 == 0) {
                    days += 19 - day + 1;
                } else {
                    days += 20 - day + 1;
                }
                for (int j = mth + 1; j <= 10; j++) {
                    if (j % 2 == 0) {
                        days += 19;
                    } else {
                        days += 20;
                    }
                }
            }
            //翌年以降
            for (int j = year + 1; j < 1000; j++) {
                if (j % 3 == 0) {
                    days += dai;
                } else {
                    days += sho;
                }
            }
            System.out.println(days);
        }

        sc.close();
    }
}

