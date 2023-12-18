import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long[] monsters = new long[n + 1];
		long[] heroes = new long[n];
		long count = 0;

		for (int i = 0; i < n + 1; i++) {
			monsters[i] = scan.nextInt();
		}
		for (int i = 0; i < n; i++) {
			heroes[i] = scan.nextInt();
		}
		scan.close();
		for (int i = 0; i < n; i++) {
			if (monsters[i] + monsters[i + 1] <= heroes[i]) {
				count += monsters[i] + monsters[i + 1];
				monsters[i + 1] = 0;
			} else {
				if (monsters[i] <= heroes[i]) {
					monsters[i + 1] -= (monsters[i] - heroes[i]);
				}
				count += heroes[i];
			}

		}
		System.out.println(count);

	}
}
