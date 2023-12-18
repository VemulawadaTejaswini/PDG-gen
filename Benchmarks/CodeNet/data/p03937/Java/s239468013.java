import java.util.*;
import java.util.regex.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        System.out.println(solve(scanner.nextInt(), scanner.nextInt()) ? "Possible" : "Impossible");
    }

    static boolean solve(int h, int w) {
        for (int i = 0, x = 0; i < h; i++) {
            String a = scanner.next();
            Matcher matcher = Pattern.compile("(\\.{" + x + "}#+)\\.*").matcher(a);
            if (!matcher.find())
                return false;
            x = matcher.group(1).length() - 1;
        }
        return true;
    }
}