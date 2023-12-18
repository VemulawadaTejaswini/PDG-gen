import java.util.*;

public class Main {
    public static int solve(int n, int m, int[] x, int[] y) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
      	for (int i = 0; i < n; i++) {
          graph.put(i, new LinkedList<Integer>());
        }
      
        for (int i = 0; i < m; i++) {
          graph.get(x[i] - 1).add(y[i] - 1);
        }

        int[] memo = new int[n];
        Arrays.fill(memo, -1);
        
      	int result = 0;
        for (int i = 0; i < n; i++) {
          max = Math.max(max, dfs(graph, i, memo));
        }
        return result;
    }

    private static int dfs(Map<Integer, List<Integer>> graph, int from, int[] memo) {
      if (memo[from] >= 0) {
        return memo[from];
      }

      int maxPath = 0;
      for (int to : graph.get(from)) {
        maxPath = Math.max(maxPath, dfs(graph, to, memo) + 1);
      }

      return memo[from] = maxPath;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] from, to;
        from = new int[m];
        to = new int[m];
        for (int i = 0; i < m; i++) {
          from[i] = scanner.nextInt();
          to[i] = scanner.nextInt();
        }
        
        int result = solve(n, m, from, to);
        System.out.println(result);
    }
}