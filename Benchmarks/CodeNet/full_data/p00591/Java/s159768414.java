public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int[][] a, c;
    int n, i, j, min, max, count;

    for(;;){
      n = sc.nextInt();
      if(n == 0)break;

      a = new int[n][n]; c = new int[n][n];
      for(i = 0;i < n;i++)for(j = 0;j < n;j++)a[i][j] = sc.nextInt();

      for(i = 0;i < n;i++){
        min = a[i][0]; max = a[0][i];
        for(j = 1;j < n;j++){
          if(min > a[i][j])min = a[i][j];
          if(max < a[j][i])max = a[j][i];
        }
        for(j = 0;j < n;j++){
          if(min == a[i][j])c[i][j]++;
          if(max == a[j][i])c[j][i]++;
        }
      }

      count = 0;
      for(i = 0;i < n;i++)for(j = 0;j < n;j++)if(c[i][j] == 2){
        out.println(a[i][j]);
        count++;
      }
      if(count == 0)out.println("0");
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}