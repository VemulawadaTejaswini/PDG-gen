import static java.util.Arrays.deepToString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	int[] num2idx;
	V[] vs;
	
	Scanner sc = new Scanner(System.in);
	public void run() {
		for (;sc.hasNext();) {
			int n = sc.nextInt();
			if (n == 0) break;
			num2idx = new int[1001];
			vs = new V[n];
			for (int i = 0; i < n; i++) {
				V v = new V();
				v.num = sc.nextInt();
				v.x = sc.nextInt();
				v.y = sc.nextInt();
				vs[i] = v;
				num2idx[v.num] = i;
			}
			
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					int d2 = dist2(vs[i].x, vs[i].y, vs[j].x, vs[j].y);
					if (d2 <= 50 * 50) {
						double dd = Math.sqrt(d2);
						vs[i].add(new E(vs[j], dd));
						vs[j].add(new E(vs[i], dd));
					}
				}
			}
			
			int m = sc.nextInt();
			for (int mi = 0; mi < m; mi++) {
				int s = num2idx[sc.nextInt()];
				int g = num2idx[sc.nextInt()];
				List<V> res = dijk(vs[s], vs[g]);
				if (res == null) 
					System.out.println("NA");
				else {
					System.out.print(res.get(0).num);
					for (int i = 1; i < res.size(); i++)
						System.out.print(" " + res.get(i).num);
					System.out.println();
				}
			}
		}
	}

	List<V> dijk(V s, V t) {
		for (V v : vs) v.dist = 1001001001;
		t.prev = null;
		s.prev = s;
		s.dist = 0;
		PriorityQueue<E> pq = new PriorityQueue<E>();
		pq.add(new E(s, 0));
		while (!pq.isEmpty()) {
			V cur = pq.poll().to;
			if (cur == t) break;
			for (E e : cur) {
				if (e.to.dist > e.dist + cur.dist) {
					e.to.dist = e.dist + cur.dist;
					e.to.prev = cur;
					pq.add(new E(e.to, e.to.dist));
				}
			}
		}
		
		if (t.prev == null) return null;
		List<V> route = new ArrayList<V>();
		V b = t;
		while (b.prev != b) {
			route.add(b);
			b = b.prev;
		}
		route.add(b);
		Collections.reverse(route);
		return route;
	}
	
	int dist2(int x1, int y1, int x2, int y2) {
		int dx = x1 - x2;
		int dy = y1 - y2;
		return dx * dx + dy * dy;
	}
	
	class V extends ArrayList<E> {
		int num;
		int x, y;
		double dist;
		V prev;
	}
	class E implements Comparable<E> {
		V to;
		double dist;
		E(V to, double dist) {
			this.to = to;
			this.dist = dist;
		}
		@Override
		public int compareTo(E o) {
			double c = dist - o.dist;
			if (c < 0) return -1;
			if (c > 0) return 1;
			return 0;
		}
	}
}