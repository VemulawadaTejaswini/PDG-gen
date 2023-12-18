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

        static long nCrModpDP(int n, int r, long p) {
            // The array C is going to store last row of
            // pascal triangle at the end. And last entry
            // of last row is nCr
            long[] C = new long[r + 1];

            C[0] = 1; // Top row of Pascal Triangle

            // One by constructs remaining rows of Pascal
            // Triangle from top to bottom
            for (int i = 1; i <= n; i++) {
                // Fill entries of current row using previous
                // row values
                for (int j = Math.min(i, r); j > 0; j--)

                    // nCj = (n-1)Cj + (n-1)C(j-1);
                    C[j] = (C[j] + C[j - 1]) % p;
            }
            return C[r];
        }

        static long nCrModpLucas(long n, long r, long p) {
// Base case
            if (r == 0)
                return 1;

// Compute last digits of n and r in base p
            long ni = n % p;
            long ri = r % p;

// Compute result for last digits computed above, and
// for remaining digits. Multiply the two results and
// compute the result of multiplication in modulo p.
            return (nCrModpLucas(n / p, r / p, p) * // Last digits of n and r
                    nCrModpDP((int) ni, (int) ri, p)) % p; // Remaining digits
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
                long a = nCrModpLucas(N, r, mod);
                long kk = k - i;
                long b = nCrModpLucas(kk + i - 1, i - 1, mod);
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

