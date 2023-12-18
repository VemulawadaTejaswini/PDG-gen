import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		long k = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();

		long ans = 1;

		if(b - a > 2 && k >= a - 1) {
			k -= a - 1;
			ans += a - 1;

			ans += (k / 2) * (b - a);
			ans += k % 2;
		} else {
			ans += k;
		}

		System.out.println(ans);
	}
}