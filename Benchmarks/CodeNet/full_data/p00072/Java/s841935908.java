import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static int[][][] getAdjecentListWithCounter(int n, int[] from, int[] to, int[] w) {
		int[][][] e = new int[n][][];
		int[] d = new int[n];
		for (int f : from)
			d[f]++;
		for (int t : to)
			d[t]++;
		for (int i = 0; i < n; i++)
			e[i] = new int[d[i]][2];
		for (int i = 0; i < from.length; i++) {
			--d[from[i]];
			e[from[i]][d[from[i]]][0] = to[i];
			e[from[i]][d[from[i]]][1] = w[i];
			--d[to[i]];
			e[to[i]][d[to[i]]][0] = from[i];
			e[to[i]][d[to[i]]][1] = w[i];
		}
		return e;
	}

	public static int prim(int[][][] adj, int nodes, int s) {
		final int[] d = new int[nodes];
		Arrays.fill(d, 0);
		TreeSet<int[]> ts = new TreeSet<int[]>(new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return (d[a[0]] != d[b[0]]) ? (d[a[0]] - d[b[0]]) : (a[1] - b[1]);
			}
		});
		d[s] = 1;
		for (int[] e : adj[s]) {
			ts.add(e);
		}
		int w = 0;
		while (!ts.isEmpty()) {
			int[] ne = ts.pollFirst();
			if (d[ne[0]] == 1)
				break;
			d[ne[0]] = 1;
			w += ne[1];
			for (int[] e : adj[ne[0]]) {
				ts.add(e);
			}
		}
		return w;
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in).useDelimiter("[^0-9]+");
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			int m = sc.nextInt();
			int[] f = new int[m];
			int[] t = new int[m];
			int[] w = new int[m];
			for (int i = 0; i < m; i++) {
				f[i] = sc.nextInt();
				t[i] = sc.nextInt();
				w[i] = sc.nextInt() / 100 - 1;
			}
			int[][][] g = getAdjecentListWithCounter(n, f, t, w);
			System.out.println(prim(g, n, 0));
		}
	}
}