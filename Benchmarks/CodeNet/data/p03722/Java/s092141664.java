import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    long[] d = new long[N];
    long[][] dp = new long[N][N];
    for(int i = 0; i < N; i++) {
      for(int j = 0; j < N; j++) {
        if(i != j) dp[i][j] = (long)Math.pow(10, 15);
      }
    }
    boolean flg = false;
    long ans = 0;
    ArrayList<Edge> edge = new ArrayList<Edge>();
    for(int i = 0; i < M; i++) {
      int a = sc.nextInt() - 1;
      int b = sc.nextInt() - 1;
      long s = (-1) * sc.nextLong();
      dp[a][b] = s;
      edge.add(new Edge(a, b, s));
    }
    // ベルマンフォード
    for(int i = 0; i < N; i++) {
      for(int j = 0; j < edge.size(); j++) {
        Edge e = edge.get(j);
        if(d[e.to] > d[e.from] + e.score) {
          d[e.to] = d[e.from] + e.score;
          if(i == N - 1) flg = true;
        }
      }
    }
    if(flg) {
      System.out.println("inf");
    } else {
      // ワーシャルフロイド
      for(int k = 1; k <= N; k++) {
        for(int i = 0; i < N; i++) {
          for(int j = 0; j < N; j++) {
            dp[i][j] = Math.min(dp[i][j], dp[i][k - 1] + dp[k - 1][j]);
          }
        }
      }
      System.out.println((-1) * dp[0][N - 1]);
    }
  }
}

class Edge {
  int from;
  int to;
  long score;
  public Edge(int from, int to, long score) {
    this.from = from;
    this.to = to;
    this.score = score;
  }
}