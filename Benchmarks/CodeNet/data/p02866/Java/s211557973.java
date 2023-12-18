import java.util.Scanner;

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int N = sc.nextInt();
		int[] D = new int[N];
		for (int i = 0; i < N; i++) {
			D[sc.nextInt()]++;
		}

		int mod = 998244353;

		if (D[0] != 1){
			System.out.println(0);
			return;
		}
		long mul = 1;
		int i = 1;
		for (; i < D.length; i++) {
			int n = D[i];
			if (n <= 0) break;
			mul = (mul * pow(D[i - 1], n, mod)) % mod;
		}
		for (; i < D.length; i++) {
			if (D[i] > 0) {
				System.out.println(0);
				return;
			}
		}
		System.out.println(mul);
	}

	long pow(long a, long n, long mod){
		long res = 1;
		while (n > 0) {
			if (n % 2 == 1) res = (res * a) % mod;
			a = a * a % mod;
			n >>= 1;
		}
		return res;
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}