import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        DLunlunNumber solver = new DLunlunNumber();
        solver.solve(1, in, out);
        out.close();
    }

    static class DLunlunNumber {
        public void solve(int testNumber, FastReader s, PrintWriter w) {
            char[] c = new char[10];
            Arrays.fill(c, '0');
            int k = s.nextInt(), sz = 1;
            if (k < 10) {
                w.println(k);
                return;
            }
            k -= 10;
            c[8] = '1';
            while (k-- > 0) {
                boolean f = false;
                for (int i = 9; i >= 10 - sz; i--) {
                    if (c[i] != '9' && Math.abs(c[i] + 1 - c[i - 1]) <= 1) {
                        c[i]++;
                        for (int j = i + 1; j < 10; j++) c[j] = (char) Math.max('0', c[j - 1] - 1);
                        f = true;
                        break;
                    }
                }
                if (!f) {
                    if (c[9 - sz] == '9') {
                        sz++;
                        //if(9-sz<0) break;
                        c[9 - sz] = '1';
                        for (int i = 9 - sz + 1; i < 10; i++) c[i] = '0';
                    } else {
                        c[9 - sz]++;
                        for (int i = 9 - sz + 1; i < 10; i++) c[i] = (char) Math.max('0', c[i - 1] - 1);
                    }
                }
            }
            w.println(c);
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

