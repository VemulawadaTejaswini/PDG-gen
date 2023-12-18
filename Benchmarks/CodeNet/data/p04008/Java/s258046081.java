import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	int n, k;
	List<Integer>[] e;

	void dfs(int num, boolean[] f, int dep, int[] depth) {
		if (f[num]) {
			return;
		}
		f[num] = true;
		depth[num] = dep;
		for (Integer to : e[num]) {
			dfs(to, f, dep + 1, depth);
		}
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		k = sc.nextInt();
		e = new LinkedList[n];
		for (int i = 0; i < n; i++) {
			e[i] = new LinkedList<Integer>();
		}
		int tmp = sc.nextInt() - 1;
		for (int i = 1; i < n; i++) {
			int t = sc.nextInt() - 1;
			e[t].add(i);
		}

		boolean[] f = new boolean[n];
		int[] depth = new int[n];
		dfs(0, f, 0, depth);

		int count = 0;
		if (tmp != 0) {
			count++;
		}
		for (int i = 1; i < n; i++) {
			if (depth[i] % (k + 1) == 0) {
				count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
