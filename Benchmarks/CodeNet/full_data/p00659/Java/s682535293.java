import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Popularity Estimation
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while (!(line = br.readLine()).equals("0")) {
			int n = Integer.parseInt(line);

			String[] names = new String[n];
			int[][] scenes = new int[n + 1][32];

			StringTokenizer st;
			int m, d;
			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				names[i] = st.nextToken();
				m = Integer.parseInt(st.nextToken());
				for (int j = 0; j < m; j++) {
					d = Integer.parseInt(st.nextToken());
					scenes[i][d] = n + 1;
					scenes[n][d]++;
				}
			}
			// 集計
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < 31; j++) {
					if (scenes[i][j] > 0)
						scenes[i][31] += (scenes[i][j] - scenes[n][j]);
				}
			}
			// 出力
			int idx = 0, min = Integer.MAX_VALUE;
			for (int i = 0; i < n; i++) {
				if (scenes[i][31] < min) {
					min = scenes[i][31];
					idx = i;
				} else if (scenes[i][31] == min) {
					if (names[i].compareTo(names[idx]) < 0)
						idx = i;
				}
			}
			System.out.println(scenes[idx][31] + " " + names[idx]);
		}
	}
}