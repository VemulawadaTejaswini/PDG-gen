import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static void solve(Scanner scanner) {
        String s = scanner.nextLine();
        // remaining combinations at i with num of picked chars j
        long[][] dp = new long[s.length() + 1][4];
        dp[s.length()][3] = 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int cn = charToNum(c);
            long m = c == '?' ? 3 : 1;
            for (int j = 0; j < 3; j++) {
                dp[i][j] = (m * dp[i + 1][j]) % 1_000_000_007;
                if (cn == j || c == '?') {
                    dp[i][j] = (dp[i][j] + dp[i + 1][j + 1]) % 1_000_000_007;
                }
            }
            dp[i][3] = (m * dp[i + 1][3]) % 1_000_000_007;
        }
        System.out.println(dp[0][0]);
    }

    static int charToNum(char c) {
        if (c == '?')
            return Integer.MAX_VALUE;
        return c - 'A';
    }

}