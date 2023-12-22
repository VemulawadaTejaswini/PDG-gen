
import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	class P implements Comparable<P> {
		int s;
		int v;

		P(int s, int v) {
			this.s = s;
			this.v = v;
		}

		public int compareTo(P t) {
			return v - t.v;
		}
	}

	int decode(String buffer) {
		int ret = 0;
		for (int i = 0; i < buffer.length(); i++) {
			ret = ret << 2;
			char ch = buffer.charAt(i);
			if (ch == 'r') {
				ret += 3;
			} else if (ch == 'g') {
				ret += 2;
			} else {
				ret += 1;
			}
		}
		return ret;
	}

	void run() {

		for (;;) {
			String buffer = sc.next();
			if (buffer.equals("0")) {
				break;
			}

			int s = decode(buffer);
			int n = buffer.length();

			PriorityQueue<P> q = new PriorityQueue<P>();
			q.add(new P(s, 0));
			boolean used[] = new boolean[1 << (n * 2)];
			int ans = -1;
			int z = 0;
			int type[] = new int[n];
			int d[] = new int[n];

			for (;;) {
				if (q.isEmpty()) {
					break;
				}

				P v = q.poll();
				if (used[v.s]) {
					continue;
				}
				used[v.s] = true;

				int max = 0;
				int s2 = v.s;
				for (int i = 0; i < n; i++) {
					type[i] = s2 & 3;
					s2 = s2 >> 2;
					if (i != 0) {
						d[i - 1] = type[i] ^ type[i - 1];
						max = (d[i - 1] | max);
					}
				}
				if (max == 0) {
					ans = v.v;
					break;
				}

				for (int i = 0; i < n - 1; i++) {
					if (d[i] != 0) {
						int v2 = v.s;
						v2 = v2 & (~(3 << (2 * (i))));
						v2 = v2 & (~(3 << (2 * (i + 1))));

						v2 = v2 | (d[i] << (2 * (i)));
						v2 = v2 | (d[i] << (2 * (i + 1)));
						if (!used[v2]) {
							q.add(new P(v2, v.v + 1));
						}
					}
				}
			}
			if (ans == -1) {
				System.out.println("NA");
			} else {
				System.out.println(ans);
			}
		}

	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}