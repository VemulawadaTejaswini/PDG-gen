import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();

		long ans = 1;
		for (int i = 1; i <= n - 2; i++) {
			ans *= 10 % 1000000007;
			ans = ans % 1000000007;
		}

		ans = ans * (n * (n - 1) % 1000000007) % 1000000007;

		System.out.println(ans);

		sc.close();

	}
}
