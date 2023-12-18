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
        DLamp solver = new DLamp();
        solver.solve(1, in, out);
        out.close();
    }

    static class DLamp {
        public void solve(int testNumber, FastReader s, PrintWriter w) {
            int n = s.nextInt(), m = s.nextInt(), max = 0, l[][] = new int[n][m], r[][] = new int[n][m], u[][] = new int[n][m], d[][] = new int[n][m];
            char c[][] = new char[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if ((c[i][j] = s.nextChar()) == '.') {
                        if (i == 0) u[i][j] = -1;
                        else u[i][j] = u[i - 1][j];
                        if (j == 0) l[i][j] = -1;
                        else l[i][j] = l[i][j - 1];
                    } else {
                        u[i][j] = i;
                        l[i][j] = j;
                    }
                }
            }
            for (int i = n - 1; i >= 0; i--) {
                for (int j = m - 1; j >= 0; j--) {
                    if (c[i][j] == '.') {
                        if (i == n - 1) d[i][j] = n;
                        else d[i][j] = d[i + 1][j];
                        if (j == m - 1) r[i][j] = m;
                        else r[i][j] = r[i][j + 1];
                        max = Math.max(max, r[i][j] - l[i][j] + d[i][j] - u[i][j] - 3);
                    } else {
                        d[i][j] = i;
                        r[i][j] = j;
                    }
                }
            }
            w.println(max);
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

        public char nextChar() {

            int c = read();

            while (isSpaceChar(c))
                c = read();

            return (char) c;
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

