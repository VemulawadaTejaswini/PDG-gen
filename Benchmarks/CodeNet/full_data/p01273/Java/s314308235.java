/**
 * Infected Computer
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n = parseInt(line.substring(0, line.indexOf(' ')));
			int m = parseInt(line.substring(line.indexOf(' ') + 1));
			if ((n | m) == 0) break;

			boolean[] ps = new boolean[n + 1];
			Queue<int[]> ts = new PriorityQueue<int[]>(m, new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					return o1[0] - o2[0];
				}
			});

			StringTokenizer st;
			for (int i = 0; i < m; i++) {
				st = new StringTokenizer(br.readLine());
				int t, s, d;
				t = parseInt(st.nextToken());
				s = parseInt(st.nextToken());
				d = parseInt(st.nextToken());
				ts.offer(new int[]{t, s, d});
			}

			ps[1] = true;
			int count = 1;
			while (!ts.isEmpty()) {
				int[] t = ts.poll();
				if (ps[t[1]]) {
					ps[t[2]] = true;
					count++;
				}
			}
			System.out.println(count);
		} //end while
	} //end main
}