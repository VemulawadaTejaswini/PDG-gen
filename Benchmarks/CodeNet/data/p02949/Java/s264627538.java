import java.util.*;

public class Main {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static void solve(Scanner scanner) {
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int P = scanner.nextInt();
        scanner.nextLine();

        BellmanFord bellmanFord = new BellmanFord(N);
        for (int i = 0; i < M; i++) {
            int[] e = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            bellmanFord.addEdge(e[0] - 1, e[1] - 1, -(e[2] - P));
        }

        bellmanFord.disableUnreachableNodes(0);
        bellmanFord.run(0);
        if (bellmanFord.dist[N - 1] == Long.MIN_VALUE) {
            System.out.println(-1);
            return;
        }

        System.out.println(Math.max(0, -bellmanFord.dist[N - 1]));
    }

}

class BellmanFord {

    private int size;
    public long[] dist;
    public long[] from;
    public List<Edge> edges;
    public Set<Integer> disabledNodes;

    public BellmanFord(int size) {
        this.size = size;
        dist = new long[size];
        Arrays.fill(dist, Long.MAX_VALUE / 2);
        from = new long[size];
        Arrays.fill(from, -1);
        edges = new ArrayList<>();
        disabledNodes = new HashSet<>();
    }

    public void addEdge(int from, int to, int cost) {
        edges.add(new Edge(from, to, cost));
    }

    public void disableUnreachableNodes(int start) {
        long[] localDist = new long[size];
        Arrays.fill(localDist, Long.MAX_VALUE / 2);
        localDist[start] = 0;
        for (int i = 0; i < size; i++) {
            for (Edge e : edges) {
                if (localDist[e.to] > localDist[e.from] + 1) {
                    localDist[e.to] = localDist[e.from] + 1;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            if (localDist[i] == Long.MAX_VALUE / 2) {
                disabledNodes.add(i);
            }
        }
    }

    public void run(int start) {
        dist[start] = 0;
        for (int i = 0; i <= size; i++) {
            boolean updated = false;
            for (Edge e : edges) {
                if (disabledNodes.contains(e.from) || disabledNodes.contains(e.to)) {
                    continue;
                }
                if (dist[e.to] > dist[e.from] + e.cost) {
                    dist[e.to] = dist[e.from] + e.cost;
                    from[e.to] = e.from;
                    updated = true;
                }
            }
            // found loops. update all nodes in loops with Long.MIN_VALUE
            if (i == size && updated) {
                for (int j = 0; j <= size; j++) {
                    for (Edge e : edges) {
                        if (disabledNodes.contains(e.from) || disabledNodes.contains(e.to)) {
                            continue;
                        }
                        if (dist[e.to] > dist[e.from] + e.cost) {
                            dist[e.to] = Long.MIN_VALUE;
                        }
                    }
                }
            }
        }
    }
}

class Edge {
    public final int from;
    public final int to;
    public final int cost;

    public Edge(int from, int to, int cost) {
        this.from = from;
        this.to = to;
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edge edge = (Edge) o;
        return from == edge.from &&
                to == edge.to &&
                cost == edge.cost;
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to, cost);
    }
}