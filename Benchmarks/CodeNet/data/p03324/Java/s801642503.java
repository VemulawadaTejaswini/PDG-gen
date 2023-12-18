import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int d = sc.nextInt();
		int n = sc.nextInt();
		int ans = 0;

		if (d == 0) {
			ans = n;
		} else {
			if (d == 1) {
				d = 100;
			} else {
				d = 10000;
			}
			for (int i = 0; i < n; i++) {
				ans += d;
			}
		}

		System.out.println(ans);

		sc.close();
	}
}
