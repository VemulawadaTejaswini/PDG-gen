
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = in.nextInt();
        int m = in.nextInt();
        Map<Integer, List<Integer>> paths = new HashMap<>();
        int[] dp = new int[n];
        for (int i = 0; i < m; i++) {
            int from = in.nextInt();
            int to = in.nextInt();
            paths.compute(from - 1, (integer, integers) -> {
                if (integers == null) {
                    integers = new ArrayList<>();
                }
                integers.add(to - 1);
                return integers;
            });
        }
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, visited, paths, dp);
            }
        }

        int result = Integer.MIN_VALUE;
        for (int j = 0; j < n; j++) {
            result = Math.max(result, dp[j]);
        }
        System.out.println(result);
    }

    private static void dfs(int from, boolean[] visited, Map<Integer, List<Integer>> paths, int[] dp) {
        final List<Integer> tos = paths.getOrDefault(from, Collections.emptyList());
        for (Integer to : tos) {
            if (!visited[to]) {
                dfs(to, visited, paths, dp);
            }
        }
        for (Integer to : tos) {
            dp[from] = Math.max(dp[from], dp[to] + 1);
        }
    }
}
