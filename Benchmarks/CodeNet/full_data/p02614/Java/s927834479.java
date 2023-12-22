import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int h = Integer.parseInt(str[0]);
		int w = Integer.parseInt(str[1]);
		int k = Integer.parseInt(str[2]);

		String matrix[][] = new String[h][w];

		for (int i = 0; i < h; i++) {
			str = br.readLine().split("");
			for (int j = 0; j < w; j++) {
				matrix[i][j] = str[j];
			}
		}

		int ans = 0;
		for (int bit = 0; bit < (1 << h + w); bit++) {
			String m[][] = new String[h][w];

			for (int o = 0; o < h; o++) {
				for (int p = 0; p < w; p++) {
					m[o][p] = matrix[o][p];
				}
			}

			for (int i = 0; i < h + w; i++) {
				if ((bit & (1 << i)) != 0) {
					if (i < h) {
						Arrays.fill(m[i], ".");
					} else {
						for (int l = 0; l < h; l++) {
							m[l][i - h] = ".";
						}
					}
				}
			}

			int count = 0;
			for (int o = 0; o < h; o++) {
				for (int p = 0; p < w; p++) {
					if (m[o][p].equals("#")) {
						count++;
					}
				}
			}

			if (count == k) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}