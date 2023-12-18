import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] a = new int[N];
            int[] b = new int[N];
            int[] c = new int[N];
            int[] d = new int[N];
            for (int i = 0; i < N; i++) {
                a[i] = in.nextInt();
                b[i] = in.nextInt();
            }
            for (int i = 0; i < N; i++) {
                c[i] = in.nextInt();
                d[i] = in.nextInt();
            }

            int[][] cost = new int[N][N];
            for (int from = 0; from < N; from++) {
                for (int to = 0; to < N; to++) {
                    cost[from][to] = (int) (a[from] < c[to] && b[from] < d[to] ? 1 : 1000);
                }
            }

            System.out.println(MinCostFlow.bestMatching(cost) % 1000);
        }
    }
}

class MinCostFlow {
    class Edge {
        int to;
        int cap;
        int cost;
        int rev;

        public Edge(int to, int cap, int cost, int rev) {
            this.to = to;
            this.cap = cap;
            this.cost = cost;
            this.rev = rev;
        }
    }

    private static final int INF = (int) 1e9;
    private ArrayList<ArrayList<Edge>> G;
    private int[] dist;
    private int[] prevv;
    private int[] preve;

    public MinCostFlow(int v) {
        clear(v);
    }

    public void clear(int v) {
        G = new ArrayList<ArrayList<Edge>>();
        for (int i = 0; i < v; i++) {
            G.add(new ArrayList<Edge>());
        }
        dist = new int[v];
        prevv = new int[v];
        preve = new int[v];
    }

    public void addEdge(int from, int to, int cap, int cost) {
        assert cost >= 0;
        assert cost <= INF;

        int edgeIndex = G.get(from).size();
        int reverseEdgeIndex = G.get(to).size();
        G.get(from).add(new Edge(to, cap, cost, reverseEdgeIndex));
        G.get(to).add(new Edge(from, 0, -cost, edgeIndex));
    }

    public int run(int s, int t, int f) {
        int res = 0;
        while (f > 0) {
            Arrays.fill(dist, INF);
            dist[s] = 0;

            for (;;) {
                boolean update = false;

                for (int v = 0; v < dist.length; v++) {
                    if (dist[v] >= INF) {
                        continue;
                    }
                    for (int i = 0; i < G.get(v).size(); i++) {
                        Edge e = G.get(v).get(i);
                        if (e.cap > 0 && dist[v] + e.cost < dist[e.to]) {
                            dist[e.to] = dist[v] + e.cost;
                            prevv[e.to] = v;
                            preve[e.to] = i;
                            update = true;
                        }
                    }
                }

                if (!update) {
                    break;
                }
            }

            if (dist[t] >= INF) {
                return -1;
            }

            int d = f;
            for (int v = t; v != s; v = prevv[v]) {
                d = Math.min(d, G.get(prevv[v]).get(preve[v]).cap);
            }

            f -= d;
            res += d * dist[t];

            for (int v = t; v != s; v = prevv[v]) {
                Edge e = G.get(prevv[v]).get(preve[v]);
                e.cap -= d;
                G.get(v).get(e.rev).cap += d;
            }

        }

        return res;
    }

    public static int bestMatching(int[][] costs) {
        assert check(costs);

        int R = costs.length;
        int C = costs[0].length;

        MinCostFlow mcf = new MinCostFlow(R + C + 2);

        int s = R + C;
        int t = s + 1;

        for (int r = 0; r < R; r++) {
            mcf.addEdge(s, r, 1, 0);
        }
        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                if (costs[r][c] < 0) {
                    continue;
                }
                mcf.addEdge(r, R + c, 1, costs[r][c]);
            }
        }
        for (int c = 0; c < C; c++) {
            mcf.addEdge(R + c, t, 1, 0);
        }

        int minCost = mcf.run(s, t, R);
        return minCost;
    }

    private static boolean check(int[][] costs) {
        assert costs.length > 0;
        assert costs[0].length > 0;
        for (int i = 1; i < costs.length; i++) {
            assert costs[i].length == costs[i - 1].length;
        }
        return true;
    }
}
