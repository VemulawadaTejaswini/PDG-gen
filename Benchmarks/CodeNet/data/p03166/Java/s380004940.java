import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();
    int[][] edges = new int[M][2];
    for (int i = 0; i < M; i++) {
      int x = scanner.nextInt() - 1;
      int y = scanner.nextInt() - 1;
      edges[i][0] = x;
      edges[i][1] = y;
    }

    int[] dist = new int[N];
    for (int i = 1; i <= M; i++) {
      for (int j = 0; j < M; j++) {
        int from = edges[j][0];
        int to = edges[j][1];
        dist[to] = Math.max(dist[to], dist[from] + 1);
      }
    }
    int max = 0;
    for (int i = 0; i < N; i++) max = Math.max(max, dist[i]);
    System.out.println(max);
  }
}
