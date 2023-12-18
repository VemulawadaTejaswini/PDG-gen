import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	static long ans = 1;
	static int n, k;
	static int mod = 1000000007;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		n = Integer.parseInt(sa[0]);
		k = Integer.parseInt(sa[1]);
		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
		map.put(-1, new ArrayList<Integer>());
		map.put(0, new ArrayList<Integer>());
		for (int i = 0; i < n - 1; i++) {
			sa = br.readLine().split(" ");
			int a = Integer.parseInt(sa[0]) - 1;
			int b = Integer.parseInt(sa[1]) - 1;

			List<Integer> list1 = map.get(a);
			if (list1 == null) {
				list1 = new ArrayList<Integer>();
				map.put(a, list1);
			}
			list1.add(b);

			List<Integer> list2 = map.get(b);
			if (list2 == null) {
				list2 = new ArrayList<Integer>();
				map.put(b, list2);
			}
			list2.add(a);
		}
		br.close();

		int[] cnt = new int[100005];
		dfs(map, 0, -1, 2, cnt);
		System.out.println(ans);
	}

	static void dfs(Map<Integer, List<Integer>> map, int c, int p, int dep, int[] cnt) {
		int x = Math.min(cnt[dep - 2], 1) + Math.min(cnt[dep - 1], 1) + cnt[dep];
		int y = Math.max(k - x, 0);
		ans *= y;
		ans %= mod;
		cnt[dep]++;

		List<Integer> list = map.get(c);
		for (int i : list) {
			if (i != p) {
				dfs(map, i, c, dep + 1, cnt);
			}
		}
		dep--;
		cnt[dep + 2] = 0;
	}
}
