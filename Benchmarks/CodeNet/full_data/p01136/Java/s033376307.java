/**
 * Gather the Maps!
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.BitSet;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n = parseInt(line);
			if (n == 0) break;

			BitSet[] count = new BitSet[31];
			for (int i = 0; i < count.length; i++) {
				count[i] = new BitSet(n);
			}

			for (int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int f = parseInt(st.nextToken());
				for (int j = 0; j < f; j++) {
					count[parseInt(st.nextToken())].set(i);
				}
			}

			//solve
			for (int i = 1; i < count.length; i++) {
				if (count[i].intersects(count[i - 1])) {
					count[i].or(count[i - 1]);
				}
				if (count[i].cardinality() == n) {
					System.out.println(i);
					break;
				}
			}
		} //end while
	} //end main
}