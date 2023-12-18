import java.io.*;
import java.util.*;

public class Main {
    private static class Solver {
        static class Edge {
            int v, w;
            Edge(int v, int w) {
                this.v = v;
                this.w = w;
            }
        }
        static class State implements Comparable<State> {
            int u;
            long d;
            State(int u, long d) {
                this.u = u;
                this.d = d;
            }
            @Override
            public int compareTo(State S) {
                if (d < S.d) {
                    return -1;
                }
                if (d > S.d) {
                    return 1;
                }
                return u - S.u;
            }
        }

        final long INF = (long) 1e18;
        final long BALANCE = (long) 1e15;

        int n, m, s, t;
        List<Edge>[] adjA;
        List<Edge>[] adjB;

        long[] Dijkstra(List<Edge>[] adj, int s) {
            PriorityQueue<State> pq = new PriorityQueue<>();
            long[] d = new long[n];
            for (int i = 0; i < n; ++i) {
                d[i] = (i == s) ? 0 : INF;
                pq.add(new State(i, d[i]));
            }
            while (!pq.isEmpty()) {
                State S = pq.poll();
                int u = S.u;
                if (S.d > d[u]) {
                    continue;
                }
                for (Edge e: adj[u]) {
                    int v = e.v;
                    int w = e.w;
                    if (d[v] > d[u] + w) {
                        d[v] = d[u] + w;
                        pq.add(new State(v, d[v]));
                    }
                }
            }
            return d;
        }

        private void Solve() {
            n = inp.nextInt();
            m = inp.nextInt();
            s = inp.nextInt() - 1;
            t = inp.nextInt() - 1;
            adjA = new ArrayList[n];
            adjB = new ArrayList[n];
            for (int i = 0; i < n; ++i) {
                adjA[i] = new ArrayList<>();
                adjB[i] = new ArrayList<>();
            }
            for (int i = 0; i < m; ++i) {
                int u = inp.nextInt() - 1;
                int v = inp.nextInt() - 1;
                int a = inp.nextInt();
                int b = inp.nextInt();
                adjA[u].add(new Edge(v, a));
                adjA[v].add(new Edge(u, a));
                adjB[u].add(new Edge(v, b));
                adjB[v].add(new Edge(u, b));
            }

            long[] ds = Dijkstra(adjA, s);
            long[] dt = Dijkstra(adjB, t);

            long[] ans = new long[n + 1];
            ans[n] = INF;
            for (int i = n - 1; i >= 0; --i) {
                ans[i] = Math.min(ans[i + 1], ds[i] + dt[i]);
            }

            for (int i = 0; i < n; ++i) {
                out.println(BALANCE - ans[i]);
            }
        }
        static InputReader inp;
        static PrintWriter out;
    }

    private static class InputReader {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        private InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        private String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        private int nextInt() {
            return Integer.parseInt(next());
        }
        private long nextLong() {
            return Long.parseLong(next());
        }
        private int[] nextArrayInt(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; ++i) {
                a[i] = nextInt();
            }
            return a;
        }
    }
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Solver.inp = new InputReader(inputStream);
        Solver.out = new PrintWriter(outputStream);
        Solver solver = new Solver();
        solver.Solve();
        Solver.out.close();
    }
}