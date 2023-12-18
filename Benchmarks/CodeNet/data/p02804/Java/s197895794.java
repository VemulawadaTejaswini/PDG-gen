import java.util.*;

public class Main {
  private static final int MOD = 1_000_000_007;
  private static int[] fact;
  private static int[] ifact;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }
    Arrays.sort(A);
    
    fact = new int[N+1];
    fact[0] = 1;
    for (int i = 1; i <= N; i++) {
      fact[i] = (int)((long)i*fact[i-1]%MOD);
    }
    ifact = new int[N+1];
    for (int i = 0; i <= N; i++) {
      ifact[i] = powMod(fact[i], MOD-2);
    }
    
    long ans = 0;
    for (int a = 0; a < 2; a++) {
      for (int i = 0; i < N; i++) {
        long now = a == 0 ? A[i] : -A[i];
        ans += now*combMod(i, K-1)%MOD;
        ans %= MOD;
      }
      int[] B = new int[N];
      for (int i = 0; i < N; i++) {
        B[N-1-i] = A[i];
      }
      A = B;
    }
    
    System.out.println(ans);
  }
  
  private static int combMod(int n, int k) {
    if (k < 0 || n < k) return 0;
    return (int)(((long)fact[n]*ifact[k]%MOD)*ifact[n-k]%MOD);
  }
  
  private static int powMod(int a, int n) {
    if (n == 0) {
      return 1;
    }
    if (n%2 == 1) {
      return (int)((long)a*powMod(a,n-1)%MOD);
    }
    long half = powMod(a,n/2);
    return (int)(half*half%MOD);
  }
}