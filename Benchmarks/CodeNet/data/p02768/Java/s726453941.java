import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int MOD = 1000000007;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		Calc calc = new Calc(MOD);
		int result = calc.subtract(calc.subtract(calc.subtract(calc.pow(2, n), 1), calc.combine(n, a)), calc.combine(n, b));
		System.out.println(String.format("%d", result));
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
