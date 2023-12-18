
import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        String[] dayoftheweek = new String[8];
        String str = scanner.nextLine();
        int result = 0;

        for(int i = 1; i <= 7; i++) {
            dayoftheweek[i] = DayOfWeek.of(i).getDisplayName(TextStyle.SHORT_STANDALONE, Locale.US).toUpperCase();
            if (dayoftheweek[i].equals(str)) {
                result = 7 - i;
            }
        }
        System.out.println(result);
    }
}
