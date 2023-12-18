import java.util.*;

public class Main {
  private static final int MOD = 1_000_000_007;
  private static int[] fact;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }
    Arrays.sort(A);
    
    if (K == 1) {
      System.out.println(0);
      return;
    }
    
    long[] sum = new long[N+1];
    for (int i = 1; i <= N; i++) {
      sum[i] = sum[i-1]+A[i-1];
    }
    
    fact = new int[N+1];
    fact[0] = 1;
    for (int i = 1; i <= N; i++) {
      fact[i] = i*fact[i-1]%MOD;
    }
    
    long ans = 0;
    for (int n = K; n <= N; n++) {
      long tmp = sum[N]-sum[n-1]- sum[N-n+1];
      tmp %= MOD;
      
      tmp *= combMod(n-2,K-2);
      tmp %= MOD;
      
      ans += tmp;
      ans %= MOD;
    }
    
    System.out.println(ans);
  }
  
  private static long combMod(int n, int k) {
    return (long)fact[n]*pow((long)fact[k]*fact[n-k]%MOD,MOD-2)%MOD;
  }
  
  private static long pow(long a, int n) {
    if (n == 0) {
      return 1;
    }
    if (n%2 == 1) {
      return a*pow(a,n-1)%MOD;
    }
    long half = pow(a,n/2)%MOD;
    return half*half%MOD;
  }
}