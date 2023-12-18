import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static long[] ans;
	static boolean[] seen;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int Q = in.nextInt();
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>() {
			{
				for (int i = 0; i < N; i++) {
					add(new ArrayList<Integer>());
				}
			}
		};
		for (int i = 0; i < N - 1; i++) {
			int a = in.nextInt() - 1;
			int b = in.nextInt() - 1;
			list.get(a).add(b);
			list.get(b).add(a);
		}
		ans = new long[N];
		seen = new boolean[N];
		for (int i = 0; i < Q; i++) {
			ans[in.nextInt() - 1] += in.nextInt();
		}
		dfs(list, 0, -1);
		for (int i = 0; i < ans.length; i++) {
			if (i == ans.length - 1) {
				System.out.println(ans[i]);
			} else {
				System.out.print(ans[i] + " ");
			}
		}
		in.close();
	}

	static void dfs(ArrayList<ArrayList<Integer>> list, int v, int p) {
		seen[v] = true;
		if (p != -1) {
			ans[v] += ans[p];
		}
		for (Integer nv : list.get(v)) {
			if (seen[nv] == true) {
				continue;
			}
			dfs(list, nv, v);
		}
	}
}