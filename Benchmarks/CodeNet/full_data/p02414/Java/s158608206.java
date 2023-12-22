public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n, m, l;
    int[][] a, b;
    int i, j, k;
    long[][] c;

    n = sc.nextInt();
    m = sc.nextInt();
    l = sc.nextInt();
    a = new int[n][m];
    b = new int[m][l];
    c = new long[n][l];

    for(i = 0;i < n;i++){
      for(j = 0;j < m;j++){
        a[i][j] = sc.nextInt();
      }
    }
    for(i = 0;i < m;i++){
      for(j = 0;j < l;j++){
        b[i][j] = sc.nextInt();
      }
    }

    for(i = 0;i < n;i++){
      for(j = 0;j < l;j++){
        c[i][j] = 0;
        for(k = 0;k < m;k++){
          c[i][j] += (a[i][k] * b[k][j]);
        }
      }
    }

    for(i = 0;i < n;i++){
      j = 0;
      System.out.print(c[i][j]);
      for(j = 1;j < l;j++){
        System.out.print(" " + c[i][j]);
      }
      System.out.println();
    }

/*fin*/
    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}