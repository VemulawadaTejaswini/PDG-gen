import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Main {
	static List<Integer> path;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<List<Integer>> list = new ArrayList<List<Integer>>(n);
		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<Integer>());
		}
		for (int i = 0; i < n - 1; i++) {
			String[] sa = br.readLine().split(" ");
			int a = Integer.parseInt(sa[0]) - 1;
			int b = Integer.parseInt(sa[1]) - 1;
			list.get(a).add(b);
			list.get(b).add(a);
		}
		br.close();

		List<Integer> path2 = new ArrayList<Integer>();
		path2.add(0);
		dfs(list, path2, n - 1);
		int x = (path.size() + 1) / 2;

		boolean[] flg1 = new boolean[n];
		flg1[path.get(x)] = true;
		int cnt1 = 0;
		Queue<Integer> que1 = new ArrayDeque<Integer>();
		for (int i = 0; i < x; i++) {
			int o = path.get(i);
			que1.add(o);
			flg1[o] = true;
			cnt1++;
		}
		while (!que1.isEmpty()) {
			Integer cur = que1.poll();
			for (int o : list.get(cur)) {
				if (!flg1[o]) {
					que1.add(o);
					flg1[o] = true;
					cnt1++;
				}
			}
		}

		boolean[] flg2 = new boolean[n];
		flg2[path.get(x - 1)] = true;
		int cnt2 = 0;
		Queue<Integer> que2 = new ArrayDeque<Integer>();
		for (int i = x; i < path.size(); i++) {
			int o = path.get(i);
			que2.add(o);
			flg2[o] = true;
			cnt2++;
		}
		while (!que2.isEmpty()) {
			Integer cur = que2.poll();
			for (int o : list.get(cur)) {
				if (!flg2[o]) {
					que2.add(o);
					flg2[o] = true;
					cnt2++;
				}
			}
		}

		if (cnt1 > cnt2) {
			System.out.println("Fennec");
		} else {
			System.out.println("Snuke");
		}
	}

	static void dfs(List<List<Integer>> list, List<Integer> path, int n) {
		int cur = path.get(path.size() - 1);
		if (cur == n) {
			List<Integer> path2 = new ArrayList<Integer>();
			path2.addAll(path);
			Main.path = path2;
		}

		int pre = 0;
		if (path.size() > 1) {
			pre = path.get(path.size() - 2);
		}
		for (int i : list.get(cur)) {
			if (i != pre) {
				path.add(i);
				dfs(list, path, n);
				path.remove(path.size() - 1);
			}
		}
	}
}
