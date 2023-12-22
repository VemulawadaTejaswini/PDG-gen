import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Problem C: Dividing Students
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		StringBuilder sb = new StringBuilder();
		while (!(line = br.readLine()).equals("0")) {

			int n = Integer.parseInt(line);

			for (int i = 0; i < n; ++i) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int pm = Integer.parseInt(st.nextToken());
				int pe = Integer.parseInt(st.nextToken());
				int pj = Integer.parseInt(st.nextToken());

				int sum = pm + pe + pj;
				char rank = 'C';
				if (pm == 100 || pe == 100 || pj == 100) {
					rank = 'A';
				} else if (sum >= 240 || sum - pj >= 180) {
					rank = 'A';
				} else if (sum >= 210) {
					rank = 'B';
				} else if (sum >= 150 && (pm >= 80 || pe >= 80)) {
					rank = 'B';
				}
				sb.append(rank).append('\n');
			}
		}
		System.out.print(sb.toString());
	}
}