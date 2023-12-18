import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.AbstractCollection;
import java.util.Comparator;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DLine solver = new DLine();
        solver.solve(1, in, out);
        out.close();
    }

    static class DLine {
        long INF = (long) 1e18 + 1;
        int MAXN = 200005;
        PrintWriter out;
        InputReader in;
        ArrayList<Edge>[] graph = new ArrayList[MAXN];
        long[] hola = new long[MAXN];
        final Comparator<Pair> com = new Comparator<Pair>() {
            public int compare(Pair a, Pair b) {
                if (Long.compare(a.x, b.x) != 0)
                    return Long.compare(a.x, b.x);
                else
                    return Integer.compare(a.y, b.y);
            }
        };

        void dijkstra(int v, int n) {
            long[] dist = new long[n];
            Arrays.fill(dist, INF);
            dist[v] = 0;
            PriorityQueue<Pair> pq = new PriorityQueue<Pair>(com);
            pq.add(new Pair(0, v));
            while (!pq.isEmpty()) {
                Pair curr;
                curr = pq.poll();
                if (curr.x > dist[curr.y])
                    continue;
                for (Edge e : graph[curr.y]) {
                    int neighbour = e.other(curr.y);
                    if (dist[curr.y] + e.wt < dist[neighbour]) {
                        dist[neighbour] = dist[curr.y] + e.wt;
                        pq.add(new Pair(dist[neighbour], neighbour));
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                hola[(int) dist[i]]++;
            }
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            this.out = out;
            this.in = in;
            int n = ni();
            int x = ni() - 1;
            int y = ni() - 1;
            int i = 0;
            for (i = 0; i < n; i++)
                graph[i] = new ArrayList<>();
            for (i = 0; i < n - 1; i++) {
                Edge e = new Edge(i, i + 1, 1);
                graph[i].add(e);
                graph[i + 1].add(e);
            }
            Edge e = new Edge(x, y, 1);
            graph[x].add(e);
            graph[y].add(e);
            for (i = 0; i < n; i++)
                dijkstra(i, n);
            for (i = 1; i < n; i++)
                pn(hola[i] / 2);
        }

        int ni() {
            return in.nextInt();
        }

        void pn(long zx) {
            out.println(zx);
        }

        class Pair {
            long x;
            int y;

            Pair(long p, int q) {
                x = p;
                y = q;
            }

        }

        class Edge {
            int u;
            int v;
            long wt;

            Edge(int a, int b, long w) {
                u = a;
                v = b;
                wt = w;
            }

            int other(int a) {
                return u ^ v ^ a;
            }

        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1)
                throw new UnknownError();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new UnknownError();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public String next() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuffer res = new StringBuffer();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));

            return res.toString();
        }

        private boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }
}

