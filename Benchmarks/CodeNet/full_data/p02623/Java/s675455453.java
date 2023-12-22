import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    long k = sc.nextLong();
    long[] sa = new long[n + 1];
    long[] sb = new long[m + 1];
    for(int i = 1; i <= n; i++) {
      sa[i] = sa[i - 1] + sc.nextLong(); 
    }
    for(int i = 1; i <= m; i++) {
      sb[i] = sb[i - 1] + sc.nextLong();
    }
    int ans = 0;
    for(int i = 0; i <= n; i++) {
      if(sa[i] <= k) {
        long t = k - sa[i];
        int left = 0;
        int right = m;
        int a = 0;
        while(left < right) {
          int med = (left + right) / 2;
          if(sb[med] <= t) {
            a = med;
            left = med + 1;
          } else {
            right = med;
          }
        }
        ans = Math.max(ans, i + a);
      }
    }
    System.out.println(ans);
  }
}
