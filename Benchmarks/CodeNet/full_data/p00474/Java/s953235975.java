import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Icicles
 */
public class Main {

	static final boolean BROKEN = false;
	static final boolean GROWING = true;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = Integer.parseInt(line.substring(0, line.indexOf(' ')));
			int l = Integer.parseInt(line.substring(line.indexOf(' ') + 1));

			int[] icicles = new int[n + 2];
			Queue<int[]> growths = new PriorityQueue<int[]>(1,
					new Comparator<int[]>() {
						@Override
						public int compare(int[] o1, int[] o2) {
							return o2[1] - o1[1];
						}
					});

			// read
			for (int i = 1; i < n + 1; i++) {
				icicles[i] = Integer.parseInt(br.readLine());
			}

			// solve
			int total = 0;
			while (true) {
				for (int i = 1; i < n + 1; i++) {
					if (icicles[i] > icicles[i - 1]
							&& icicles[i] > icicles[i + 1])
						growths.add(new int[] { i, icicles[i] });
				}
				if (growths.size() == 0) {
					break;
				}
				int elapse = l - growths.peek()[1];
				total += elapse;
				while (growths.size() > 0) {
					int[] i = growths.poll();
					if (icicles[i[0]] + elapse < 0) {
						icicles[i[0]] += elapse;
					} else {
						icicles[i[0]] = 0;
					}
				}
				growths.clear();
			}
			System.out.println(total);
		}
	}
}