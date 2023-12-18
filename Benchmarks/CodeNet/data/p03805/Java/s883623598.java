import java.util.*;

public class Main {

  static int N;
  static int M;
  static boolean[][] graph;
  static boolean[] visited;

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    N = sc.nextInt();
    M = sc.nextInt();
    graph = new boolean[M][M];

    for (int i = 0; i < M; i++) {
      int a = sc.nextInt() - 1;
      int b = sc.nextInt() - 1;
      graph[a][b] = true;
      graph[b][a] = true;
    }

    sc.close();

    visited = new boolean[N];

    visited[0] = true;

    int count = dfs(0);

    System.out.println(count);

  }

  public static int dfs(int v) {

    boolean all = true;

    for (int i = 0; i < N; i++) {
      if (visited[i] == false) {
        all = false;
        break;
      }
    }

    if (all) {
      return 1;
    }

    int count = 0;

    for (int i = 0; i < N; i++) {

      if (graph[v][i] == false) {
        continue;
      }

      if (visited[i]) {
        continue;
      }

      visited[i] = true;

      count += dfs(i);

      visited[i] = false;

    }

    return count;

  }

}