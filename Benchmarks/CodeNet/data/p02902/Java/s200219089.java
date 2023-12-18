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
		List<List<Integer>> list = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<>());
		}
		for (int i = 0; i < m; i++) {
			sa = br.readLine().split(" ");
			int a = Integer.parseInt(sa[0]) - 1;
			int b = Integer.parseInt(sa[1]) - 1;
			list.get(a).add(b);
		}
		br.close();

		int ans = n + 1;
		int idx = -1;
		for (int i = 0; i < n; i++) {
			Queue<Integer> que = new ArrayDeque<>();
			que.add(i);
			int[] d = new int[n];
			Arrays.fill(d, n + 1);
			d[i] = 0;
			label:
			while (!que.isEmpty()) {
				Integer cur = que.poll();
				List<Integer> list2 = list.get(cur);
				for (int next : list2) {
					int alt = d[cur] + 1;
					if (next == i) {
						if (alt < ans) {
							ans = alt;
							idx = i;
						}
						break label;
					}
					if (d[next] == n + 1) {
						que.add(next);
						d[next] = alt;
					}
				}
			}
		}
		if (ans == n + 1) {
			System.out.println(-1);
		} else {
			System.out.println(ans);
			Queue<List<Integer>> que = new ArrayDeque<>();
			List<Integer> listA = new ArrayList<>();
			listA.add(idx);
			que.add(listA);
			while (!que.isEmpty()) {
				List<Integer> cur = que.poll();
				List<Integer> list2 = list.get(cur.get(cur.size() - 1));
				for (int next : list2) {
					if (next == idx) {
						for (int i : cur) {
							System.out.println(i + 1);
						}
						return;
					}
					List<Integer> listN = new ArrayList<>(cur.size() + 1);
					listN.addAll(cur);
					listN.add(next);
					que.add(listN);
				}
			}
		}
	}
}
