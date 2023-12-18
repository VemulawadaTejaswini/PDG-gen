import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		solver();
	}

	static void solver() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();// modify the graphs to the one whose diameter is
		// equal or shorter than k.
		ArrayList<Integer>[] e = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			e[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < n - 1; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			e[a].add(b);
			e[b].add(a);
		}
		depth = new int[n];
		if (k % 2 == 0) {
			int ans = Integer.MAX_VALUE / 4;
			for (int i = 0; i < n; i++) {
				Arrays.fill(depth, 0);
				bfs(i, -1, 0, e);
				int count = 0;
				for (int j = 0; j < n; j++) {
					if (depth[j] > k / 2)
						count++;
				}
				ans = Math.min(ans, count);
			}
			System.out.println(ans);
		} else if (k % 2 == 1) {
			int ans = Integer.MAX_VALUE / 4;
			for (int i = 0; i < n; i++) {
				Arrays.fill(depth, 0);
				bfs(i, -1, 0, e);
				int[] depth1 = Arrays.copyOf(depth, depth.length);
				for (int v : e[i]) {

					Arrays.fill(depth, 0);
					bfs(v, -1, 0, e);

					int[] depth2 = Arrays.copyOf(depth, depth.length);
					int count = 0;
					for (int j = 0; j < n; j++) {
						if (depth1[j] > k / 2 && depth2[j] > k / 2) {
							count++;
						}
					}
					ans = Math.min(ans, count);
				}
			}
			System.out.println(ans);
		}
	}

	static int[] depth;

	static void bfs(int v, int p, int d, ArrayList<Integer>[] e) {
		ArrayDeque<P> q = new ArrayDeque<P>();
		q.add(new P(v, p, d));
		while (!q.isEmpty()) {
			P u = q.poll();
			depth[u.me] = u.depth;
			for (int i = 0; i < e[u.me].size(); i++) {
				if (e[u.me].get(i) != u.parent)
					q.add(new P(e[u.me].get(i), u.me, u.depth + 1));
			}
		}
	}

	static class P {
		int parent;
		int me;
		int depth;

		P(int me, int parent, int depth) {
			this.me = me;
			this.parent = parent;
			this.depth = depth;
		}
	}

}
