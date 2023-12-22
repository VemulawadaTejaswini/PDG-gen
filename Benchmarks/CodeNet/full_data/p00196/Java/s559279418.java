import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n = parseInt(line);
			if (n == 0) break;

			int[][] league = new int[n][5];
			for (int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				league[i][3] = i;
				league[i][4] = st.nextToken().charAt(0);
				for (int j = 0; j < n - 1; j++) {
					league[i][parseInt(st.nextToken())]++;
				}
			}
			Arrays.sort(league, new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					if (o1[0] != o2[0]) {
						return o2[0] - o1[0];
					} else {
						if (o1[1] != o2[1]) {
							return o1[1] - o2[1];
						} else {
							return o1[3] - o2[3];
						}
					}
				}
			});
			for (int[] team : league) {
				System.out.println((char) team[4]);
			}
		}
	}
}