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
      int sr = search(s, x);
      int tr = search(t, x);
      long min = INF;
      for (int j = 0; j < 2; j++) {
        long[] a = j == 0 ? s : t;
        long[] b = j == 0 ? t : s;
        int apos = j == 0 ? sr : tr;
        int bpos = j == 0 ? tr : sr;
        for (int k = 0; k < 2; k++) {
          for (int l = 0; l < 2; l++) {
            min = Math.min(min, Math.abs(x-a[apos-k])+Math.abs(a[apos-k]-b[bpos-l]));
          }
        }
      }
      System.out.println(min);
    }
  }
  
  private static int search(long[] a, long x) {
    int ng = 0;
    int ok = a.length-1;
    while (Math.abs(ok-ng) > 1) {
      int m = (ok+ng)/2;
      if (x <= a[m]) {
        ok = m;
      } else {
        ng = m;
      }
    }
    
    return ok;
  }
}