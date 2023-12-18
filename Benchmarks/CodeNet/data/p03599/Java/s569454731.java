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

		double max = 0;
		int ansSuw = 0;
		int ansSu = 0;
		for (int i = 0; c * i <= f; i++) {
			for (int j = 0; d * j <= f; j++) {
				for (int s = 0; 100 * a * s <= f; s++) {
					for (int k = 0; 100 * b * k <= f; k++) {
						double su = (double) (c * i + d * j);
						double wa = (double) (100 * a * s + 100 * b * k);
						double suw = wa + su;
						if (e * suw >= su * (100 + e) && f >= suw) {
							if (suw != 0 && su >= max * suw) {
								max = su / suw;
								ansSuw = (int) suw;
								ansSu = (int) su;
							}
						}
					}
				}
			}
		}

		System.out.println(ansSuw + " " + ansSu);
	}
}
