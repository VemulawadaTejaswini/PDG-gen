import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[n];
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextLong() - (long)(i + 1);
    }
    Arrays.sort(a);
    long ans = 0;
    if((n % 2) == 1) {
      int t = n / 2;
      for(int i = 0; i < n; i++) {
        ans += (Math.abs(a[i] - a[t]));
      }
    } else {
      int t = n / 2;
      long s = 0;
      for(int i = 0; i < n; i++) {
        s += (Math.abs(a[i] - a[t]));
      }
      ans = s;
      s = 0;
      for(int i = 0; i < n; i++) {
        s += (Math.abs(a[i] - a[t - 1]));
      }
      ans = Math.min(ans, s);
    }
    System.out.println(ans);
  }
}