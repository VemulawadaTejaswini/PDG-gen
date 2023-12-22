import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Factorial II
 */
public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n = Integer.parseInt(line);
			if (n == 0) {
				break;
			}

			int two = 0;
			int five = 0;

			for (int i = 0; i < n / 2 + 1; i++) {
				for (int j = 0; j < n / 5 + 1; j++) {
					int k = 2 * i + 5 * j, l;
					if ((i | j) > 0) {
						l = k;
						while (l % 2 == 0) {
							two++;
							l /= 2;
						}
						if (j > 0) {
							l = k;
							while (l % 5 == 0) {
								five++;
								l /= 5;
							}
						}
					}
				}
				System.out.println(two < five ? two : five);
			}
		}
	}