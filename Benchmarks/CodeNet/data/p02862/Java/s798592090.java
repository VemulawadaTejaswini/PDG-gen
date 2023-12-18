import java.util.Scanner;

public class Main {
	private static final int MOD = 1000000007;

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var x = sc.nextInt();
		var y = sc.nextInt();
		sc.close();

		var a = (x + y) / 3;
		var b = Math.min(x, y) - a;
		if ((x + y) % 3 == 0 && b >= 0) {
			var modCalc = new Main().new ModCalc(MOD);
			var result = modCalc.combine(a, b);
			System.out.println(result);
		} else {
			System.out.println(0);
		}
	}

	public class ModCalc {
		int mod;

		public ModCalc(int mod) {
			this.mod = mod;
		}

		public int add(int a, int b) {
			return (int) (((long) a + b) % mod);
		}

		public int subtract(int a, int b) {
			return (int) (((long) a - b + mod) % mod);
		}

		public int multiply(int a, int b) {
			return (int) (((long) a * b) % mod);
		}

		public int divide(int a, int b) {
			return multiply(a, pow(b, mod - 2));
		}

		public int pow(int n, int k) {
			if (k == 0) {
				return 1;
			} else if (k % 2 == 0) {
				int p = pow(n, k / 2);
				return multiply(p, p);
			} else {
				int p = pow(n, (k - 1) / 2);
				return multiply(multiply(p, p), n);
			}
		}

		public int combine(int n, int k) {
			int sum1 = 1;
			int sum2 = 1;
			for (int i = 0; i < k; i++) {
				sum1 = multiply(sum1, n - i);
				sum2 = multiply(sum2, i + 1);
			}
			return divide(sum1, sum2);
		}
	}
}
