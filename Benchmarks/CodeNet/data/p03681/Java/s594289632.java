
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	long fact[];
	long ifact[];
	int NMAX = 1000000;
	long MOD = 1000000007;
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		fact = new long[NMAX+1];
		ifact = new long[NMAX+1];

		if(Math.abs(n-m)>1) {
			sc.close();
			System.out.println(0);
			return;
		}

		init();

		long ans = 0;
		if(n==m) {
			ans = fact[n] * fact[m];
			ans %= MOD;
			ans *= 2;
			ans %= MOD;
		}else {
			ans = fact[n] * fact[m];
			ans %= MOD;
		}
		System.out.println(ans);
		sc.close();
	}

	private void init() {
		fact[0]=1;
		fact[1]=1;
		for(int i=2; i<=NMAX; i++) {
			fact[i] = fact[i-1] * i;
			fact[i] %= MOD;
		}
		ifact[NMAX] = inv(fact[NMAX]);
		for(int i=NMAX-1; i>=0; i--) {
			ifact[i] = ifact[i+1] * i;
			ifact[i] %= MOD;
		}
	}


	private long pow(long n, long k) {
		if(k==0) return 1;
		if(k%2==0) {
			long tmp = pow(n, k/2);
			long ans = tmp * tmp;
			ans %= MOD;
			return ans;
		}else {
			long tmp = pow(n, k-1);
			long ans = tmp * n;
			ans %= MOD;
			return ans;
		}
	}

	private long inv(long x) {
		return pow(x, MOD-2);
	}



}
