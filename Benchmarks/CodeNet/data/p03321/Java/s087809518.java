import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);

		List<Set<Integer>> list = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			Set<Integer> set = new HashSet<>();
			for (int j = 0; j < n; j++) {
				if (i != j) {
					set.add(j);
				}
			}
			list.add(set);
		}
		for (int i = 0; i < m; i++) {
			sa = br.readLine().split(" ");
			int a = Integer.parseInt(sa[0]) - 1;
			int b = Integer.parseInt(sa[1]) - 1;
			list.get(a).remove(b);
			list.get(b).remove(a);
		}
		br.close();

		List<Integer> g1 = new ArrayList<>();
		List<Integer> g2 = new ArrayList<>();
		int[] grp = new int[n];
		for (int i = 0; i < n; i++) {
			if (grp[i] != 0) {
				continue;
			}
			Queue<Integer> que = new ArrayDeque<>();
			que.add(i);
			grp[i] = 1;
			int cnt1 = 1;
			int cnt2 = 0;
			while (!que.isEmpty()) {
				int cur = que.poll();
				for (int next : list.get(cur)) {
					if (grp[next] == 0) {
						grp[next] = 3 - grp[cur];
						que.add(next);
						if (grp[next] == 1) {
							cnt1++;
						} else {
							cnt2++;
						}
					} else if (grp[next] == grp[cur]) {
						System.out.println(-1);
						return;
					}
				}
			}
			g1.add(cnt1);
			g2.add(cnt2);
		}

		boolean[] dp = new boolean[n + 1];
		dp[0] = true;
		for (int i = 0; i < g1.size(); i++) {
			for (int j = n - 1; j >= 0; j--) {
				if (dp[j]) {
					dp[j + g1.get(i)] = true;
					dp[j + g2.get(i)] = true;
				}
			}
		}

		int ans = Integer.MAX_VALUE;
		for (int i = 0; i <= n; i++) {
			if (dp[i]) {
				int val1 = i * (i - 1) / 2;
				int val2 = (n - i) * (n - i - 1) / 2;
				ans = Math.min(ans, val1 + val2);
			}
		}
		System.out.println(ans);
	}
}
