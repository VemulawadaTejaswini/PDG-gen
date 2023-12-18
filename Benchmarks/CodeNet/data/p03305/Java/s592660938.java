import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.TreeSet;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        inclass in = new inclass(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DSavingSnuuk solver = new DSavingSnuuk();
        solver.solve(1, in, out);
        out.close();
    }

    static class DSavingSnuuk {
        static int n;
        static int m;
        static int s;
        static int f;
        static long inf = (long) 1e15;

        public void solve(int testNumber, inclass in, PrintWriter out) {
            n = in.nextInt();
            m = in.nextInt();
            s = in.nextInt() - 1;
            f = in.nextInt() - 1;

            ArrayList<DSavingSnuuk.pair>[] gy = new ArrayList[n];
            ArrayList<DSavingSnuuk.pair>[] gk = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                gy[i] = new ArrayList<>();
                gk[i] = new ArrayList<>();
            }
            for (int i = 0; i < m; i++) {
                int a = in.nextInt() - 1, b = in.nextInt() - 1, y = in.nextInt(), s = in.nextInt();
                gy[a].add(mp(y, b));
                gy[b].add(mp(y, a));
                gk[b].add(mp(s, a));
                gk[a].add(mp(s, b));
            }
            long[] distk = new long[n];
            long[] disty = new long[n];
            dij(s, disty, gy);
            dij(f, distk, gk);
            long ans[] = new long[n];
            TreeSet<Long> set = new TreeSet<>();
            for (int i = 0; i < n; i++) {
                ans[i] = distk[i] + disty[i];
                set.add(ans[i]);
            }
            for (int i = 0; i < n; i++) {
                out.println(inf - set.first());
                set.remove(ans[i]);
            }

        }

        static void dij(int source, long dist[], ArrayList<DSavingSnuuk.pair> g[]) {
            TreeSet<DSavingSnuuk.pair> set = new TreeSet<>();
            for (int i = 0; i < n; i++) {
                dist[i] = inf;
                if (i == source) {
                    set.add(mp(0, i));
                    dist[source] = 0;
                } else
                    set.add(mp(dist[i], i));
            }
            while (!set.isEmpty()) {
                DSavingSnuuk.pair p1 = set.pollFirst();
                long u = p1.node;
                long ditance_from_source = p1.dist;
                for (DSavingSnuuk.pair p : g[(int) u]) {
                    long v = p.node;
                    long edge_dist_from_u_to_v = p.dist;
                    if (dist[(int) v] > edge_dist_from_u_to_v + dist[(int) u]) {
                        set.remove(mp(dist[(int) v], v));
                        dist[(int) v] = edge_dist_from_u_to_v + dist[(int) u];
                        set.add(mp(dist[(int) v], v));
                    }
                }
            }
        }

        static DSavingSnuuk.pair mp(long a, long b) {
            return new DSavingSnuuk.pair(a, b);
        }

        static class pair implements Comparable<DSavingSnuuk.pair> {
            long dist;
            long node;

            pair(long a, long b) {
                dist = a;
                node = b;
            }

            public int compareTo(DSavingSnuuk.pair p) {
                if (dist - p.dist == 0) {
                    return ((int) (node - p.node));
                }
                return (int) (dist - p.dist);
            }

        }

    }

    static class inclass {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private inclass.SpaceCharFilter filter;

        public inclass(InputStream stream) {
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

