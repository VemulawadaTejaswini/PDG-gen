import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        NSlimes solver = new NSlimes();
        solver.solve(1, in, out);
        out.close();
    }

    static class NSlimes {
        int[] a;
        long[][] dp;
        long[] acc;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            a = new int[n];
            acc = new long[n + 1];
            dp = new long[n + 1][n + 1];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                acc[i + 1] = acc[i] + a[i];
            }
            for (int i = 0; i < n + 1; i++) {
                Arrays.fill(dp[i], -1);
            }

            out.println(f(0, n));
        /*for (int i = 0; i < n + 1; i++) {
            out.println(Arrays.toString(dp[i]));
        }
        
         */

        }

        long f(int l, int r) {
            if (dp[l][r] != -1) return dp[l][r];
            if (r - l <= 1) return dp[l][r] = 0;
            long s = acc[r] - acc[l];
            long cnt = (long) 1e18;
            for (int i = l + 1; i < r; i++) {
                cnt = Math.min(cnt, f(l, i) + f(i, r));
            }
            return dp[l][r] = cnt + s;
        }

    }
}

