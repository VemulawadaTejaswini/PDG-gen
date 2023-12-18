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
        FKnapsackForAllSegments solver = new FKnapsackForAllSegments();
        solver.solve(1, in, out);
        out.close();
    }

    static class FKnapsackForAllSegments {
        public void solve(int testNumber, InputReader s, PrintWriter w) {
            int n = s.nextInt(), k = s.nextInt();
            int[] a = new int[n + 1];
            for (int i = 1; i <= n; i++)
                a[i] = s.nextInt();
            long mod = 998244353;
            long[][] dp = new long[n + 1][k + 1];
            long res = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j <= k; j++)
                    dp[i][j] = dp[i - 1][j];
                if (a[i] > k)
                    continue;
                dp[i][a[i]] = (dp[i][a[i]] + i) % mod;
                for (int j = a[i]; j <= k; j++) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][j - a[i]]) % mod;
                }
                long curr = dp[i - 1][k - a[i]];
                if (a[i] == k)
                    curr = (curr + i) % mod;
                res = (res + curr * (n - i + 1) % mod) % mod;
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

