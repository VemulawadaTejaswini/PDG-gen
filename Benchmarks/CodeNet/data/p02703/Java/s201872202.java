
import java.util.*;

class Edge {
    public int v;
    public long cost;
    public long time;

    public Edge(int v, long cost, long time) {
        this.v = v;
        this.cost = cost;
        this.time = time;
    }
}

class Exchange {
    public long sil;
    public long time;

    public Exchange(long sil, long time) {
        this.sil = sil;
        this.time = time;
    }
}

class QNode implements Comparable<QNode> {
    public int v;
    public long coin;
    public long cost;

    public QNode(int v, long coin, long cost) {
        this.v = v;
        this.coin = coin;
        this.cost = cost;
    }

    @Override
    public int compareTo(QNode qNode) {
        return Long.compare(cost, qNode.cost);
    }
}

public class Main {
    private static final Scanner sc = new Scanner(System.in);

    private void solve() {
        int N = sc.nextInt();
        int M = sc.nextInt();
        int S = sc.nextInt();

        List<List<Edge>> adj = new ArrayList<>();
        for (int i = 0; i < N + 1; ++i) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < M; ++i) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            adj.get(u).add(new Edge(v, a, b));
            adj.get(v).add(new Edge(u, a, b));
        }


        List<Exchange> ex = new ArrayList<>();
        ex.add(new Exchange(0, 0));
        for (int i = 0; i < N; ++i) {
            int c = sc.nextInt();
            int d = sc.nextInt();
            ex.add(new Exchange(c, d));
        }

        final int MAX_COIN = 50 * N;
        boolean[][] visit = new boolean[N + 1][MAX_COIN + 1];

        Queue<QNode> q = new PriorityQueue<>();
        S = Math.min(S, MAX_COIN);
        q.add(new QNode(1, S, 0));
        int[] ans = new int[N + 1];
        Arrays.fill(ans, Integer.MAX_VALUE);
        while (!q.isEmpty()) {
            QNode node = q.poll();
            if (visit[node.v][(int)node.coin]) {
                continue;
            }
            visit[node.v][(int)node.coin] = true;
            ans[node.v] = Math.min(ans[node.v], (int)node.cost);

            for (int i = 0; i < MAX_COIN; ++i) {
                for (Edge e : adj.get(node.v)) {
                    long remain = node.coin + i * ex.get(node.v).sil - e.cost;
                    remain = Math.min(MAX_COIN, remain);
                    if (remain >= 0) {
                        q.add(new QNode(e.v, remain, node.cost + i * ex.get(node.v).time + e.time));
                    }
                }
            }
        }

        for (int i = 2; i <= N; ++i) {
            System.out.println(ans[i]);
        }
    }

    public static void main(String[] args) {
        new Main().solve();
    }
}