import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	static int n;
	static List<List<Integer>> list;
	static int[] a, ans, val;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		String[] sa = br.readLine().split(" ");
		a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		list = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<>());
		}
		for (int i = 0; i < n - 1; i++) {
			sa = br.readLine().split(" ");
			int u = Integer.parseInt(sa[0]) - 1;
			int v = Integer.parseInt(sa[1]) - 1;
			list.get(u).add(v);
			list.get(v).add(u);
		}
		br.close();

		ans = new int[n];
		val = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			val[i] = Integer.MAX_VALUE;
		}
		dfs(0, -1, 1);

		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < n; i++) {
			pw.println(ans[i]);
		}
		pw.flush();
	}

	static void dfs(int x, int p, int dep) {
		int idx = Arrays.binarySearch(val, a[x]);
		if (idx < 0) idx = ~idx;
		int bk = val[idx];
		val[idx] = a[x];

		int lis = Arrays.binarySearch(val, Integer.MAX_VALUE - 1);
		if (lis < 0) {
			lis = ~lis;
			lis--;
		}
		ans[x] = lis;

		for (int next : list.get(x)) {
			if (next != p) {
				dfs(next, x, dep + 1);
			}
		}
		val[idx] = bk;
	}
}
