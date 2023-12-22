import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Yamanote Line
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			StringTokenizer st = new StringTokenizer(line);

			int a = parseInt(st.nextToken());
			int b = parseInt(st.nextToken());
			int c = parseInt(st.nextToken());

			int arriveAt = 0;
			int overSleep;
			List<Integer> overSleeps = new ArrayList();

			for (int i = 0; ; i++) {
				arriveAt = 60 * i + c;
				overSleep = arriveAt % (a + b);
				if (overSleep <= a) {
					break;
				} else {
					if (overSleeps.contains(overSleep)) {
						arriveAt = -1;
						break;
					} else {
						overSleeps.add(overSleep);
					}
				}
			}
			System.out.println(arriveAt);
		}
	} //end while
} //end main