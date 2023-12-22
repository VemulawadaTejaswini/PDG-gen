public class Main{
  static int infi = 1000001;
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int t, n, k;
    int i, j, l, joint, sum, tmp;
    int[] x, d;

    t = sc.nextInt();
    for(i = 0;i < t;i++){
      n = sc.nextInt(); k = sc.nextInt();
      if(n <= k){
        for(j = 0;j < n;j++)tmp = sc.nextInt();
        out.println("0");
      }else{
        x = new int[n]; d = new int[n - 1];
        x[0] = sc.nextInt();
        for(j = 1;j < n;j++){
          x[j] = sc.nextInt();
          d[j - 1] = x[j] - x[j - 1];
        }
        joint = n - k; sum = 0;
        mergesort(d, 0, n - 1);

        for(j = 0;j < joint;j++)sum += d[j];
        out.println(sum);
      }
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
  private static void mergesort(int[] x, int l, int r){
    int m, c;
    if(l + 1 >= r)return;
    else{
      m = (l + r) / 2;
      mergesort(x, l, m);
      mergesort(x, m, r);
      merge(x, l, m, r);
      return;
    }
  }
  private static void merge(int[] x, int l, int m, int r){
    int nl, nr, count;
    int i, j, k;
    int[] xl, xr;

    nl = m - l; nr = r - m;
    xl = new int[nl + 1]; xr = new int[nr + 1];
    for(i = 0;i < nl;i++)xl[i] = x[l + i];
    for(i = 0;i < nr;i++)xr[i] = x[m + i];
    xl[nl] = infi; xr[nr] = infi;

    i = 0;j = 0;count = 0;

    for(k = l;k < r;k++){
      if(xl[i] < xr[j])x[k] = xl[i++];
      else x[k] = xr[j++];
    }
    return;
  }
}