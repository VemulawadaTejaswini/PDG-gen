import java.util.Arrays;
import java.util.Scanner;

public class Main {
	int MAX = 'Z' - 'A' + 1;
	int n;
	int[] inDeg, outDeg, vis;
	int[][] nei;

	boolean check() {
		for (int i = 0; i < MAX; i++) {
			if (vis[i] != 1) {
				return false;
			}
		}
		int cnt = 0;
		for (int i = 0; i < MAX; i++) {
			if (inDeg[i] != outDeg[i]) {
				return false;
			}
		}

		return true;
	}

	void dfs(int k) {
		if (vis[k] == 1) {
			return;
		}
		vis[k] = 1;
		for (int i = 0; i < MAX; i++) {
			if (0 < nei[k][i]) {
				dfs(i);
			}
		}
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}

			int s = 0;
			inDeg = new int[MAX];
			outDeg = new int[MAX];
			vis = new int[MAX];
			nei = new int[MAX][MAX];
			Arrays.fill(vis, 1);
			for (int i = 0; i < n; i++) {
				char[] c = sc.next().toCharArray();
				int u = c[0] - 'a';
				int v = c[c.length - 1] - 'a';
				outDeg[u]++;
				inDeg[v]++;
				nei[u][v] = 1;
				vis[u] = vis[v] = -1;
				s = u;
			}

			dfs(s);
			if (check()) {
				System.out.println("OK");
			} else {
				System.out.println("NG");
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}