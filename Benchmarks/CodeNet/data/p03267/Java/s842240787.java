import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.UncheckedIOException;
import java.util.List;
import java.util.stream.Stream;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;
import java.util.function.IntFunction;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        LightScanner in = new LightScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DPeopleOnALine solver = new DPeopleOnALine();
        solver.solve(1, in, out);
        out.close();
    }

    static class DPeopleOnALine {
        private static final String YES = "Yes";
        private static final String NO = "No";

        public void solve(int testNumber, LightScanner in, PrintWriter out) {
            int n = in.ints(), m = in.ints();
            int[] l = new int[m], r = new int[m], d = new int[m];
            ShortestPathSolver solver = ShortestPathSolver.Algorithm.WARSHALL_FLOYD.getInstance(n);
            for (int i = 0; i < m; i++) {
                l[i] = in.ints() - 1;
                r[i] = in.ints() - 1;
                d[i] = in.ints();
                solver.addEdge(l[i], r[i], d[i]);
            }
            for (int i = 0; i < m; i++) {
                if (solver.shortestPath(l[i], r[i]) != d[i] || solver.shortestPath(r[i], l[i]) < Integer.MAX_VALUE) {
                    out.println(NO);
                    return;
                }
            }
            out.println(YES);
        }

    }

    static class BellmanFord implements ShortestPathSolver {
        int nodes;
        List<BellmanFord.Edge> edges;
        long[] distance;

        public BellmanFord(int n) {
            nodes = n;
            edges = new ArrayList<>();
            distance = new long[n];
        }

        public void addEdge(int from, int to, int cost) {
            edges.add(new BellmanFord.Edge(from, to, cost));
        }

        public long shortestPath(int src, int dst) {
            Arrays.fill(distance, Long.MAX_VALUE);
            distance[src] = 0;
            for (int i = 0; i < 2 * nodes; i++) {
                for (BellmanFord.Edge e : edges) {
                    if (distance[e.from] < Long.MAX_VALUE && distance[e.to] > distance[e.from] + e.cost) {
                        distance[e.to] = distance[e.from] + e.cost;
                        if (i == nodes - 1 && e.to == dst) {
                            throw new RuntimeException("negative loop");
                        }
                    }
                }
            }
            return distance[dst];
        }

        private static class Edge {
            int from;
            int to;
            long cost;

            Edge(int from, int to, long cost) {
                this.from = from;
                this.to = to;
                this.cost = cost;
            }

        }

    }

    static class LightScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public LightScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public String string() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int ints() {
            return Integer.parseInt(string());
        }

    }

    static class WarshallFloyd implements ShortestPathSolver {
        private static final int INF = 0x2fffffff;
        private int[][] graph;
        private boolean calculated = false;

        public WarshallFloyd(int n) {
            graph = new int[n][n];
            Arrays.stream(graph).forEach(a -> Arrays.fill(a, INF));
        }

        public void addEdge(int from, int to, int cost) {
            graph[from][to] = cost;
        }

        public long shortestPath(int src, int dst) {
            if (!calculated) {
                for (int i = 0; i < graph.length; i++) {
                    for (int j = 0; j < graph.length; j++) {
                        for (int k = 0; k < graph.length; k++) {
                            graph[j][k] = Math.min(graph[j][k], graph[j][i] + graph[i][k]);
                        }
                    }
                }
                calculated = true;
            }
            return graph[src][dst] == INF ? Integer.MAX_VALUE : graph[src][dst];
        }

    }

    static interface ShortestPathSolver {
        void addEdge(int from, int to, int cost);

        long shortestPath(int src, int dst);

        enum Algorithm {
            WARSHALL_FLOYD(WarshallFloyd::new),
            BELLMAN_FORD(BellmanFord::new),
            DIJKSTRA(null),
            ;
            private final IntFunction<ShortestPathSolver> constructor;

            Algorithm(IntFunction<ShortestPathSolver> constructor) {
                this.constructor = constructor;
            }

            public ShortestPathSolver getInstance(int nodes) {
                return constructor.apply(nodes);
            }

        }

    }
}

