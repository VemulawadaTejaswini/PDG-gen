import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long x = sc.nextLong();
    long[] a = new long[n];
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextLong();
    }
    long[] rui = new long[n];
    rui[0] = a[0];
    for(int i = 1; i < n; i++) {
      rui[i] = rui[i - 1] + a[i];
    }
    long ans = Long.MAX_VALUE;
    for(int k = 1; k <= n; k++) {
      long t = ((long)(n + k)) * x;
      int p = n - 1;
      for(int j = 1; j <= n; j++) {
        long c = rui[p];
        if((p - k) >= 0) c -= rui[p - k];
        p -= k;
        if(j == 1) {
          t += (5 * c);
        } else {
          t += ((2 * j + 1) * c);
        }
        if(p < 0) break;
      }
      ans = Math.min(ans, t);
    }
    System.out.println(ans);
  }
}