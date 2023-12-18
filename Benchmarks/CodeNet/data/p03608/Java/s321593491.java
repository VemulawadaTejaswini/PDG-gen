import java.util.*;

public class Main {
  public static long ans;
  public static int n;
  public static int r;
  public static int[] rk;
  public static long[][] dp;
  public static boolean[] used;
  public static int[] perm;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    int m = sc.nextInt();
    r = sc.nextInt();
    used = new boolean[r];
    perm = new int[r];
    rk = new int[r];
    ans = Long.MAX_VALUE;
    for(int i = 0; i < r; i++) {
      rk[i] = sc.nextInt() - 1;
    }
    dp = new long[n][n];
    for(int i = 0; i < n; i++) {
      for(int j = 0; j < n; j++) {
        if(i != j) dp[i][j] = (long)Math.pow(10, 15);
      }
    }
    for(int i = 0; i < m; i++) {
      int a = sc.nextInt() - 1;
      int b = sc.nextInt() - 1;
      long c = sc.nextLong();
      dp[a][b] = c;
      dp[b][a] = c;
    }
    for(int k = 0; k < n; k++) {
      for(int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++) {
          dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k][j]);
        }
      }
    }
    dfs(0);
    System.out.println(ans);
  }

  public static void dfs(int i) {
    if(i == r) {
      long t = 0;
      int[] p = new int[r];
      for(int j = 0; j < r; j++) {
        int d = perm[j];
        p[j] = rk[d];
      }
      for(int j = 0; j < (r - 1); j++) {
        t += dp[p[j]][p[j + 1]];
      }
      ans = Math.min(ans, t);
    } else {
      for(int j = 0; j < r; j++) {
        if(!used[j]) {
          perm[i] = j;
          used[j] = true;
          dfs(i + 1);
          used[j] = false;
        }
      }
    }
  }
}