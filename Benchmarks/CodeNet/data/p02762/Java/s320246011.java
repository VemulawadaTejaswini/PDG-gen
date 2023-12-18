import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();

		StringBuilder ans = new StringBuilder();
		int[] edgenum = new int[N + 1];
		UnionFind uf = new UnionFind(N);

		// 友達関係を精査
		for (int i = 1; i <= M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			uf.unite(a, b);
			edgenum[a]++;
			edgenum[b]++;
		}

		int[] x = new int[N + 1];
		// 各人の結果を計算
		for (int i = 1; i <= N; i++) {
			x[i] = uf.size(i) - edgenum[i] - 1;
		}
		// ブロック関係を精査
		for (int i = 1; i <= K; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (uf.isSame(a, b)) {
				x[a]--;
				x[b]--;
			}
		}
		for (int i = 1; i <= N; i++) {
			ans.append(x[i] + " ");
		}
		System.out.println(ans);

		sc.close();
	}

}

/**
 * UnionFind
 */
class UnionFind {

	int[] parent; // インデックスとノードを対応させ、そのルートノードのインデックスを保持
	int[] size; // 属しているグループのサイズを保持
	int[] rank; // parentと同様に、木の高さを保持

	public UnionFind(int n) {
		this.parent = new int[n + 1];
		this.size = new int[n + 1];
		this.rank = new int[n + 1];

		for (int i = 0; i < n; i++) {
			makeSet(i);
		}
	}

	public void makeSet(int i) {
		parent[i] = i;
		size[i] = 1;
		rank[i] = 0;
	}

	public int size(int i) {
		return size[find(i)];
	}

	public void unite(int x, int y) {
		int xRoot = find(x);
		int yRoot = find(y);

		if (xRoot == yRoot) {
			return;
		}
		// xが属する木の方が大きい場合
		if (rank[xRoot] > rank[yRoot]) {
			parent[yRoot] = xRoot; // yの親をxに更新
			size[xRoot] += size[yRoot];
		} else {
			// yが属する木のランクがxのそれ以上の場合
			parent[xRoot] = yRoot;
			size[yRoot] += size[xRoot];
			if (rank[xRoot] == rank[yRoot]) {
				rank[xRoot]++;
			}
		}
	}

	// 引数の属する木のルートを返す
	public int find(int i) {
		if (i != parent[i]) {
			parent[i] = find(parent[i]);
		}
		return parent[i];
	}

	// 同じ木に属しているか
	public boolean isSame(int x, int y) {
		return find(x) == find(y);
	}
}
