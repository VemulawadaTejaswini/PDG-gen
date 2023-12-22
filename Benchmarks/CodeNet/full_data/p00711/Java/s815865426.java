import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		int x0 = 9, y0 = 9;
		// int count = 0;
		int[] count = new int[64];
		int dataset = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// StringBuffer sb = new StringBuffer(new String(br.readLine()));
		// int x = Character.getNumericValue(sb.charAt(0));
		// int y = Character.getNumericValue(sb.charAt(2));

		for (dataset = 0; dataset < 64; dataset++) {

			int k = 0;
			String str = br.readLine();
			String box[] = str.split(" ");
			int x = Integer.parseInt(box[0]);
			int y = Integer.parseInt(box[1]);

			if (x == 0 && y == 0) {
				break;
			} else {

				boolean[][] can = new boolean[x][y];
				boolean[][] black = new boolean[x][y];

				for (int j = 0; j < y; j++) {

					StringBuffer sb = new StringBuffer(new String(br.readLine()));
					for (int i = 0; i < x; i++) {
						if (sb.charAt(i) == '#') {
							black[i][j] = false;
						} else {
							if (sb.charAt(i) == '@') {
								x0 = i;
								y0 = j;
							}
							black[i][j] = true;
						}
					} // iのループ
				} // jのループ

				can[x0][y0] = true;

				int px = x0;
				int py = y0;

				do {
					for (int j = 0; j < y; j++) {
						for (int i = 0; i < x; i++) {
							if (can[i][j]) {
								px = i;
								py = j;

								if (py > 0) {
									if (black[px][py - 1]) {// 上
										can[px][py - 1] = true;
									}
								}

								if (py < y - 1) {
									if (black[px][py + 1]) {// 下
										can[px][py + 1] = true;
									}
								}

								if (px > 0) {
									if (black[px - 1][py]) {// 左
										can[px - 1][py] = true;
									}
								}

								if (px < x - 1) {
									if (black[px + 1][py]) {// 右
										can[px + 1][py] = true;
									}
								}
							}

						}
					}
					k++;
				} while (k < x * y);

				for (int j = 0; j < y; j++) {
					for (int i = 0; i < x; i++) {
						if (can[i][j]) {
							count[dataset]++;
						}
					}
				}
			}
		}
		for (dataset = 0; dataset < 64; dataset++) {
			if (count[dataset] == 0) {
				break;
			}
			System.out.println(count[dataset]);
		}

	}// main

}// class
