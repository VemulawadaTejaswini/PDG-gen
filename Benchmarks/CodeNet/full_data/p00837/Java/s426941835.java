import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		for (;;) {
			int m = sc.nextInt();
			int c = sc.nextInt();
			int n = sc.nextInt();

			if ((m | c | n) == 0) {
				break;
			}

			int[][] qq = new int[n][];

			int sz = 0;
			int maxx = 0;
			for (int i = 0; i < n; i++) {
				int x = sc.nextInt();
				qq[i] = new int[x];
				for (int j = 0; j < x; j++) {
					qq[i][j] = sc.nextInt();
				}
				maxx = Math.max(x, maxx);
				sz += x;
			}

			int[] q = new int[sz];
			int cnt = 0;
			for (int j = 0; j < maxx; j++) {
				for (int i = 0; i < n; i++) {
					if (qq[i].length <= j) {
						continue;
					}
					q[cnt] = qq[i][j];
					cnt++;
				}
			}

			int map[] = new int[100];

			LinkedList<Integer> l = new LinkedList<Integer>();

			int smp[] = new int[m + 2];

			Arrays.fill(smp, c);
			smp[m + 1] = 1000;

			int cost = 0;
			for (int i = 0; i < sz; i++) {

				// get
				if (map[q[i]] == 0) {
					cost += m + 1;
				} else {
					if (map[q[i]] == 1) {
						l.remove((Integer) q[i]);
					}
					cost += map[q[i]];
					smp[map[q[i]]]++;
				}

				l.addFirst(q[i]);
				map[q[i]] = 1;

				if (l.size() > c) { // swap
					int j = 2;
					int k;
					for (; smp[j] == 0; j++)
						;
					smp[j]--;

					k = j;
					int v = l.pollLast();

					cost += k; // put k temp

					cost += 1; // remove 1
					for (; smp[j] == 0; j++)
						;
					smp[j]--;

					cost += j; // 1 to j
					map[v] = j;

					cost += k; // k to 1;
					cost += 1;
					
					smp[k]++;
				} else {
					cost += 1;
				}
				// return
			}
			System.out.println(cost);
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}