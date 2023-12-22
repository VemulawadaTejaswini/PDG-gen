
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String x = sc.next();
    long p = 0;
    for(int i = 0; i < n; i++) {
      if(x.charAt(i) == '1') p++;
    }
    if(p == 0) {
      for(int i = 0; i < n; i++) {
        System.out.println(1); 
      }
    } else {
      long[] r0 = new long[n];
      r0[n - 1] = 1;
      for(int i = n - 2; i >= 0; i--) {
        r0[i] = (2 * r0[i + 1]) % p;
      }
      long t0 = 0;
      for(int i = 0; i < n; i++) {
        if(x.charAt(i) == '1') t0 = (t0 + r0[i]) % p;
      }

      long[] r1 = new long[n];
      r1[n - 1] = 1;
      for(int i = n - 2; i >= 0; i--) {
        r1[i] = (2 * r1[i + 1]) % (p + 1);
      }
      long t1 = 0;
      for(int i = 0; i < n; i++) {
        if(x.charAt(i) == '1') t1 = (t1 + r1[i]) % (p + 1);
      }

      long[] r2 = new long[n];
      long t2 = 0;
      r2[n - 1] = 1;
      if(p > 1) {
        for(int i = n - 2; i >= 0; i--) {
          r2[i] = (2 * r2[i + 1]) % (p - 1);
        }
        for(int i = 0; i < n; i++) {
          if(x.charAt(i) == '1') t2 = (t2 + r2[i]) % (p - 1);
        }
      }

      for(int i = 0; i < n; i++) {
        if(x.charAt(i) == '0') {
          long s = (t1 + r1[i]) % (p + 1);
          int ans = 1;
          while(s > 0) {
            ans++;
            int d = 0;
            long s1 = s;
            while(s1 > 0) {
              d += (s1 % 2);
              s1 /= 2;
            }
            s = (s % d);
          }
          System.out.println(ans);
        } else {
          if(p == 1) {
            System.out.println(0); 
          } else {
            long s = (t2 - r2[i] + p - 1) % (p - 1);
            int ans = 1;
            while(s > 0) {
              ans++;
              int d = 0;
              long s1 = s;
              while(s1 > 0) {
                d += (s1 % 2);
                s1 /= 2;
              }
              s = (s % d);
            }
            System.out.println(ans);
          }
        }
      }
    }
  }
}