public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n, i, m;
    double[] x, y;
    n = sc.nextInt();
    x = new double[n]; y = new double[n];
    for(i = 0;i < n;i++){
      x[i] = sc.nextDouble(); y[i] = sc.nextDouble();
    }
    m = getconvexhull(x, y, n);
    if(n == m)out.println("Possible");
    else out.println("Impossible");

    sc.close();
  }
  private static int getconvexhull(double[] x, double[] y, int n){
    int i, numr, numl;
    double[] resx, resy, anslx, ansly;
    mergesort(x, y, 0, n);
    resx = new double[n]; resy = new double[n];
    numr = rcovering(x, y, n, resx, resy);
    if(n == numr)return numr;
    else{
      anslx = new double[n]; ansly = new double[n];
      reverse(x, y, n);
      numl = rcovering(x, y, n, anslx, ansly);
      for(i = 0;i < numl;i++){
        resx[numr + i] = anslx[i]; resy[numr + i] = ansly[i];
      }
    }
    return (numr + numl);
  }
  private static int rcovering(double[] x, double[] y, int n,
                                double[] ansx, double[] ansy){
    int i, num;
    ansx[0] = x[0]; ansy[0] = y[0]; ansx[1] = x[1]; ansy[1] = y[1];
    num = 2;
    for(i = 2;i < n;i++){
      ansx[num] = x[i]; ansy[num] = y[i];
      num = gscan(ansx, ansy, num);
    }
    if(ansx[num - 1] == x[n - 1] && ansy[num - 1] == y[n - 1])num--;
    return num;
  }
  private static void reverse(double[] x, double[] y, int n){
    double tmp;
    int i;
    for(i = 0;i < n / 2;i++){
      tmp = x[i]; x[i] = x[n - 1 - i]; x[n - 1 - i] = tmp;
      tmp = y[i]; y[i] = y[n - 1 - i]; y[n - 1 - i] = tmp;
    }
    return;
  }
  private static int gscan(double[] ansx, double[] ansy, int num){
    double s1x, s1y, s2x, s2y;
    for(;num > 0;){
      if(num == 1)return ++num;
      s1x = ansx[num - 1] - ansx[num]; s1y = ansy[num - 1] - ansy[num];
      s2x = ansx[num - 2] - ansx[num]; s2y = ansy[num - 2] - ansy[num];
      if(s1x * s2y - s2x * s1y > 0){
        ansx[num - 1] = ansx[num]; ansy[num - 1] = ansy[num--];
      }else return ++num;
    }
    return num;
  }
  private static void mergesort(double[] x, double[] y, int l, int r){
    int m, c;
    if(l + 1 >= r)return;
    else{
      m = (l + r) / 2;
      mergesort(x, y, l, m); mergesort(x, y, m, r); merge(x, y, l, m, r);
      return;
    }
  }
  private static void merge(double[] x, double[] y, int l, int m, int r){
    int nl, nr;
    int i, j, k;
    double infi = 1010001000;
    double[] xl, xr, yl, yr;
    nl = m - l; nr = r - m;
    xl = new double[nl + 1]; xr = new double[nr + 1];
    yl = new double[nl + 1]; yr = new double[nr + 1];
    for(i = 0;i < nl;i++){ xl[i] = x[l + i]; yl[i] = y[l + i]; }
    for(i = 0;i < nr;i++){ xr[i] = x[m + i]; yr[i] = y[m + i]; }
    xl[nl] = infi; xr[nr] = infi; yl[nl] = infi; yr[nr] = infi;
    i = 0; j = 0;
    for(k = l;k < r;k++){
      if(alow(xl[i], yl[i], xr[j], yr[j])){ x[k] = xl[i]; y[k] = yl[i++]; }
      else{ x[k] = xr[j]; y[k] = yr[j++]; }
    }
    return;
  }
  private static boolean alow(double ax, double ay, double bx, double by){
    if(ay < by || (ay == by && ax <= bx))return true;
    else return false;
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}