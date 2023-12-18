import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] in = new int[n];
		List<Integer>[] es = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			es[i] = new ArrayList<>();
		}

		for (int i = 0; i < m; i++) {
			int x = sc.nextInt() - 1;
			int y = sc.nextInt() - 1;
			es[x].add(y);
			in[y]++;
		}

		int answer = 0;
		for (int i = 0; i < n; i++) {
			if (in[i] != 0) continue;
			answer = Math.max(answer, dfs(i, es));
		}

		System.out.println(answer);
	}

	private static int dfs(int v, List<Integer>[] es) {
		if (es[v].size() == 0) return 0;
		int a = 0;
		for (int e = 0; e < es[v].size(); e++) {
			a = Math.max(dfs(es[v].get(e), es), a);
		}
		return a + 1;
	}
}
