import java.util.*;

public class Main {

	static long mod = 1_000_000_007;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextInt();
		long a = scan.nextInt();
		long b = scan.nextInt();
		long nt = pow(2, n);
		nt -= nck(n,a);
		nt %= mod;
		if(nt < 0) nt += mod;
		nt -= nck(n, b);
		nt %= mod;
		if(nt < 0) nt += mod;
		nt--;
		nt %= mod;
		if(nt < 0) nt += mod;
		System.out.println(nt);
	}
	
	static long nck(long n, long k) {
		// small k
		long kfac = 1;
		for(int i = 1; i <= k; i++){
			kfac *= i;
			kfac %= mod;
		}
		long num = 1;
		for(long i = n; i > n-k; i--) {
			num *= i;
			num %= mod;
		}
//		System.out.println(num+" "+kfac);
		long minv = pow(kfac, mod-2);
//		System.out.println(num*minv%mod);
		return (num*minv)%mod;
	}
	
	static long pow(long x, long b) {
		if(b == 0) return 1;
		if(b % 2 == 1) {
			long r = pow(x, b-1);
			return (r*x)%mod;
		}
		long r = pow(x, b/2);
		return (r*r)%mod;
	}

}
