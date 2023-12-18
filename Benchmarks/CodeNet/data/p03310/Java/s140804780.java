import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    int s = 0;
    for (int i=0;i<n;i++) {
      a[i] = sc.nextInt();
      s += a[i];
    }
    int aa = s/4;
    int b = 0;
    int e = 0;
    int i = 0;
    while(b<aa) {
      b += a[i];
      i++;
    }
    if (b-aa>aa-b+a[i-1]&&i>1) b -= a[--i];
    int j = n-1;
    while(e<aa) {
      e += a[j];
      j--;
    }
    if (e-aa>aa-e+a[j+1]&&j<n-2) e -= a[++j];
    int aaa;
    int c = 0;
    int d = 0;
    int ii;
    if (i==j) {
      if (i>1 && b>e) {
        d = a[i];
        aaa = b/2;
        i = 0;
        while(c<aaa) {
          c += a[i];
          i++;
        }
        if (c-aaa>aaa-c+a[i-1]&&i>1) c -= a[--i];
        b -= c;
      } else {
        c = a[i];
        aaa = e/2;
        j++;
        while(d<aaa) {
          d += a[j];
          j++;
        }
        if (d-aaa>aaa-d+a[j-1]&&j>i+2) d -= a[--j];
        e -= d;
      }
    } else {
      ii = i;
      while(c<aa) {
        c += a[i];
        i++;
      }
      if (c-aa>aa-c+a[i-1]&&i>ii+1) c -= a[--i];
      d = s - b - c - e;
    }
    int min = b;
    int max = b;
    if (min > c) min = c;
    if (max < c) max = c;
    if (min > d) min = d;
    if (max < d) max = d;
    if (min > e) min = e;
    if (max < e) max = e;
    System.out.println(max-min);
  }
}
