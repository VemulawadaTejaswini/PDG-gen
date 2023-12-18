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
 * @author Dhanin Gupta
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DRGBTriplets solver = new DRGBTriplets();
        solver.solve(1, in, out);
        out.close();
    }

    static class DRGBTriplets {
        public void solve(int testNumber, InputReader in, PrintWriter w) {
            int n = in.nextInt();
            long ans = 0;

            char[] a = (" " + in.next()).toCharArray();

            int[] r = new int[n + 1];
            int[] g = new int[n + 1];
            int[] b = new int[n + 1];
            r[0] = 0;
            g[0] = 0;
            b[0] = 0;
            for (int i = 1; i <= n; i++) {
                r[i] = r[i - 1];
                b[i] = b[i - 1];
                g[i] = g[i - 1];
                if (a[i] == 'R')
                    r[i]++;
                if (a[i] == 'G')
                    g[i]++;
                if (a[i] == 'B')
                    b[i]++;

            }

            for (int i = 1; i <= n; i++) {
                for (int k = i + 2; k <= n; k++) {
                    if (a[k] != a[i]) {
                        if (a[i] == 'R') {
                            if (a[k] == 'G') {
                                ans += b[k - 1] - b[i];

                                if ((i + k) % 2 == 0) {
                                    if (a[(i + k) / 2] == 'B')
                                        ans--;
                                }
                            } else if (a[k] == 'B') {
                                ans += g[k - 1] - g[i];
                                if ((i + k) % 2 == 0) {
                                    if (a[(i + k) / 2] == 'G')
                                        ans--;
                                }
                            }
                        } else if (a[i] == 'G') {
                            if (a[k] == 'R') {
                                ans += b[k - 1] - b[i];

                                if ((i + k) % 2 == 0) {
                                    if (a[(i + k) / 2] == 'B')
                                        ans--;
                                }
                            } else if (a[k] == 'B') {
                                ans += r[k - 1] - r[i];
                                if ((i + k) % 2 == 0) {
                                    if (a[(i + k) / 2] == 'R')
                                        ans--;
                                }
                            }
                        } else if (a[i] == 'B') {
                            if (a[k] == 'G') {
                                ans += r[k - 1] - r[i];

                                if ((i + k) % 2 == 0) {
                                    if (a[(i + k) / 2] == 'R')
                                        ans--;
                                }
                            } else if (a[k] == 'R') {
                                ans += g[k - 1] - g[i];
                                if ((i + k) % 2 == 0) {
                                    if (a[(i + k) / 2] == 'G')
                                        ans--;
                                }
                            }
                        }
                    }
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

        public String readString() {
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

        public String next() {
            return readString();
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

