import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var MOD = 998244353;
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var m = sc.nextInt();
		var k = sc.nextInt();
		sc.close();

		var calc = new Calc(MOD);
		var sum = calc.pow(m, n);
		for (var i = n - 1; i > k; i--) {
			var result = calc.multiply(calc.multiply(m, calc.pow(m - 1, n - 1 - i)), calc.combine(n - 1, n - 1 - i));
			sum = calc.subtract(sum, result);
		}
		System.out.println(sum);
	}

	public static class Calc {
		int mod;

		public Calc(int mod) {
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