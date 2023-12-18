import java.io.PrintWriter;
import java.util.*;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        int n = in.nextInt();
        int[][] h = new int[n][3];
        for (int i=0; i < n; i++) {
            h[i][0] = in.nextInt();
            h[i][1] = in.nextInt();
            h[i][2] = in.nextInt();
        }

        int[][] dp = new int[n+1][3];
        int last = -1;
        // i = day
        for (int i=0; i < n; i++) {
            // j = today's task
            for (int j=0; j < 3; j++) {
                // k = yesterday's task
                int max = 0;
                for (int k=0; k < 3; k++) {
                    if (j == k && i != 0)
                        continue;
                    if (max < dp[i][k] + h[i][k]) {
                        max = dp[i][k] + h[i][k];
                    }
                }
                dp[i+1][j] = max;
            }
        }

        int max = 0;
        for (int i=0; i < 3; i++) {
            max = Math.max(max, dp[n][i]);
        }
        // out.println(Arrays.deepToString(dp));
        out.println(max);
    }

}
