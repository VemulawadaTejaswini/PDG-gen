import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    long a = sc.nextInt();
    long b = sc.nextInt();

    long ans = 0;
    for (long i = 1; i <= Math.min(a, b); i++) {
      if ((a % i) == 0 && (b % i) == 0) {
        int cnt = 0;
        for (long j = 2; j <= i; j++) {
          if (i % j == 0) cnt++;
          if (cnt >= 2) break;
        }
        if (cnt < 2) ans++;
      }
    }
    
    System.out.println(ans);
  }
}
