import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	static int n, m;
	static List<List<Hen>> list;
	static long[] x;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		n = Integer.parseInt(sa[0]);
		m = Integer.parseInt(sa[1]);
		Hen[] arr = new Hen[m];
		list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<>());
		}
		for (int i = 0; i < m; i++) {
			sa = br.readLine().split(" ");
			Hen h = new Hen();
			h.i = i;
			h.l = Integer.parseInt(sa[0]) - 1;
			h.r = Integer.parseInt(sa[1]) - 1;
			h.d = Integer.parseInt(sa[2]);
			arr[i] = h;
			list.get(h.l).add(h);
			list.get(h.r).add(h);
		}
		br.close();

		x = new long[n];
		Arrays.fill(x, Long.MIN_VALUE);
		for (int i = 0; i < n; i++) {
			if (x[i] == Long.MIN_VALUE) {
				x[i] = 0;
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
			if (!h.used) {
				h.used = true;
				int next = h.l;
				long nx = x[cur] + h.d;
				if (next == cur) {
					next = h.r;
					nx = x[cur] - h.d;
				}
				if (x[next] == Long.MIN_VALUE) {
					x[next] = nx;
					if (!dfs(next)) {
						return false;
					}
				} else {
					if (x[next] != nx) {
						return false;
					}
				}
			}
		}
		return true;
	}

	static class Hen {
		int i, l, r, d;
		boolean used;
	}
}
