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
 *
 * @author maheshwari29
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        EColorfulBlocks solver = new EColorfulBlocks();
        solver.solve(1, in, out);
        out.close();
    }

    static class EColorfulBlocks {
        static long mod = 998244353;

        static long exponent(long a, long n) {
            long ans = 1;
            while (n != 0) {
                if (n % 2 == 1) ans = (ans * a) % mod;
                a = (a * a) % mod;
                n = n >> 1;
            }
            return ans;
        }

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int i, j;
            int n = in.ni();
            int m = in.ni();
            int k = in.ni();
            long fac[] = new long[200001];
            fac[0] = 1;
            for (i = 1; i <= 200000; i++) {
                fac[i] = i * fac[i - 1];
                fac[i] %= mod;
            }
            long ans = 0;
            for (i = n - k; i <= n; i++) {
                long temp1 = func(n - 1, i - 1, fac);
                long temp2 = exponent(m - 1, i - 1);
                //out.println((n-1)+" "+(i-1)+" "+temp1);
                //out.println((m-1)+" "+(i-1)+" "+temp2);
                temp2 = (temp2 * m) % mod;
                ans += (temp2 * temp1) % mod;
                ans %= mod;
            }
            out.println(ans);
        }

        public long func(int n, int r, long fac[]) {
            long temp2 = fac[r] * fac[n - r];
            temp2 %= mod;
            temp2 = exponent(temp2, mod - 2);
            return (temp2 * fac[n]) % mod;
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

        public int ni() {
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

