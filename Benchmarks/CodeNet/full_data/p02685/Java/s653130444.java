
import java.util.Scanner;

public class Main {

	static long []fac ;
	static long []finv;
	static int n;
	
	static int mod = 998244353;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		
		fac = new long [n+1];
		finv = new long [n+1];
		
		COMinit();
		
		long ans = (Modpow(m-1,n-1)*m)%mod;
		
		for(int i = 1 ; i <= k ;i++) {
			long temp = (((m*Modpow(m-1,n-1-i))%mod)*COM(n-1,i))%mod;
			ans = (ans +temp)%mod;
		}
		System.out.println(ans);
	}
	
	public static void COMinit() {
	    fac[0] = fac[1] = 1;
	    finv[0] = finv[1] = 1;
	    for (int i = 2; i <= n; i++){
	        fac[i] = fac[i - 1] * i % mod;
	        finv[i] = finv[i - 1] * Modpow(i,mod-2) % mod;
	    }
	}
 
	// 二項係数計算
	public static  long COM(int n,int k){
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


