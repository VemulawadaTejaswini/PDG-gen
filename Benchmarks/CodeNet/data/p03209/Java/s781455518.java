import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author __shangu__
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DChristmas solver = new DChristmas();
        solver.solve(1, in, out);
        out.close();
    }

    static class DChristmas {
        private long[] memo;
        private long[] tot;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            memo = new long[n + 10];
            tot = new long[n + 10];
            tot[0] = 1;
            memo[0] = 1;
            long k = in.nextLong();

            for (int i = 1; i <= n; ++i) {
                tot[i] = tot[i - 1] * 2 + 3;
                memo[i] = memo[i - 1] * 2 + 1;
//            out.printf("%d: %d %d\n", i, tot[i], memo[i]);
            }

            out.println(count(n, k));
        }

        private long count(int n, long k) {
            if (k == 0) return 0;
            if (n == 0) return 1;
            if (k == tot[n]) return memo[n];
            if (k <= tot[n - 1] + 1) return count(n - 1, k - 1);
            return count(n - 1, tot[n - 1]) + 1 + count(n - 1, k - tot[n - 1] - 2);
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

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

