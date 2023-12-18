import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		int e = scanner.nextInt();
		int f = scanner.nextInt();

		int max = 0;
		int ansSuw = 0;
		int ansSu = 0;
		for (int i = 0; i <= 30; i++) {
			for (int j = 0; j <= 30; j++) {
				for (int s = 0; s <= 30; s++) {
					for (int k = 0; k <= 30; k++) {
						int su = c * i + d * j;
						int wa = (100 * a * s + 100 * b * k);
						int suw = wa + su;
						if (e * suw >= su * (100 + e) && f >= suw) {
							if (su >= max * suw) {
								ansSuw = suw;
								ansSu = su;
							}
						}
					}
				}
			}
		}

		System.out.println(ansSuw + " " + ansSu);
	}
}