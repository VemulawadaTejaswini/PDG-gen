import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    long K = sc.nextLong();
    solve(N, A, B, K);
  }

  private static void solve(int N, int A, int B, long K) {
    
    long q[] = new long[N+1];
    long invq[] = new long[N+1];
    long MAGIC = 998244353;
    q[0] = 1;
    invq[0] = 1;
    for (int i=1; i<=N; i++) {
      q[i] = q[i-1] * i % MAGIC;
      invq[i] = inv(q[i], MAGIC);
      if (invq[i] == 0) {
        throw new RuntimeException("zero inv: " + q[i]);
      }
    }
    
    long ans = 0;
    
    for (int numA=0; numA<=N; numA++) {
      long remain = K - (A*numA);
      if (remain % B == 0) {
        int numB = (int) (remain / B);
        if (0 <= numB && numB <= N) {
          long tmp = (q[N]*q[N])%MAGIC;
          tmp = (tmp*invq[numA])%MAGIC;
          tmp = (tmp*invq[N-numA])%MAGIC;
          tmp = (tmp*invq[numB])%MAGIC;
          tmp = (tmp*invq[N-numB])%MAGIC;
          ans = (ans + tmp)%MAGIC;
        }
      }
    }
    System.out.println(ans % MAGIC);
  }
  
  private static long inv(long a, long MOD) {
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
