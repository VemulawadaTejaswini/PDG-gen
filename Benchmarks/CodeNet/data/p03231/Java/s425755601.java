import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    String S = sc.next();
    String T = sc.next();
    if (S.charAt(0) != T.charAt(0)) {
      System.out.println(-1);
      return;
    }
    int gcd = calcGcd(N, M);
    if (gcd == -1) {
      System.out.println((long)N*M);
      return;
    }
    if (gcd == N || gcd == M) {
      int cycle = gcd == N ? N : M;
      String target = N >= M ? S : T;
      String key = N >= M ? T : S;
      for (int i = 0; i < target.length(); i++) {
        if (target.charAt(i) != key.charAt(i%cycle)) {
          System.out.println(-1);
          return;
        }
      }
      System.out.println(target.length());
      return;
    }
    System.out.println((long)gcd*(N/gcd)*(M/gcd));
  }
  
  private static int calcGcd(int n, int m) {
    for (int i = 2; i <= n && i <= m; i++) {
      if (n%i == 0 && m%i == 0) {
        return i;
      }
    }
    return -1;
  }
}
