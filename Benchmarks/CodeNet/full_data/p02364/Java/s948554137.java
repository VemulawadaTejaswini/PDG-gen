import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Objects;
import java.util.AbstractCollection;
import java.util.PriorityQueue;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        AizuMST solver = new AizuMST();
        solver.solve(1, in, out);
        out.close();
    }

    static class AizuMST {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();

            final AizuMST.Vertex[] g = new AizuMST.Vertex[n];
            for (int i = 0; i < n; i++) {
                g[i] = new AizuMST.Vertex();
            }

            Map<AizuMST.Edge, Integer> weights = new HashMap<>();
            for (int j = 0; j < m; j++) {
                int f = in.nextInt();
                int t = in.nextInt();
                int w = in.nextInt();

                g[f].vs.add(t);
                g[t].vs.add(f);
                weights.put(new AizuMST.Edge(f, t, w), w);
                weights.put(new AizuMST.Edge(t, f, w), w);
            }

            out.printf("%d\n", prims(g, 0, weights));
        }

        private int prims(final AizuMST.Vertex[] g, final int s, final Map<AizuMST.Edge, Integer> weights) {
            Set<Integer> visited = new HashSet<>();
            visited.add(s);

            Set<AizuMST.Edge> mst = new HashSet<>();

            PriorityQueue<AizuMST.Edge> pq = new PriorityQueue<>((x, y) -> Integer.compare(x.weight, y.weight));
            for (int v : g[s].vs) {
                pq.add(new AizuMST.Edge(s, v, weights.get(new AizuMST.Edge(s, v, -1))));
            }

            while (!pq.isEmpty()) {
                final AizuMST.Edge e = pq.poll();

                if (visited.contains(e.to)) {
                    continue;
                }

                visited.add(e.to);
                for (int vv : g[e.to].vs) {
                    pq.add(new AizuMST.Edge(e.to, vv, weights.get(new AizuMST.Edge(e.to, vv, -1))));
                }
                mst.add(e);
            }

            int w = 0;
            for (final AizuMST.Edge e : mst) {
                w += e.weight;
            }

            return w;
        }

        static class Vertex {
            Set<Integer> vs;

            Vertex() {
                vs = new HashSet<>();
            }

        }

        static class Edge {
            int from;
            int to;
            int weight;

            Edge(final int from, final int to, final int weight) {
                this.from = from;
                this.to = to;
                this.weight = weight;
            }


            public boolean equals(Object o) {
                if (o == null || !(o instanceof AizuMST.Edge)) {
                    return false;
                }

                final AizuMST.Edge other = (AizuMST.Edge) o;
                return other.from == from && other.to == to ||
                        other.from == to && other.to == from;
            }


            public int hashCode() {
                return Objects.hash(from, to);
            }

        }

    }
}


