import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int mod = (int) Math.pow(10, 9) + 7;

		long ans = 1;

		if (Math.abs(m-n) > 1) {
			System.out.println(0);
			return;
			}
		else {
			for (int i = 1; i <= n; i++) {
				ans = ans * i % mod;
			}
			for (int j = 1; j <= m; j++) {
				ans = ans * j % mod;
			}
		}

		System.out.println(m==n ? 2 * ans % mod: ans % mod);
	}}