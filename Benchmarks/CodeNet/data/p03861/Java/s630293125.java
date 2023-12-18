import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		long a = scanner.nextLong();
		long b = scanner.nextLong();
		long x = scanner.nextLong();
		long ans = 0;

		if (b - a == 0) {
			ans = 0;
		} else {
			ans = (b / x) - ((a - 1) / x);
			if (a == 0) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}