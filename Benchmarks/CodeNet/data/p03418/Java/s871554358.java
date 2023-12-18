import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		int k = sc.nextInt();
		sc.close();

		if (k == 0) {
			System.out.println(n * n);
		}
		long ans = 0;
		for (int i = k + 1; i <= n; i++) {
			int d = i - k;
			long a = n / i;
			long b = n % i;
			long c = Math.max(b - k + 1, 0);
			ans += d * a + c;
		}
		System.out.println(ans);
	}
}
