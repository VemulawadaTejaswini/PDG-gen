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
        FUnhappyHacking solver = new FUnhappyHacking();
        solver.solve(1, in, out);
        out.close();
    }

    static class FUnhappyHacking {
        public void solve(int testNumber, InputReader s, PrintWriter w) {

            int n = s.nextInt();
            char[] a = s.next().toCharArray();
            int k = a.length;

            long[][] dp = new long[n + 1][n + 1];
            dp[0][0] = 1;
            long mod = (long) 1e9 + 7;
            for (int i = 1; i <= n; i++) {
                dp[i][0] += dp[i - 1][0];
                dp[i][0] %= mod;
                for (int j = 0; j <= n; j++) {
                    if (j - 1 >= 0) {
                        dp[i][j] += 2 * dp[i - 1][j - 1];
                        dp[i][j] %= mod;
                    }
                    if (j + 1 <= n) {
                        dp[i][j] += dp[i - 1][j + 1];
                        dp[i][j] %= mod;
                    }
                }
            }

            long[] pow2 = new long[k + 1];
            pow2[0] = 1;
            pow2[1] = 500000004;
            for (int i = 1; i <= k; i++)
                pow2[i] = pow2[i - 1] * pow2[1] % mod;
            w.println(dp[n][k] * pow2[k] % mod);
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

        public String nextString() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                if (Character.isValidCodePoint(c)) {
                    res.appendCodePoint(c);
                }
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
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

        public String next() {
            return nextString();
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

