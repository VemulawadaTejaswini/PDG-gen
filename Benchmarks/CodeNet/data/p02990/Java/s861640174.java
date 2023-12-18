import java.util.*;
public class Main {
  
  private static long X = 1000000007;
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    
    long[][] memo = new long[N+1][N+1];
    for (int i = 1; i <= K; i++) {
      if (N-K+1 >= i) {
        long count = (comb(N-K+1, i, memo) * comb(K-1, i-1, memo)) % X;
        System.out.println(count);
      } else {
        System.out.println(0);
      }
    }
  }
  
  private static long comb(int n, int r, long[][] memo) {

    if (r == n || r == 0) {
      return 1;
    }

    if (memo[n][r] != 0) {
      return memo[n][r];
    }

    memo[n][r] = (comb(n-1, r-1, memo) + comb(n-1, r, memo)) % X;
    
    return memo[n][r];
  }
}
