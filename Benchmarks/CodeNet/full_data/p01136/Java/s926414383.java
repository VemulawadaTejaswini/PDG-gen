import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.BitSet;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Gather the Maps!
 */
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
			int ans = -1;
			for (int i = 1; i < count.length; i++) {
				if (count[i].cardinality() == 0) {
					count[i].or(count[i - 1]);
				} else if (count[i].intersects(count[i - 1])) {
					count[i].or(count[i - 1]);
				}
				if (count[i].cardinality() == n) {
					ans = i;
					break;
				}
			}
			System.out.println(ans);
		} //end while
	} //end main
}