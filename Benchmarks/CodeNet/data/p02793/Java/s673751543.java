import java.util.Scanner;

public class Main {

	public static final int MOD = 1000000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] array = new int[n];

		int max = 1;
		long lcm = 1;

		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
			lcm = lcm(lcm, array[i]);
			max = Math.max(max, array[i]);
		}

		// 逆元
		long[] inverse = new long[max + 1];
		inverse[1] = 1;
		for (int i = 2; i <= max; i++) {
			inverse[i] = MOD - inverse[MOD % i] * (MOD / i) % MOD;
		}

		long ans = 0;
		for (int i = 0; i < n; i++) {
			long b = (lcm * inverse[array[i]]) % MOD;
			ans = (ans + b) % MOD;
		}
		print(ans);
		sc.close();
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

	public static long lcm(long num1, long num2) {
		return (num1 * num2 / gcd(num1, num2)) % MOD;
	}

	public static long gcd(long num1, long num2) {
		if (num2 == 0)
			return num1;
		else
			return gcd(num2, num1 % num2);
	}

}