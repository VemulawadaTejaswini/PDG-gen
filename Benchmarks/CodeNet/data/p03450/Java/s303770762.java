import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		List<List<Hen>> list = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<>());
		}
		for (int i = 0; i < m; i++) {
			sa = br.readLine().split(" ");
			Hen h = new Hen();
			h.l = Integer.parseInt(sa[0]) - 1;
			h.r = Integer.parseInt(sa[1]) - 1;
			h.d = Integer.parseInt(sa[2]);
			list.get(h.l).add(h);
			list.get(h.r).add(h);
		}
		br.close();

		long[] x = new long[n];
		boolean[] fix = new boolean[n];
		for (int i = 0; i < n; i++) {
			if (!fix[i]) {
				fix[i] = true;
				x[i] = 0L;
				Queue<Integer> que = new ArrayDeque<>();
				que.add(i);
				while (!que.isEmpty()) {
					int cur = que.poll();
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
								que.add(next);
							} else {
								if (x[next] - x[cur] != d) {
									System.out.println("No");
									return;
								}
							}
						}
					}
				}
			}
		}
		System.out.println("Yes");
	}

	static class Hen {
		int l, r, d;
		boolean used;
	}
}
