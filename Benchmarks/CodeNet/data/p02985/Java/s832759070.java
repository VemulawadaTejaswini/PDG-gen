import lib.graph.Edge;
import lib.graph.GraphBuilder;

import java.util.*;

public class Main {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    // int N = Integer.parseInt(scanner.nextLine());
    // int N = scanner.nextInt(), M = scanner.nextInt();
    // scanner.nextLine();
    // int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    // long[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();
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

