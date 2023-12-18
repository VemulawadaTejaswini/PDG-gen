import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        FSelectHalf solver = new FSelectHalf();
        solver.solve(1, in, out);
        out.close();
    }

    static class FSelectHalf {
        public void solve(int testNumber, InputReader s, PrintWriter w) {
            int n = s.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = s.nextLong();
            long[][] dp = new long[n][3];
            for (int i = 0; i < n; i++)
                Arrays.fill(dp[i], Long.MIN_VALUE);
            for (int i = 0; i < n; i++) {
                if ((i & 1) == 0) {
                    dp[i][0] = a[i];
                    if (i - 2 >= 0)
                        dp[i][0] += dp[i - 2][0];
                    if (i - 2 >= 0 && dp[i - 2][2] != Long.MIN_VALUE) {
                        dp[i][2] = Math.max(a[i] + dp[i - 2][2], dp[i][2]);
                    }
                    if (i - 3 >= 0) {
                        dp[i][2] = Math.max(dp[i - 3][1] + a[i], dp[i][2]);
                    } else if (i == 2)
                        dp[i][2] = Math.max(a[i], dp[i][2]);

                } else {
                    dp[i][1] = a[i];
                    if (i - 2 >= 0)
                        dp[i][1] += dp[i - 2][1];
                    if (i - 3 >= 0)
                        dp[i][1] = Math.max(dp[i - 3][0] + a[i], dp[i][1]);
                }
            }
            long res = Long.MIN_VALUE;
            if (n % 2 == 0) {
                res = Math.max(dp[n - 1][1], dp[n - 2][0]);
            } else {
                res = Math.max(dp[n - 1][2], res);
                res = Math.max(dp[n - 2][1], res);
                res = Math.max(dp[n - 3][0], res);
            }
            w.println(res);

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

        public long nextLong() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
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

