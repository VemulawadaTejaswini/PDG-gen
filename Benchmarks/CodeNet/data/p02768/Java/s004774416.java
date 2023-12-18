import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	long fact[];
	long ifact[];
	final static int MOD = 1000000007;
	int MAX = 2 * 100000;
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		fact = new long[MAX+1];
		ifact = new long[MAX+1];

		fact[0]=1;
		for(int i=1; i<=MAX; i++) {
			fact[i]=(fact[i-1] * i) % MOD;
		}
		ifact[MAX] = inv(fact[MAX]);
		for(int i=MAX; i>=1; i--) {
			ifact[i-1] = (ifact[i] * i) % MOD;
		}

		long nfact = 1;
		for(int i=1; i<=n; i++) {
			nfact = (nfact * i) % MOD;
		}

		long ans = 0;
		for(int i=1; i<= n; i++) {
			if(i != a && i != b) {
				ans = ans + combi(n, i) % MOD;
			}
		}
		System.out.println(ans);
		sc.close();
	}

	private long combi(int n, int k) {
		return (((fact[n]*ifact[n-k]) % MOD) *ifact[k]) % MOD;
	}

	private long inv(long a) {
		return pow(a, MOD-2);
	}

	private long pow(long a, long b) {
		long res = 1;
		if(b>0) {
			res = pow(a, b/2);
			if(b%2==0) {
				res = (res * res) % MOD;
			}else {
				res = (((res * res) % MOD) * a) % MOD;
			}
		}
		return res;
	}
}
