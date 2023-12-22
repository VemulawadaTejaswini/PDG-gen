import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var x = sc.next();
		sc.close();

		var count = 0;
		for (var i = 0; i < x.length(); i++) {
			var b = x.substring(i, i + 1).equals("1");
			if (b) {
				count++;
			}
		}

		var sum1 = 0;
		var sum2 = 0;
		if (count - 1 > 0) {
			for (var i = x.length() - 1; i >= 0; i--) {
				if (x.substring(i, i + 1).equals("1")) {
					sum1 = add(sum1, (int) pow(2, x.length() - 1 - i, count - 1), count - 1);
					sum2 = add(sum2, (int) pow(2, x.length() - 1 - i, count + 1), count + 1);
				}
			}
		}

		for (var i = 0; i < n; i++) {
			var result = 0;
			var b = x.substring(i, i + 1).equals("1");
			var count1 = b ? count + 1 : count - 1;
			if(count1 > 0) {
				var fc = f(x, b, count1, sum1, sum2, i);
				result++;
				while (fc > 0) {
					fc = f(fc);
					result++;
				}
			}
			System.out.println(result);
		}
	}

	private static int f(String x, boolean b, int count, int sum1, int sum2, int index) {
		var result = 0;
		if (x.substring(index, index + 1).equals("1")) {
			result = subtract(sum1, (int) pow(2, x.length() - 1 - index, count), count);
		} else {
			result = add(sum2, (int) pow(2, x.length() - 1 - index, count), count);
		}

		//System.out.printf("%d, %d, %d, %d\r\n", count, sum1, sum2, result);
		return result;
	}

	public static int add(int a, int b, int mod) {
		return (int) (((long) a + b) % mod);
	}

	public static int subtract(int a, int b, int mod) {
		return (int) (((long) a - b + mod) % mod);
	}

	public static int pow(int n, int k, int mod) {
		if (k == 0) {
			return 1;
		} else if (k % 2 == 0) {
			int p = pow(n, k / 2, mod);
			return multiply(p, p, mod);
		} else {
			int p = pow(n, (k - 1) / 2, mod);
			return multiply(multiply(p, p, mod), n, mod);
		}
	}

	public static int multiply(int a, int b, int mod) {
		return (int) (((long) a * b) % mod);
	}

	private static int f(int n) {
		var count = 0;
		var bits = getBits(n);
		for (var i = 0; i < bits.length; i++) {
			if (bits[i]) {
				count++;
			}
		}

		return n % count;
	}

	public static boolean[] getBits(int n) {
		var bits = new boolean[32];
		for (int i = 0; i < 32; i++) {
			bits[i] = getBit(n, i);
		}
		return bits;
	}

	public static boolean getBit(int n, int d) {
		return ((n % (int) Math.pow(2, d + 1)) / ((int) Math.pow(2, d))) != 0;
	}
}
