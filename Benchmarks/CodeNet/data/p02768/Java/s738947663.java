import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	final static int MOD = 1000000007;
	public void run() {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();

		long ans = pow(2, n);
		ans = minus(ans, 1);
		ans = minus(ans, combi(n, a));
		ans = minus(ans, combi(n, b));
		System.out.println(ans);
		sc.close();
	}

	private long combi(long n, long k) {
		long x=1;
		long y=1;
		for(int i=0; i<k; i++) {
			x = mul(x, (n-i));
			y = mul(y, (i+1));
		}
		return div(x, y);
	}

	private long div(long a, long b) {
		return mul(a, inv(b));
	}

	private long inv(long n) {
		return pow(n, MOD-2);
	}

	private long pow(long n, long x) {
		long res = 1;
		if(x==0) return res;
		res = pow(n, x/2);
		if(x%2==0) {
			res = mul(res, res);
		}else {
			res = mul(mul(res, res), n);
		}
		return res;
	}

	private long minus(long a, long b) {
		if((a -= b) < 0) a += MOD;
		return a;
	}

	private long mul(long a, long b) {
		return (a * b) % MOD;
	}
}
