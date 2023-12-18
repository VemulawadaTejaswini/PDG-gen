import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Main {
	static int n, m;
	static char[] s;
	static List<List<Integer>> list;
	static boolean[][] ng;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		n = Integer.parseInt(sa[0]);
		m = Integer.parseInt(sa[1]);
		s = br.readLine().toCharArray();
		list = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<>());
		}
		for (int i = 0; i < m; i++) {
			sa = br.readLine().split(" ");
			int a = Integer.parseInt(sa[0]) - 1;
			int b = Integer.parseInt(sa[1]) - 1;
			list.get(a).add(b);
			if (a != b) {
				list.get(b).add(a);
			}
		}
		br.close();

		ng = new boolean[n][2];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2; j++) {
				if (!ng[i][j]) {
					if (dfs(i * 10 + j, new LinkedHashSet<>())) {
						System.out.println("Yes");
						return;
					}
				}
			}
		}
		System.out.println("No");
	}

	static boolean dfs(int x, LinkedHashSet<Integer> his) {
		int cur = x / 10;
		int t = x % 10;
		char nc = s[cur];
		if (t == 1) {
			nc = (char) ('A' + 'B' - s[cur]);
		}
		int nt = 1 - t;
		for (int next : list.get(cur)) {
			if (s[next] == nc) {
				int nx = next * 10 + nt;
				if (his.contains(nx)) {
					return true;
				}
				if (!ng[next][nt]) {
					his.add(nx);
					if (dfs(nx, his)) {
						return true;
					}
					his.remove(nx);
				}
			}
		}
		ng[cur][t] = true;
		return false;
	}
}
