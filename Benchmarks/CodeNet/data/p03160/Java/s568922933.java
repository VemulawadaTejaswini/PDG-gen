import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        A solver = new A();
        solver.solve(1, in, out);
        out.close();
    }

    static class A {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int N = Integer.parseInt(in.next());
            int[] h = new int[N];
            for (int i = 0; i < N; i++) {
                h[i] = Integer.parseInt(in.next());
            }
            int[] dp = new int[N];
            Arrays.fill(dp, Integer.MAX_VALUE);
            dp[0] = 0;
            for (int i = 1; i < N; i++) {
                dp[i] = Math.min(dp[i], dp[i - 1] + Math.abs(h[i] - h[i - 1]));
                if (i > 1) dp[i] = Math.min(dp[i], dp[i - 2] + Math.abs(h[i] - h[i - 2]));
            }

            out.println(dp[N - 1]);
        }

    }
}

