import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
	static List<List<Integer>> list;
	static int[] cnt;
	static int[] ans;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int q = Integer.parseInt(sa[1]);
		list = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<>());
		}
		for (int i = 0; i < n - 1; i++) {
			sa = br.readLine().split(" ");
			int a = Integer.parseInt(sa[0]) - 1;
			int b = Integer.parseInt(sa[1]) - 1;
			list.get(a).add(b);
			list.get(b).add(a);
		}
		cnt = new int[n];
		for (int i = 0; i < q; i++) {
			sa = br.readLine().split(" ");
			int p = Integer.parseInt(sa[0]) - 1;
			int x = Integer.parseInt(sa[1]);
			cnt[p] += x;
		}
		br.close();

		ans = new int[n];
		dfs(0, -1, 0);

		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < n; i++) {
			pw.println(ans[i]);
		}
		pw.flush();
	}

	static void dfs(int x, int p, int v) {
		v += cnt[x];
		ans[x] += v;
		for (int next : list.get(x)) {
			if (next != p) {
				dfs(next, x, v);
			}
		}
		v -= cnt[x];
	}
}
