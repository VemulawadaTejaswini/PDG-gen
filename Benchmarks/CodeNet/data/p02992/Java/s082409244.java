import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Collections;
import java.util.ArrayList;
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
        FSmallProducts solver = new FSmallProducts();
        solver.solve(1, in, out);
        out.close();
    }

    static class FSmallProducts {
        public void solve(int testNumber, InputReader s, PrintWriter w) {
            int n = s.nextInt(), k = s.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            for (int i = 1; (long) i * i <= n; i++) {
                a.add(i);
                if (n / i != i)
                    a.add(n / i);
            }
            Collections.sort(a);
            int m = a.size();
            int[] count = new int[m];
            count[0] = a.get(0);
            for (int i = 1; i < m; i++)
                count[i] = a.get(i) - a.get(i - 1);
            long mod = (long) 1e9 + 7;
            long[][] dp = new long[k][m];
            dp[0][0] = count[0];
            for (int i = 1; i < m; i++)
                dp[0][i] = (count[i] + dp[0][i - 1]) % mod;
            for (int i = 1; i < k; i++) {
                dp[i][0] = count[0] * dp[i - 1][m - 1] % mod;
                for (int j = 1; j < m; j++)
                    dp[i][j] = (dp[i][j - 1] + count[j] * dp[i - 1][m - 1 - j] % mod) % mod;
            }
            w.println(dp[k - 1][m - 1]);
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

