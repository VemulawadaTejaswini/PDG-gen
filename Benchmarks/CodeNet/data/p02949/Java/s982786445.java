import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		int p = Integer.parseInt(sa[2]);
		List<List<Hen>> list1 = new ArrayList<>(n);
		List<List<Hen>> listn = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			list1.add(new ArrayList<>());
			listn.add(new ArrayList<>());
		}
		Hen[] arr = new Hen[m];
		for (int i = 0; i < m; i++) {
			sa = br.readLine().split(" ");
			Hen h = new Hen();
			h.a = Integer.parseInt(sa[0]) - 1;
			h.b = Integer.parseInt(sa[1]) - 1;
			h.c = -Integer.parseInt(sa[2]) + p;
			arr[i] = h;
			list1.get(h.a).add(h);
			listn.get(h.b).add(h);
		}
		br.close();

		boolean[] visit1 = new boolean[n];
		Queue<Integer> que = new ArrayDeque<>();
		que.add(0);
		visit1[0] = true;
		while (!que.isEmpty()) {
			int cur = que.poll();
			for (Hen h : list1.get(cur)) {
				if (!visit1[h.b]) {
					que.add(h.b);
					visit1[h.b] = true;
				}
			}
		}

		boolean[] visitn = new boolean[n];
		que = new ArrayDeque<>();
		que.add(n - 1);
		visitn[n - 1] = true;
		while (!que.isEmpty()) {
			int cur = que.poll();
			for (Hen h : listn.get(cur)) {
				if (!visitn[h.a]) {
					que.add(h.a);
					visitn[h.a] = true;
				}
			}
		}

		boolean[] visit = new boolean[n];
		for (int i = 0; i < n; i++) {
			visit[i] = visit1[i] && visitn[i];
		}

		long[] d = new long[n];
		Arrays.fill(d, Integer.MAX_VALUE);
		d[0] = 0;
		boolean upd = true;
		for (int i = 0; i <= n && upd; i++) {
			upd = false;
			for (Hen h : arr) {
				if (!visit[h.a] || !visit[h.b]) {
					continue;
				}
				long alt = d[h.a] + h.c;
				if (d[h.b] > alt) {
					d[h.b] = alt;
					upd = true;
				}
			}
			if (i == n) {
				System.out.println(-1);
				return;
			}
		}
		System.out.println(Math.max(-d[n - 1], 0));
	}

	static class Hen {
		int a, b, c;
	}
}
