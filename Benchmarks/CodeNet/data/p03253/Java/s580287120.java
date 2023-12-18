
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	int MOD = 1000000007;

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();

		long ans = 1;
		for(int i=2; i*i<=m; i++) {
			if(m%i==0) {
				int cnt=0;
				while(m%i==0) {
					m /= i;
					cnt++;
				}
				ans *= combi(cnt + (n-1), n-1) ;
				ans = ans % MOD;
			}
		}
		if(m != 1) {
			ans *= combi(1+(n-1), n-1);
			ans = ans % MOD;
		}
		System.out.println(ans);

		sc.close();
	}

	private long modpow(long a, int p) {
		if(p==0)return 1;
		if(p%2==0) {
			long x = modpow(a, p/2) % MOD;
			return x * x %MOD;
		}else {
			return a * modpow(a, p-1) % MOD;
		}
	}

	private long combi(int n, int k) {
		long x = 1;
		long y = 1;
		for(int i=0; i<k; i++) {
			x *= (n-i);
			y *= (i+1);
			x %= MOD;
			y %= MOD;
		}
		return x * modpow(y, MOD-2) % MOD;
	}
}


