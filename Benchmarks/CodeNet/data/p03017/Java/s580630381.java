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
        AKenkenRace solver = new AKenkenRace();
        solver.solve(1, in, out);
        out.close();
    }

    static class AKenkenRace {
        public void solve(int testNumber, FastReader s, PrintWriter w) {
            int n = s.nextInt(), a = s.nextInt() - 1, b = s.nextInt() - 1, c1 = s.nextInt() - 1, d = s.nextInt() - 1, cdot = 0, crock = 0;
            boolean dot3 = false;
            char c[] = s.next().toCharArray();
            for (int i = a; i <= Math.max(c1, d); i++) {
                if (c[i] == '.') {
                    crock = 0;
                } else {
                    crock++;
                }
                if (crock == 2) {
                    w.println("No");
                    return;
                }
            }
            if (c1 < d) {
                w.println("Yes");
                return;
            }
            for (int i = b - 1; i <= d; i++) {
                if (c[i] == '.') {
                    cdot++;
                } else {
                    cdot = 0;
                }
                if (cdot == 3) dot3 = true;
            }
            if (c1 > d && !dot3) {
                w.println("No");
                return;
            }
            w.println("Yes");
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

