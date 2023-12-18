import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	int n, k;
	List<Integer>[] e;

	void depth(int k, boolean[] f, int[] depth, int d) {
		if (f[k]) {
			return;
		}
		f[k] = true;
		depth[k] = d;
		for (Integer to : e[k]) {
			depth(to, f, depth, d + 1);
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
		for (int i = 0; i < n - 1; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			e[a].add(b);
			e[b].add(a);
		}

		int[] depth = new int[n];
		depth(0, new boolean[n], depth, 0);
		int root = 0;
		for (int i = 0; i < n; i++) {
			if (depth[root] < depth[i]) {
				root = i;
			}
		}
		depth(root, new boolean[n], depth, 0);
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (k < depth[i]) {
				count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
