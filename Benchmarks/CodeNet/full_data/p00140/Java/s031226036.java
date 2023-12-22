import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Bus Line
 */
public class Main {

	// 15 stations
	final static int[] stations = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 5, 4, 3, 2, 1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = Integer.parseInt(line);
			int s, g;

			for (int i = 0; i < n; ++i) {
				line = br.readLine();
				s = Integer.parseInt(line.substring(0, line.indexOf(' ')));
				g = Integer.parseInt(line.substring(line.indexOf(' ') + 1));

				if (s <= 5 && g < s) {
					s = 15 - s;
				}

				StringBuilder sb = new StringBuilder();
				for (int j = s;; j++) {
					if (j > 14) {
						j -= 15;
					}
					sb.append(stations[j] + " ");
					if (stations[j] == g) {
						break;
					}
				}
				System.out.println(sb.substring(0, sb.length() - 1).toString());
			}
		}

	}
}