public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n;
    int[][] a;
    int i, j;

    for(;;){
      n = sc.nextInt();
      if(n == 0)break;
      a = new int[n + 1][n + 1];

      for(i = 0;i < n;i++)for(j = 0;j < n;j++)a[i][j] = sc.nextInt();

      for(i = 0;i < n;i++){
        for(j = 0;j < n;j++){
          a[i][n] += a[i][j];
          a[n][j] += a[i][j];
        }
        a[n][n] += a[i][n];
      }

      for(i = 0;i < n + 1;i++){
        for(j = 0;j < n;j++)System.out.printf("%5d", a[i][j]);
        System.out.printf("%5d%n", a[i][j]);
      }
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}