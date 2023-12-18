import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		int ans = 0;

		if (c < a && d < a) {
			ans = 0;
		}
		if (c <= a && d >= a && d <= b) {
			ans = d - a;
		}

		if (c >= a && d <= b) {
			ans = d - c;
		}
		if (c >= a && d >= b && c <= b) {
			ans = b - c;
		}

		if (b < c) {
			ans = 0;
		}
		if (c <= a && b <= d) {
			ans = b - a;
		}

		System.out.println(ans);
	}
}
