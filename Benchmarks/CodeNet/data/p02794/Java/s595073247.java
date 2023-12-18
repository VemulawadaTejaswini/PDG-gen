import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	static List<List<Hen>> list;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		list = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<>());
		}
		for (int i = 0; i < n - 1; i++) {
			String[] sa = br.readLine().split(" ");
			int a = Integer.parseInt(sa[0]) - 1;
			int b = Integer.parseInt(sa[1]) - 1;
			list.get(a).add(new Hen(b, i));
			list.get(b).add(new Hen(a, i));
		}

		int m = Integer.parseInt(br.readLine());
		long[] cond = new long[m];
		for (int i = 0; i < m; i++) {
			String[] sa = br.readLine().split(" ");
			int u = Integer.parseInt(sa[0]) - 1;
			int v = Integer.parseInt(sa[1]) - 1;
			List<Integer> route = new ArrayList<>();
			dfs(u, v, -1, route);
			for (int j : route) {
				cond[i] += 1L << j;
			}
		}
		br.close();

		long ans = 0;
		int m2 = 1 << m;
		for (int i = 0; i < m2; i++) {
			long conds = 0;
			for (int j = 0; j < m; j++) {
				if ((i >> j & 1) == 1) {
					conds |= cond[j];
				}
			}
			int white = Long.bitCount(conds);
			long val = 1L << (n - 1 - white);
			int num = Integer.bitCount(i);
			if (num % 2 == 0) {
				ans += val;
			} else {
				ans -= val;
			}
		}
		System.out.println(ans);
	}

	static boolean dfs(int x, int to, int p, List<Integer> route) {
		if (x == to) {
			return true;
		}
		for (Hen h : list.get(x)) {
			if (h.v == p) {
				continue;
			}
			if (dfs(h.v, to, x, route)) {
				route.add(h.i);
				return true;
			}
		}
		return false;
	}

	static class Hen {
		int v, i;

		public Hen(int v, int i) {
			this.v = v;
			this.i = i;
		}
	}
}
