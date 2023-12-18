
import java.util.Scanner;


public class Main {
	
	public static final int mod = 1_000_000_007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		long n = sc.nextInt();
		long a = sc.nextInt();
		long b = sc.nextInt();
		long c = sc.nextInt();
		
		long aPct = div(a,a+b);
		long bPct = div(b,a+b);
		
		long comb = 1;
		long ans = 0;
		for (int i=0;i<n;i++) {
			ans += pow(aPct, n)*pow(bPct, i)%mod*comb%mod*(n+i)%mod;
			ans %= mod;
			ans += pow(bPct, n)*pow(aPct, i)%mod*comb%mod*(n+i)%mod;
			ans %= mod;
			comb = div(comb*(n+i)%mod, i+1);

		}
		long l = div(a+b,100);

		System.out.println (div(ans, l));
	}
	
	static long pow (long x, long y) {
		if (y==0) {
			return 1;
		} else if (y%2==0) {
			long a = pow(x,y/2);
			return a*a%mod;
		} else {
			long a = pow(x,y/2);
			return (a*a%mod)*x%mod;
		}
	}
	
	static long div (long x, long y) {
		return (x*pow(y, mod-2))%mod;
	}




}
