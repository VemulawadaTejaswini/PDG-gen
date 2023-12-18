import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		int k = sc.nextInt();
		int ans = 0;

		for (int x = 1; x <= n; x++) {
			for (int y = 1; y <= n; y++) {
				for (int z = 1; z <= n; z++) {
					if ((x + y) % k == 0 && (y + z) % k == 0 && (z + x) % k == 0) {
						ans++;
					}
				}
			}
		}

		System.out.println(ans);

		sc.close();
	}
}
