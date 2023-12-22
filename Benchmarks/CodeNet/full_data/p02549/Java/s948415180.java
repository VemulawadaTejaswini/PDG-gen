import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var k = sc.nextInt();
		var l = new int[k];
		var r = new int[k];
		for (var i = 0; i < k; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}
		sc.close();

		var calc = new Main().new ModCalc();
		var count = new int[n + 1];
		var sum = new int[n + 1];
		count[1] = 1;
		sum[1] = 1;
		for (var i = 2; i <= n; i++) {
			for (var j = 0; j < k; j++) {
				var min = l[j];
				var max = r[j];
				if (i - min > 0) {
					count[i] = calc.add(count[i], sum[i - min]);
				}
				if (i - max - 1 > 0) {
					count[i] = calc.subtract(count[i], sum[i - max - 1]);
				}
			}
			sum[i] = calc.add(sum[i - 1], count[i]);
		}
		System.out.println(count[n]);
	}

	public class ModCalc {
		private int mod = 998244353;

		public ModCalc() {
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
