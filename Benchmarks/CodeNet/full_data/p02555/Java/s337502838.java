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
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(null, new TaskAdapter(), "", 1 << 27);
        thread.start();
        thread.join();
    }

    static class TaskAdapter implements Runnable {
        @Override
        public void run() {
            InputStream inputStream = System.in;
            OutputStream outputStream = System.out;
            FastReader in = new FastReader(inputStream);
            PrintWriter out = new PrintWriter(outputStream);
            DRedistribution solver = new DRedistribution();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class DRedistribution {
        static final int mod = 1000000007;

        public void solve(int testNumber, FastReader s, PrintWriter w) {
            final int S = s.nextInt();
            final int SZ = S / 3;
            int[][] dp = new int[SZ + 1][S + 1];
            int[][] sum = new int[SZ + 1][S + 1];
            dp[0][0] = 1;
            Arrays.fill(sum[0], 1);
            int res = 0;
            for (int i = 1; i <= SZ; i++) {
                for (int j = 3; j <= S; j++) {
                    dp[i][j] += sum[i - 1][j - 3];
                    dp[i][j] %= mod;
                    sum[i][j] += sum[i][j - 1] + dp[i][j];
                    sum[i][j] %= mod;
                }
                res += dp[i][S];
                res %= mod;
            }
            w.println(res);
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

