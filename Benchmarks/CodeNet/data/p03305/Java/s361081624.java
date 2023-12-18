import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            int m = in.nextInt();
            int s = in.nextInt() - 1;
            int t = in.nextInt() - 1;

            ArrayList<Edge>[] edges = new ArrayList[n];
            for (int i = 0; i < edges.length; i++) {
                edges[i] = new ArrayList<>();
            }
            for (int i = 0; i < m; i++) {
                int u = in.nextInt() - 1;
                int v = in.nextInt() - 1;
                int a = in.nextInt();
                int b = in.nextInt();
                edges[u].add(new Edge(v, a, b));
                edges[v].add(new Edge(u, a, b));
            }

            long[] cost = new long[n];
            Arrays.fill(cost, (long) 1e18);
            dijkstra(s, true, n, edges, cost);
            long[] costS = new long[n];
            Arrays.fill(costS, (long) 1e18);
            dijkstra(t, !true, n, edges, costS);

            long[] mins = new long[n];
            Arrays.fill(mins, (long) 1e18);
            for (int i = n - 1; i >= 0; i--) {
                mins[i] = Math.min(mins[i], cost[i] + costS[i]);
                if (i + 1 < n) {
                    mins[i] = Math.min(mins[i], mins[i + 1]);
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.println(1000000000000000L - mins[i]);
            }

        }
    }

    private static void dijkstra(int startVertex, boolean b, int n, ArrayList<Edge>[] edges, long[] cost) {

        PriorityQueue<Vertex> pq = new PriorityQueue<>(new Comparator<Vertex>() {
            @Override
            public int compare(Vertex o1, Vertex o2) {
                if (o1.cost < o2.cost) {
                    return -1;
                }
                if (o1.cost > o2.cost) {
                    return 1;
                }
                return 0;
            }
        });

        {
            pq.add(new Vertex(startVertex, 0));
            cost[startVertex] = 0;
        }
        for (; !pq.isEmpty();) {
            Vertex vertex = pq.poll();

            // if (used[vertex.index]) {
            // continue;
            // }
            // used[vertex.index] = true;

            if (vertex.cost > cost[vertex.index]) {
                continue;
            }
            // if (cost[vertex.index] < INF) {
            // Utils.debug("extract negative loop");
            // break;
            // }
            // cost[vertex.index] = vertex.cost;

            for (Edge edge : edges[vertex.index]) {
                // if (used[edge.to]) {
                // continue;
                // }
                long nextCost = vertex.cost + (b ? edge.yen : edge.snuke);
                if (nextCost >= cost[edge.to]) {
                    continue;
                }
                // assert edge.from == vertex.index;
                pq.add(new Vertex(edge.to, nextCost));
                cost[edge.to] = nextCost;
            }

        }
    }

}

class Edge {
    int to;
    long yen;
    long snuke;

    public Edge(int to, long y, long s) {
        super();
        this.to = to;
        this.yen = y;
        this.snuke = s;
    }
}

class Vertex {
    int index;
    long cost;

    public Vertex(int index, long cost) {
        super();
        this.index = index;
        this.cost = cost;
    }

}
