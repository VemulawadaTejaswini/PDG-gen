import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static final int MOD = (int) Math.pow(10, 9) + 7;
    static final boolean TEST = false;

    static void debug(Object... os) {
        if (TEST) {
            StringBuilder sb = new StringBuilder(os.length);
            for (Object o : os)
                sb.append(o);
            System.out.println(sb);
        }
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            do {
                solve(in);
            } while (TEST);
        }
    }

    private static void solve(Scanner in) {
        int N = in.nextInt();
        DGraph G = new DGraph(N);
        for (int i = 2; i <= N; i++) {
            G.addEdge(new DEdge(in.nextInt(), i, 1));
        }
        memo = new int[N + 1];
        Arrays.fill(memo, -1);
        int fukasa = dfs(G, 1);
        System.out.println(fukasa);
    }

    private static int[] memo;

    private static int dfs(DGraph G, int i) {
        if (G.dim(i) == 0) {
            return 0;
        }
        if (memo[i] > 0) {
            return memo[i];
        }
        int dim = G.dim(i);
        int maxSub = 0;
        for (DEdge e : G.adj(i)) {
            int sub = dfs(G, e.to) + 1;
            maxSub = Math.max(maxSub, sub);
        }
        int ret = Math.max(dim, maxSub);
        memo[i] = ret;
        return ret;
    }
}

class DGraph {

    private final List<DEdge>[] adj;

    @SuppressWarnings("unchecked")
    DGraph(int V) {
        adj = new List[V + 1];
        for (int i = 0; i < adj.length; i++) {
            adj[i] = new ArrayList<DEdge>();
        }
    }

    int V() {
        return adj.length;
    }

    void addEdge(DEdge edge) {
        adj[edge.from].add(edge);
    }

    Iterable<DEdge> adj(int v) {
        return adj[v];
    }

    int dim(int v) {
        return adj[v].size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("V=" + V()).append("\n");
        for (int i = 0; i < V(); i++) {
            sb.append(i + ":" + adj[i]).append("\n");
        }
        return sb.toString();
    }
}

class DEdge {
    final int from, to, weight;

    DEdge(int from, int to, int weight) {
        this.from = from;
        this.to = to;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("%d->%d(%d)", from, to, weight);
    }
}