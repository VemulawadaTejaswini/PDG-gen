import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		// Union Find
		UnionFind uf = new UnionFind(N);
		for (int i = 0; i < M; i++) {
			uf.unite(sc.nextInt() - 1, sc.nextInt() - 1);
		}
		sc.close();

		int cnt = 0;
		for (int i = 0; i < N; i++) {
			if (uf.isRoot(i)) {
				cnt = Math.max(cnt, uf.size(i));
			}
		}

		System.out.println(cnt);
	}
}

class UnionFind {
	int[] parent; // インデックスとノードを対応させ、そのルートノードのインデックスを保持
	int[] size; // 属しているグループのサイズを保持
	int[] rank; // parentと同様に、木の高さを保持

	public UnionFind(int n) {
		this.parent = new int[n];
		this.size = new int[n];
		this.rank = new int[n];

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

	public boolean isRoot(int i) {
		return rank[i] == 0;
	}
}
