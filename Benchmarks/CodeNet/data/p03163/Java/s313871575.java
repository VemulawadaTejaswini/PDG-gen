import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int W = in.nextInt();
            int[] w = new int[n];
            long[] v = new long[n];
            for (int i = 0; i < n; i++) {
                w[i] = in.nextInt();
                v[i] = in.nextInt();
            }
            long[] dp = new long[W + 1];
            Arrays.fill(dp, 0);
            dp[w[0]] = v[0];
            for (int i = 1; i < n; i++) {
                boolean[] used = new boolean[W + 1];
                for (int j = 0; j <= W; j++)
                    if (dp[j] != 0)
                        used[j] = true;
                for (int j = 1; j <= W; j++)
                    if (used[j]) {
                        int nextW = j + w[i];
                        if (nextW <= W)
                            dp[nextW] = Math.max(dp[nextW], dp[j] + v[i]);
                    }
                dp[w[i]] = Math.max(dp[w[i]], v[i]);
            }
            long max = -1;
            for (long el : dp)
                max = Math.max(max, el);
            out.println(max);
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}