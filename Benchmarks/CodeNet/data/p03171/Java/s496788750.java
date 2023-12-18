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
 * @author aps
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        LDeque solver = new LDeque();
        solver.solve(1, in, out);
        out.close();
    }

    static class LDeque {
        int N = 3005;
        long[] a = new long[N];
        long[][][] dp = new long[N][N][2];

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            for (int i = 1; i <= n; i++) a[i] = in.nextLong();
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) dp[i][j][0] = dp[i][j][1] = -1;
            }
            out.println(f(1, n, 0));
        }

        public long f(int i, int j, int k) {
            if (i > j) return 0;
            long ret = dp[i][j][k];
            if (ret != -1) return ret;
            if (k == 0) { // player 1 trying to maximize
                ret = Math.max(a[i] + f(i + 1, j, 1 - k), a[j] + f(i, j - 1, 1 - k));
            } else { // player 2 trying to minimize
                ret = Math.min(-a[i] + f(i + 1, j, 1 - k), -a[j] + f(i, j - 1, 1 - k));
            }
            dp[i][j][k] = ret;
            return ret;
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

