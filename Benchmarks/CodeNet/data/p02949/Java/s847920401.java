import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collection;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.BitSet;
import java.io.BufferedReader;
import java.util.Queue;
import java.util.ArrayDeque;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author anand.oza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ECoinsRespawn solver = new ECoinsRespawn();
        solver.solve(1, in, out);
        out.close();
    }

    static class ECoinsRespawn {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int p = in.nextInt();

            List<Graphs.Edge> edges = new ArrayList<>();
            List<Integer>[] adjForward = new List[n];
            List<Integer>[] adjBackward = new List[n];
            for (int i = 0; i < n; i++) {
                adjForward[i] = new ArrayList<>();
                adjBackward[i] = new ArrayList<>();
            }
            for (int i = 0; i < m; i++) {
                int a = in.nextInt() - 1;
                int b = in.nextInt() - 1;
                int c = p - in.nextInt();
                edges.add(new Graphs.Edge(a, b, c));

                adjForward[a].add(b);
                adjBackward[b].add(a);
            }

            BitSet fromSource = Graphs.reachabilityViaBFS(n, adjForward, 0);
            BitSet toDest = Graphs.reachabilityViaBFS(n, adjBackward, n - 1);
            fromSource.and(toDest);

            List<Graphs.Edge> filteredEdges = new ArrayList<>();
            for (Graphs.Edge e : edges) {
                if (fromSource.get(e.i) && fromSource.get(e.j)) {
                    filteredEdges.add(e);
                }
            }

            Graphs.BellmanFord bf = new Graphs.BellmanFord(n, filteredEdges, 0);

            if (bf.cycle) {
                out.println(-1);
            } else {
                out.println(Math.max(0, -bf.distance[n - 1]));
            }
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }

    static class Graphs {
        public static BitSet reachabilityViaBFS(int n, List<Integer>[] adj, int start) {
            BitSet visited = new BitSet();
            Queue<Integer> q = new ArrayDeque<>();
            q.add(start);
            visited.set(start);

            while (!q.isEmpty()) {
                int cur = q.poll();
                for (int next : adj[cur]) {
                    if (visited.get(next))
                        continue;

                    q.add(next);
                    visited.set(next);
                }
            }

            return visited;
        }

        public static class Edge {
            public final int i;
            public final int j;
            public final int cost;

            public Edge(int i, int j, int cost) {
                this.i = i;
                this.j = j;
                this.cost = cost;
            }

            public String toString() {
                return String.format("[(%d, %d): %d]", i, j, cost);
            }

        }

        public static class BellmanFord {
            public long[] distance;
            public int[] predecessor;
            public boolean cycle;

            public BellmanFord(int n, List<Graphs.Edge> edges, int start) {
                distance = new long[n];
                Arrays.fill(distance, Long.MAX_VALUE);
                predecessor = new int[n];

                distance[start] = 0;

                for (int i = 0; i < n - 1; i++) {
                    for (Graphs.Edge e : edges) {
                        if (distance[e.i] < Long.MAX_VALUE && distance[e.i] + e.cost < distance[e.j]) {
                            distance[e.j] = distance[e.i] + e.cost;
                            predecessor[e.j] = e.i;
                        }
                    }
                }

                cycle = false;
                for (Graphs.Edge e : edges) {
                    if (distance[e.i] < Long.MAX_VALUE && distance[e.i] + e.cost < distance[e.j]) {
                        cycle = true;
                        break;
                    }
                }
            }

        }

    }
}

