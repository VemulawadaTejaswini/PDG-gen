import java.util.*;

public class Main {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static void solve(Scanner scanner) {
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.nextLine();

        GraphBuilder builder = new GraphBuilder();
        for (int i = 0; i < N - 1; i++) {
            int[] e = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            builder.addEdge(e[0], e[1]);
            builder.addEdge(e[1], e[0]);
        }
        Map<Integer, Set<Edge>> edges = builder.build();
        long ans = (K * dfs(-1, edges, new HashSet<>(), K)) % MOD;
        System.out.println(ans);
    }

    static long dfs(int s, Map<Integer, Set<Edge>> edges, Set<Integer> visited, int K) {
        long ans = 0;
        if (visited.add(s)) {
            int n = s == -1 ? K - 1 : K - 2;
            int perm = n;
            while (n > 1) {
                perm *= --n;
            }
            ans = perm;
            for (Edge edge : edges.getOrDefault(s, Collections.emptySet())) {
                ans += dfs(edge.to, edges, visited, K);
                ans %= MOD;
            }
        }
        return ans;
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

class GraphBuilder {
    private List<Edge> edges = new ArrayList<>();

    public void addEdge(int from, int to) {
        edges.add(new Edge(from, to, 1));
    }

    public void addEdge(int from, int to, int cost) {
        edges.add(new Edge(from, to, cost));
    }

    public Map<Integer, Set<Edge>> build() {
        Map<Integer, Set<Edge>> m = new HashMap<>();
        for (Edge e : edges) {
            if (!m.containsKey(e.from)) {
                m.put(e.from, new HashSet<>());
            }
            m.get(e.from).add(e);
        }
        return m;
    }

}


