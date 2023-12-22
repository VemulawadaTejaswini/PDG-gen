import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;

		for (int i = 1; i <= 1000000; i++) {
			int x = n - i;
			if (x <= 0) break;
			for (int j = 1; j <= Math.sqrt(x); j++) {
				if (x % j == 0) {
					if (x / j == j) {
						ans++;
					} else {
						ans += 2;
					}
				}
			}
		}

		System.out.println(ans);

		sc.close();

	}
}
