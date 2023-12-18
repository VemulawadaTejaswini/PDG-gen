import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		sc.close();
		long ans = n - 1;
		for (long i = 1; i <= n; i++) {
			if (n % i == 0) {
				ans = Math.min(ans, i + (n / i) - 2);
			}
		}
		System.out.println(ans);

	}
}
