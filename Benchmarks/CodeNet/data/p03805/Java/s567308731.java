import java.util.*;

public class Main {
  public static boolean[][] path = new boolean[8][8];

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    boolean[] visit = new boolean[N];
    visit[0] = true;
    for (int i = 1; i < N; i++) {
      visit[i] = false;
    }
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        path[i][j] = false;
      }
    }
    for (int i = 0; i < M; i++) {
      int a = sc.nextInt() - 1;
      int b = sc.nextInt() - 1;
      path[a][b] = true;
      path[b][a] = true;
    }
    System.out.println(dfs(0, N, visit));
  }

  public static int dfs(int point, int N, boolean[] visit) {
    boolean allVisit = true;
    for (int i = 0; i < N; i++) {
      if (!visit[i]) {
        allVisit = false;
      }
    }
    if (allVisit) {
      return 1;
    }
    int ret = 0;
    for (int i = 0; i < N; i++) {
      if (path[point][i] && !visit[i]) {
        visit[i] = true;
        ret += dfs(i, N, visit);
        visit[i] = false;
      }
    }
    return ret;
  }
}