import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    final int INF = 1_000_000;
    int N = scanner.nextInt();
    int[][] g = new int[N][N];
    for (int i = 0; i < N; i++) {
      char[] l = scanner.next().toCharArray();
      for (int j = 0; j < N; j++) {
        if (l[j] == '1') g[i][j] = 1;
        else g[i][j] = INF;
      }
    }
    int[] ids = new int[N];
    Arrays.fill(ids, -1);
    if (!dfs(N, 0, 0, ids, g)) {
      System.out.println(-1);
      return;
    }

    for (int k = 0; k < N; k++) {
      for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
          if (g[i][k] + g[k][j] < g[i][j]) g[i][j] = g[i][k] + g[k][j];
        }
      }
    }

    int max = 0;
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        if (i != j) max = Math.max(max, g[i][j]);
      }
    }
    System.out.println(max + 1);
  }

  private static boolean dfs(int N, int node, int id, int[] ids, int[][] g) {
    ids[node] = id;
    boolean result = true;
    for (int i = 0; i < N; i++) {
      if (g[node][i] == 1) {
        if (ids[i] < 0) result &= dfs(N, i, 1 - id, ids, g);
        else if (ids[i] != 1 - id) return false;
      }
    }
    return result;
  }
}
