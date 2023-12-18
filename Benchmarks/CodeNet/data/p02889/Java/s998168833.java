import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();
    int L = scanner.nextInt();

    final long INF = 1_000_000_000_000_000L;
    long[][] dist = new long[N][N];
    for (int i = 0; i < N; i++) for (int j = 0; j < N; j++) if (i != j) dist[i][j] = INF;
    for (int i = 0; i < M; i++) {
      int a = scanner.nextInt() - 1;
      int b = scanner.nextInt() - 1;
      int c = scanner.nextInt();
      if (c <= L) dist[a][b] = dist[b][a] = c;
    }

    int[][] next = new int[N][N];
    for (int i = 0; i < N; i++) for (int j = 0; j < N; j++) next[i][j] = j;

    for (int k = 0; k < N; k++) {
      for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
          if (dist[i][j] > dist[i][k] + dist[k][j]) {
            dist[i][j] = dist[i][k] + dist[k][j];
            next[i][j] = next[i][k];
          }
        }
      }
    }
    int Q = scanner.nextInt();
    for (int i = 0; i < Q; i++) {
      int s = scanner.nextInt() - 1;
      int t = scanner.nextInt() - 1;
      if (dist[s][t] >= INF) System.out.println(-1);
      else {
        long cnt = 0;
        long len = 0;
        while (s != t) {
          int k = next[s][t];
          if (len + dist[s][k] > L) {
            cnt++;
            len = 0;
          }
          len += dist[s][k];
          s = k;
        }
        System.out.println(cnt);
      }
    }
  }
}
