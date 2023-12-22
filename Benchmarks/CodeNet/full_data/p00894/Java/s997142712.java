import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.parseInt;

/**
 * Gift from the Goddess of Programming
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = parseInt(line);
			if (n == 0) break;

			Map<String, Map<String, Deque<int[]>>> logbook = new HashMap<>();

			for (int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());

				String day = st.nextToken();
				String time = st.nextToken();
				char e = st.nextToken().charAt(0);
				String p = st.nextToken();

				logbook.putIfAbsent(day, new HashMap<>());
				logbook.get(day).putIfAbsent(p, new ArrayDeque<>());
				if (e == 'I') {
					logbook.get(day).get(p).add(new int[]{timeValue(time), 0});
				} else {
					logbook.get(day).get(p).peekLast()[1] = timeValue(time);
				}
			}

			//
			int max = 0;
			Map<String, Integer> blessed = new HashMap<>();

			for (String day : logbook.keySet()) {
				Map<String, Deque<int[]>> logs = logbook.get(day);

				if (logs.get("000") == null) continue;

				for (String p : logs.keySet()) {
					if (!p.equals("000")) {
						blessed.putIfAbsent(p, 0);
						for (int[] r1 : logs.get(p)) {
							for (int[] r0 : logs.get("000")) {
								int i = blessed.get(p);
								i += intersect(r0, r1);
								blessed.put(p, i);
								max = Math.max(max, i);
							}
						}
					}
				}
			}
			System.out.println(max);
		} //end while
	} //end main

	static int timeValue(String time) {
		int c = time.indexOf(':');
		return parseInt(time.substring(0, c)) * 60 +
				parseInt(time.substring(c + 1));
	}

	static int intersect(int[] r1, int[] r2) {
		int ret = 0;
		if (r1[1] <= r2[0]) {
			ret = 0;
		} else if (r1[0] >= r2[1]) {
			ret = 0;
		} else if (r1[0] <= r2[0] && r2[1] <= r1[1]) {
			ret = r2[1] - r2[0];
		} else if (r2[0] <= r1[0] && r1[1] <= r2[1]) {
			ret = r1[1] - r1[0];
		} else if (r1[0] <= r2[0] && r1[1] <= r2[1]) {
			ret = r1[1] - r2[0];
		} else {
			ret = r2[1] - r1[0];
		}
		return ret;
	}
}