import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    long k = sc.nextLong();
    long[] a = new long[n];
    long[] b = new long[m];
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextLong();
    }
    for(int i = 0; i < m; i++) {
      b[i] = sc.nextLong();
    }
    int ans = 0;
    int p = 0;
    int q = 0;
    long t = 0;
    for(int i = 0; i < (n + m); i++) {
      if(p >= n) {
        t += b[q];
        q++;
      } else {
        if(q >= m) {
          t += a[p];
          p++;
        } else {
          if(a[p] >= b[q]) {
            t += b[q];
            q++;
          } else {
            t += a[p];
            p++;
          }
        }
      }
      if(t <= k) {
        ans++;
      } else {
        break;
      }
    }
    System.out.println(ans);
  }
}