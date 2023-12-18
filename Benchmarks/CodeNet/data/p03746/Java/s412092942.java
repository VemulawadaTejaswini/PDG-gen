import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	void run() throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[m];
		int[] b = new int[m];
		for (int i = 0; i < m; ++i) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			--a[i];
			--b[i];
		}

		ArrayList<Integer>[] g = new ArrayList[n];
		for (int i = 0; i < n; ++i) {
			g[i] = new ArrayList<>();
		}

		for (int i = 0; i < m; ++i) {
			g[a[i]].add(b[i]);
			g[b[i]].add(a[i]);
		}

		boolean[] vis = new boolean[n];

		int s = 0;
		int t = 0;
		ArrayDeque<Integer> que = new ArrayDeque<>();
		que.add(0);
		vis[0] = true;
		for (boolean update = true; update;) {
			update = false;
			for (int dst : g[s]) {
				if (vis[dst])
					continue;
				que.addFirst(dst);
				vis[dst] = true;
				s = dst;
				update = true;
				break;
			}
			for (int dst : g[t]) {
				if (vis[dst])
					continue;
				que.addLast(dst);
				vis[dst] = true;
				t = dst;
				update = true;
				break;
			}
		}
		System.out.println(que.size());
		while (!que.isEmpty()) {
			System.out.print(que.pollFirst() + 1);
			if (!que.isEmpty()) {
				System.out.print(" ");
			} else {
				System.out.println();
			}
		}
	}
}