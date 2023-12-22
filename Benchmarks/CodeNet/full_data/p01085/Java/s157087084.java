import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Entrance Examination
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			StringTokenizer st = new StringTokenizer(line);

			int m, nmin, nmax;
			m = parseInt(st.nextToken());
			nmin = parseInt(st.nextToken());
			nmax = parseInt(st.nextToken());
			if ((m | nmin | nmax) == 0) break;

			int[] ns = new int[m];
			for (int i = 0; i < m; i++) {
				ns[i] = parseInt(br.readLine());
			}

			int max = -1, n = nmin;
			for (int i = nmin - 1; i < nmax; i++) {
				int gap = ns[i] - ns[i + 1];
				if (max <= gap) {
					max = gap;
					n = i;
				}
			}
			System.out.println(n + 1);
		} //end while
	} //end main
}