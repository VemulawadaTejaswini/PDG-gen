import java.util.Scanner;

public class Main {
	static final long MOD = 1000000007L;
	
	Main() {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		
		init(M);
		
		//全事象
		long ans = permutation(M, N) * permutation(M, N) % MOD;
		
		//余事象
		long sub = 0;
		for (int k = 1; k <= N; k++) {
			long temp = combination(N, k) * permutation(M-k, N-k) % MOD;
			
			if ( (k & 1) == 1 ) {
				sub = (sub + temp) % MOD;
			} else {
				sub = (sub - temp) % MOD;
				if (sub < 0L)
					sub += MOD;
			}
		}
		sub = sub * permutation(M, N) % MOD;
		ans = (ans - sub) % MOD;
		if (ans < 0L)
			ans += MOD;
		
		System.out.println(ans);
	}
	
	public static void main(String[] args) {
		new Main();
	}
	
	long[] fac, finv, inv;
	
	void init(int max) {
		max += 1;
		fac  = new long[max];
		finv = new long[max];
		inv  = new long[max];
		
		fac[0] = fac[1] = 1;
		finv[0] = finv[1] = 1;
		inv[1] = 1;
		for (int i = 2; i < max; i++) {
			fac[i] = fac[i - 1] * i % MOD;
			inv[i] = MOD - inv[(int) (MOD % i)] * (MOD / i) % MOD;
			finv[i] = finv[i - 1] * inv[i] % MOD;
		}
	}
	
	long combination(int n, int k) {
		if (n < k) return 0;
		if (n < 0 || k < 0) return 0;
		return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;
	}
	
	long permutation(int n, int k){
		if (n < k) return 0;
		if (n < 0 || k < 0) return 0;
		return fac[n] * finv[n-k] % MOD;
	}
}
