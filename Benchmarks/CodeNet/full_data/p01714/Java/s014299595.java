
//Apples
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(in.readLine());
		int[][] XYUV = new int[n][4];

		for (int i = 0; i < n; i++) {

			String[] xyuv = in.readLine().split(" ");

			XYUV[i][0] = Integer.parseInt(xyuv[0]);
			XYUV[i][1] = Integer.parseInt(xyuv[1]);
			XYUV[i][2] = Integer.parseInt(xyuv[2]);
			XYUV[i][3] = Integer.parseInt(xyuv[3]);
		}

		int t = 0;
		int count = 0;
		int max = 0;

		int[][] now = new int[n][2];

		search: {
			while (true) {

				for (int i = 0; i < n; i++) {
					now[i][0] = XYUV[i][0] + XYUV[i][2] * t;
					now[i][1] = XYUV[i][1] + XYUV[i][3] * t;

					if (now[i][0] < -10 || now[i][1] < -10 || now[i][0] > 10 || now[i][1] > 10) {
						break search;
					}
				}

				// ????????´???
				for (int i = -10; i <= 10; i++) {

					for (int l = 0; l < n; l++) {
						if (now[l][0] == i) {
							count++;
						}
					}

					if (max < count) {
						max = count;
					}
					count = 0;

				}

				// ?¨??????´???
				for (int i = -10; i <= 10; i++) {

					for (int l = 0; l < n; l++) {
						if (now[l][1] == i) {
							count++;
						}
					}

					if (max < count) {
						max = count;
					}
					count = 0;

				}

				// ???????????´???

				for (int i = -10; i <= 10; i++) {

					for (int j = -3; j <= 3; j++) {
						for (int k = -3; k <= 3; k++) {

							for (int l = 0; l < n; l++) {
								if (j*now[l][0] == k*now[l][1] + j) {
									count++;
								}
							}

							if (max < count) {
								max = count;
							}
							count = 0;
						}
					}
				}

				t++;
			}
		}
		System.out.println(max);
	}
}