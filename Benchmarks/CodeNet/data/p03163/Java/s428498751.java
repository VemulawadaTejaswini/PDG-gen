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
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int w = in.nextInt();
            int[][] a = new int[n][2];
            for (int i = 0; i < n; i++) {
                a[i][1] = in.nextInt();
                a[i][0] = in.nextInt();
            }
            int[][] dp = new int[n + 1][w + 1];

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= w; j++) {
                    if (a[i - 1][1] <= j) {
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - a[i - 1][1]] + a[i - 1][0]);
                    } else {
                        dp[i][j] = dp[i - 1][j];
                    }
                }
            }

            out.println(dp[n][w]);
        }

    }
}

