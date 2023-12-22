import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	Scanner sc;

	Main() {
		
		sc = new Scanner(System.in);
		for (int i = 0; i < 50; i ++) d.add(new PriorityQueue<P>(200, Collections.reverseOrder()));
	}

	int n, m, k, a, b,
		t[][] = new int[50][49],
		c[][] = new int[50][49],
		l[] = new int[50];

	void run() {

		for (;;) {

			n = sc.nextInt();
			m = sc.nextInt();
			k = sc.nextInt();
			a = sc.nextInt();
			b = sc.nextInt();
			if ((n | m | k | a -- | b --) == 0) break;

			Arrays.fill(l, 0, n, 0);
			for (int i = 0; i < m; i++) {

				int x = sc.nextInt() - 1;
				t[x][l[x]] = sc.nextInt() - 1;
				c[x][l[x]] = sc.nextInt();
				l[x]++;
			}
			
			d();
			Queue<P> db = d.get(b);
			if (db.size() < k) System.out.println("None");
			else System.out.println(db.element().p);
		}
	}

	class P implements Comparable<P> {

		int d;
		String p;
		long s;

		P(int a, String b, long c) {

			d = a;
			p = b;
			s = c;
		}

		@Override
		public int compareTo(P t) {

			if (d != t.d) return d - t.d;
			return p.compareTo(t.p);
		}
	}

	static final int INF = Integer.MAX_VALUE >> 4;
	List<Queue<P>> d = new ArrayList<Queue<P>>(50);
	Queue<P> q = new PriorityQueue<P>(200 * 50 * 49);

	void d() {

		q.clear();
		for (int i = 0; i < n; i++) d.get(i).clear();
		P s = new P(0, Integer.toString(a + 1), 1 << a);
		d.get(a).add(s);
		q.add(s);

		while (!q.isEmpty()) {

			P p = q.remove();
			int v = Integer.valueOf(p.p.substring(p.p.lastIndexOf("-") + 1)) - 1;
			Queue<P> dv = d.get(v);
			if (dv.size() >= k && p.compareTo(dv.element()) > 0) continue;

			for (int i = 0; i < l[v]; i++) {

				if ((p.s >> t[v][i] & 1) == 1) continue;
				P np = new P(p.d + c[v][i], p.p + "-" + (t[v][i] + 1), p.s | 1 << t[v][i]);
				Queue<P> dt = d.get(t[v][i]);
				if (dt.size() < k || np.compareTo(dt.element()) < 0) {
					
					dt.add(np);
					if (dt.size() > k) dt.remove();
					q.add(np);
				}
			}
		}
	}

	public static void main(String args[]) {
		
		Main m = new Main();
		m.run();
	}
}