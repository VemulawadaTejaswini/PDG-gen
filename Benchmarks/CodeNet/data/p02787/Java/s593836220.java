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
 * @author KharYusuf
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ECrestedIbisVsMonster solver = new ECrestedIbisVsMonster();
        solver.solve(1, in, out);
        out.close();
    }

    static class ECrestedIbisVsMonster {
        public void solve(int testNumber, FastReader s, PrintWriter w) {
            int h = s.nextInt(), n = s.nextInt();
            long[][] dp = new long[n + 1][h + 1];
            int[] a = new int[n + 1], b = new int[n + 1];
            Arrays.fill(dp[0], Integer.MAX_VALUE);
            dp[0][0] = 0;
            for (int i = 1; i <= n; i++) {
                a[i] = s.nextInt();
                b[i] = s.nextInt();
                Arrays.fill(dp[i], Integer.MAX_VALUE);
                dp[i][0] = 0;
            }
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= h; j++) {
                    int from = Math.max(j - a[i], 0);
                    dp[i][j] = func.min(dp[i - 1][from] + b[i], dp[i - 1][j], dp[i][from] + b[i]);
                }
            }
            w.println(dp[n][h]);
        }

    }

    static class func {
        public static long min(long... v) {
            long min = Long.MAX_VALUE;
            for (long i : v) min = Math.min(min, i);
            return min;
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

