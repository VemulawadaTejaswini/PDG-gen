import java.util.*;

public class Main {
	static final long MOD = 1000000007;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextInt();
		ArrayList<Integer>[] tree = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			tree[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < n - 1; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			tree[a].add(b);
			tree[b].add(a);
		}
		boolean[] visited = new boolean[n];
		ArrayList<Integer> now = new ArrayList<>();
		now.add(0);
		long ans = 1;
		while (true) {
			ArrayList<Integer> next = new ArrayList<>();
			for (int x : now) {
				int count = 0;
				for (int y : tree[x]) {
					if (visited[y]) {
						count++;
						for (int z : tree[y]) {
							if (visited[z]) {
								count++;
							}
						}
					}
				}
				ans *= Math.max(k - count, 0);
				ans %= MOD;
				visited[x] = true;
				for (int y : tree[x]) {
					if (!visited[y]) {
						next.add(y);
					}
				}
			}
			if (next.size() == 0) {
				break;
			}
			now = next;
		}
		System.out.println(ans);
	}
}
