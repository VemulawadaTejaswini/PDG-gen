import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] as = new int[m];
		int[] bs = new int[m];
		for (int i = 0; i < m; i++) {
			as[i] = sc.nextInt() - 1;
			bs[i] = sc.nextInt() - 1;
		}

		int count = 0;
		for (int i = 0; i < m; i++) {
			UnionFindTree uf = new UnionFindTree(n);
			for (int j = 0; j < m; j++) {
				if (i == j) {
					continue;
				}
				uf.union(as[j], bs[j]);
			}
			for (int j = 1; j < n; j++) {
				if (!uf.same(0, j)) {
					count++;
					break;
				}
			}
		}
		System.out.println(count);
	}
}

class UnionFindTree {

	int[] parent; //インデックスにとノードを対応させ、そのルートノードのインデックスを格納
	int[] rank; //parentと同様に、木の高さを格納

	public UnionFindTree(int size) {
		this.parent = new int[size];
		this.rank = new int[size];

		for (int i = 0; i < size; i++) {
			makeSet(i);
		}
	}

	public void makeSet(int i) {
		parent[i] = i;
		rank[i] = 0; //集合の高さ
	}

	public void union(int x, int y) {
		int xRoot = find(x);
		int yRoot = find(y);

		//xが属する木の方が大きい場合
		if (rank[xRoot] > rank[yRoot]) {
			parent[yRoot] = xRoot; //yの親をxに更新
		} else if (rank[xRoot] < rank[yRoot]) {
			parent[xRoot] = yRoot;
		} else if (xRoot != yRoot) {
			parent[yRoot] = xRoot;
			rank[xRoot]++; //同じ高さの木がルートの子として着くから大きさ++;
		}
	}

	//引数の属する木のルートのidを返す
	public int find(int i) {
		if (i != parent[i]) {
			parent[i] = find(parent[i]);
		}
		return parent[i];
	}

	//同じ木に属しているか
	public boolean same(int x, int y) {
		return find(x) == find(y);
	}
}