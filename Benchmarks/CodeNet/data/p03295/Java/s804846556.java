import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * 解説どおりに作成したソースコード
 */
public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt(), m = scanner.nextInt();
			UnionFindTree uft = new UnionFindTree(n);
			IntStream.range(1, n).forEach(i -> uft.union(i, i - 1));
			Pair[] pairs = new Pair[m];
			IntStream.range(0, m).forEach(i -> pairs[i] = new Pair(scanner.nextInt() - 1, scanner.nextInt() - 1));
			Arrays.sort(pairs);
			System.out.println(IntStream.range(0, m).map(i -> {
				if (uft.same(pairs[i].a, pairs[i].b)) {
					uft.ununion(pairs[i].b, pairs[i].b - 1);
					return 1;
				}
				return 0;
			}).sum());
		}
	}

	/**
	 * Union Find Treeの実装<br/>
	 * https://atcoder.jp/contests/abc040/submissions/4708654 を参考に作成<br/>
	 * 今回の問題に特化したununionを実装、count実装を削除
	 */
	private static class UnionFindTree {
		int[] parent;

		UnionFindTree(int size) {
			parent = new int[size];
			IntStream.range(0, size).forEach(i -> parent[i] = i);
		}

		int find(int x) {
			if (parent[x] == x) {
				return x;
			} else {
				return find(parent[x]);
			}
		}

		/**
		 * @param x
		 * @param y
		 * @return xとyがつながっているかどうか
		 */
		boolean same(int x, int y) {
			return find(x) == find(y);
		}

		/**
		 * xとyを結合する
		 * 
		 * @param x
		 * @param y
		 */
		void union(int x, int y) {
			int rootX = find(x);
			int rootY = find(y);
			if (rootX == rootY) {
				return;
			}
			parent[x] = y;
		}

		/**
		 * yの子供であるxを独立させる
		 * 
		 * @param x
		 * @param y
		 */
		void ununion(int x, int y) {
			if (same(x, y)) {
				parent[x] = x;
			}
		}
	}

	/**
	 * aとbを格納するクラス
	 */
	private static class Pair implements Comparable<Pair> {
		int a;
		int b;

		Pair(int a, int b) {
			super();
			this.a = a;
			this.b = b;
		}

		@Override
		public int compareTo(Pair pair) {
			return Integer.compare(this.b, pair.b);
		}
	}
}
