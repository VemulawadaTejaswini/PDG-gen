import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int x = scanner.nextInt();
		int dis[] = new int[n];
		int ans = 0;

		int min = 2000000000;
		for (int i = 0; i < n; i++) {
			int tar = Math.abs(scanner.nextInt() - x);
			min = Math.min(min, tar);
			dis[i] = tar;
		}

		boolean judge = true;
		for (int j = 1; j<=min; j++) {
			int tar = min / j;
			if (tar == 1) {
				System.out.println(1);
				return;
			}
			for (int i = 0; i < n; i++) {
				if (dis[i] % tar != 0) {
					judge = false;
					break;
				} else {
					judge = true;
					ans = tar;
				}
			}
			if (judge) {
				System.out.println(ans);
				return;
			}
		}

	}
}
