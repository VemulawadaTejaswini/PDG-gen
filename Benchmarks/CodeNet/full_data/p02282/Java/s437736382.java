
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		new Main().run();
	}

	private void run() throws NumberFormatException, IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] pre = new int[n][2];
		for (int i = 0; i < n; i++) {
			pre[i][0] = scanner.nextInt();
		}
		for (int i = 0; i < n; i++) {
			int t = scanner.nextInt();
			for (int j = 0; j < n; j++) {
				if (pre[j][0] == t) {
					pre[j][1] = i;
				}
			}
		}
		rec(0, n, pre);

	}

	int pos = 0;

	private void rec(int l, int r, int[][] pre) {
		if (l >= r)
			return;
		int root = pre[pos][0];
		int m = pre[pos][1];
		pos++;
		rec(l, m, pre);
		rec(m + 1, r, pre);
		System.out.print(root);
		System.out.print(root == pre[0][0] ? '\n' : ' ');
	}
}