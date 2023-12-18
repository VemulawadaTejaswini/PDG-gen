import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt();
		int s = sc.nextInt();

		int ans = 0;

		for (int x = 0; x <= k; x++) {
			if (x > s)
				break;
			if (x == s) {
				ans++;
				break;
			}
			for (int y = 0; y <= k; y++) {
				if (y > s)
					break;
				if (x + y == s) {
					ans++;
					break;
				}
				for (int z = 0; z <= k; z++) {
					if (z > s)
						break;
					if (x + y + z == s) {
						ans++;
						break;
					}
				}
			}
		}
		System.out.println(ans);
		sc.close();
	}
}