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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ECrestedIbisVsMonster solver = new ECrestedIbisVsMonster();
        solver.solve(1, in, out);
        out.close();
    }

    static class ECrestedIbisVsMonster {
        public void solve(int testNumber, FastReader s, PrintWriter out) {
            int h = s.nextInt();
            int n = s.nextInt();
            ECrestedIbisVsMonster.pair[] arr = new ECrestedIbisVsMonster.pair[n];
            for (int i = 0; i < n; i++) {
                arr[i] = new ECrestedIbisVsMonster.pair(s.nextInt(), s.nextInt());
            }

            Arrays.sort(arr);
            int[][] arr1 = new int[h + 1][n];
            for (int i = 0; i <= h; i++) {
                Arrays.fill(arr1[i], -1);
            }
            out.println(func(arr, h, 0, n, arr1));
        }

        private int func(ECrestedIbisVsMonster.pair[] arr, int h, int pos, int n, int[][] arr1) {
            if (h < 0) {
                return 0;
            }

            if (pos == n - 1) {
                if (h % arr[pos].a == 0) {
                    return arr1[h][pos] = (h / arr[pos].a) * arr[pos].b;
                }
                return arr1[h][pos] = (h / arr[pos].a + 1) * arr[pos].b;
            }

            if (arr1[h][pos] != -1) {
                return arr1[h][pos];
            }

            int curr;
            if (h % arr[pos].a == 0) {
                curr = (h / arr[pos].a) * arr[pos].b;
            } else {
                curr = (h / arr[pos].a + 1) * arr[pos].b;
            }
            int i = 0;
            int div = h / arr[pos].a;
            while (i <= div) {
                curr = Math.min(curr, func(arr, h - (arr[pos].a * i), pos + 1, n, arr1) + i * arr[pos].b);
                i++;
            }
            return arr1[h][pos] = curr;
        }

        private static class pair implements Comparable<ECrestedIbisVsMonster.pair> {
            int a;
            int b;

            public pair(int a, int b) {
                this.a = a;
                this.b = b;
            }

            public int compareTo(ECrestedIbisVsMonster.pair o) {
                if (this.a == o.a) {
                    return Integer.compare(this.b, o.b);
                }
                return Integer.compare(o.a, this.a);
            }

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

