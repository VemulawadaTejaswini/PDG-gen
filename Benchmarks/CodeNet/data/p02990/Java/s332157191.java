import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
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
        OutputWriter out = new OutputWriter(outputStream);
        DBlueAndRedBalls solver = new DBlueAndRedBalls();
        solver.solve(1, in, out);
        out.close();
    }

    static class DBlueAndRedBalls {
        static long mod = 1000000007;

        static long power(long x, long y, long p) {

            // Initialize result
            long res = 1;

            // Update x if it is more than or
            // equal to p
            x = x % p;

            while (y > 0) {

                // If y is odd, multiply x
                // with result
                if (y % 2 == 1)
                    res = (res * x) % p;

                // y must be even now
                y = y >> 1; // y = y/2
                x = (x * x) % p;
            }

            return res;
        }

        static long modInverse(int n, long p) {
            return power(n, p - 2, p);
        }

        static long nCrModPFermat(int n, int r,
                                  long p) {

            // Base case
            if (r == 0)
                return 1;

            // Fill factorial array so that we
            // can find all factorial of r, n
            // and n-r
            long[] fac = new long[n + 1];
            fac[0] = 1;

            for (int i = 1; i <= n; i++)
                fac[i] = fac[i - 1] * i % p;

            return (fac[n] * modInverse((int) fac[r], p)
                    % p * modInverse((int) fac[n - r], p)
                    % p) % p;
        }

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            long n = in.nextLong();
            long k = in.nextLong();
            long red = n - k;
            long ans = 0;
            for (long i = 1; i <= k; i++) {
                long gaps = red + 1;
                long N = gaps;
                long r = i;
                long a = nCrModPFermat((int) N, (int) r, mod);
                long kk = k - i;
                long b = nCrModPFermat((int) (kk + i - 1), (int) i - 1, mod);
                ans = a % mod;
                ans *= b % mod;
                ans %= mod;
                out.println(ans);

            }
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

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void close() {
            writer.close();
        }

        public void println(long i) {
            writer.println(i);
        }

    }
}

