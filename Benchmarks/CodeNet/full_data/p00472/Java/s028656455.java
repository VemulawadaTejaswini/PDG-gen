import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * A Traveler
 */
public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = Integer.parseInt(line.substring(0, line.indexOf(' ')));
			int m = Integer.parseInt(line.substring(line.indexOf(' ') + 1));

			int[] d = new int[n];
			for (int i = 0; i < n - 1; i++) {
				d[i] = Integer.parseInt(br.readLine());
			}
			long sum = 0;
			int inn = 0;
			for (int i = 0; i < m; i++) {
				int mm = Integer.parseInt(br.readLine());
				if (mm > 0) {
					for (int j = inn; j < inn + mm; j++) {
						sum += d[j];
					}
				} else {
					for (int j = inn - 1; j >= inn + mm; j--) {
						sum += d[j];
					}
				}
				inn += mm;
			}
			System.out.println(sum % 100000);

		}

	}
}