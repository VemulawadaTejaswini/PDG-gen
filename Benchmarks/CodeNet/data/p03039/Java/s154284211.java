
import java.util.Scanner;

public class Main {

	public static final long MOD = 1_000_000_007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long m = sc.nextInt();
		long k = sc.nextInt();
		long ans1 = 0;
		long ans2 = 0;
		for (long i=1;i<m;i++) {
			ans1 += (i*(m-i)%MOD);
			ans1 %= MOD;
		}
		ans1 = ans1*n%MOD*n%MOD;
		for (long i=1;i<n;i++) {
			ans2 += (i*(n-i)%MOD);
			ans2 %= MOD;
		}
		ans2 = ans2*m%MOD*m%MOD;
		
		long ans = ans1+ans2;
		for (int i=1;i<=k-2;i++) {
			ans = ans*(n*m-1-i)%MOD;
			ans = div(ans, i);
		}
		System.out.println(ans);
		
	}
	
	static long power (long x, long y) {
		if (y==0) {
			return 1;
		} else if (y==1) {
			return x;
		} else if (y%2==0) {
			long tmp = power(x,y/2);
			return (tmp*tmp)%MOD;
		} else {
			long tmp = power(x,y/2);
			return (((tmp*tmp)%MOD)*x)%MOD;
		}
	}
	
	static long div (long x, long y) {
		return (x*power(y, MOD-2))%MOD;
	}
}


