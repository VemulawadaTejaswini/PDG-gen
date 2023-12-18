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
            long ans = 0, mod = (long) 1e9 + 7, cur = n * (n + 1) >> 1, com = func.ncr(n * m - 2, k - 2, mod);
            for (int i = 0; i < n; i++) {
                cur += (i << 1) - n;
                ans = (ans + (cur * ((m * m) % mod)) % mod) % mod;
            }
            cur = m * (m + 1) >> 1;
            for (int i = 0; i < m; i++) {
                cur += (i << 1) - m;
                ans = (ans + (cur * ((n * n) % mod)) % mod) % mod;
            }
            w.println((ans * ((com * func.power(2, mod - 2, mod)) % mod)) % mod);
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

        public static int ncr(int n, int r, long p) {
            int[] C = new int[r + 1];
            C[0] = 1;
            for (int i = 1; i <= n; i++) {
                for (int j = Math.min(i, r); j > 0; j--) {
                    C[j] = (int) ((C[j] + C[j - 1]) % p);
                }
            }
            return C[r];
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

