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
 * @author Sparsh Sanchorawala
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CHAndV solver = new CHAndV();
        solver.solve(1, in, out);
        out.close();
    }

    static class CHAndV {
        public void solve(int testNumber, InputReader s, PrintWriter w) {
            int r = s.nextInt(), c = s.nextInt(), k = s.nextInt();
            char[][] a = new char[r][];
            for (int i = 0; i < r; i++)
                a[i] = s.next().toCharArray();
            int ans = 0;
            for (int i = 0; i < (1 << r); i++) {
                for (int j = 0; j < (1 << c); j++) {
                    int[][] b = new int[r][c];
                    for (int x = 0; x < r; x++) {
                        if (((i >> x) & 1) == 0)
                            continue;
                        for (int y = 0; y < c; y++)
                            b[x][y] = 1;
                    }
                    for (int y = 0; y < c; y++) {
                        if (((j >> y) & 1) == 0)
                            continue;
                        for (int x = 0; x < r; x++)
                            b[x][y] = 1;
                    }
                    int count = 0;
                    for (int x = 0; x < r; x++) {
                        for (int y = 0; y < c; y++) {
                            if (a[x][y] == '#' && b[x][y] == 0)
                                count++;
                        }
                    }
                    if (count == k)
                        ans++;
                }
            }
            w.println(ans);
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

        public int nextInt() {
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

        public String nextString() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                if (Character.isValidCodePoint(c)) {
                    res.appendCodePoint(c);
                }
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
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

        public String next() {
            return nextString();
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

