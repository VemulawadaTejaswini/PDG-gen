import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	static long[] x;
	static boolean[] fix;
	static List<List<Hen>> list;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		list = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<>());
		}
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < m; i++) {
			sa = br.readLine().split(" ");
			Hen h = new Hen();
			h.l = Integer.parseInt(sa[0]) - 1;
			h.r = Integer.parseInt(sa[1]) - 1;
			h.d = Integer.parseInt(sa[2]);
			list.get(h.l).add(h);
			list.get(h.r).add(h);
			set.add(h.l);
		}
		br.close();

		x = new long[n];
		fix = new boolean[n];
		for (int i : set) {
			if (!fix[i]) {
				fix[i] = true;
				x[i] = 0L;
				if (!dfs(i)) {
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");
	}

	static boolean dfs(int cur) {
		for (Hen h : list.get(cur)) {
			int next = h.r;
			int d = h.d;
			if (cur == h.r) {
				next = h.l;
				d = -d;
			}
			if (!h.used) {
				h.used = true;
				if (!fix[next]) {
					fix[next] = true;
					x[next] = x[cur] + d;
				} else {
					if (x[next] - x[cur] != d) {
						return false;
					}
				}
				if (!dfs(next)) {
					return false;
				}
			}
		}
		return true;
	}

	static class Hen {
		int l, r, d;
		boolean used;
	}
}
