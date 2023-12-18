import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

  static int MOD = 1000000007;
  static Map<Integer, List<Integer>> adjList;
  static boolean[] visited;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    adjList = new HashMap<>();
    int P;
    int Q;
    visited = new boolean[N + 1];
    for (int i = 1; i < N; i++) {
      P = scanner.nextInt();
      Q = scanner.nextInt();
      List<Integer> orDefault = adjList.getOrDefault(P, new ArrayList<>());
      orDefault.add(Q);
      adjList.put(P, orDefault);
      orDefault = adjList.getOrDefault(Q, new ArrayList<>());
      orDefault.add(P);
      adjList.put(Q, orDefault);
    }
    System.out.println(solve());
  }

  private static int[] dfs(int a) {
    int[] ans = new int[2];
    int mul1 = 0;
    int mul2 = 0;
    if (adjList.containsKey(a)) {
      mul1 = 1;
      mul2 = 1;
      for (Integer ii : adjList.get(a)) {
        if (!visited[ii]) {
          visited[ii] = true;
          int[] dfs = dfs(ii);
          mul1 = ((mul1%MOD)*(dfs[0]%MOD))%MOD;
          mul2 = ((mul2 %MOD)*(dfs[0] + dfs[1])%MOD)%MOD;
        }
      }
      ans[0] = mul2;
      ans[1] = mul1;
    }else{
      ans[0]=1;//Index 0 for white
      ans[1]=1;//Index 1 for black
    }

    return ans;
  }

  private static int solve() {
    int ans = 0;
    if (!adjList.isEmpty()) {
      for (Map.Entry<Integer, List<Integer>> integerListEntry : adjList.entrySet()) {
        if (!visited[integerListEntry.getKey()]) {
          visited[integerListEntry.getKey()] = true;
          int[] dfs = dfs(integerListEntry.getKey());
          ans += (dfs[0] + dfs[1]);
        }
      }
    } else {
      ans = 2;
    }
    return ans;
  }
}
