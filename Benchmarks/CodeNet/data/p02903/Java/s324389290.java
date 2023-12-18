
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int[][] result = new int[h][w];

			if (h == 1) {
				if (b != 0) {
					System.out.println("No");
					return;
				} else {
					int aCount = 0;
					for (int j = 0; j < w; j++) {
						if (aCount < a) {
							result[0][j] = 1;
							aCount++;
						} else {
							result[0][j] = 0;
						}
					}
				}
			} else if (w == 1) {
				if (a != 0) {
					System.out.println("No");
					return;
				} else {
					int bCount = 0;
					for (int i = 0; i < h; i++) {
						if (bCount < b) {
							result[i][0] = 1;
							bCount++;
						} else {
							result[i][0] = 0;
						}
					}
				}
			} else {
				for (int i = 0; i < h; i++) {
					for (int j = 0; j < w; j++) {
						if ((i * a) % w <= j && j < (i * a) % w + a) {
							result[i][j] = 1;
						} else {
							result[i][j] = 0;
						}
					}
				}

				for (int j = 0; j < w; j++) {
					int count = 0;
					for (int i = 0; i < h; i++) {
						count += result[i][j];
					}
					if (count != b) {
						System.out.println("No");
						return;
					}
				}
			}

			// 出力
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					System.out.print(result[i][j]);
				}
				System.out.println();
			}
		}
	}
}
