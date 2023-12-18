import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		solve(s);
		s.close();
	}

	public static void solve(Scanner s) {
		int n = s.nextInt();

		long ans = 0;

		for (int i = 0; i < n; i++) {
			ans += i + 1;
		}

		System.out.println(ans);
	}
}
