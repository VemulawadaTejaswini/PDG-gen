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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        OMatching solver = new OMatching();
        solver.solve(1, in, out);
        out.close();
    }

    static class OMatching {
        long MOD = (int) 1e9 + 7;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int N = in.nextInt();
            boolean[][] pair = new boolean[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    pair[i][j] = (in.nextInt() == 1);
                }
            }
            long[] dp = new long[1 << N];
            dp[0] = 1;
            for (int mask = 0; mask < (1 << N) - 1; mask++) {
                int men_paired = Integer.bitCount(mask);
                // pairing men at index men_paired with some women
                for (int women = 0; women < N; women++) {
                    if (pair[men_paired][women] && ((1 << women) & mask) == 0) {
                        dp[mask + (1 << women)] = (dp[mask + (1 << women)] + dp[mask]) % MOD;
                    }
                }
            }

            out.print(dp[(1 << N) - 1]);
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
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
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        private boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }
}

