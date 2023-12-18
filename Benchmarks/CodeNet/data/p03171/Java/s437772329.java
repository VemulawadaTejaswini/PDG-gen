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
            long[] a = new long[n];

            for (int i = 0; i < n; i++) a[i] = in.nextLong();

            long[][] dp = new long[n + 1][n + 1];
            for (int left = n - 1; left >= 0; left--) {
                for (int right = left; right < n; right++) {
                    if (left == right) {
                        dp[left][right] = a[left];
                    } else {
                        dp[left][right] = Math.max(a[left] - dp[left + 1][right], a[right] - dp[left][right - 1]);
                    }
                }
            }
            out.println(dp[0][n - 1]);
        }

    }
}

