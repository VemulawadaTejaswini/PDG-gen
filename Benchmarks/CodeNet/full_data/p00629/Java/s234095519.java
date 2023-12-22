import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

import static java.lang.Integer.parseInt;

/**
 * Problem 03: Selecting Teams Advanced to Regional
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = parseInt(line);
			if (n == 0) break;

			int selected = 0;
			int[] groups = new int[1001];
			int[][] teams = new int[n][4];

			for (int i = 0; i < n; i++) {
				words = br.readLine().split(" ");
				for (int j = 0; j < words.length; j++) {
					teams[i][j] = parseInt(words[j]);
				}
			}

			Arrays.sort(teams, new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					int ret1, ret2;
					ret1 = Integer.compare(o2[2], o1[2]);
					if (ret1 == 0) {
						ret2 = Integer.compare(o1[3], o2[3]);
						if (ret2 == 0) {
							return Integer.compare(o1[0], o2[0]);
						} else {
							return ret2;
						}
					} else {
						return ret1;
					}
				}
			});

			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < n; i++) {
				boolean select = false;
				if (selected < 10) {
					if (groups[teams[i][1]] < 3) {
						select = true;
					}
				} else if (selected < 20) {
					if (groups[teams[i][1]] < 2) {
						select = true;
					}
				} else if (selected < 26) {
					if (groups[teams[i][1]] < 1) {
						select = true;
					}
				}
				if (select) {
					sb.append(teams[i][0]).append("\n");
					groups[teams[i][1]]++;
					selected++;
				}
			}
			System.out.print(sb.toString());
		} //end while
	} //end main
}