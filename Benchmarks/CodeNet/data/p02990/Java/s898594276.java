import java.util.*;
public class Main {

	public static int mod = 1_000_000_007;
	public static long[] fac = new long[2001];
	public static long[] finv = new long[2001];
	public static long[] inv = new long[2001];
	public static void COMinit() {
		fac[0] = 1;
		fac[1] = 1;
		finv[0] = 1;
		finv[1] = 1;
		inv[1] = 1;
		for(int i = 2; i < 2001; i++) {
			fac[i] = fac[i-1] * i % mod;
			inv[i] = mod - inv[mod%i] * (mod/i) % mod;
			finv[i] = finv[i-1] * inv[i] % mod;
		}
	}
	public static long combination(int n, int k){
		if(n < k) return 0;
		if(n < 0 || k < 0) return 0;
		return fac[n] * (finv[k] * finv[n-k] % mod) % mod;
	}
	
	public static void main(String[] args) {
		COMinit();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		for(int i = 1; i <= K; i++) {
			long ans = combination(N-K+1,i)*combination(K-1, i-1);
			ans %= mod;
			System.out.println(ans);	
		}

	}

}