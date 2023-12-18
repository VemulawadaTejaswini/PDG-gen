import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();

		double rate = 0.0;
		int[] answer = new int[2];

		for (int i = 0; i <= 3000; i++) {
			for (int j = 0; j <= 3000; j++) {
				int water = ((a * i) + (b * j)) * 100;
				if (water == 0 || water >= f) break;
				int cap = Math.min(f - water, (water / 100) * e);
				for (int k = 0; k <= 3000; k++) {
					for (int l = 0; l <= 3000; l++) {
						int sugar = k * c + l * d;
						if (sugar > cap || water + sugar > f) break;
						if (100.0 * sugar / (sugar + water) > rate) {
							rate = 100.0 * sugar / (sugar + water);
							answer[0] = sugar + water;
							answer[1] = sugar;
						}
					}
				}
			}
		}

		System.out.println(answer[0] + " " + answer[1]);
	}
}
