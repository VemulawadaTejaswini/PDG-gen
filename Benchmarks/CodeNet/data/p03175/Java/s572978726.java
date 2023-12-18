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
    int[] solve = solve(1, -1);
    System.out.println((solve[0] + solve[1]) % MOD);
  }

  private static int[] solve(int node, int parent) {
    int allWhite = 1;
    int sthIsBlack = 0;
    for (int child : adjList.get(node)) {
      if (child != parent) {
        int[] ways = solve(child, node);
        int memoWhite = allWhite;
        allWhite = ((allWhite % MOD) * (ways[1] % MOD)) % MOD;
        sthIsBlack =
            ((((memoWhite % MOD) * (ways[0] % MOD)) % MOD)
                + ((sthIsBlack % MOD) * (ways[0] + ways[1]) % MOD) % MOD);
      }
    }
    return new int[] {allWhite, allWhite + sthIsBlack};
  }
}
