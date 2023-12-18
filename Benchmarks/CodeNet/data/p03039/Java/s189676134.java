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
        ECellDistance solver = new ECellDistance();
        solver.solve(1, in, out);
        out.close();
    }

    static class ECellDistance {
        public void solve(int testNumber, FastReader s, PrintWriter w) {
            int n = s.nextInt(), m = s.nextInt(), k = s.nextInt();
            long ans = 0, mod = (long) 1e9 + 7, n1 = (n * n) % mod, m1 = (m * m) % mod, fac[] = new long[n * m - 1];
            fac[0] = 1;
            for (int i = 1; i < m * n - 1; i++) {
                fac[i] = (fac[i - 1] * i) % mod;
            }
            long com = (fac[m * n - 2] * ((func.power(fac[k - 2], mod - 2, mod) * func.power(fac[m * n - k], mod - 2, mod)) % mod)) % mod;
            for (long i = 1; i < n; i++) {
                ans = (ans + (((i * (i + 1) >> 1) * m1) % mod)) % mod;
            }
            for (long i = 1; i < m; i++) {
                ans = (ans + (((i * (i + 1) >> 1) * n1) % mod)) % mod;
            }
            w.println((ans * com) % mod);
        }

    }

    static class func {
        public static long power(long x, long y, long p) {
            long res = 1;
            x = x % p;
            while (y > 0) {
                if ((y & 1) == 1)
                    res = (res * x) % p;
                y = y >> 1;
                x = (x * x) % p;
            }
            return res;
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

