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
        EChildrenAndCandies solver = new EChildrenAndCandies();
        solver.solve(1, in, out);
        out.close();
    }

    static class EChildrenAndCandies {
        public void solve(int testNumber, InputReader s, PrintWriter w) {
            int n = s.nextInt();
            int c = s.nextInt();
            int[] a = new int[n + 1];
            int[] b = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                a[i] = s.nextInt();
            }
            for (int i = 1; i <= n; i++) {
                b[i] = s.nextInt();
            }
            long mod = (long) 1e9 + 7;
            long[][] psum = new long[401][401];
            Arrays.fill(psum[0], 1);
            psum[0][0] = 0;
            for (int i = 1; i <= 400; i++) {
                for (int j = 1; j <= 400; j++) {
                    psum[i][j] = psum[i - 1][j] * j % mod;
                }
            }
            for (int i = 0; i <= 400; i++) {
                for (int j = 1; j <= 400; j++) {
                    psum[i][j] = (psum[i][j] + psum[i][j - 1]) % mod;
                }
            }
            long[][] dp = new long[n + 1][c + 1];
            dp[0][0] = 1;
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j <= c; j++) {
                    for (int k = 0; k <= j; k++) {
                        dp[i][j] = (dp[i][j] + dp[i - 1][k] * ((psum[j - k][b[i]] - psum[j - k][a[i] - 1] + mod) % mod) % mod) % mod;
                    }
                }
            }
            w.println(dp[n][c]);
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

