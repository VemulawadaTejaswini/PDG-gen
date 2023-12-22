import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final String[] dayS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        while (true) {
            int year = 2004;
            int month = Integer.parseInt(sc.next());
            int date  = Integer.parseInt(sc.next());

            if (month == 0 && date == 0) break;

            if (month == 1 || month == 2) {
                year--;
                month += 12;
            }

            int day = (year + year / 4 - year / 100 + year / 400 + (13 * month + 8) / 5 + date) % 7;

            System.out.println(dayS[day]);
        }
    }
}