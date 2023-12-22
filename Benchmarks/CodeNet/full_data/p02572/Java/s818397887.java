import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long ans = 0;
		long sum = 0;
		long sqSum = 0;

		final long MOD = 1000000007;

		for (int i = 0; i < n; i++) {
			long a = sc.nextLong();
			sum = (sum + a) % MOD;
			sqSum = (sqSum + (a * a) % MOD) % MOD;
		}

		ans = ((sum * sum) % MOD - sqSum) % MOD;

		if (ans < 0) {
			ans = ans + MOD;
		}

		ans = ans * (MOD + 1) / 2;
		ans = ans % MOD;

		System.out.println(ans / 2);

		sc.close();

	}

}