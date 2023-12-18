import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long k = sc.nextLong();
    long ans = 0;
    for(int j = k + 1; j <= n; j++) {
      long t = n / j;
      long r = n - t * j;
      long a = (j - k) * t + Math.max(0, r - k + 1);
      ans += a;
    }
    System.out.println(ans);
  }
}