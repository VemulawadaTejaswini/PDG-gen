import java.util.*;

public class Main {

  static int N;
  static int W;
  static int[] w;
  static int[] v;
  static long[][] dp;

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    N = sc.nextInt();
    W = sc.nextInt();
    w = new int[N];
    v = new int[N];

    for (int i = 0; i < N; i++) {
      w[i] = sc.nextInt();
      v[i] = sc.nextInt();
    }

    sc.close();

    // 計算結果を入れておく配列
    dp = new long[N+1][W+1];

    // 処理をしていないところは -1 としておく
    for (int i = 0; i < N + 1; i++) {
      Arrays.fill(dp[i], -1);
    }

    System.out.println(dfs(0,W));

  }

  // i番目以降の品物から重さの総和がj以下になるように選ぶ
  public static long dfs(int i, int j){

    // すでに調べたことがある場合はその値を返す
    if (0 <= dp[i][j]) {
      return dp[i][j];
    }

    if (i == N) {
      dp[i][j] = 0;
    } else if (j < w[i]) {
      dp[i][j] = dfs(i + 1, j);
    } else {
      dp[i][j] = Math.max(dfs(i + 1, j), dfs(i + 1, j - w[i]) + v[i]); 
    }

    return dp[i][j];

  }

}