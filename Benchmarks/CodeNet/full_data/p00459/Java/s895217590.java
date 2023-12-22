/**
 * Shuffle
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n = parseInt(line);
			if (n == 0) break;

			Queue<Bundle> bundles = new ArrayDeque<Bundle>();
			bundles.offer(new Bundle(1, n));

			int m = parseInt(br.readLine());
			int p, q, r;
			StringTokenizer st = new StringTokenizer(br.readLine());
			p = parseInt(st.nextToken());
			q = parseInt(st.nextToken());
			r = parseInt(st.nextToken());

			//shuffle
			int count = 0;
			for (int i = 0; i < m + 1; i++) {
				int x, y;
				int[] pos;
				if (i < m) {
					line = br.readLine();
					x = parseInt(line.substring(0, line.indexOf(' ')));
					y = parseInt(line.substring(line.indexOf(' ') + 1));
					pos = new int[]{x, y - x, n - y};
				} else {
					pos = new int[]{p - 1, q - p - 1, n - q};
				}
				for (int j = 0; j < pos.length; j++) {
					while (pos[j] != 0) {
						Bundle seg;
						if (bundles.peek().size > pos[j]) {
							seg = bundles.peek().divide(pos[j]);
						} else {
							seg = bundles.poll();
						}
						bundles.offer(seg);
						pos[j] -= seg.size;
						if (i == m && j == 1) {
							count += seg.query(r);
						}
					}
				}
			}
			System.out.println(count);
		} //end while
	} //end main
}

class Bundle {
	int start, end, size;

	Bundle(int start, int end) {
		this.start = start;
		this.end = end;
		this.size = end - start + 1;
	}

	int query(int query) {
		if (end <= query) return size;
		else if (start <= query) return query - start + 1;
		else return 0;
	}

	Bundle divide(int size) {
		int _start = this.start;
		this.start += size;
		this.size = this.end - this.start + 1;
		return new Bundle(_start, _start + size - 1);
	}
}