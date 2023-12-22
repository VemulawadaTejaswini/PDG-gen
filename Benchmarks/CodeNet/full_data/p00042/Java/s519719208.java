public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int w, n, i, j, res, t, l, r;
    int[] v, h;
    int[][] dp;
    char[] c;
    String s;

    for(t = 1;;t++){
      w = sc.nextInt(); if(w == 0)break;
      n = sc.nextInt();
      v = new int[n]; h = new int[n];
      for(i = 0;i < n;i++){
        s = sc.next();
        c = new char[s.length()];
        for(j = 0;j < s.length();j++)c[j] = s.charAt(j);
        l = 0; r = 0;
        for(j = 0;j < s.length();j++)if(c[j] == ','){
          r = j; v[i] = readint(c, l, r); l = ++j; break;
        }
        h[i] = readint(c, l, s.length());
      }
      dp = new int[n + 1][w + 1];
      for(i = 0;i < n + 1;i++)for(j = 0;j < w + 1;j++)dp[i][j] = 0;

      for(i = 1;i < n + 1;i++)for(j = 0;j < w + 1;j++){
        if(h[i - 1] > j)dp[i][j] = dp[i - 1][j];
        else if(dp[i][j] < dp[i - 1][j - h[i - 1]] + v[i - 1])
            dp[i][j] = dp[i - 1][j - h[i - 1]] + v[i - 1];
      }

      res = w;
      for(j = w;j >= 0;j--)if(dp[n][j] >= dp[n][res])res = j;
      out.printf("Case %d:%n%d%n%d%n", t, dp[n][res], res);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
  private static int readint(char[] ch, int l, int r){
    int i, d, res;
    d = 1; res = 0;
    for(i = r - 1;i >= l;i--){
      res += d * (int)(ch[i] - '0');
      d *= 10;
    }
    return res;
  }
}