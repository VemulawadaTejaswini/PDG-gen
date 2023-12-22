public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int r, c;
    int[][] a;
    int i, j;

    r = sc.nextInt();
    c = sc.nextInt();
    a = new int[r + 1][c + 1];

    for(i = 0;i < r;i++){
      for(j = 0;j < c;j++){
        a[i][j] = sc.nextInt();
      }
    }

    for(i = 0;i < r;i++){
      for(j = 0;j < c;j++){
        a[i][c] += a[i][j];
        a[r][j] += a[i][j];
      }
      a[r][c] += a[i][c];
    }

    for(i = 0;i < r + 1;i++){
      for(j = 0;j < c;j++){
        System.out.print(a[i][j] + " ");
      }
      System.out.println(a[i][j]);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}