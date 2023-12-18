import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	List<Integer>[] e;

	void dfs(int k, boolean[] flag, int[] depth, int dep, boolean[] delete) {
		if (flag[k] || delete[k]) {
			return;
		}
		flag[k] = true;
		depth[k] = dep;
		for (Integer to : e[k]) {
			dfs(to, flag, depth, dep + 1, delete);
		}
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		e = new LinkedList[n];
		for (int i = 0; i < n; i++) {
			e[i] = new LinkedList<Integer>();
		}
		for (int i = 0; i < n - 1; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			e[a].add(b);
			e[b].add(a);
		}

		boolean[] delete = new boolean[n];
		boolean loop = true;

		while (loop) {
			loop = false;
			int[] depth = new int[n];
			Arrays.fill(depth, 10000);
			boolean[] flag = new boolean[n];
			int root = 0;
			for (int i = 0; i < n; i++) {
				if (!delete[i]) {
					root = i;
					break;
				}
			}
			depth[root] = 0;
			dfs(root, flag, depth, 0, delete);

			//			System.out.println("root: " + (root + 1));
			//			System.out.println("depth1: " + Arrays.toString(depth));
			//			System.out.println("delete: " + Arrays.toString(delete));

			for (int i = 0; i < n; i++) {
				if (!delete[i] && depth[root] < depth[i]) {
					root = i;
				}
			}
			Arrays.fill(flag, false);
			Arrays.fill(depth, 10000);
			dfs(root, flag, depth, 0, delete);
			//			System.out.println("root: " + (root + 1));
			//			System.out.println("depth2: " + Arrays.toString(depth));
			int max = 0;
			for (int i = 0; i < n; i++) {
				if (!delete[i]) {
					max = Math.max(max, depth[i]);
				}
			}
			if (k < max) {
				for (int i = 0; i < n; i++) {
					if (!delete[i] && depth[i] == max) {
						delete[i] = true;
						loop = true;
					}
				}
			}
			//			System.out.println("delete: " + Arrays.toString(delete));
			//			System.out.println();
		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
			if (delete[i]) {
				sum++;
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
