import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// 無向グラフ
//人をグルーピングする。これが連結関係を表す。
//UNIONFIND. unite(a,b)でa,bのグループを結合する。大きいグループに小さいグループをくっつける。
//find(a)でaの根を求める。a自身が根の場合、-aとする。

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		UnionFind uf = new UnionFind(n);

		int[] deg = new int[100005];
		List<Integer>[] to = new List[n];
		for (int i = 0; i < n; i++) {
			to[i] = new ArrayList<>();
		}

		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			a--;
			b--;
			deg[a]++;
			deg[b]++;
			uf.unite(a, b);
		}

		for (int i = 0; i < k; i++) {
			int c = sc.nextInt();
			int d = sc.nextInt();
			c--;
			d--;
			to[c].add(d);
			to[d].add(c);

		}

		for (int i = 0; i < n; i++) {
			int ans = uf.size(i) - 1 - deg[i]; //友達は絶対に同じグループに属する
			for (int u : to[i]) {
				if (uf.same(i, u))
					ans--;
			}
			System.out.println(ans + " ");
		}
		return;

	}
}

class UnionFind {

	static int[] d;

	UnionFind(int n) {
		d = new int[n];
		Arrays.fill(d, -1);
	}

	public int find(int x) {
		if (d[x] < 0)
			return x;
		return d[x] = find(d[x]);
	}

	public boolean unite(int x, int y) {
		x = find(x);
		y = find(y);
		if (x == y)
			return false;
		if (d[x] > d[y]) {
			d[x] += d[y];
			d[y] = x;
			return true;
		}
		d[y] += d[x];
		d[x] = y;
		return true;
	}

	public boolean same(int x, int y) {
		return find(x) == find(y);
	}

	public int size(int x) {
		return -d[find(x)];
	}

}
