
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	final int mod = 1000000007;
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		combi(4, 3);
		for(int i=1; i<=k; i++) {
			//n-k+1 C i * k-1 C i-1
			long ans = combi(n-k+1, i) * combi(k-1, i-1);
			ans %= mod;
			System.out.println(ans);
		}

		sc.close();
	}

	private long fact(long x) {
		long ans = 1;
		for(int i=1; i<=x; i++) {
			ans *= i;
			ans %= mod;
		}
		return ans;
	}

	private long pow(long x, long n) {
		if(n==0) return 1;
		if(n%2==0) {
			long tmp = pow(x, n/2);
			return tmp * tmp % mod;
		}else {
			long tmp = pow(x, n-1);
			return tmp * x % mod;
		}
	}

	private long inv(long x) {
		return pow(x, mod-2);
	}

	private long combi(long n, long k) {
		if(n<k) return 0;
		if(k==0) return 1;
		long ans = 0;
		ans = ((fact(n) * inv(fact(n-k)) % mod) * inv(fact(k))) % mod;
		return ans;
	}
}
