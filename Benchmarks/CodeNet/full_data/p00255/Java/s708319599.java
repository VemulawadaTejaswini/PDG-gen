import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Salary for a Plumber
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = parseInt(line);
			if (n == 0) break;

			int[] p = new int[n];
			int[] j = new int[n];

			StringTokenizer st;

			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++) p[i] = parseInt(st.nextToken());

			st = new StringTokenizer(br.readLine());
			for (int i = 1; i < n; i++) j[i] = parseInt(st.nextToken());

			//
			int max = p[0];
			int len = p[0];
			int c = 1;

			for (int i = 1; i < n; i++) {
				int s1 = (len + p[i] + j[i]) * c;
				int s2 = (len + p[i]) * (c + 1);
				if (s1 > s2) {
					len = len + p[i] + j[i];
					max = s1;
				} else {
					len = len + p[i];
					c++;
					max = s2;
				}
			}

			System.out.println(max);
		}
	}
}