import java.util.*;
import java.util.function.ToDoubleFunction;


public class Main {
    private static final String ex = "9999999999";
//    private static final String ex = "125";

    public static void main(String[] args) {
        solve(new Scanner(System.in));
//        solve(new Scanner(ex));
    }

    private static void solve(Scanner scanner) {
        String S = scanner.nextLine();

        long num[][] = new long[S.length()][S.length()];
        for (int i = 0; i < S.length(); i ++) {
            for (int j = i; j < S.length(); j ++) {
                num[i][j] = Long.parseLong(S.substring(i, j + 1));
            }
        }

        long sum = 0;
        for (int i = 0; i < S.length(); i ++) {
            for (int j = i; j < S.length(); j ++) {
                long shift;
                if (i == 0 && j == S.length() - 1) {
                    shift = 0;
                } else if (i == 0 || j == S.length() - 1) {
                    shift = S.length() - 1 - (j - i + 1);
                } else {
                    shift = S.length() - 1 - (j - i + 2);
                }

                if (shift < 0) throw new RuntimeException();

                long numPattern = 1 << shift;
                sum += num[i][j] * numPattern;
            }
        }

        System.out.println(sum);
    }
}
