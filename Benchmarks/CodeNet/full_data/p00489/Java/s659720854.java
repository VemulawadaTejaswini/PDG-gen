import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

/**
 * Soccer
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = Short.parseShort(line);
			int[][] points = new int[n + 1][3];

			for (int i = 0; i < n + 1; i++) {
				points[i][0] = i;
			}

			int g = (n * (n - 1)) / 2;
			int t1, t2, p1, p2;
			StringTokenizer st;
			for (int i = 0; i < g; i++) {
				st = new StringTokenizer(br.readLine());
				t1 = Integer.parseInt(st.nextToken());
				t2 = Integer.parseInt(st.nextToken());
				p1 = Integer.parseInt(st.nextToken());
				p2 = Integer.parseInt(st.nextToken());

				if (p1 > p2) {
					points[t1][1] += 3;
				} else if (p1 == p2) {
					points[t1][1] += 1;
					points[t2][1] += 1;
				} else {
					points[t2][1] += 3;
				}
			}

			Arrays.sort(points, new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					return o2[1] - o1[1];
				}
			});

			int rank, prev;
			rank = 1;
			prev = points[0][1];
			for (int i = 0; i < n + 1; i++) {
				if (points[i][1] != prev) {
					rank = i + 1;
				}
				points[i][2] = rank;
				prev = points[i][1];
			}

			Arrays.sort(points, new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					return o1[0] - o2[0];
				}
			});

			StringBuilder sb = new StringBuilder();
			for (int i = 1; i < n + 1; i++) {
				sb.append(points[i][2] + "\n");
			}
			System.out.print(sb.toString());
		}

	}
}