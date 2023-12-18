import java.io.PrintWriter;
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

        int[][] activities = new int[n][];
        for (int i = 0; i < n; i++) {
            activities[i] = new int[3];
            activities[i][0] = scanner.nextInt();
            activities[i][1] = scanner.nextInt();
            activities[i][2] = scanner.nextInt();
        }

        // dp[i][j] denote max points of day i-th if playing activity j
        int[][] dp = new int[n][3];

        // First day
        dp[0][0] = activities[0][0];
        dp[0][1] = activities[0][1];
        dp[0][2] = activities[0][2];

        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(dp[i-1][1] + activities[i][0], dp[i-1][2] + activities[i][0]);
            dp[i][1] = Math.max(dp[i-1][0] + activities[i][1], dp[i-1][2] + activities[i][1]);
            dp[i][2] = Math.max(dp[i-1][0] + activities[i][2], dp[i-1][1] + activities[i][2]);
        }

        for (int i = 0; i < n; i++) {
            writer.println(String.format("%d %d %d", dp[i][0], dp[i][1], dp[i][2]));
        }

        int ans = Math.max(dp[n-1][0], Math.max(dp[n-1][1], dp[n-1][2]));
        writer.println(ans);
    }

}
