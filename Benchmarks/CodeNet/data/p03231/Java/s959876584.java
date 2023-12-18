import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    String S = sc.next();
    String T = sc.next();
    int gcd = calcGcd(N, M);
    long lcm = (long)gcd*(N/gcd)*(M/gcd);
    long ans = lcm;
    long step = ((long)N/gcd)*((long)M/gcd);
    for (long i = 0; i < lcm; i+=step) {
      if (S.charAt((int)(i*gcd/M)) != T.charAt((int)(i*gcd/N))) {
        ans = -1;
        break;
      }
    }
    System.out.println(ans);
  }
  
  private static int calcGcd(int n, int m) {
    int gcd = 1;
    for (int i = 1; i <= n && i <= m; i++) {
      if (n%i == 0 && m%i == 0) {
        gcd = i;
      }
    }
    return gcd;
  }
}