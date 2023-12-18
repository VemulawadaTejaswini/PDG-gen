

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(final String [] args) {
        final Scanner scanner = new Scanner(System.in);
        final String input = scanner.next();
        final PrintWriter pw = new PrintWriter(System.out);

        if (input.charAt(0) != '1' || input.charAt(input.length() - 1) != '0') {
            pw.println(-1);
            return;
        }
        for (int i = 0, j = input.length() - 2; i < j; ++i, --j) {
            if (input.charAt(i) != input.charAt(j)) {
                pw.println(-1);
                return;
            }
        }
        int currentEnd = 1;
        for (int i = 1; i < input.length(); ++i) {
            if (input.charAt(i - 1) == '1') {
                pw.println(currentEnd + " " + (i + 1));
                currentEnd = (i + 1);
            } else {
                pw.println(currentEnd + " " + (i + 1));
            }
        }
    }
}
