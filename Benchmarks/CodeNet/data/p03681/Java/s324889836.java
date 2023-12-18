import java.util.*;

public class Main {
  
  private static final int MOD = 1_000_000_007;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    if (Math.abs(N-M) > 1) {
      System.out.println(0);
      return;
    }
    int min = Math.min(N, M);
    long a = perm(min);
    long ans;
    if (M == N) {
      ans = (2*a*a) % MOD;
    } else {
      ans = (Math.max(N,M)*a*a) % MOD;
    }
    System.out.println(ans);
  }
  
  private static long perm(int n) {
    if (n == 1) {
      return 1;
    }
    return (n*perm(n-1)) % MOD;
  }
}