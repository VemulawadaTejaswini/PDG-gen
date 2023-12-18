import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		List<Integer>[] tree = new List[n]; //adjacency list
		for (int i = 0; i < n; i++) {
			tree[i] = new ArrayList<Integer>();
		}
		for (int i = 0, a, b; i < n - 1; i++) {
			a = scanner.nextInt() - 1;
			b = scanner.nextInt() - 1;
			tree[a].add(b);
			tree[b].add(a);
		}
		int[] distance = new int[n];
		for (int i = 1; i < n; i++) {
			distance[i] = -1;
		}
		dfs(tree, 0, distance);
		int even = 0;
		for (int i = 0; i < n; i++) {
			if (distance[i] % 2 == 0)
				even++;
		}

		int[] number = { 1, 0, 0 };

		if (even <= n / 3) {
			for (int i = 0; i < n; i++) {
				if (distance[i] % 2 == 0) {
					System.out.print(poll(0, 0, 0, n));
				} else {
					System.out.print(poll(1, 2, 0, n));
				}
				System.out.print(i == n - 1 ? "\n" : " ");
			}
		}
		if (n - even <= n / 3) {
			for (int i = 0; i < n; i++) {
				if (distance[i] % 2 != 0) {
					System.out.print(poll(0, -1, -1, n));
				} else {
					System.out.print(poll(1, 2, 0, n));
				}
				System.out.print(i == n - 1 ? "\n" : " ");
			}
		} else {
			for (int i = 0; i < n; i++) {
				if (distance[i] % 2 == 0) {
					System.out.print(poll(1, 0, -1, n));
				} else {
					System.out.print(poll(2, 0, -1, n));
				}
				System.out.print(i == n - 1 ? "\n" : " ");
			}
		}

	}

	static void dfs(List<Integer>[] tree, int v, int[] distance) {
		for (int nv : tree[v]) {
			if (distance[nv] < 0) {
				distance[nv] = distance[v] + 1;
				dfs(tree, nv, distance);
			}
		}
	}

	static int[] number = { 1, 0, 0 };

	static int poll(int first, int second, int third, int n) {
		if (number[first] * 3 + first <= n) {
			number[first]++;
			return number[first] * 3 + first - 3;
		}
		return poll(second, third, first, n);
	}

}
