import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.InputMismatchException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.ArrayList;

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
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int v = in.nextInt();
            int e = in.nextInt();
            int r = in.nextInt();

            BellmanFord bellmanFord = new BellmanFord(v);
            for (int i = 0; i < e; i++) {
                int from = in.nextInt();
                int to = in.nextInt();
                int cost = in.nextInt();

                bellmanFord.addUndirectedEdge(from, to, cost);
            }

            int[] dist = bellmanFord.getDist(r);
            if (dist == null) {
                out.println("NEGATIVE CYCLE");
            } else {
                int INF = Integer.MAX_VALUE / 3;
                for (int i = 0; i < v; i++) {
                    out.println(dist[i] == INF ? "INF" : dist[i]);
                }
            }
        }

    }

    static class BellmanFord {
        int n;
        ArrayList<Edge> edges = new ArrayList<Edge>();
        int INF = Integer.MAX_VALUE / 3;

        public BellmanFord(int n) {
            this.n = n;
        }

        public void addUndirectedEdge(int from, int to, int cost) {
            edges.add(new Edge(from, to, cost));
            edges.add(new Edge(from, to, cost));
        }

        public int[] getDist(int s) {
            int[] dist = new int[n];
            Arrays.fill(dist, INF);

            dist[s] = 0;
            for (int i = 0; i < n; i++) {
                boolean update = false;
                for (Edge edge : edges) {
                    if (dist[edge.from] != INF && dist[edge.from] + edge.cost < dist[edge.to]) {
                        dist[edge.to] = dist[edge.from] + edge.cost;

                        if (i == n - 1) return null;
                        update = true;
                    }
                }
                if (!update) break;
            }

            return dist;
        }

        class Edge {
            int from;
            int to;
            int cost;

            Edge(int from, int to, int cost) {
                this.from = from;
                this.to = to;
                this.cost = cost;
            }

        }

    }

    static class InputReader {
        BufferedReader in;
        StringTokenizer tok;

        public String nextString() {
            while (!tok.hasMoreTokens()) {
                try {
                    tok = new StringTokenizer(in.readLine(), " ");
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
            }
            return tok.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextString());
        }

        public InputReader(InputStream inputStream) {
            in = new BufferedReader(new InputStreamReader(inputStream));
            tok = new StringTokenizer("");
        }

    }
}