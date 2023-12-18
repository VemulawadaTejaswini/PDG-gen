import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    long a = sc.nextLong();
    long b = sc.nextLong();

    long ans = 1;
    if (a % 2 == 0 && b % 2 == 0) ans++;
    for (long i = 3; i <= Math.min(a, b); i += 2) {
      if ((a % i) == 0 && (b % i) == 0) {
        long cnt = 0;
        for (long j = 2; j <= i; j++) {
          if ((i % j) == 0) cnt++;
          if (cnt >= 2) break;
        }
        if (cnt < 2) ans++;
      }
    }
    
    System.out.println(ans);
  }
}
