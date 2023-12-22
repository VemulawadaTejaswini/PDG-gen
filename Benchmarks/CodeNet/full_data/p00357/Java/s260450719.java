import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.parseInt;

/**
 * Trampoline
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		int N = parseInt(br.readLine());
		int[] d = new int[N];

		for (int i = 0; i < N; i++) {
			d[i] = parseInt(br.readLine());
		}

		//
		Map<Integer, Set<Integer>> indeg, outdeg;
		indeg = new HashMap<>();
		outdeg = new HashMap<>();

		for (int i = 0; i < N; i++) {
			indeg.put(i, new HashSet<>());
			outdeg.put(i, new HashSet<>());
		}

		for (int i = 0; i < N; i++) {
			int p = d[i] / 10;
			for (int j = i + 1; j < N && j <= i + p; j++) {
				indeg.get(j).add(i);
				outdeg.get(i).add(j);
			}
			for (int j = i - 1; j >= 0 && j >= i - p; j--) {
				indeg.get(j).add(i);
				outdeg.get(i).add(j);
			}
		}

		Queue<Integer> que = new ArrayDeque<>();
		boolean[] b = new boolean[N];

		Arrays.fill(b, true);

		for (int i = 0; i < N; i++) {
			if (outdeg.get(i).size() == 0) {
				que.offer(i);
				b[i] = false;
			}
		}

		while (!que.isEmpty()) {
			int u = que.poll();

			for (int v : indeg.get(u)) {
				outdeg.get(v).remove(u);
				if (outdeg.get(v).size() == 0) {
					que.offer(v);
					b[v] = false;
				}
			}
		}

		System.out.println(b[0] && b[N - 1] ? "yes" : "no");
	}
}
