import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main implements Runnable {

	class Edge {
		int src, dst;
		long cost;

		public Edge(int src_, int dst_, long cost_) {
			src = src_;
			dst = dst_;
			cost = cost_;
		}
	}

	boolean dfs(int cur, long[] num, ArrayList<Edge>[] g) {
		boolean ret = true;
		for (Edge e : g[cur]) {
			if (num[e.dst] != -1) {
				ret &= (num[e.dst] + num[cur] == e.cost);
				continue;
			}
			num[e.dst] = e.cost - num[cur];
			ret &= num[e.dst] + num[e.dst] >= 0;
			ret &= dfs(e.dst, num, g);
		}
		return ret;
	}

	void solver(int R, int C, int N, int[] r, int[] c, int[] a) {
		ArrayList<Edge>[] g = new ArrayList[R + C];
		for (int i = 0; i < g.length; ++i) {
			g[i] = new ArrayList<>();
		}
		for (int i = 0; i < N; ++i) {
			g[r[i]].add(new Edge(r[i], c[i] + R, a[i]));
			g[c[i] + R].add(new Edge(c[i] + R, r[i], a[i]));
		}
		long[] num = new long[R + C];
		Arrays.fill(num, -1);
		for (int i = 0; i < num.length; ++i) {
			if (num[i] != -1)
				continue;
			num[i] = 0;
			if (!dfs(i, num, g)) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}

	void input() {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		int N = sc.nextInt();
		int[] r = new int[N];
		int[] c = new int[N];
		int[] a = new int[N];
		for (int i = 0; i < N; ++i) {
			r[i] = sc.nextInt();
			c[i] = sc.nextInt();
			a[i] = sc.nextInt();
			--r[i];
			--c[i];
		}
		solver(R, C, N, r, c, a);
	}

	public void run() {
		input();
	}

	public static void main(String[] args) throws FileNotFoundException {
		new Main().run();
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
