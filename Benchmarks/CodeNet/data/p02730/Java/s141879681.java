
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        if (isP(s) && isP(s.substring(0, (s.length() - 1) / 2)) &&
                isP(s.substring((s.length() + 3) / 2 - 1))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    public static boolean isP(String s) {
        for (int i = 0, j = s.length() - 1; i < j; ++i, --j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
