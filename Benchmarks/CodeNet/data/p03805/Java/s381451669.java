import java.util.*;

public class Main {

  static int N;
  static boolean[][] graph;
  static boolean[] visited;

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    N = sc.nextInt();
    int M = sc.nextInt();
    graph = new boolean[N][N];

    for (int i = 0; i < M; i++) {
      int a = sc.nextInt() - 1;
      int b = sc.nextInt() - 1;
      graph[a][b] = true;
      graph[b][a] = true;
    }

    sc.close();

    visited = new boolean[N];

    // 1は訪問済み
    visited[0] = true;

    int count = dfs(0);

    System.out.println(count);

  }

  static int dfs(int v) {
 
    boolean all = true;

    // すべての点を確認する
    for (int i = 0; i < N; i++) {
      if (visited[i] == false) {
        all = false;
        break;
      }
    }

    // すべての点を通っているときは1を返す
    // ( = 答えを1増やす)
    if (all) {
      return 1;
    }

    // 答えカウント用
    int count = 0;

    // すべての点で確認する
    for (int i = 0; i < N; i++) {
      // パスが繋がっていない場合は次の点へ
      if (graph[v][i] == false) {
        continue;
      }
      // すでに訪れた点だった場合は次の点へ
      if (visited[i]) {
        continue;
      }
      // 訪れた点とする
      visited[i] = true;
      // 再帰
      count += dfs(i);
      // 訪れていない点とする
      visited[i] = false;
    }

    return count;
 
  }

}