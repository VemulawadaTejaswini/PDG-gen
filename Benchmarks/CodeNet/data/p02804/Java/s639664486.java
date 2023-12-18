import java.util.*;
public class Main {
		
	public static int MOD = 1_000_000_007;
	public static int MAX = 100001;
	public static long[] fac = new long[MAX];
	public static long[] finv = new long[MAX];
	public static long[] inv = new long[MAX];
	
	public static void COMinit() {
		fac[0] = fac[1] = 1;
		finv[0] = finv[1] = 1;
		inv[1] = 1;
		for(int i = 2; i < MAX; i++) {
			fac[i] = fac[i-1] * i % MOD;
			inv[i] = MOD - inv[MOD%i] * (MOD/i) % MOD;
			finv[i] = finv[i-1] * inv[i] % MOD;
		}
	}
	
	public static long combination(int n, int k){
		if(n < k || n < 0 || k < 0) return 0;
		return fac[n] * (finv[k] * finv[n-k] % MOD) % MOD;
	}
	
	public static void main(String[] args) {
		COMinit();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long[] A = new long[N];
		Arrays.setAll(A, i -> sc.nextLong());
		Arrays.sort(A);
		long ans = 0;
		for(int i = 0; i <= N-K; i++) {
			ans += A[N-1-i]*combination(N-1-i, K-1);
			ans -= A[i]*combination(N-1-i, K-1);
			ans %= MOD;
		}
		System.out.println(ans);


	}

}