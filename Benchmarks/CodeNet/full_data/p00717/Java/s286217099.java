public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n, i, j, tmp;
    int[] m;
    int[][] x, y;


    for(;;){
      n = sc.nextInt();
      if(n == 0)break;

      m = new int[n + 1];
      x = new int[n + 1][10]; y = new int[n + 1][10];
      for(i = 0;i < n + 1;i++){
        m[i] = sc.nextInt();
        for(j = 0;j < m[i];j++){
          x[i][j] = sc.nextInt(); y[i][j] = sc.nextInt();
        }
      }

      for(i = 1;i < n + 1;i++){
        if(m[0] == m[i]){
          if(isisom(x, y, m, i))out.println(i);
          for(j = 0;j < m[i] / 2;j++){
            tmp = x[i][j]; x[i][j] = x[i][m[i] - 1 - j];
            x[i][m[i] - 1 - j] = tmp;
            tmp = y[i][j]; y[i][j] = y[i][m[i] - 1 - j];
            y[i][m[i] - 1 - j] = tmp;
          }
          if(isisom(x, y, m, i))out.println(i);
        }
      }
      out.println("+++++");
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
  private static boolean isisom(int[][] x, int[][] y, int[] m, int i){
    int j, s0, si, l0, li;
    for(j = 0;j < m[i] - 2;j++){
      s0 = (x[0][j + 1] - x[0][j]) * (y[0][j + 2] - y[0][j])
      - (x[0][j + 2] - x[0][j]) * (y[0][j + 1] - y[0][j]);
      si = (x[i][j + 1] - x[i][j]) * (y[i][j + 2] - y[i][j])
      - (x[i][j + 2] - x[i][j]) * (y[i][j + 1] - y[i][j]);
      l0 = (x[0][j + 1] - x[0][j]) * (x[0][j + 1] - x[0][j])
      + (y[0][j + 1] - y[0][j]) * (y[0][j + 1] - y[0][j]);
      li = (x[i][j + 1] - x[i][j]) * (x[i][j + 1] - x[i][j])
      + (y[i][j + 1] - y[i][j]) * (y[i][j + 1] - y[i][j]);
      if(s0 * si <= 0 || l0 != li)return false;
    }
    l0 = (x[0][j + 1] - x[0][j]) * (x[0][j + 1] - x[0][j])
    + (y[0][j + 1] - y[0][j]) * (y[0][j + 1] - y[0][j]);
    li = (x[i][j + 1] - x[i][j]) * (x[i][j + 1] - x[i][j])
    + (y[i][j + 1] - y[i][j]) * (y[i][j + 1] - y[i][j]);
    if(l0 == li)return true;
    return false;
  }
}