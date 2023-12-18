import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int ans = 0;
		if (a + b > c * 2) {

			if (x < y) {
				ans += x * 2 * c;
				if (b >= c * 2) {
					ans += (y - x) * 2 * c;
				} else {

					ans += (y - x) * b;
				}
			} else {
				ans += y * 2 * c;
				if (a >= c * 2) {
					ans += (x - y) * 2 * c;
				} else {
					ans += (x - y) * a;

				}
			}
		} else {
			ans += a * x + b * y;
		}
		System.out.println(ans);
	}
}