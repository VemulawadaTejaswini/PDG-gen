import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.AbstractCollection;
import java.util.PriorityQueue;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Comparator;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Jeel Vaishnav
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BEvenDegrees solver = new BEvenDegrees();
        solver.solve(1, in, out);
        out.close();
    }

    static class BEvenDegrees {
        public void solve(int testNumber, InputReader sc, PrintWriter out) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            if (m % 2 == 1) {
                out.print("-1");
                return;
            }

            Edge e[] = new Edge[m];
            for (int i = 0; i < m; ++i) {
                e[i] = new Edge(sc.nextInt() - 1, sc.nextInt() - 1);
            }

            HashSet<Integer> adj[] = new HashSet[n];
            for (int i = 0; i < n; ++i)
                adj[i] = new HashSet<>();

            for (int i = 0; i < m; ++i) {
                adj[e[i].u].add(i);
                adj[e[i].v].add(i);
            }

            int deg[] = new int[n];
            int vis[] = new int[n];

            PriorityQueue<Pair> queue = new PriorityQueue<Pair>(new Comparator<Pair>() {

                public int compare(Pair o1, Pair o2) {
                    return o1.deg - o2.deg;
                }
            });

            for (int i = 0; i < n; ++i)
                queue.add(new Pair(i, adj[i].size()));

            while (!queue.isEmpty()) {
                Pair curP = queue.poll();

                int idx = curP.idx;
                int cdeg = curP.deg;

                if (vis[idx] == 1 || adj[idx].size() != cdeg)
                    continue;

                vis[idx] = 1;

                int poss = cdeg;
                if ((poss + deg[idx]) % 2 == 1) {
                    int edgeInd = -1;
                    for (int j : adj[idx]) {
                        edgeInd = j;
                        break;
                    }

                    int v = e[edgeInd].findAnother(idx);
                    deg[v]++;
                    e[edgeInd].setSrc(v);
                    adj[v].remove(edgeInd);
                    adj[idx].remove(edgeInd);
                    queue.add(new Pair(v, adj[v].size()));
                }

                for (int edgeInd : adj[idx]) {
                    int v = e[edgeInd].findAnother(idx);
                    e[edgeInd].setSrc(idx);
                    adj[v].remove(edgeInd);
                    queue.add(new Pair(v, adj[v].size()));
                }

                adj[idx].clear();
            }

            for (Edge curE : e) {
                out.println((curE.u + 1) + " " + (curE.v + 1));
            }
        }

        class Pair {
            int idx;
            int deg;

            Pair(int a, int b) {
                idx = a;
                deg = b;
            }

        }

        class Edge {
            int u;
            int v;

            Edge(int a, int b) {
                u = a;
                v = b;
            }

            void setSrc(int a) {
                if (v == a) {
                    v = u;
                    u = a;
                }
            }

            int findAnother(int a) {
                if (u == a)
                    return v;
                return u;
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

