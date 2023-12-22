import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		while (true) {
			int n = s.nextInt();
			int m = s.nextInt();

			if (n == 0 && m == 0)
				break;

			int[] taro = new int[n];
			int[] hana = new int[m];

			int sumt = 0;
			int sumh = 0;

			for (int i = 0; i < n; i++) {
				taro[i] = s.nextInt();
				sumt += taro[i];
			}

			for (int i = 0; i < m; i++) {
				hana[i] = s.nextInt();
				sumh += hana[i];
			}

			int t = 0, h = 0;

			if ((sumt + sumh) % 2 == 1)
				System.out.println("-1");

			else {
				// int ave = (sumt + sumh) / 2;

				if (sumt >= sumh) {
					int dif = (sumt - sumh) / 2;

					outer1: for (int count = 0; count < 100; count++) {
						t = count + dif;
						h = count;

						for (int x = 0; x < n; x++) {
							if (taro[x] == t) {
								// t = taro[x];
								for (int y = 0; y < m; y++) {
									if (hana[y] == h) {
										// h = hana[y];
										// System.out.println(t + " " + h);
										break outer1;
									}
								}
							}
						}
					}

				} else if (sumh > sumt) {
					int dif = (sumh - sumt) / 2;

					outer2: for (int count = 0; count < 100; count++) {
						t = count;
						h = count + dif;

						for (int y = 0; y < m; y++) {
							if (hana[y] == h) {
								// h = hana[y];
								for (int x = 0; x < n; x++) {
									if (taro[x] == t) {
										// t = taro[x];
										break outer2;
									}
								}
							}
						}
					}

				}

				if (t != 0 && h != 0 && t <= 100 && h <= 100)
					System.out.println(t + " " + h);
				else
					System.out.println(-1);

			}
		}
		s.close();
	}
}