import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.util.HashMap;
import java.io.IOException;
import java.util.Objects;
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
        BPickingUp solver = new BPickingUp();
        solver.solve(1, in, out);
        out.close();
    }

    static class BPickingUp {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();

            int[][] c = new int[n][2];

            for (int i = 0; i < n; i++) {
                c[i][0] = in.nextInt();
                c[i][1] = in.nextInt();
            }

            int ans = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int p = c[j][0] - c[i][0];
                    int q = c[j][1] - c[i][1];

                    if (p == 0 && q == 0) {
                        continue;
                    }

                    ans = Math.min(ans, calMin(p, q, c));
                }
            }

            out.println(ans);
        }

        int calMin(int p, int q, int[][] c) {
            int n = c.length;

            DsuInteger dsu = new DsuInteger(n);

            for (int i = 0; i < n; i++) {
                dsu.createSet(i);
            }

            Map<coo, Integer> coo = new HashMap<>();

            for (int i = 0; i < n; i++) {
                coo.merge(new coo(c[i][0], c[i][1]), 1, (x, y) -> x + y);
            }

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int cp = c[j][0] - c[i][0];
                    int cq = c[j][1] - c[i][1];

                    if (cp == p && cq == q) {
                        dsu.mergeSets(i, j);
                    }
                }
            }

            Map<Integer, Integer> mp = new HashMap<>();

            for (int i = 0; i < n; i++) {
                int fs = dsu.findSet(i);
                mp.merge(fs, coo.get(new coo(c[i][0], c[i][1])), (x, y) -> Math.max(x, y));
            }

            int ans = 0;

            for (int val : mp.values()) {
                ans += val;
            }

            return ans;
        }

        class coo {
            int x;
            int y;

            public coo(int x, int y) {
                this.x = x;
                this.y = y;
            }

            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                coo coo = (coo) o;
                return x == coo.x &&
                        y == coo.y;
            }

            public int hashCode() {
                return Objects.hash(x, y);
            }

        }

        class DsuInteger {
            int[] parent;
            int[] rank;
            int[] size;
            int n;
            int ts = 0;

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
                ts++;
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

                ts--;

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

        public void println(int i) {
            writer.println(i);
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

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

