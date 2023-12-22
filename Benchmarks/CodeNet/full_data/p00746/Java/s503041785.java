public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n, ni, di, i, j, k, l, r, t, b;
    int[][] f;

    for(;;){
      n = sc.nextInt();
      if(n == 0)break;
      f = new int[2 * n + 1][2 * n + 1];
      for(i = 0;i < 2 * n + 1;i++)for(j = 0;j < 2 * n + 1;j++)f[i][j] = -1;
      f[n][n] = 0; l = n; r = n; t = n; b = n;

      for(k = 0;k < n - 1;k++){
        ni = sc.nextInt(); di = sc.nextInt();
        for(i = 0;i < 2 * n + 1;i++)for(j = 0;j < 2 * n + 1;j++){
          if(f[i][j] == ni){
            if(di == 0)f[i][j - 1] = k + 1;
            else if(di == 1)f[i + 1][j] = k + 1;
            else if(di == 2)f[i][j + 1] = k + 1;
            else  f[i - 1][j] = k + 1;
            break;
          }
        }
      }

      for(i = 0;i < 2 * n + 1;i++){
        for(j = 0;j < 2 * n + 1;j++){
          if(f[i][j] >= 0){
            if(l > j)l = j;
            if(r < j)r = j;
            if(t < i)t = i;
            if(b > i)b = i;
          }
        }
      }

      out.println((r - l + 1) + " " + (t - b + 1));
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}