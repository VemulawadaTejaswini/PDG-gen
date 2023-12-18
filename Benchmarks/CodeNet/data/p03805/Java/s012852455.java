import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();
    int[][] graph = new int[N][N];
    for (int i = 0; i < M; i++) {
      int a = scanner.nextInt() - 1;
      int b = scanner.nextInt() - 1;
      graph[a][b] = graph[b][a] = 1;
    }

    boolean[] visited = new boolean[N];
    System.out.println(dfs(N, graph, visited, 0, 0));
  }

  private static int dfs(int N, int[][] graph, boolean[] visited, int numVisited, int id) {
    visited[id] = true;
    numVisited++;
    if (numVisited == N) {
      return 1;
    }
    int count = 0;
    for (int i = 0; i < N; i++) {
      if (graph[id][i] == 1 && !visited[i]) {
        boolean[] copy = new boolean[N];
        System.arraycopy(visited, 0, copy, 0, N);
        count += dfs(N, graph, copy, numVisited, i);
      }
    }
    return count;
  }
}
