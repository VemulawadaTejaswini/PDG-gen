import java.io.*;
import java.math.BigInteger;
import java.util.*;

/**
 * Created by fcdkbear on 15.10.16.
 */
public class Main {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        new Task().solve(in, out);
        out.close();
    }


    static class Task {

        long E,T;
        int n;
        final int MAGIC = 1600;

        long dp[];
        long[] x;
        int[] next;
        int[] opt;

        public void solve(InputReader in, PrintWriter out) {

            n = in.nextInt();
            E = in.nextLong();
            T = in.nextLong();
            x = new long[n];
            next = new int[n];
            for (int i = 0; i < n; ++i) {
                x[i] = in.nextLong();
            }
            int pos = 0;
            for (int i = 0; i < n; ++i) {
                while ((pos < n) && (2*(x[pos] - x[i]) <= T)) {
                    pos++;
                }
                next[i] = pos;
            }
            dp = new long[n];
            dp[n - 1] = T + E - x[n - 1];
            opt[n - 1] = n - 1;
            for (int p = n - 2; p >= 0; --p) {
                long res = T + x[p + 1] - x[p] + dp[p + 1];
                int from = Math.max(p + 1, opt[p + 1] - MAGIC);
                int to = Math.min(n, opt[p + 1] + MAGIC);
                long nres = Long.MAX_VALUE;
                for (int i = from; i < to; ++i) {
                    long now = 0;
                    if (i + 1 != n) {
                        now = (x[i] - x[p]) + Math.max(T - x[i] + x[p], x[i] - x[p]) + x[i + 1] - x[p] + dp[i + 1];
                    } else {
                        now = (x[i] - x[p]) + Math.max(T - x[i] + x[p], x[i] - x[p]) + E - x[p];
                    }
                    if (now < nres) {
                        nres = now;
                        opt[p] = i;
                    }
                }
                dp[p] = Math.min(res, nres);
            }
            out.println(dp[0] + x[0]);
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

        public double nextDouble() {
            return Double.parseDouble(next());
        }

    }

}
