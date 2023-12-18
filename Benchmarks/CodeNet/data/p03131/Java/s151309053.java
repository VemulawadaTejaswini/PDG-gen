
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long k = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long ans = 1;

		if (b - a <= 2) {
			ans = k + 1;
		} else {
			if (k <= a) {
				ans = k + 1;
			} else {
				long n = k - (a - 1);
				if (n % 2 == 0) {
					ans = (b - a) * (n / 2) + a;
				} else {
					ans = (b - a) * (n / 2) + a + 1;
				}
			}
		}

		System.out.println(ans);
	}

}
