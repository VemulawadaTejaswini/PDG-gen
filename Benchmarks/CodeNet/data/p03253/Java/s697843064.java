
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
					cnt++;
					m /= i;
				}
				ans *= combi(cnt+(n-1), (n-1));
				ans %= MOD;
			}
		}
		if(m > 1) {
			ans *= combi(1+(n-1),(n-1));
			ans %= MOD;
		}
		System.out.println(ans);
		sc.close();
	}

	private long combi(int n, int k) {
		long res = fact(n);
		res *= inv(fact(k));
		res %= MOD;
		res *= inv(fact(n-k));
		res %= MOD;
		return res;
	}

	private long inv(long x) {
		return modpow(x, MOD-2);
	}

	private long fact(long n) {
		long res = 1;
		for(int i=1; i<=n; i++) {
			res *= i;
			res %= MOD;
		}
		return res;
	}

	private long modpow(long a, int p) {
		if(p==0) return 1;
		if(p%2==0) {
			long h = modpow(a, p/2);
			return h*h%MOD;
		}else {
			long h = modpow(a, p-1);
			h *= a;
			h %= MOD;
			return h;
		}
	}
}


