import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.AbstractCollection;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Comparator;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EHopscotchAddict solver = new EHopscotchAddict();
        solver.solve(1, in, out);
        out.close();
    }

    static class EHopscotchAddict {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int n = in.nextInt();
            int m = in.nextInt();
            Graph g = new Graph(3 * n);

            for (int i = 0; i < m; i++) {
                int u = in.nextInt() - 1;
                int v = in.nextInt() - 1;

                g.addEdge(new Edge((u + n * 0) % (3 * n), (v + n * 1) % (3 * n), 1));
                g.addEdge(new Edge((u + n * 1) % (3 * n), (v + n * 2) % (3 * n), 1));
                g.addEdge(new Edge((u + n * 2) % (3 * n), (v + n * 0) % (3 * n), 1));
            }

            long[] dist = g.dijkstra(in.nextInt() - 1);
            long res = dist[in.nextInt() - 1];
            out.println(res == (long) 1e18 ? -1 : res / 3);

        }

    }

    static class Graph {
        int n;
        ArrayList<Edge>[] adj;
        long[] vertexCost;

        public Graph(int size) {
            n = size;
            adj = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                adj[i] = new ArrayList<>();
            }
            vertexCost = new long[n];
        }

        public void addEdge(Edge e) {
            adj[e.from].add(e);
        }

        public long[] dijkstra(int from) {
            long[] d = new long[n];
            PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparing(e -> d[e]));
            for (int i = 0; i < n; i++) {
                d[i] = (i == from) ? 0 : (long) 1e18;
                pq.add(i);
            }
            // System.out.println(Arrays.toString(pq.toArray()));
            while (!pq.isEmpty()) {
                int search = pq.poll();
                // System.out.println("now: " + search);
                ArrayList<Edge> edges = adj[search];
                for (Edge e : edges) {
                    // System.out.println(e.toString());
                    long cmp = d[search] + e.cost;
                    if (d[e.to] > d[search] + e.cost) {
                        // 更新が入る
                        // 処理を入れたい場合はここに入れる
                        d[e.to] = d[search] + e.cost;
                        pq.add(e.to);
                    }
                }
                //  System.out.println(Arrays.toString(pq.toArray()));
            }
            return d;
        }

    }

    static class Edge {
        int from;
        int to;
        long cost;

        public Edge(int to) {
            this.to = to;
        }

        public Edge(int to, long cost) {
            this.to = to;
            this.cost = cost;
        }

        public Edge(int from, int to, long cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }

        public String toString() {
            return "Edge{" +
                    "from=" + from +
                    ", to=" + to +
                    ", cost=" + cost +
                    '}';
        }

    }
}

