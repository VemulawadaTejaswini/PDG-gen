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
        EFlatten solver = new EFlatten();
        solver.solve(1, in, out);
        out.close();
    }

    static class EFlatten {
        final long mod = (long) 1e9 + 7;

        public void solve(int testNumber, FastReader s, PrintWriter w) {
            int n = s.nextInt();
            int[] a = new int[n], f = new int[(int) 1e6 + 1];
            for (int i = 0; i < n; i++) a[i] = s.nextInt();
            long lcm = 1, ans = 0;
            for (int i = 0; i < n; i++) {
                int sq = (int) Math.sqrt(a[i]), t = a[i];
                for (int j = 2; j <= sq; j++) {
                    if (a[i] % j == 0) {
                        int cnt = 0;
                        while (t % j == 0) {
                            t /= j;
                            cnt++;
                        }
                        f[j] = Math.max(f[j], cnt);
                    }
                }
                if (t != 1) {
                    f[t] = Math.max(f[t], 1);
                }
            }
            for (int i = 2; i <= 1e6; i++)
                if (f[i] > 0) {
                    lcm *= func.power(i, f[i], mod);
                    lcm %= mod;
                }
            for (int i = 0; i < n; i++) {
                ans += (lcm * func.power(a[i], mod - 2, mod));
                ans %= mod;
            }
            w.println(ans);
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
        public static long power(long x, long y, long p) {
            long res = 1;
            x %= p;
            while (y > 0) {
                if ((y & 1) == 1) {
                    res *= x;
                    res %= p;
                }
                y >>= 1;
                x *= x;
                x %= p;
            }
            return res;
        }

    }
}

