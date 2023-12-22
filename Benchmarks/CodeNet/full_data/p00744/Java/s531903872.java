import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	int gcd(int a, int b) {
		if(a % b == 0){
			return b;
		}
		if( b % a == 0){
			return a;
		}
		if (a > b) {
			return gcd(b, a % b);
		} else {
			return gcd(a, b % a);
		}
	}

	class E {
		int capacity;
		int flow;

		public E(int from, int to) {
			this.from = from;
			this.to = to;
			this.capacity = 1;
			this.flow = 0;
		}

		int from;
		int to;
		int weight;
	}

	class Node {
		int id;
		int value;

		Node(int id, int value) {
			this.id = id;
			this.value = value;
		}
	}

	Node[] b;
	Node[] r;

	LinkedList<E> link;
	boolean used[];

	int dfs(int start, int goal) {
		if (goal == start) {
			return 1;
		}
//		System.out.println(start + " " + goal);
		used[start] = true;
		for (E l : link) {
			if (l.from == start) {
				if (!used[l.to]) {
					if (l.capacity - l.flow> 0) {
						int res = dfs(l.to, goal);
						if (res > 0) {
							l.flow += res;
							return res;
						}
					}
				}
			}
			if (l.to == start) {
				if (!used[l.from]) {
					if (l.flow > 0) {
						int res = dfs(l.from, goal);
						if (res > 0) {
							l.flow -= res;
							return res;
						}
					}
				}
			}
		}
		return 0;
	}

	void run() {
		for (;;) {
			int m = sc.nextInt();
			int n = sc.nextInt();

			if ((m | n) == 0) {
				break;
			}

			b = new Node[m];
			r = new Node[n];

			int source = m + n;
			int sink = source + 1;
			link = new LinkedList<E>();
			for (int i = 0; i < m; i++) {
				b[i] = new Node(i, sc.nextInt());

				link.add(new E(source, b[i].id));

			}

			for (int i = 0; i < n; i++) {
				r[i] = new Node(i + m, sc.nextInt());

				for (int j = 0; j < m; j++) {
					if (gcd(b[j].value, r[i].value) >= 2) {
						link.add(new E(b[j].id, r[i].id));
					}
				}
				link.add(new E(r[i].id, sink));
			}

			int ans = 0;
			for (;;) {
				used = new boolean[sink + 1];
				int res = dfs(source, sink);
				if (res == 0) {
					break;
				}
				ans += res;
			}
			System.out.println(ans);
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}