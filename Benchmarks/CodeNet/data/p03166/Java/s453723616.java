import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

  static boolean visited[];
  static Map<Integer, List<Integer>> entry;
  static int[] inDegree;
  static int[] dp;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int M = scanner.nextInt();
    int[][] path = new int[M][2];
    entry = new HashMap<>();
    visited = new boolean[N + 1];
    inDegree = new int[N + 1];
    dp = new int[N + 1];
    for (int i = 0; i < M; i++) {
      path[i][0] = scanner.nextInt();
      path[i][1] = scanner.nextInt();

      List<Integer> orDefault = entry.getOrDefault(path[i][0], new ArrayList<>());
      orDefault.add(path[i][1]);
      entry.put(path[i][0], orDefault);
      inDegree[path[i][1]] = inDegree[path[i][1]] + 1;
    }
    System.out.println(solve(N));
  }

  private static int solve(int N) {

    for (Map.Entry<Integer, List<Integer>> en : entry.entrySet()) {
      if (!visited[en.getKey()] && inDegree[en.getKey()] == 0) {
        dfs(en.getKey());
      }
    }
    int ans = 0;
    for (int i = 0; i < dp.length; i++) {
      ans = Math.max(ans, dp[i]);
    }
    return ans;
  }

  public static void dfs(int a) {
    visited[a] = true;
    if (entry.containsKey(a)) {
      for (Integer integer : entry.get(a)) {
        dp[integer] = Math.max(dp[integer], dp[a] + 1);
        inDegree[integer]--;
        if (inDegree[integer] == 0) {
          dfs(integer);
        }
      }
    }
  }
}
