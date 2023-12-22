import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EditDistanceAizu solver = new EditDistanceAizu();
        solver.solve(1, in, out);
        out.close();
    }

    static class EditDistanceAizu {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            char[] a = in.next().toCharArray();
            char[] b = in.next().toCharArray();
            int n = a.length;
            int m = b.length;

            int[][] dp = new int[n + 1][m + 1];

            for (int i = 0; i < n + 1; i++) {
                dp[i][0] = i;
            }

            for (int j = 0; j < m + 1; j++) {
                dp[0][j] = j;
            }

            for (int i = 1; i < n + 1; i++) {
                for (int j = 1; j < m + 1; j++) {
                    if (a[i - 1] == b[j - 1]) {
                        dp[i][j] = Math.min(Math.min(dp[i - 1][j] + 1, dp[i][j - 1] + 1), dp[i - 1][j - 1]);
                    } else {
                        dp[i][j] = Math.min(Math.min(dp[i - 1][j] + 1, dp[i][j - 1] + 1), dp[i - 1][j - 1] + 1);
                    }
                }
            }

            out.println(dp[n][m]);
        }

    }
}


