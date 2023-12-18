import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Sparsh Sanchorawala
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ECommonSubsequence solver = new ECommonSubsequence();
        solver.solve(1, in, out);
        out.close();
    }

    static class ECommonSubsequence {
        int[] a;
        int[] b;
        long[][] dp;
        long[][] dpSum;
        long mod = (long) 1e9 + 7;

        void recur(int n, int m) {
            dp[n][m] = 0;
            if (a[n] == b[m]) {
                if (n - 1 >= 0 && m - 1 >= 0) {
                    if (dp[n - 1][m - 1] == -1)
                        recur(n - 1, m - 1);
                    dp[n][m] = (dpSum[n - 1][m - 1] + dp[n][m]) % mod;
                }
            }

            dpSum[n][m] = dp[n][m];

            if (n - 1 >= 0) {
                if (dp[n - 1][m] == -1)
                    recur(n - 1, m);
                dpSum[n][m] = (dpSum[n - 1][m] + dpSum[n][m]) % mod;
            }
            if (m - 1 >= 0) {
                if (dp[n][m - 1] == -1)
                    recur(n, m - 1);
                dpSum[n][m] = (dpSum[n][m - 1] + dpSum[n][m]) % mod;
            }

            if (n - 1 >= 0 && m - 1 >= 0) {
                if (dp[n - 1][m - 1] == -1)
                    recur(n - 1, m - 1);
                dpSum[n][m] = (mod - dpSum[n - 1][m - 1] + dpSum[n][m]) % mod;
            }
        }

        public void solve(int testNumber, InputReader s, PrintWriter w) {
            int n = s.nextInt(), m = s.nextInt();
            a = new int[n + 1];
            for (int i = 1; i <= n; i++)
                a[i] = s.nextInt();
            b = new int[m + 1];
            for (int i = 1; i <= m; i++)
                b[i] = s.nextInt();
            dp = new long[n + 1][m + 1];
            for (int i = 1; i <= n; i++)
                for (int j = 1; j <= m; j++)
                    dp[i][j] = -1;
            dp[0][0] = 1;
            dpSum = new long[n + 1][m + 1];
            dpSum[0][0] = 1;
            for (int i = 1; i <= n; i++)
                dpSum[i][0] = dpSum[i - 1][0];
            for (int j = 1; j <= m; j++)
                dpSum[0][j] = dpSum[0][j - 1];
            recur(n, m);
            w.println(dpSum[n][m]);
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

