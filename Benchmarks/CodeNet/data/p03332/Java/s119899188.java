import java.util.Scanner;

public class Main {

  private static final long MOD = 998244353;
  private static long FACT[];
  private static long IFACT[];

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    long K = sc.nextLong();
    solve(N, A, B, K);
  }

  private static void solve(int N, int A, int B, long K) {
    
    FACT = new long[N+1];
    IFACT = new long[N+1];
    FACT[0] = 1;
    IFACT[0] = 1;
    for (int i=1; i<=N; i++) {
      FACT[i] = FACT[i-1] * i % MOD;
      IFACT[i] = inv(FACT[i]);
    }
    
    long ans = 0;
    
    for (int numA=0; numA<=N; numA++) {
      long numB = (K - (A*numA))/B;
      if (numB >= 0 && numB <= N && ((long)A*numA + B*numB) == K) {
        ans = (ans + comb(N, numA) * comb(N, (int)numB))%MOD;
      }
    }
    System.out.println(ans);
  }
  
  private static long comb(int n, int r) {
    if (n < 0 || r < 0 || n < r) {
      return 0;
    }
    if (r > n/2) {
      r = n - r;
    }
    return FACT[n]*IFACT[n-r]%MOD*IFACT[r]%MOD;
  }

  private static long inv(long a) {
    long x0 = 1, x1 = 0;
    long y0 = 0, y1 = 1;
    long b = MOD;
    while (b != 0) {
      long q = a / b;
      long r = a % b;
      long x2 = x0 - q * x1;
      long y2 = y0 - q * y1;
      a = b;
      b = r;
      x0 = x1;
      x1 = x2;
      y0 = y1;
      y1 = y2;
    }
    return (MOD+x0%MOD)%MOD;
  }
}
