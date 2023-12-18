import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	int MOD = 998244353;

	int n, a, b;
	long k;

	void run() {

		n = sc.nextInt();
		a = sc.nextInt();
		b = sc.nextInt();
		k = sc.nextLong();
		Arrays.fill(m, -1);
		m[0] = 1;
		p2(312345);
		long res = 0;
		for (long r = 0; r <= n; r++) {
			long bb = k - r * a;
			if (bb >= 0 && bb % b == 0 && bb / b < n ) {
//				System.out.println(" "+r+" "+bb/b);
				res += pat((int)r, (int) (bb / b)) % MOD;
				res = res % MOD;
			}
		}

		System.out.println(res);

	}

	int[] m = new int[312345];

	void p2(int x) {

		for (int i = 1; i < x; i++) {
			m[i] = (int)((long)m[i - 1] * i % MOD);
		}

	}

	long div(long a, long b){
	    return (((a%MOD) * ( pow(b, MOD-2)))%MOD);
	}
	
	long pow(long x, long y) {
		if (y == 0) {
			return 1;
		}
		if (y == 1) {
			return x % MOD;
		}
		if (y % 2 == 0) {
			long p2 = pow(x, y / 2)  % MOD;
			return (p2*p2 %MOD);
		}
		long p2 = pow(x, y / 2)  % MOD;
		return ((((p2*p2)%MOD) * x) % MOD);
	}

	long comb(int n,int r){
		return div(div(m[n],m[r]),m[n-r])%MOD;
	}
	
	long pat(int rr, int bb) {
		return comb(n,rr)*comb(n,bb);
	}

}
