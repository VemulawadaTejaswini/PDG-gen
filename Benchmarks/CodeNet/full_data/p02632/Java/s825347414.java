import java.util.*;
public class Main {

	static int MOD = 1_000_000_007;
	static int MAX = 1_000_000;
	static long[] fac = new long[MAX+1];
	static long[] finv = new long[MAX+1];
	static long[] inv = new long[MAX+1];
	
	static void COMinit() {
		fac[0] = fac[1] = 1;
		finv[0] = finv[1] = 1;
		inv[1] = 1;
		for(int i = 2; i <= MAX; i++) {
			fac[i] = fac[i-1] * i % MOD;
			inv[i] = MOD - inv[MOD%i] * (MOD/i) % MOD;
			finv[i] = finv[i-1] * inv[i] % MOD;
		}
	}
	
	static long cmb(int n, int k){
		if(n < k || k < 0) return 0;
		return fac[n] * (finv[k] * finv[n-k] % MOD) % MOD;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		String S = sc.next();
		int N = S.length();
		COMinit();
		long ans = 0, p = 1;
		for(int i = 0; i <= K; i++) {
			ans = (ans + cmb(N+K, i) * p) % MOD;
			p = p * 25 % MOD;
		}
		System.out.println(ans);
	}

}