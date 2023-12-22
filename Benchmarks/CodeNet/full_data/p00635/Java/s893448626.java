
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			n = scanner.nextInt();
			if (n == 0)
				break;
			d = new int[n][n];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++)
					d[i][j] = scanner.nextInt();
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++)
					d[i][j] = Math.max(d[i][j], d[j][i]);
			ans = INF;
			used = new boolean[n];
			pos = new int[n];
			dfs(0);
			System.out.println(ans);
		}
	}

	private void dfs(int right) {
		if (right >= ans)
			return;
		int a = 0, b = 0;
		int[] na = new int[n], nb = new int[n];
		for (int i = 0; i < n; i++)
			if (!used[i])
				na[a++] = i;
			else
				nb[b++] = i;

		if(a==0){
			ans = right;
			return;
		}
		for (int i = 0; i < a; i++) {
			int u = na[i];
			for (int j = 0; j < b; j++) {
				int v = nb[j];
				pos[u] = Math.max(pos[u], pos[v] + d[v][u]);
			}
			used[u] = true;
			dfs(pos[u]);
			used[u] = false;
			pos[u] = 0;
		}
	}

	int n, ans;
	int[] pos;
	int[][] d;
	int INF = 1 << 30;
	boolean[] used;
}