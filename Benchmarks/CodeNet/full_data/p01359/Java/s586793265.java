import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.parseInt;

/**
 * Era Name
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int N, Q;
			N = parseInt(line.substring(0, line.indexOf(' ')));
			Q = parseInt(line.substring(line.indexOf(' ') + 1));
			if ((N | Q) == 0) break;

			NavigableMap<Integer, String> mins = new TreeMap<>();
			Map<String, Integer> maxs = new HashMap<>();

			mins.put(0, "Unknown");
			maxs.put("Unknown", 0);

			StringTokenizer st;
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				String E;
				int B, W;
				E = st.nextToken();
				B = parseInt(st.nextToken());
				W = parseInt(st.nextToken());
				mins.put(W - B + 1, E);
				maxs.put(E, W);
			}

			for (int i = 0; i < Q; i++) {
				int q, w;
				q = parseInt(br.readLine());
				w = q - mins.floorKey(q) + 1;
				String e = mins.floorEntry(q).getValue();
				if (q <= maxs.get(e)) {
					System.out.println(e + " " + w);
				} else {
					System.out.println("Unknown");
				}
			}
		}
	}
}