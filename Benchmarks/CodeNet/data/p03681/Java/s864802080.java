import java.util.Scanner;

public class Main {

	static final int MOD = 1000000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());

		int n = Math.max(a, b);
		int m = Math.min(a, b);
		long ans = 1;

		if (Math.abs(n - m) <= 1) {
			ans = power(n, ans);
			ans = power(m, ans);
		} else {
			ans = 0;
		}

		if (a == b) {
			ans *= 2;
			ans %= MOD;
		}

		System.out.println(ans);
		sc.close();
	}

	public static long power(int x, long ans) {
		long res = ans;
		for (int i = 1; i <= x; i++) {
			res *= i;
			res %= MOD;
		}
		return res;
	}
}