import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		List<List<Integer>> list = new ArrayList<List<Integer>>(n);
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<Integer>());
			set.add(i);
		}
		for (int i = 0; i < m; i++) {
			sa = br.readLine().split(" ");
			int x = Integer.parseInt(sa[0]) - 1;
			int y = Integer.parseInt(sa[1]) - 1;
			list.get(x).add(y);
			set.remove(y);
		}
		br.close();

		int[] maxs = new int[n];
		for (int i : set) {
			List<Integer> work = new ArrayList<Integer>();
			work.add(i);
			dfs(list, maxs, work);
		}

		int ans = 0;
		for (int i = 0; i < n; i++) {
			ans = Math.max(ans, maxs[i]);
		}
		System.out.println(ans);
	}

	static int dfs(List<List<Integer>> list, int[] maxs, List<Integer> work) {
		int now = work.get(work.size() - 1);
		List<Integer> nexts = list.get(now);
		if (nexts.isEmpty()) {
			for (int i = 0; i < work.size(); i++) {
				maxs[work.get(i)] = Math.max(maxs[work.get(i)], work.size() - 1 - i);
			}
			return maxs[now];
		}

		int max = 0;
		int idx = 0;
		for (int i = 0; i < nexts.size(); i++) {
			work.add(nexts.get(i));
			int ret = dfs(list, maxs, work);
			if (ret > max) {
				max = ret;
				idx = i;
			}
			work.remove(work.size() - 1);
		}
		for (int i = nexts.size() - 1; i >= 0; i--) {
			if (i != idx) {
				nexts.remove(i);
			}
		}
		return maxs[now];
	}
}
