import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		long money;

		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}
			money = 0;
			for (int i = 0; i < n; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				int z = sc.nextInt();
				int w = sc.nextInt();
				int k = Math.max(Math.max(x, y), z);
				if (k <= 60 && w <= 2) {
					money += 600;
				} else if (k <= 80 && w <= 5) {
					money += 800;
				} else if (k <= 100 && w <= 10) {
					money += 1000;
				} else if (k <= 120 && w <= 15) {
					money += 1200;
				} else if (k <= 140 && w <= 20) {
					money += 1400;
				} else if (k <= 160 && w <= 25) {
					money += 1600;
				}
			}
			System.out.println(money);
		}
	}
}