import java.util.*;

public class Main {
    static Stack<Integer> sort; static boolean[] visited; static ArrayList<Integer> [] adj;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int m = sc.nextInt();
        adj = new ArrayList[n+1];
        for (int i = 1; i <= n; i++) adj[i] = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt(); int b = sc.nextInt();
            adj[a].add(b);
        }
        visited = new boolean[n+1]; ArrayList<Integer> order = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                sort = new Stack<>();
                dfs(i);
                while (!sort.isEmpty()) order.add(sort.pop());
            }
        }
        int [] dp = new int[n+1]; ArrayList<Integer> [] rev = new ArrayList[n+1];
        for (int i = 1; i <= n; i++) rev[i] = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            for (Integer j: adj[i]) {
                rev[j].add(i);
            }
        }
        long ans = 0;
        for (int i = 0; i < order.size(); i++) {
            int here = order.get(i);
            for (Integer come: rev[here]) {
                dp[here] = Math.max(dp[here], 1 + dp[come]);
            }
            ans = Math.max(dp[here], ans);
        }
        System.out.println(ans);
    }

    static void dfs(int cur) {
        visited[cur] = true;
        for (Integer next: adj[cur]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
        sort.push(cur);
    }

}