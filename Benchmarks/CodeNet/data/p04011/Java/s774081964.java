import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		solve();
	}

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();

		System.out.println(n < k ? x * n : x * k + y * (n - k));
	}

}