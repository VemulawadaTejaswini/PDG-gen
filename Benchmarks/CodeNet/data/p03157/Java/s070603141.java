import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Map;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author prakharjain
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        CAlternatingPath solver = new CAlternatingPath();
        solver.solve(1, in, out);
        out.close();
    }

    static class CAlternatingPath {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int h = in.nextInt();
            int w = in.nextInt();

            String[] g = new String[h];

            for (int i = 0; i < h; i++) {
                g[i] = in.next();
            }

            DsuInteger dsu = new
                    DsuInteger(h * w);

            for (int i = 0; i < h * w; i++) {
                dsu.createSet(i);
            }

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    int ci = i * w + j;
                    if (i > 0) {
                        if (g[i].charAt(j) != g[i - 1].charAt(j)) {
                            int pr = (i - 1) * w + j;
                            dsu.mergeSets(ci, pr);
                        }
                    }

                    if (j > 0) {
                        if (g[i].charAt(j) != g[i].charAt(j - 1)) {
                            int pr = i * w + j - 1;
                            dsu.mergeSets(ci, pr);
                        }
                    }
                }
            }

            Map<Integer, Integer> bm = new HashMap<>();
            Map<Integer, Integer> wm = new HashMap<>();

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    int ci = i * w + j;

                    int rep = dsu.findSet(ci);

                    if (!bm.containsKey(rep)) {
                        bm.put(rep, 0);
                        wm.put(rep, 0);
                    }

                    if (g[i].charAt(j) == '#')
                        bm.merge(rep, 1, (x, y) -> x + y);
                    else
                        wm.merge(rep, 1, (x, y) -> x + y);
                }
            }


            long ans = 0;
            for (int key : bm.keySet()) {
                long bs = bm.get(key);
                long ws = wm.get(key);

                ans += bs * ws;
            }

            out.println(ans);
        }

        class DsuInteger {
            int[] parent;
            int[] rank;
            int[] size;
            int n;

            public DsuInteger(int n) {
                this.n = n;
                this.parent = new int[n];
                this.rank = new int[n];
                this.size = new int[n];
            }

            int createSet(int x) {
                parent[x] = x;
                rank[x] = 0;
                size[x] = 1;
                return x;
            }

            int findSet(int x) {
                int par = parent[x];
                if (x != par) {
                    parent[x] = findSet(par);
                    return parent[x];
                }
                return par;
            }

            int mergeSets(int x, int y) {
                int rx = findSet(x);
                int ry = findSet(y);

                if (rx == ry) {
                    return rx;
                }

                int fp = -1;

                if (rank[rx] > rank[ry]) {
                    parent[ry] = rx;
                    fp = rx;
                } else {
                    parent[rx] = ry;
                    fp = ry;
                }

                size[fp] = size[rx] + size[ry];

                if (rank[rx] == rank[ry]) {
                    rank[ry] = rank[ry] + 1;
                }

                return fp;
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

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
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

        public String next() {
            return nextString();
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void close() {
            writer.close();
        }

        public void println(long i) {
            writer.println(i);
        }

    }
}

