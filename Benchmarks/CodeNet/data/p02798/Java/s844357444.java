import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Comparator;
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
        DSwapAndFlip solver = new DSwapAndFlip();
        solver.solve(1, in, out);
        out.close();
    }

    static class DSwapAndFlip {
        public void solve(int testNumber, InputReader s, PrintWriter w) {
            int n = s.nextInt();
            int[][] a = new int[2][n];
            for (int i = 0; i < n; i++)
                a[0][i] = s.nextInt();
            for (int i = 0; i < n; i++)
                a[1][i] = s.nextInt();
            int res = 1000;
            Comparator<Pair> comparator = new Comparator<Pair>() {

                public int compare(Pair p1, Pair p2) {
                    if (p1.w < p2.w)
                        return -1;
                    if (p1.w > p2.w)
                        return 1;
                    return 0;
                }
            };
            outer:
            for (int mask = 0; mask < (1 << n); mask++) {
                Pair[] p = new Pair[n];
                int[] b = new int[n];
                int temp = mask;
                int c = 0;
                while (temp > 0) {
                    p[c] = new Pair(c, a[temp & 1][c]);
                    b[c] = temp & 1;
                    temp = temp >> 1;
                    c++;
                }
                while (c < n) {
                    p[c] = new Pair(c, a[0][c]);
                    c++;
                }
                Arrays.sort(p, comparator);
                int i = 0;
                while (i < n) {
                    int j = i;
                    while (j < n && p[j].w == p[i].w)
                        j++;
                    for (int x = i; x < j; x++) {
                        if (((p[x].i + b[p[x].i]) & 1) == (x & 1))
                            continue;
                        boolean b1 = false;
                        for (int y = x + 1; y < j; y++) {
                            if (((p[y].i + b[p[y].i]) & 1) == (x & 1)) {
                                Pair t1 = p[x];
                                p[x] = p[y];
                                p[y] = t1;
                                b1 = true;
                                break;
                            }
                        }
                        if (!b1)
                            continue outer;
                    }
                    for (int x = i; x < j; x += 2) {
                        for (int y = x + 2; y < j; y += 2) {
                            if (p[x].i > p[y].i) {
                                Pair t1 = p[x];
                                p[x] = p[y];
                                p[y] = t1;
                            }
                        }
                    }
                    for (int x = i + 1; x < j; x += 2) {
                        for (int y = x + 2; y < j; y += 2) {
                            if (p[x].i > p[y].i) {
                                Pair t1 = p[x];
                                p[x] = p[y];
                                p[y] = t1;
                            }
                        }
                    }
                    i = j;
                }
                int cost = 0;
                for (int x = 0; x < n; x++) {
                    for (int y = x + 1; y < n; y++) {
                        if (p[x].i > p[y].i)
                            cost++;
                    }
                }
                res = Math.min(cost, res);
            }
            if (res == 1000)
                w.println(-1);
            else
                w.println(res);
        }

        class Pair {
            int i;
            int w;

            Pair(int i, int w) {
                this.i = i;
                this.w = w;
            }

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

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

