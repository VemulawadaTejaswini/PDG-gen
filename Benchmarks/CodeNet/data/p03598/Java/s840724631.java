import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int ans = 0;

		for (int i = 0; i < n; i++) {
			int x = scanner.nextInt();
			ans += Math.min(Math.abs(x - k), x) * 2;
		}

		System.out.println(ans);
	}
}
