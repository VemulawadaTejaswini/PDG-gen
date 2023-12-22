import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;
 
public class Main {

  static final int INF = 1000000001;
  static final int N = 500000;
  static int n, c;
  static int a[], L[], R[];

  public static void merge(int l, int m, int r) {
    int i, j, k;
    int nl = m - l;
    int nr = r - m;

    for (i=0; i<nl; i++) L[i] = a[l + i];
    for (i=0; i<nr; i++) R[i] = a[m + i];
    L[nl] = R[nr] = INF;

    i = j = 0;
    for (k=l; k<r; k++) {
      c++;
      if (L[i] <= R[j])
        a[k] = L[i++];
      else
        a[k] = R[j++];
    }
  }

  static void merge_sort(int l, int r) {
    if (l + 1 < r) {
      int m = (l+r)/2;
      merge_sort(l, m);
      merge_sort(m, r);
      merge(l, m, r);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    n = Integer.parseInt(sc.next());
    a = new int[n];
    L = new int[n];
    R = new int[n];
    for (int i=0; i<n; i++)
      a[i] = Integer.parseInt(sc.next());

    merge_sort(0, n);
    for (int i=0; i<n; i++)
      System.out.print(String.valueOf(a[i]) + ( (i==n-1) ? '\n' : ' ' ));
    System.out.println(c);
  }
}