
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] x = new int[n];
			int[] y = new int[n];
			long[] h = new long[n];

			for (int i = 0; i < n; i++) {
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
				h[i] = sc.nextLong();
			}

			for (int i = 0; i <= 100; i++) {
				for (int j = 0; j <= 100; j++) {
					boolean collect = true;
					long higher = 0;
					for (int k = 0; k < n; k++) {
						if (0 < h[k]) {
							higher = h[k] + Math.abs(x[k] - i) + Math.abs(y[k] - j);
						}
					}

					for (int k = 0; k < n; k++) {
						long kyori = Math.abs(x[k] - i) + Math.abs(y[k] - j);

						if (higher - kyori != h[k] && 0 <= higher - kyori) {
							collect = false;
							break;
						}
					}
					if (collect) {
						System.out.println(i + " " + j + " " + higher);
						return;
					}
				}
			}

		}
	}
}
