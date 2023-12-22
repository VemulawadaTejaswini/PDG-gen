public class Main{
  static int[] a;
  static int infi = 2000000;
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int v, e, i, j, k;
    int[][] d, dp;

    v = sc.nextInt(); e = sc.nextInt();
    d = new int[v][v]; a = new int[v + 1];
    for(i = 0;i < v;i++)for(j = 0;j < v;j++)d[i][j] = infi;
    for(;e-- > 0;)d[sc.nextInt()][sc.nextInt()] = sc.nextInt();
    a[0] = 1;
    for(i = 0;i < v;i++)a[i + 1] = a[i] * 2;
    dp = new int[a[v]][v];
    for(i = 0;i < a[v];i++)for(j = 0;j < v;j++)dp[i][j] = infi;
    dp[a[v] - 1][0] = 0;

    for(i = a[v] - 1;i >= 0;i--)
      for(j = 0;j < v;j++)if(dp[i][j] != infi)
        for(k = 0;k < v;k++)if(j != k && isin(i, k) && d[k][j] < infi){
          if(dp[i][j] + d[k][j] < dp[i - a[j]][k])
            dp[i - a[j]][k] = dp[i][j] + d[k][j];
        }
    out.println(dp[0][0]);
    
    sc.close();
  }
  private static boolean isin(int s, int v){
    return (v == 0 || ((s % a[v + 1]) / a[v]) == 1);
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}