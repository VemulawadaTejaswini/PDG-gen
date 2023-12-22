public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int i, j, n, w;
    int[] v, vv;
    int[][] dp;
    n = sc.nextInt(); w = sc.nextInt();
    v = new int[n]; vv = new int[n]; dp = new int[n + 1][w + 1];
    for(i = 0;i < n;i++){
      v[i] = sc.nextInt(); vv[i] = sc.nextInt();
    }
    for(i = 0;i < n;i++)for(j = 0;j <= w;j++){
      if(dp[i + 1][j] < dp[i][j])dp[i + 1][j] = dp[i][j];
      if(j + vv[i] <= w && dp[i][j] + v[i] > dp[i + 1][j + vv[i]])
        dp[i + 1][j + vv[i]] = dp[i][j] + v[i];
    }
    out.println(dp[n][w]);

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}