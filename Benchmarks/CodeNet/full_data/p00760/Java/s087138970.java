
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int my = 1000;
        int mm = 1;
        int md = 1;
        int hito = scanner.nextInt();
        for (int poi = 0; poi < hito; poi++){
            int y = scanner.nextInt();
            int m = scanner.nextInt();
            int d = scanner.nextInt();

            int days = 0;
            for (int year = y + 1; year < my; ++year) {
                if (year % 3 == 0) {
                    days = days + 200;
                } else {
                    days = days + 195;
                }
            }

            int tep = d;
            for (int month = 1; month < m; ++month) {
                if (y % 3 == 0 || month % 2 == 1) {
                    tep += 20;
                } else {
                    tep += 19;
                }
            }

            if (y % 3 == 0) {
                days += 200 - tep;
            } else {
                days += 195 - tep;
            }

            System.out.println(days + 1);
        }
    }
}



