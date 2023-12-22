import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while (!(line = br.readLine().trim()).equals("0") && !line.isEmpty()) {

			int n = parseInt(line);
			int[][] cs = new int[n][5];
			for (int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				cs[i][0] = parseInt(st.nextToken());
				cs[i][1] = parseInt(st.nextToken());
				cs[i][2] = parseInt(st.nextToken());
				cs[i][3] = parseInt(st.nextToken());
				cs[i][4] = cs[i][1] * 4 + cs[i][2] * 9 + cs[i][3] * 4;
			}

			int[] lim = new int[5];
			StringTokenizer st = new StringTokenizer(br.readLine());
			lim[1] = parseInt(st.nextToken());
			lim[2] = parseInt(st.nextToken());
			lim[3] = parseInt(st.nextToken());
			lim[4] = parseInt(st.nextToken());

			int sum = 0;
			outer: for (int i = 0; i < n; i++) {
				for (int j = 1; j < 5; j++) {
					if (cs[i][j] > lim[j])
						continue outer;
				}
				System.out.println(cs[i][0]);
				sum++;
			}
			if (sum == 0)
				System.out.println("NA");

		}

	}
}