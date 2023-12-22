import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int ans;

		while (sc.hasNext()) {
			n = sc.nextInt();
			ans = 0;
			for (int i = 0; i <= 1000; i++) {
				for (int j = 0; j <= 1000; j++) {
					if (0 <= n - i - j && n - i - j <= 2000) {
						ans += Math.min(n - i - j + 1, 2000 - (n - i - j) + 1);
					}
				}
			}
			System.out.println(ans);
		}
	}
}