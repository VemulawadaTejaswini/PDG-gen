import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int x[] = new int[N];
		int y[] = new int[N];
		int h[] = new int[N];
		for (int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			h[i] = sc.nextInt();
		}
		for (int cx = 0; cx <= 100; cx++) {
			for (int cy = 0; cy <= 100; cy++) {
				int hh = -1;
				for (int i = 0; i < N; i++) {
					if (h[i] == 0) {
						if (hh != -1) {
							if (0 < hh - Math.abs(x[i] - cx)
									- Math.abs(y[i] - cy)) {
								break;
							}
						}

					} else {
						if (hh == -1) {
							hh = h[i] + Math.abs(x[i] - cx)
									+ Math.abs(y[i] - cy);

						} else {
							if (hh != h[i] + Math.abs(x[i] - cx)
									+ Math.abs(y[i] - cy)) {
								break;
							}
						}
					}
					if (i == N - 1) {
						for (int j = 0; j < N; j++) {
							if (h[j] == 0) {
								if (0 < hh - Math.abs(x[j] - cx)
										- Math.abs(y[j] - cy)) {
									break;

								}
							}else{
								if (hh != h[j] + Math.abs(x[j] - cx)
										+ Math.abs(y[j] - cy)) {
									break;
								}
							}
							if (j == N - 1) {
								System.out.println(cx + " " + cy + " " + hh);
								return;
							}
						}

					}
				}

			}
		}

	}

}
