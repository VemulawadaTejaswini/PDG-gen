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
 * @author Yagnik
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FKnapsackForAllSegments solver = new FKnapsackForAllSegments();
        solver.solve(1, in, out);
        out.close();
    }

    static class FKnapsackForAllSegments {
        final long mod = 998244353;

        public void solve(int testNumber, FastReader s, PrintWriter w) {
            int n = s.nextInt(), sum = s.nextInt();
            long[][] dp = new long[n + 1][sum + 1];
            int[] a = new int[n + 1];
            for (int i = 1; i <= n; i++) a[i] = s.nextInt();
            dp[0][0] = 1;
            for (int i = 1; i <= n; i++) {
                dp[i] = dp[i - 1].clone();
                for (int j = 0; j + a[i] <= sum; j++) {
                    if (j == 0 && j + a[i] == sum) {
                        dp[i][j + a[i]] += dp[i - 1][j] * i * (n - i + 1);
                        dp[i][j + a[i]] %= mod;
                    } else if (j == 0) {
                        dp[i][j + a[i]] += dp[i - 1][j] * i;
                        dp[i][j + a[i]] %= mod;
                    } else if (j + a[i] == sum) {
                        dp[i][j + a[i]] += dp[i - 1][j] * (n - i + 1);
                        dp[i][j + a[i]] %= mod;
                    } else {
                        dp[i][j + a[i]] += dp[i - 1][j];
                        dp[i][j + a[i]] %= mod;
                    }
                }
            }
            w.println(dp[n][sum]);
        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private FastReader.SpaceCharFilter filter;

        public FastReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {

            if (numChars == -1)
                throw new InputMismatchException();

            if (curChar >= numChars) {

                curChar = 0;

                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (numChars <= 0)
                    return -1;
            }

            return buf[curChar++];
        }

        public int nextInt() {

            int c = read();

            while (isSpaceChar(c))
                c = read();

            int sgn = 1;

            if (c == '-') {
                sgn = -1;
                c = read();
            }

            int res = 0;

            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();

                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));

            return res * sgn;
        }

        public boolean isSpaceChar(int c) {

            if (filter != null)
                return filter.isSpaceChar(c);

            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

