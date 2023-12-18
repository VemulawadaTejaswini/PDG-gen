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
        ESumEqualsXor solver = new ESumEqualsXor();
        solver.solve(1, in, out);
        out.close();
    }

    static class ESumEqualsXor {
        public void solve(int testNumber, FastReader s, PrintWriter w) {
            char c[] = s.next().toCharArray();
            long mod = (long) 1e9 + 7, num = 0, d = 0, cur = 1;
            int n = c.length;
            boolean all1 = true;
            for (int i = 0; i < n; i++) {
                if (c[i] == '0') {
                    all1 = false;
                    break;
                }
            }
            if (all1) {
                w.println(func.power(3, n, mod));
                return;
            }
            for (int i = n - 1; i >= 0; i--) {
                if (i != 0) {
                    d = (d + cur) % mod;
                }
                if (c[i] == '1') {
                    num = (num + cur) % mod;
                }
                cur <<= 1;
                cur %= mod;
            }
            w.println((func.power(3, n - 1, mod) + (((num - d + mod) % mod) << 1) % mod) % mod);
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

        public String next() {

            int c = read();

            while (isSpaceChar(c))
                c = read();

            StringBuilder res = new StringBuilder();

            do {
                res.appendCodePoint(c);
                c = read();
            }
            while (!isSpaceChar(c));

            return res.toString();
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

