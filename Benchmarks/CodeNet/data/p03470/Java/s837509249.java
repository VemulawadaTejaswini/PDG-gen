import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[n];

            Set<Integer> s = new HashSet<>();
            for (int i = 0; i < n; i++) {
                s.add(in.nextInt());
            }
            out.println(s.size());
            return;

            // int[] dp  = new int[n];
            //
            // for (int i = 0; i < n; i++) {
            //     a[i] = in.nextInt();
            // }
            //
            // for (int i = 0; i < n; ++i) {
            //     dp[i] = 1;
            //     for (int j = 0; j < i; ++j)
            //         if (a[j] > a[i])
            //             dp[i] = Math.max(dp[i], 1 + dp[j]);
            // }
            //
            // int ans = dp[0];
            // for (int i = 0; i < n; ++i)
            //     ans = Math.max(ans, dp[i]);
            //
            // out.println(ans);
        }

    }
}

