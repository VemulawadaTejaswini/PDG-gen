public class Main{
  static double eps = 0.0000001;
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    double ux, uy, uz, ex, ey, ez;
    double[] x, y, z, s, t;
    double[][] a, ainv;
    int i, j;
    x = new double[3]; y = new double[3]; z = new double[3];
    a = new double[3][3]; ainv = new double[3][3];
    s = new double[3]; t = new double[3];

    ux = sc.nextDouble(); uy = sc.nextDouble(); uz = sc.nextDouble();
    ex = sc.nextDouble(); ey = sc.nextDouble(); ez = sc.nextDouble();
    t[0] = ex - ux; t[1] = ey - uy; t[2] = ez - uz;
    for(i = 0;i < 3;i++){
      x[i] = sc.nextDouble(); y[i] = sc.nextDouble(); z[i] = sc.nextDouble();
      a[0][i] = x[i] - ux; a[1][i] = y[i] - uy; a[2][i] = z[i] - uz;
    }
    getinv(a, ainv, 3);
    for(i = 0;i < 3;i++)for(j = 0;j < 3;j++)s[i] += ainv[i][j] * t[j];
    if(solve(s))out.println("HIT");
    else out.println("MISS");

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
  private static void getinv(double[][] a, double[][] ainv, int n){
    int i, j, max;
    double[][] x;
    x = new double[n][n * 2];
    for(i = 0;i < n;i++){
      for(j = 0;j < n;j++)x[i][j] = a[i][j];
      x[i][n + i] = 1;
    }
    for(i = 0;i < n;i++){
      max = i;
      for(j = i;j < n;j++){
        if(x[max][i] == 1)break;
        if(max < x[j][i])max = j;
      }
      hswap(x, n, i, max);
      hdiv(x, n, i, x[i][i]);
      for(j = 0;j < n;j++)if(i != j)hdel(x, n, i, j);
    }
    for(i = 0;i < n;i++)for(j = 0;j < n;j++)ainv[i][j] = x[i][j + n];

    return;
  }
  private static void hswap(double[][] x, int n, int i, int j){
    int q;
    double tmp;
    for(q = 0;q < 2 * n;q++){
      tmp = x[i][q]; x[i][q] = x[j][q]; x[j][q] = tmp;
    }
    return;
  }
  private static void hdiv(double[][] x, int n, int i, double c){
    int q;
    for(q = i;q < n * 2;q++)x[i][q] /= c;
    return;
  }
  private static void hdel(double[][] x, int n, int i, int j){
    int q;
    double t = x[j][i];
    for(q = i;q < 2 * n;q++)x[j][q] -= x[i][q] * t;
    return;
  }
  private static boolean solve(double[] s){
    int i;
    for(i = 0;i < 3;i++)if(s[i] + eps < 0)return true;
    if(s[0] + s[1] + s[2] + eps <= 1.0)return true;
    return false;
  }
}