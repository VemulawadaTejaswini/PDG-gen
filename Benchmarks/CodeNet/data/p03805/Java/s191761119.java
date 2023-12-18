import java.util.Scanner;

class Main {

  public static int N;
  public static boolean[][] graph;
  public static int ans = 0;

  public static void dfs(int now, int prv, boolean[] used) {
    boolean flag = true;
    for (boolean b : used) {
      flag &= b;
    }
    if (flag) {
      ans++;
      return;
    }
    for (int i = 0; i < N; i++) {
      if (i != now && i != prv && graph[now][i] && !used[i]) {
        boolean[] sub = used.clone();
        sub[i] = true;
        dfs(i, now, sub);
      }
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    int M = scanner.nextInt();
    graph = new boolean[N][N];
    boolean[] used = new boolean[N];
    used[0] = true;
    for (int i = 0; i < M; i++) {
      int a = scanner.nextInt() - 1;
      int b = scanner.nextInt() - 1;
      graph[a][b] = true;
      graph[b][a] = true;
    }
    dfs(0, 0, used);
    System.out.println(ans);
  }
}
