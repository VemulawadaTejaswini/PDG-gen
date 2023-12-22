public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n, i;
    int[] a;
    n = sc.nextInt();
    a = new int[n];
    for(i = 0;i < n;i++)a[i] = sc.nextInt();
    out.println(count(a, 0, n));

    sc.close();
  }
  private static long count(int[] c, int l, int r){
    int m;
    if(l + 1 >= r){
      if(l < r)return 0;
      return 1;
    }else{
      m = (l + r) / 2;
      return (count(c, l, m) + count(c, m, r) + merge(c, l, m, r));
    }
  }
  private static long merge(int[] c, int l, int m, int r){
    int nl, nr;
    int i, j, k;
    int infi = 1980000000;
    int[] cl, cr;
    long count;
    nl = m - l; nr = r - m;
    cl = new int[nl + 1]; cr = new int[nr + 1];
    for(i = 0;i < nl;i++)cl[i] = c[l + i];
    for(i = 0;i < nr;i++)cr[i] = c[m + i];
    cl[nl] = infi; cr[nr] = infi;
    i = 0; j = 0; count = 0;
    for(k = l;k < r;k++){
      if(cl[i] < cr[j])c[k] = cl[i++];
      else{
        c[k] = cr[j++]; count += (nl - i);
      }
    }
    return count;
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}