import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(in, out);
        out.close();
    }

    static class Task {
        int V, E, r;

        void solve(InputReader in, PrintWriter out) {
            V = in.nextInt();
            E = in.nextInt();
            r = in.nextInt();

            BellmanFord bf = new BellmanFord(V);

            for (int i = 0; i < E; ++i) {
                int u = in.nextInt();
                int v = in.nextInt();
                int w = in.nextInt();
                bf.addEdge(u, v, w);
            }

            bf.setDistances(r);

            if (bf.hasNegativeCycle()) {
                out.println("NEGATIVE CYCLE");
                return;
            }

            for (int i = 0; i < V; ++i) {
                int d = bf.getDistance(i);
                out.println(d == Integer.MAX_VALUE ? "INF" : d);
            }
        }
    }

    static class BellmanFord {
        private static int INF = Integer.MAX_VALUE;

        private int[] dst;
        private List<Edge> edges;

        private class Edge {
            int src;
            int dest;
            int weight;

            Edge(int s, int d, int w) {
                this.src = s;
                this.dest = d;
                this.weight = w;
            }
        }

        public BellmanFord(int n) {
            this.dst = new int[n];
            this.edges = new ArrayList<>();
        }

        public boolean hasNegativeCycle() {
            for (Edge e : edges) {
                int u = e.src;
                int v = e.dest;
                int w = e.weight;

                if (dst[u] != INF && dst[u] + w < dst[v]) {
                    return true;
                }
            }
            return false;
        }

        public int getDistance(int node) {
            return dst[node];
        }

        public void setDistances(int sp) {
            Arrays.fill(dst, INF);
            dst[sp] = 0;

            for (int i = 0; i < dst.length; ++i) {
                for (Edge e : edges) {
                    int u = e.src;
                    int v = e.dest;
                    int w = e.weight;

                    if (dst[u] != INF && dst[u] + w < dst[v]) {
                        dst[v] = dst[u] + w;
                    }
                }
            }
        }

        public void addEdge(int u, int v, int w) {
            edges.add(new Edge(u, v, w));
        }
    }

    static class InputReader {
        static int BUFSIZE = 32768;

        BufferedReader reader;
        StringTokenizer tokenizer;

        InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), BUFSIZE);
            tokenizer = null;
        }

        String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int n) {
            int[] arr = new int[n];
            for (int i = 0; i < n; ++i) {
                arr[i] = nextInt();
            }
            return arr;
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        long[] nextLongArray(int n) {
            long[] arr = new long[n];
            for (int i = 0; i < n; ++i) {
                arr[i] = nextLong();
            }
            return arr;
        }
    }
}

