
import java.io.IOException;
import java.util.BitSet;
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
			int max = 0;
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++) {
					d[i][j] = Math.max(d[i][j], d[j][i]);
					max = Math.max(max, d[i][j]);
				}
			ans = INF;
			pos = new int[n];
			bitSet = new BitSet();
			dfs(0);
			System.out.println(ans);
		}
	}

	private void dfs(int right) {
		if (ans <= right)
			return;

		if (bitSet.cardinality() == n) {
			ans = right;
			return;
		}
		for (int i = 0; i < n; i++) {
			if (bitSet.get(i))
				continue;
			
			for (int j = 0; j < n; j++) {
				if (bitSet.get(j))
					pos[i] = Math.max(pos[i], pos[j] + d[j][i]);
			}
			bitSet.set(i);
			dfs(pos[i]);
			bitSet.clear(i);
			pos[i] = 0;
		}
	}

	int n, ans;
	int[] pos;
	int[][] d;
	int INF = 1 << 30;
	BitSet bitSet;
}