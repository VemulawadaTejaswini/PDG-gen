import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long k = sc.nextLong();
    long[] a = new long[n];
    long sum = 0;
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextLong();
      sum += a[i];
    }
    long ans = 0;
    for(long i = 1; (i * i) <= sum; i++) {
      if((sum % i) == 0) {
        long d = i;
        long[] r = new long[n];
        long p = 0;
        for(int j = 0; j < n; j++) {
          r[j] = (a[j] % d);
          if(r[j] > 0) p++;
        }
        if(p == 0) {
          ans = Math.max(ans, d);
        } else { 
          Arrays.sort(r);
          long[] t = new long[n];
          long[] u = new long[n];
          t[0] = r[0];
          u[n - 1] = (d - r[n - 1]);
          for(int j = 1; j < n; j++) {
            t[j] = (t[j - 1] + r[j]);
          }
          for(int j = n - 2; j >= 0; j--) {
            u[j] = (u[j + 1] + d - r[j]);
          }
          long m = 0;
          for(int j = 0; j < n - 1; j++) {
            if((Math.abs(t[j] - u[j + 1]) % d) == 0) {
              if(Math.max(t[j], u[j + 1]) <= k) m++;
            }
          }
          if(m > 0) ans = Math.max(ans, d);
        }
        d = sum / i;
        r = new long[n];
        p = 0;
        for(int j = 0; j < n; j++) {
          r[j] = (a[j] % d);
          if(r[j] > 0) p++;
        }
        if(p == 0) {
          ans = Math.max(ans, d);
        } else { 
          Arrays.sort(r);
          long[] t = new long[n];
          long[] u = new long[n];
          t[0] = r[0];
          u[n - 1] = (d - r[n - 1]);
          for(int j = 1; j < n; j++) {
            t[j] = (t[j - 1] + r[j]);
          }
          for(int j = n - 2; j >= 0; j--) {
            u[j] = (u[j + 1] + d - r[j]);
          }
          long m = 0;
          for(int j = 0; j < n - 1; j++) {
            if((Math.abs(t[j] - u[j + 1]) % d) == 0) {
              if(Math.max(t[j], u[j + 1]) <= k) m++;
            }
          }
          if(m > 0) ans = Math.max(ans, d);
        }
      }
  }
  System.out.println(ans);
}
}