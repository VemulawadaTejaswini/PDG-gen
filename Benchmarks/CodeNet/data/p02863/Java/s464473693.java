import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EAllyoucaneat solver = new EAllyoucaneat();
        solver.solve(1, in, out);
        out.close();
    }

    static class EAllyoucaneat {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int t = in.nextInt();
            int[] a = new int[n + 1];
            int[] b = new int[n + 1];
            int[][] dp = new int[n + 1][t + 2]; // n まで,t分でのmax
            for (int i = 1; i <= n; i++) {
                a[i] = in.nextInt();
                b[i] = in.nextInt();
            }

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= t; j++) {
                    // dp[i][j] = dp[i-1][j-a[i]] -> Add or dp[i-1][j] NoAdd
                    if (j - a[i] >= 0) {
                        dp[i][j] = Math.max(dp[i - 1][j - a[i]] + b[i], dp[i - 1][j]);
                    } else {
                        // Add -> cannot
                        dp[i][j] = dp[i - 1][j - 1];
                    }
                }
                // dp[i][t+1] -> over (MAX(dp[i-1][t-1] + Add, dp[i-1][t]))
                dp[i][t + 1] = Math.max(dp[i - 1][t - 1] + b[i], dp[i - 1][t + 1]);
            }
        /*
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= t+1; j++) {
                out.print(dp[i][j] + " ");
            }
            out.println("");
        }
        out.println("-------table-------");
         */
            out.println(dp[n][t + 1]);

        }

    }
}

