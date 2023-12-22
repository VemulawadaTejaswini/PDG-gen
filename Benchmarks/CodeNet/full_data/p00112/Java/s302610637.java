public class Main{
  static int infi = 100;
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int[] a;
    int n, i, sum;

    for(;;){
      n = sc.nextInt();
      if(n == 0)break;
      a = new int[n];
      for(i = 0;i < n;i++)a[i] = sc.nextInt();
      mergesort(a, 0, n);
      sum = 0;
      for(i = 1;i < n;i++)sum += a[n - 1 - i] * i;
      out.println(sum);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
  private static void mergesort(int[] a, int l, int r){
    int m, c;
    if(l + 1 >= r)return;
    else{
      m = (l + r) / 2;
      mergesort(a, l, m);
      mergesort(a, m, r);
      merge(a, l, m, r);
      return;
    }
  }
  private static void merge(int[] a, int l, int m, int r){
    int nl, nr, count;
    int i, j, k;
    int[] al, ar;

    nl = m - l; nr = r - m;
    al = new int[nl + 1]; ar = new int[nr + 1];
    for(i = 0;i < nl;i++){
      al[i] = a[l + i];
    }
    for(i = 0;i < nr;i++){
      ar[i] = a[m + i];
    }
    al[nl] = infi; ar[nr] = infi;

    i = 0;j = 0;count = 0;

    for(k = l;k < r;k++){
      if(al[i] < ar[j])a[k] = al[i++];
      else a[k] = ar[j++];
    }
    return;
  }

}