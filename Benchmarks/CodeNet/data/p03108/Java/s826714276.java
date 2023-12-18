import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	//Union-Find

	// 根の場合、-（グループのサイズ）
	int[] par;

	private int root(int x) {
		while (par[x] >= 0) {
			x = par[x];
		}
		return x;
	}

	private void unite(int x, int y) {
		int rx = root(x);
		int ry = root(y);
		if (x != y) {
			par[ry] += par[rx]; //サイズを更新
			par[rx] = ry;
		}
	}

	private boolean same(int x, int y) {
		return root(x) == root(y);
	}

	private int size(int x) {
		return -par[root(x)];
	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[m];
		int[] b = new int[m];

		for (int i = 0; i < m; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}

		// すべて根として初期化
		par = new int[n + 1];
		for (int i = 0; i < par.length; i++) {
			par[i] = -1;
		}

		long[] ans = new long[m];

		ans[m - 1] = (n * (n - 1) / 2);

		for (int i = m - 1; i > 0; i--) {
			ans[i - 1] = ans[i];
			if (!same(a[i], b[i])) {
				ans[i - 1] -= (long) size(a[i]) * size(b[i]);
				unite(a[i], b[i]);
			}
		}

		for (int i = 0; i < ans.length; i++) {
			out.println(ans[i]);
		}

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
