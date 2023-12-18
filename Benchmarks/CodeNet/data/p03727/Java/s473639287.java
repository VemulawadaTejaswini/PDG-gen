import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	long toKey(int a, int b) {
		if (a < b) {
			return (long) b << 32 | a;
		} else {
			return (long) a << 32 | b;
		}
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Set<Integer>[] g = new Set[N];
		for (int i = 0; i < N; ++i) {
			g[i] = new HashSet<>();
		}
		ArrayDeque<Long> pend = new ArrayDeque<>();
		for (int i = 0; i < 2 * (N - 1); ++i) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			--a;
			--b;
			if (g[a].contains(b)) {
				pend.add(toKey(a, b));
			}
			g[a].add(b);
			g[b].add(a);
		}
		int cnt = 0;
		while (!pend.isEmpty()) {
			++cnt;
			long key = pend.poll();
			int a = (int) (key >> 32);
			int b = (int) (key);
			if (g[a].size() < g[b].size()) {
				int tmp = a;
				a = b;
				b = tmp;
			}
			g[a].remove(b);
			g[b].remove(a);
			for (int v : g[b]) {
				g[v].remove(b);
				if (g[v].contains(a)) {
					pend.add(toKey(v, a));
				} else {
					g[v].add(a);
				}
			}
			g[a].addAll(g[b]);
			g[b].clear();
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
