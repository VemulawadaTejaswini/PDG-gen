import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
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
        EWeightsOnVerticesAndEdges solver = new EWeightsOnVerticesAndEdges();
        solver.solve(1, in, out);
        out.close();
    }

    static class EWeightsOnVerticesAndEdges {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();

            long[] x = in.nextLongArray(n);

            List<edge> edges = new ArrayList<>();

            for (int i = 0; i < m; i++) {
                int u = in.nextInt();
                int v = in.nextInt();
                long w = in.nextInt();

                u--;
                v--;

                edge edge = new edge(u, v, w, i);

                edges.add(edge);
            }

            edges.sort((s, y) -> (int) Math.signum(s.w - y.w));

            int lo = 0;
            int hi = m;


            int ans = 0;
            while (lo <= hi) {
                int mid = (lo + hi) / 2;

                DsuInteger dsu = new DsuInteger(n);
                dsu.w = x;

                for (int i = 0; i < n; i++) {
                    dsu.createSet(i);
                }

                for (int i = 0; i < mid; i++) {
                    edge ce = edges.get(i);
                    dsu.mergeSets(ce.u, ce.v);
                }

                boolean poss = true;
                for (int i = 0; i < mid; i++) {
                    edge ce = edges.get(i);

                    long vw = dsu.size[dsu.findSet(ce.u)];
                    vw = Math.max(vw, dsu.size[dsu.findSet(ce.v)]);

                    if (vw < ce.w) {
                        poss = false;
                        break;
                    }
                }


                if (poss) {
                    int ca = mid;
                    for (int i = mid; i < m; i++) {
                        edge ce = edges.get(i);

                        if (dsu.findSet(ce.u) == dsu.findSet(ce.v)) {
                            long vw = dsu.size[dsu.findSet(ce.u)];
                            vw = Math.max(vw, dsu.size[dsu.findSet(ce.v)]);
                            if (vw >= ce.w) {
                                ca++;
                            }
                        } else {
                            long vw = dsu.size[dsu.findSet(ce.u)];
                            vw = Math.max(vw, dsu.size[dsu.findSet(ce.v)]);
                            if (ce.w <= vw) {
                                ca++;
                                dsu.mergeSets(ce.u, ce.v);
                            }
                        }


                    }

                    ans = Math.max(ans, ca);
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }

            out.println(m - ans);
        }

        class DsuInteger {
            int[] parent;
            int[] rank;
            long[] size;
            int n;
            long[] w;

            public DsuInteger(int n) {
                this.n = n;
                this.parent = new int[n];
                this.rank = new int[n];
                this.size = new long[n];
            }

            int createSet(int x) {
                parent[x] = x;
                rank[x] = 0;
                size[x] = w[x];
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

        class edge {
            int u;
            int v;
            long w;
            int i;

            public edge(int u, int v, long w, int i) {
                this.u = u;
                this.v = v;
                this.w = w;
                this.i = i;
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

        public long nextLong() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
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

        public long[] nextLongArray(int n) {
            long[] array = new long[n];
            for (int i = 0; i < n; ++i) array[i] = nextLong();
            return array;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

