import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final int INF = (int) 1e9 + 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        solve(scanner, writer);
        scanner.close();
        writer.close();
    }

    public static void solve(Scanner scanner, PrintWriter writer) {
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        int[] weights = new int[n];
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            weights[i] = scanner.nextInt();
            values[i] = scanner.nextInt();
        }

        // dp[i][j] denote maximum sum of values using first i items and total weights is j
        // recurrence: dp[i][j] = max(dp[i-1][j-weight[i]] + values[i], dp[i-1][j])
        long[][] dp = new long[n+1][];
        for (int i = 0; i <= n; i++) {
            dp[i] = new long[w + 1];
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= w; j++) {
                if (j - weights[i-1] >=0 ){
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - weights[i-1]] + values[i-1]);
                }
                dp[i][j] = Math.max(dp[i][j], dp[i - 1][j]);
            }
        }

        long ans = 0;
        for (int i = 0; i <= w; i++) {
            ans = Math.max(ans, dp[n][i]);
        }

        writer.println(ans);
    }
}
