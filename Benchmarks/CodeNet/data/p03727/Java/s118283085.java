import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	class Pair {
		int a, b;

		public Pair(int a, int b) {
			if (a < b) {
				this.a = a;
				this.b = b;
			} else {
				this.a = b;
				this.b = a;
			}
		}
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Set<Integer>[] g = new Set[N];
		for (int i = 0; i < N; ++i) {
			g[i] = new HashSet<>();
		}
		ArrayDeque<Pair> pend = new ArrayDeque<>();
		for (int i = 0; i < 2 * (N - 1); ++i) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			--a;
			--b;
			if (g[a].contains(b)) {
				pend.add(new Pair(a, b));
			}
			g[a].add(b);
			g[b].add(a);
		}
		int cnt = 0;
		while (!pend.isEmpty()) {
			++cnt;
			Pair p = pend.poll();
			if (g[p.a].size() > g[p.b].size()) {
				int tmp = p.a;
				p.a = p.b;
				p.b = tmp;
			}
			g[p.a].remove(p.b);
			g[p.b].remove(p.a);
			for (int v : g[p.b]) {
				g[v].remove(p.b);
				if (g[v].contains(p.a)) {
					pend.add(new Pair(v, p.a));
				} else {
					g[v].add(p.a);
				}
			}
			g[p.a].addAll(g[p.b]);
		}
		if (cnt == N - 1) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

	private static void tr(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}
}
