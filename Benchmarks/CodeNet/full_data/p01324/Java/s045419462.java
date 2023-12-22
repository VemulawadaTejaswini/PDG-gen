import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

import static java.lang.Integer.parseInt;

/**
 * Consistet Unit System
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int N = parseInt(line);
			if (N == 0) break;

			String std = "";
			Map<String, Integer> convs = new HashMap<>();
			Queue<Tuple> queue = new ArrayDeque<>();
			boolean ans = true;

			for (int i = 0; i < N; i++) {
				words = br.readLine().split("[ ^]");

				if (i == 0) {
					std = words[1];
					convs.put(words[5], parseInt(words[4]));
				} else {
					if (parseInt(words[4]) > 0) {
						queue.add(new Tuple(words[1], words[5], parseInt(words[4])));
					} else {
						queue.add(new Tuple(words[5], words[1], -parseInt(words[4])));
					}
				}
			}

			while (!queue.isEmpty()) {

				Tuple t = queue.poll();

				String u = "";
				int e = 0;

				if (t.u1.equals(std)) {
					u = t.u2;
					e = t.e;
				} else if (t.u2.equals(std)) {
					u = t.u1;
					e = -t.e;
				} else if (convs.containsKey(t.u1)) {
					u = t.u2;
					e = convs.get(t.u1) + t.e;
				} else if (convs.containsKey(t.u2)) {
					u = t.u1;
					e = convs.get(t.u2) - t.e;
				} else {
					queue.offer(t);
					continue;
				}

				if (u.equals("")) {
					System.out.println();
				}

				if (!convs.containsKey(u)) {
					convs.put(u, e);
				} else {
					if (convs.get(u) != e) {
						ans = false;
						break;
					}
				}
			}

			System.out.println(ans ? "Yes" : "No");
			
		}
	}
}

class Tuple {
	String u1, u2;
	int e;

	public Tuple(String u1, String u2, int e) {
		this.u1 = u1;
		this.u2 = u2;
		this.e = e;
	}
}