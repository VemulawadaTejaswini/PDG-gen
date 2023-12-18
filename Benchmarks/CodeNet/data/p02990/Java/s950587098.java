
import java.util.Scanner;
public class Main {

	static long fac[];
	static long finv[];
	static int mod = 1000000007;

	public static void main(String[] args) {
      
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		
		fac = new long [n+1];
		finv = new long [n+1];
		
		Cominit(n);
		
		int B = k;
		int R = n-k;

		
		for(int i = 1 ;  i <= k ; i++) {
			long ans = COM(R+1,i);
			ans = ans * COM(B-1,i-1) % mod;
			System.out.println(ans);
		}
		
		
		
	}
	
	
	static void Cominit(int n) {
	    fac[0] = fac[1] = 1;
	    finv[0] = finv[1] = 1;;
	    for (int i = 2; i <= n; i++){
	       fac[i] = fac[i-1] * i % mod;
	       finv[i] = finv[i-1] * Modinv(i) % mod;
	    }
	}

	// 二項係数計算
	static long COM(int n, int k){
	    if (n < k) return 0;
	    if (n < 0 || k < 0) return 0;
	    return fac[n] * (finv[k] * finv[n - k] % mod) % mod;
	}
	
	//a^n mod
	static long Modpow(long a, long n) {
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
		
		//a^-1
	static long Modinv (long a) {
			return Modpow(a,mod-2);
		}


}
