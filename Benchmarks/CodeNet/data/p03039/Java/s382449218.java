
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	long  MOD = 1000000007L;

	public void run() {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int K=sc.nextInt();

		long NM= (N*M)%MOD;
		long ans = f(NM, N, M, K);
		ans += f(NM, M, N, K);
		ans %= MOD;
		long cnt = choose(NM-2, K-2);
		ans *= cnt;
		ans %= MOD;

		System.out.println(ans);
		sc.close();
	}

	public long f(long nm, int n, int m, int k) {
		long ans = 0;
		for(long i=1; i<n; i++) {
			long tmp = i * (n-i) % MOD;
			tmp %= MOD;
			ans += tmp;
			ans %= MOD;
			//System.out.println(ans);
		}
		ans = ans*m*m;
		ans %= MOD;
		return ans;
	}

	public long choose(long n, int k) {
		return fact(n) * inv(fact(n-k)) % MOD * inv(fact(k)) % MOD;
	}

	public long fact(long x) {
		long ans = 1;
		for(long i=x; i>0; i--) {
			ans *= i;
			ans %= MOD;
		}
		return ans;
	}

	public long pow(long n, long x) {
		if(x==0) return 1;
		long tmp = pow(n, x/2);
		long ans = 0;
		if(x%2==0) {
			ans = tmp * tmp % MOD;
		}else {
			ans = tmp * tmp % MOD * n % MOD;
		}
		return ans;
	}

	public long inv(long x) {
		return pow(x, MOD-2);
	}
}
