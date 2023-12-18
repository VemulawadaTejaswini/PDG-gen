/*input
6
7 6 8 6 1 1
*/
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author masterbios
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CLinovaAndKingdom solver = new CLinovaAndKingdom();
        solver.solve(1, in, out);
        out.close();
    }

    static class CLinovaAndKingdom {

        final int MAXN = (int) (4e2) + 10;
        long dp[][] = new long[MAXN][MAXN];
        final long INF = (long) (1e18);

        public void solve(int testNumber, InputReader in, PrintWriter out) {

            int n = in.nextInt();
            long a[] = new long[n];
            for (int i = 0; i < n; i++) a[i] = in.nextLong();

            for (int i = n - 1; i >= 0; i--) {
                for (int j = i; j < n; j++) {
                    if (i == j) {
                        dp[i][j] = 0;
                    } else {
                        dp[i][j] = INF;
                        long sum = 0L;
                        for (int k = i; k <= j; k++) {
                            sum += a[k];
                        }
                        for (int k = i; k <= j - 1; k++) {
                            dp[i][j] = min(dp[i][j], dp[i][k] + dp[k + 1][j] + sum);
                        }
                    }
                }
            }

            out.println(dp[0][n - 1]);

        }


        public int max(int ...a) {
            int max = Integer.MIN_VALUE;
            for (int i : a) max = Math.max(max, i);
            return max;
        }

        public int min(int ...a) {
            int min = Integer.MAX_VALUE;
            for (int i : a) min = Math.min(min, i);
            return min;
        }

        public long max(long ...a) {
            long max = Long.MIN_VALUE;
            for (long i : a) max = Math.max(max, i);
            return max;
        }

        public long min(long ...a) {
            long min = Long.MAX_VALUE;
            for (long i : a) min = Math.min(min, i);
            return min;
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
            while (tokenizer == null || !tokenizer.hasMoreElements()) {
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

