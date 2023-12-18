import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	static List<List<Hen>> list;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		Hen[] hens = new Hen[n - 1];
		list = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<>());
		}
		for (int i = 0; i < n - 1; i++) {
			sa = br.readLine().split(" ");
			Hen h = new Hen();
			h.a = Integer.parseInt(sa[0]) - 1;
			h.b = Integer.parseInt(sa[1]) - 1;
			h.i = i;
			hens[i] = h;
			list.get(h.a).add(h);
			list.get(h.b).add(h);
		}
		int m = Integer.parseInt(br.readLine());
		Cond[] conds = new Cond[m];
		for (int i = 0; i < m; i++) {
			sa = br.readLine().split(" ");
			Cond c = new Cond();
			c.u = Integer.parseInt(sa[0]) - 1;
			c.v = Integer.parseInt(sa[1]) - 1;
			c.i = i;
			conds[i] = c;
		}
		br.close();

		for (Cond c : conds) {
			dfs(c.u, -1, c.v, new ArrayList<>(), c);
		}

		long rem = 0;
		int end = 1 << m;
		for (int i = 1; i < end; i++) {
			Set<Integer> set = new HashSet<>();
			for (int j = 0; j < n; j++) {
				if ((i >> j & 1) == 1) {
					set.addAll(conds[j].visit);
				}
			}
			int num = n - 1 - set.size();
			long val = 1L << num;
			int cnt = Integer.bitCount(i);
			if (cnt % 2 == 1) {
				rem += val;
			} else {
				rem -= val;
			}
		}
		System.out.println((1L << n - 1) - rem);
	}

	static void dfs(int x, int p, int v, List<Integer> visit, Cond c) {
		if (x == v) {
			c.visit.addAll(visit);
			return;
		}
		for (Hen h : list.get(x)) {
			int next = h.a;
			if (next == x) {
				next = h.b;
			}
			if (next == p) {
				continue;
			}
			visit.add(h.i);
			dfs(next, x, v, visit, c);
			visit.remove(visit.size() - 1);
		}
	}

	static class Hen {
		int a, b, i;
	}

	static class Cond {
		int u, v, i;
		List<Integer> visit = new ArrayList<>();
	}
}
