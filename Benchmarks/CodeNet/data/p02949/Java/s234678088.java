import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static final int INF = Integer.MAX_VALUE;

    static class Edge {
        int from, to, cost;

        public Edge(int from, int to, int cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }
    }

    static class BellmanFord {
        int n;
        List<Edge> edges;
        int[] dist;
        boolean negativeCycle;

        public BellmanFord(int n, List<Edge> edges) {
            this.n = n;
            this.edges = edges;
            dist = new int[n];
            Arrays.fill(dist, INF);
            dist[0] = 0;
            run();
        }

        private void run() {
            boolean[] reachableFrom = new boolean[n];
            reachableFrom[n - 1] = true;

            for (int i = 0; i < n - 1; i++) {
                for (Edge e : edges) {
                    if (reachableFrom[e.to]) reachableFrom[e.from] = true;
                    if (dist[e.from] == INF) continue;
                    dist[e.to] = Math.min(dist[e.to], dist[e.from] + e.cost);
                }
            }

            for (Edge e : edges) {
                if (dist[e.from] == INF || !reachableFrom[e.from]) continue;
                if (dist[e.to] > dist[e.from] + e.cost) negativeCycle = true;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int P = sc.nextInt();

        List<Edge> edges = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            edges.add(new Edge(sc.nextInt() - 1, sc.nextInt() - 1, -sc.nextInt() + P));
        }

        BellmanFord sol = new BellmanFord(N, edges);

        if (sol.negativeCycle) {
            System.out.println(-1);
        } else {
            System.out.println(Math.max(-sol.dist[N - 1], 0));
        }
    }
}
