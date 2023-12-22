import java.util.*;

public class Main {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static void solve(Scanner scanner) {
        int V = scanner.nextInt();
        int E = scanner.nextInt();
        int R = scanner.nextInt();
        scanner.nextLine();

        Dijkstra dijkstra = new Dijkstra(V);
        for (int i = 0; i < E; i++) {
            int[] e = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            dijkstra.addEdge(e[0], e[1], e[2]);
        }
        dijkstra.run(R);
        for (int i = 0; i < V; i++) {
            if (dijkstra.dist[i] == Long.MAX_VALUE / 2)
                System.out.println("INF");
            else
                System.out.println(dijkstra.dist[i]);
        }
    }


}

class Dijkstra {

    private int size;
    Map<Integer, Set<Edge>> edges;
    public long[] dist;
    public long[] from;

    public Dijkstra(int size) {
        this.size = size;
        dist = new long[size];
        Arrays.fill(dist, Long.MAX_VALUE / 2);
        from = new long[size];
        Arrays.fill(from, -1);
        edges = new HashMap<>();
    }

    public void addEdge(int from, int to, int cost) {
        if (!edges.containsKey(from)) {
            edges.put(from, new HashSet<>());
        }
        edges.get(from).add(new Edge(from, to, cost));
    }

    public void run(int start) {
        Queue<NodeCost> waitingNodes = new PriorityQueue<>(Comparator.comparingInt(x -> x.cost));
        waitingNodes.add(new NodeCost(start, 0));
        dist[start] = 0;
        while (!waitingNodes.isEmpty()) {
            NodeCost nodeCost = waitingNodes.poll();
            if (dist[nodeCost.node] < nodeCost.cost) {
                continue;
            }
            dist[nodeCost.node] = nodeCost.cost;
            for (Edge e : edges.getOrDefault(nodeCost.node, Collections.emptySet())) {
                if (dist[e.to] > dist[nodeCost.node] + e.cost) {
                    dist[e.to] = dist[nodeCost.node] + e.cost;
                    from[e.to] = nodeCost.node;
                    waitingNodes.add(new NodeCost(e.to, nodeCost.cost + e.cost));
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

class NodeCost {
    public final int node;
    public final int cost;

    public NodeCost(int node, int cost) {
        this.node = node;
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NodeCost nodeCost = (NodeCost) o;
        return node == nodeCost.node &&
                cost == nodeCost.cost;
    }

    @Override
    public int hashCode() {
        return Objects.hash(node, cost);
    }
}

