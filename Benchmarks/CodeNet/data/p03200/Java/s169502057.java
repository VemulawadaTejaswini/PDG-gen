
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final char[] s = scanner.nextLine().toCharArray();
        int result = 0;
        int whiteCount = 0;
        for (int i = s.length - 1; i >= 0; i--) {
            if (s[i] == 'W') {
                whiteCount++;
            } else {
                result += whiteCount;
            }
        }

        System.out.println(result);
    }
}
