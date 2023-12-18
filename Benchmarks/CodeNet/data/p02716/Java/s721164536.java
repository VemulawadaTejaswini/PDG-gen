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
 * @author KharYusuf
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FSelectHalf solver = new FSelectHalf();
        solver.solve(1, in, out);
        out.close();
    }

    static class FSelectHalf {
        public void solve(int testNumber, FastReader s, PrintWriter w) {
            int n = s.nextInt();
            int[] a = new int[n + 1];
            for (int i = 1; i <= n; i++) a[i] = s.nextInt();
            if ((n & 1) == 1) {
                long[][] dp = new long[n + 1][3];
                dp[1][0] = a[1];
                dp[1][1] = a[1];
                dp[2][0] = -(long) 1e14;
                dp[2][1] = a[2];
                dp[3][0] = a[1] + a[3];
                dp[3][1] = a[3];
                dp[3][2] = a[3];
                for (int i = 4; i <= n; i++) {
                    dp[i][0] = dp[i - 2][0] + a[i];
                    dp[i][1] = Math.max(dp[i - 3][0] + a[i], dp[i - 2][1] + a[i]);
                    dp[i][2] = func.max(dp[i - 4][0] + a[i], dp[i - 3][1] + a[i], dp[i - 2][2] + a[i]);
                }
                w.println(func.max(dp[n][1], dp[n][0], dp[n][2], dp[n - 1][1], dp[n - 1][0], dp[n - 2][0]));
            } else {
                long[][] dp = new long[n + 1][2];
                dp[1][0] = a[1];
                dp[1][1] = a[1];
                dp[2][0] = -(long) 1e14;
                dp[2][1] = a[2];
                for (int i = 3; i <= n; i++) {
                    dp[i][0] = dp[i - 2][0] + a[i];
                    dp[i][1] = Math.max(dp[i - 3][0] + a[i], dp[i - 2][1] + a[i]);
                }
                //for(int i=0;i<=n;i++) w.println(dp[i][0]+" "+dp[i][1]);
                w.println(func.max(dp[n][1], dp[n][0], dp[n - 1][1], dp[n - 1][0]));
            }
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

    static class func {
        public static long max(long... v) {
            long max = Integer.MIN_VALUE;
            for (long i : v) max = Math.max(max, i);
            return max;
        }

    }
}

