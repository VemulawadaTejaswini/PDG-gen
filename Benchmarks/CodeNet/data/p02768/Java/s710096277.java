
import java.util.Scanner;
public class Main {
	static long []fac;
	static long []finv;
	static long []inv;
	
	static int mod = 1000000007;
	static int n,a,b;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = Integer.parseInt(sc.next());
		
		a = Integer.parseInt(sc.next());
		b = Integer.parseInt(sc.next());
		
		fac = new long [501001];
		finv = new long[501001];
		inv = new long [501001];
		
		COMinit();
		
		
		long ans = Modpow(2L,n) -1;
		
		long aa = 1L;
		long bb = 1L;
		
		for(int i = n ; i >= n - a + 1 ; i--) {
			aa *= i;
			aa %= mod;
		}
		
		for(int i = n ; i >= n - b +1 ; i--) {
			bb *= i;
			bb %= mod;
		}
		
		aa = aa * finv[a] % mod;
		bb = bb * finv[b] % mod;
		
		ans = ans - aa - bb;
		
		ans += 2 * mod;
		
		ans = ans % mod;
		
		System.out.println(ans);

	}
	public static void COMinit() {
	    fac[0] = fac[1] = 1;
	    finv[0] = finv[1] = 1;
	    inv[1] = 1;
	    for (int i = 2; i <= 500001; i++){
	        fac[i] = fac[i - 1] * i % mod;
	        inv[i] = mod - inv[mod%i] * (mod / i) % mod;
	        finv[i] = finv[i - 1] * inv[i] % mod;
	    }
	}

	// 二項係数計算
	public static long COM(int k){
	    if (n < k) return 0;
	    if (n < 0 || k < 0) return 0;
	    return fac[n] * (finv[k] * finv[n - k] % mod) % mod;
	}

	//a^n mod
	public static long Modpow(long a, long n) {
		long res = 1;
		while(n > 0) {
			if((n & 1) == 1) {
				res = res * a % mod;
			}
			a = a * a % mod;
			n >>= 1;
		}
		return res;
	}
	



}
