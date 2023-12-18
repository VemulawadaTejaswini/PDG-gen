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
        EDivisibleSubstring solver = new EDivisibleSubstring();
        solver.solve(1, in, out);
        out.close();
    }

    static class EDivisibleSubstring {
        public void solve(int testNumber, FastReader s, PrintWriter w) {
            int n = s.nextInt(), p = s.nextInt();
            char[] c = s.next().toCharArray();
            long ans = 0;
            if (p == 2) {
                for (int i = 0; i < n; i++)
                    if (c[i] % 2 == 0) ans += i + 1;
                w.println(ans);
                return;
            } else if (p == 5) {
                for (int i = 0; i < n; i++)
                    if ((c[i] - '0') % 5 == 0) ans += i + 1;
                w.println(ans);
                return;
            }
            long[] f = new long[p];
            f[0] = 1;
            int num = 0;
            for (int i = n - 1, cur = 1; i >= 0; i--, cur *= 10, cur %= p) {
                num += (c[i] - '0') * cur;
                num %= p;
                ans += f[num];
                f[num]++;
            }
            w.print(ans);
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

