import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long ans = sc.nextLong() - 1;
    long p = 2;
    for(int i = 1; i < n; i++) {
      long a = sc.nextLong();
      if(a == p) {
        p++;
      } else {
        long r = (a % p);
        if(r == 0) {
          if(a > p) {
            ans++;
            a -= (p + 1);
            r = (a % p);
            ans += ((a - r) / p);
          }
        } else {
          ans += ((a - r) / p);
        }
      }
    }
    System.out.println(ans);
  }
}