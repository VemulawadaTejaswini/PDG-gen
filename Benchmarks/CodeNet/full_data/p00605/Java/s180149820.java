public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n, k;
    int[] s;
    int[][] b;
    int i, j;

    for(;;){
      n = sc.nextInt();
      k = sc.nextInt();
      if(n == 0 && k == 0)break;
      s = new int[k];
      b = new int[n][k];

      for(i = 0;i < k;i++)s[i] = sc.nextInt();
      for(i = 0;i < n;i++)for(j = 0;j < k;j++)b[i][j] = sc.nextInt();

      for(i = 1;i < n;i++)for(j = 0;j < k;j++)b[0][j] += b[i][j];

      for(i = 0;i < k;i++)if(s[i] < b[0][i])break;
      if(i < k)System.out.println("No");
      else System.out.println("Yes");

    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}