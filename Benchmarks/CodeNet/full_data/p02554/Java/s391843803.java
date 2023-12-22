import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		int m = 1000000007;
		long a = power(10, n, m);
		long b = power(9, n, m);
		long c = power(8, n, m);
		long ans = a - b - b + c + m + m;
		ans %= m;
		System.out.println(ans);
	}

	static long power(long x, long n, int m) {
		if (n == 0) {
			return 1;
		}
		long val = power(x, n / 2, m);
		val = val * val % m;
		if (n % 2 == 1) {
			val = val * x % m;
		}
		return val;
	}
}
