import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N;
	static int[] B;
	static int[] count;
	static boolean[][] g;
	static boolean[] used;

	public static void main(String[] args) {
		while (true) {
			N = sc.nextInt();
			if (N == 0) break;
			Country[] cs = new Country[N];
			used = new boolean[N];
			B = new int[N];
			count = new int[N];
			for (int i = 0; i < N; ++i) {
				cs[i] = new Country();
				B[i] = cs[i].b;
			}
			used[0] = true;
			g = new boolean[N][N];
			for (int i = 0; i < N; ++i) {
				for (String o : cs[i].c) {
					for (int j = 0; j < N; ++j) {
						if (o.equals(cs[j].a)) {
							g[i][j] = true;
							if (i == 0) used[j] = true;
							break;
						}
					}
				}
			}
			int ans = B[0];
			for (int i = 0; i < N; ++i) {
				if (!used[i]) ans += solve(i);
			}
			System.out.println(ans);
		}
	}

	static int solve(int cur) {
		int pos = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(cur);
		used[cur] = true;
		while (pos < list.size()) {
			int c = list.get(pos++);
			for (int i = 0; i < N; ++i) {
				if (g[c][i] && !used[i]) {
					used[i] = true;
					list.add(i);
				}
			}
		}
		return dfs(0, list);
	}

	static int dfs(int pos, ArrayList<Integer> list) {
		if (pos == list.size()) return 0;
		int ret = 0;
		int cur = list.get(pos);

		// use cur
		if (count[cur] == 0) {
			int sum = B[cur];
			for (int i = pos + 1; i < list.size(); ++i) {
				if (g[cur][list.get(i)]) {
					count[list.get(i)]++;
				}
			}
			sum += dfs(pos + 1, list);
			for (int i = pos + 1; i < list.size(); ++i) {
				if (g[cur][list.get(i)]) {
					count[list.get(i)]--;
				}
			}
			ret = sum;
		}

		// not use cur
		ret = Math.max(ret, dfs(pos + 1, list));

		return ret;
	}

	static class Country {
		String a;
		int b;
		String[] c;

		Country() {
			a = sc.next();
			b = sc.nextInt();
			int cc = sc.nextInt();
			c = new String[cc];
			for (int i = 0; i < cc; ++i) {
				c[i] = sc.next();
			}
		}
	}
}