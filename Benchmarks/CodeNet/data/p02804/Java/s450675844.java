
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static long []fac ;
	static long []finv;
	static int n;
	
	static int mod = 1000000007;
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		 n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		
		int []a = new int [n];
		fac = new long[n+1];
		finv = new long[n+1];
		
		COMinit();
		long []up = new long [n+1];
		long []low = new long [n+1];
		
		for(int i = 0 ; i < n ;i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		Arrays.sort(a);
		
		long ans = 0;
		
		for(int i = 0 ; i < n ;i++) {
			ans = (ans + (a[i] * (COM(i,k-1)-COM(n-i-1,k-1))%mod)%mod)%mod;
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
	public static long COM(int n,int k){
	    if (n < k) return 0;
	    if (n < 0 || k < 0) return 0;
	    return fac[n] * (finv[k] * finv[n - k] % mod) % mod;
	}
 
	//a^n mod
	public static  long Modpow(long a, long n) {
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
