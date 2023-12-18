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
        LDeque solver = new LDeque();
        solver.solve(1, in, out);
        out.close();
    }

    static class LDeque {
        long[][] dp;
        boolean[][] used;
        long[] a;

        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int n = in.nextInt();
            a = new long[n];
            dp = new long[n][n];
            used = new boolean[n][n];

            for (int i = 0; i < n; i++) {
                Arrays.fill(used[i], false);
                a[i] = in.nextLong();
            }

        /*
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                out.println(f(i, j));
            }
        }
        
         */

            out.println(f(0, n - 1));
        }

        long f(int l, int r) {
            if (used[l][r]) {
                return dp[l][r];
            }
            used[l][r] = true;
            if (l == r) return dp[l][r] = a[l];
            return dp[l][r] = Math.max(a[l] - f(l + 1, r),
                    a[r] - f(l, r - 1));
        }

    }
}

