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
        AizuSP1 solver = new AizuSP1();
        solver.solve(1, in, out);
        out.close();
    }

    static class AizuSP1 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            final AizuSP1.Vertex[] g = new AizuSP1.Vertex[n];
            for (int i = 0; i < n; i++) {
                g[i] = new AizuSP1.Vertex();
            }

            Map<AizuSP1.Edge, Integer> weights = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int f = in.nextInt();
                int k = in.nextInt();
                for (int j = 0; j < k; j++) {
                    int t = in.nextInt();
                    int w = in.nextInt();

                    g[f].vs.add(t);
                    weights.put(new AizuSP1.Edge(f, t), w);
                }
            }

            int[][] table = buildDistanceTable(g, 0, weights);
            for (int i = 0; i < n; i++) {
                out.printf("%d %d\n", i, table[i][0]);
            }
        }

        private int[][] buildDistanceTable(final AizuSP1.Vertex[] g, final int s, final Map<AizuSP1.Edge, Integer> weights) {
            int[][] table = new int[g.length][2];
            for (int i = 0; i < g.length; i++) {
                table[i][0] = Integer.MAX_VALUE;
                table[i][1] = -1;
            }

            table[s][0] = 0;
            table[s][1] = s;

            PriorityQueue<AizuSP1.VertexInfo> pq = new PriorityQueue<>((x, y) -> Integer.compare(x.weight, y.weight));
            pq.add(new AizuSP1.VertexInfo(s, 0));

            while (!pq.isEmpty()) {
                final AizuSP1.VertexInfo v = pq.poll();

                for (int vv : g[v.vertex].vs) {
                    final AizuSP1.Edge e = new AizuSP1.Edge(v.vertex, vv);
                    int d = table[v.vertex][0] + weights.get(e);
                    if (d < table[vv][0]) {
                        table[vv][0] = d;
                        table[vv][1] = v.vertex;
                        pq.add(new AizuSP1.VertexInfo(vv, weights.get(e)));
                    }
                }
            }

            return table;
        }

        static class VertexInfo {
            int vertex;
            int weight;

            VertexInfo(final int vertex, final int weight) {
                this.vertex = vertex;
                this.weight = weight;
            }

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

            Edge(final int from, final int to) {
                this.from = from;
                this.to = to;
            }


            public boolean equals(final Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                final AizuSP1.Edge edge = (AizuSP1.Edge) o;
                return from == edge.from &&
                        to == edge.to;
            }


            public int hashCode() {
                return Objects.hash(from, to);
            }

        }

    }
}


