import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int X = sc.nextInt();

            Calendar calendar = Calendar.getInstance();
            calendar.set(2017, Calendar.SEPTEMBER, X);
            System.out.println(calendar.getDisplayName(
                Calendar.DAY_OF_WEEK, Calendar.SHORT, Locale.ENGLISH).toLowerCase());
        }
    }
}

