import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	static List<List<Integer>> list;
	static boolean[] visit;
	static int mx = 100001;
	static int mx2 = 200003;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		list = new ArrayList<>(mx2);
		for (int i = 0; i < mx2; i++) {
			list.add(new ArrayList<>());
		}
		for (int i = 0; i < n; i++) {
			sa = br.readLine().split(" ");
			int x = Integer.parseInt(sa[0]);
			int y = Integer.parseInt(sa[1]) + mx;
			list.get(x).add(y);
			list.get(y).add(x);
		}
		br.close();

		long ans = 0;
		visit = new boolean[mx2];
		for (int i = 1; i < mx2; i++) {
			if (!visit[i]) {
				int[] cnt = dfs(i, 0, new int[3]);
				ans += Math.max((long) cnt[0] * cnt[1] - cnt[2], 0);
			}
		}
		System.out.println(ans);
	}

	static int[] dfs(int cur, int p, int[] cnt) {
		visit[cur] = true;
		cnt[cur / mx]++;
		for (int next : list.get(cur)) {
			if (next != p && !visit[next]) {
				cnt[2]++;
				dfs(next, cur, cnt);
			}
		}
		return cnt;
	}
}
