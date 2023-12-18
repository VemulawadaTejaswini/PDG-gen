import java.util.*;

public class Main {
  private static long INF = 1_000_000_000_000L;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int Q = sc.nextInt();
    
    long[] s = new long[A+2];
    s[0] = -INF;
    s[A+1] = INF;
    for (int i = 1; i <= A; i++) {
      s[i] = sc.nextLong();
    }
    
    long[] t = new long[B+2];
    t[0] = -INF;
    t[B+1] = INF;
    for (int i = 1; i <= B; i++) {
      t[i] = sc.nextLong();
    }
    
    for (int i = 0; i < Q; i++) {
      long x = sc.nextLong();
      int sr = search(s, x, 0, A+1);
      int tr = search(t, x, 0, B+1);
      long min = INF;
      min = Math.min(min, x-Math.min(s[sr-1], t[tr-1]));
      min = Math.min(min, Math.max(s[sr], t[tr])-x);
      min = Math.min(min, 2*(x-s[sr-1])+(t[tr]-x));
      min = Math.min(min, (x-s[sr-1])+2*(t[tr]-x));
      min = Math.min(min, 2*(x-t[tr-1])+(s[sr]-x));
      min = Math.min(min, (x-t[tr-1])+2*(s[sr]-x));
      
      System.out.println(min);
    }
  }
  
  private static int search(long[] a, long x, int l, int r) {
    
    if (a[l] < x && x < a[l+1]) {
      return l+1;
    }
    if (a[r-1] < x && x < a[r]) {
      return r;
    }
    
    int m = (l+r)/2;
    if (x < a[m]) {
      return search(a, x, l, m);
    } else {
      return search(a, x, m, r);
    }
  }
}