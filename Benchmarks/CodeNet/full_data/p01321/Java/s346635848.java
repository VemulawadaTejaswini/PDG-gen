import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Final Examination!
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n = parseInt(line);
			if (n == 0) break;

			boolean[] score = new boolean[501];

			for (int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int sum = 0;
				while (st.hasMoreElements()) {
					sum += parseInt(st.nextToken());
				}
				score[sum] = true;
			}
			int min = 0, max = 0;
			for (int j = 0; j < score.length; j++) {
				if (score[j]) {
					min = j;
					break;
				}
			}
			for (int j = score.length - 1; j >= 0; j--) {
				if (score[j]) {
					max = j;
					break;
				}
			}
			System.out.println(min + " " + max);
		} // end while
	} // end main
}