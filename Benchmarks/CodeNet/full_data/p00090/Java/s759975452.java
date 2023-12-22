import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Overlaps of Seals
 */
public class Main {

	static char DELIM = ',';
	static int SEPARATE = 5;
	static int OVERLAP = 4;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n = Integer.parseInt(line);
			if (n == 0) break;

			double[][] graph = new double[n][n];
			double[][] coords = new double[n][2];

			for (int i = 0; i < n; i++) {
				line = br.readLine();
				coords[i][0] = Double.parseDouble(line.substring(0, line.indexOf(DELIM)));
				coords[i][1] = Double.parseDouble(line.substring(line.indexOf(DELIM) + 1));
			}

			// init graph.
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					graph[i][j] = SEPARATE;
				}
			}

			// calc distance.
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (i <= j) {
						graph[i][j] = Math.pow(coords[i][0] - coords[j][0], 2)
								+ Math.pow(coords[i][1] - coords[j][1], 2);
					}
				}
			}

			// solve.
			int max = 0;
			for (int i = 0; i < n; i++) {
				int _max = 0;
				for (int j = 0; j < n; j++) {
					if (graph[i][j] <= OVERLAP) {
						_max++;
						if (_max > max) {
							max = _max;
						}
					}
				}
			}
			System.out.println(max);
		}
	}
}