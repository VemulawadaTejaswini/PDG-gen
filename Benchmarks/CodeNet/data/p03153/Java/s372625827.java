import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * メインクラス
 * @author Yuichiro.Yamashita
 *
 */
public class Main {

	/**
	 * メインメソッド
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		// ============================================================
		// 標準入力を変数に設定
		// ============================================================

		// 標準入力を取得
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().split(" ");

		// 都市数 N
		int n = Integer.parseInt(line[0]);

		// 建設コスト算出で使用する係数 D
		int d = Integer.parseInt(line[1]);

		// 各都市の建設コスト
		line = br.readLine().split(" ");
		long[] a = new long[line.length];
		for (int i = 0; i < line.length; i++) {
			a[i] = Integer.parseInt(line[i]);
		}

		// ============================================================
		// メイン処理
		// ============================================================

		// Union-Find木を初期化
		UnionFindTree unionFindTree = new UnionFindTree(n);

		// 回答を初期化
		long answer = 0;

		// 全てのノードが接続されるまでループ
		while (unionFindTree.size(0) != n) {
			long[] val1 = new long[n + 2];
			long[] val2 = new long[n + 2];
			long[] valL = new long[n + 2];
			long[] valR = new long[n + 2];
			Arrays.fill(valL, Long.MAX_VALUE / 2);
			Arrays.fill(valR, Long.MAX_VALUE / 2);
			Arrays.fill(val1, Long.MAX_VALUE / 2);
			Arrays.fill(val2, Long.MAX_VALUE / 2);
			int[] indexL = new int[n + 2];
			int[] indexR = new int[n + 2];
			for (int i = 0; i < n; i++) {
				if (valL[unionFindTree.root(i) + 1] > a[i] - i * d) {
					valL[unionFindTree.root(i) + 1] = a[i] - i * d;
					indexL[unionFindTree.root(i) + 1] = i;
				}
				if (valR[unionFindTree.root(i) + 1] > a[i] + i * d) {
					valR[unionFindTree.root(i) + 1] = a[i] + i * d;
					indexR[unionFindTree.root(i) + 1] = i;
				}
				val1[unionFindTree.root(i) + 1] = Math.min(val1[unionFindTree.root(i) + 1], a[i] + i * d);
				val2[unionFindTree.root(i) + 1] = Math.min(val2[unionFindTree.root(i) + 1], a[i] - i * d);
			}

			int[] minL = new int[n + 2];
			int[] minR = new int[n + 2];

			for (int i = 1; i <= n; i++) {
				if (valL[minL[i - 1]] >= valL[i]) {
					minL[i] = i;
				} else {
					minL[i] = minL[i - 1];
				}
			}

			minR[n + 1] = n + 1;
			for (int i = n; i >= 1; i--) {
				if (valR[minR[i + 1]] >= valR[i]) {
					minR[i] = i;
				} else {
					minR[i] = minR[i + 1];
				}
			}

			for (int i = 1; i <= n; i++) {
				if (unionFindTree.root(i - 1) != i - 1)
					continue;
				long cl = valL[minL[i - 1]] + val1[i];
				long cr = valR[minR[i + 1]] + val2[i];
				if (cl <= cr) {
					if (!unionFindTree.same(i - 1, minL[i - 1] - 1)) {
						answer += cl;
						unionFindTree.union(i - 1, minL[i - 1] - 1);
					}
				} else {
					if (!unionFindTree.same(i - 1, minR[i + 1] - 1)) {
						answer += cr;
						unionFindTree.union(i - 1, minR[i + 1] - 1);
					}
				}
			}
		}

		// ============================================================
		// 結果出力
		// ============================================================

		// 結果出力
		System.out.println(answer);
	}
}

/**
 * Union-Find木
 * @author Yuichiro.Yamashita
 *
 */
class UnionFindTree {

	// ノードの親ノードを格納する変数
	// 但し自らが親ノードの場合はその配下に接続されたノード数を負数で保持
	private int[] data;

	/**
	 * コンストラクタ
	 * @param size
	 */
	public UnionFindTree(final int size) {
		data = new int[size];
		clear();
	}

	/**
	 * 全てのデータを初期化
	 * ※全ノードを根とする
	 * ※根ノードについてはその配下にあるノード数を負数で管理するため
	 * ※値に -1 を設定する
	 */
	public void clear() {
		Arrays.fill(data, -1);
	}

	/**
	 * ルートノードを取得
	 * @param x
	 * @return
	 */
	public int root(final int x) {

		// 負数を保持している場合は自らがルートノード
		if (data[x] < 0) {
			return x;

			// それ以外の場合はルートノードを検索して返却
		} else {
			return root(data[x]);
		}
	}

	/**
	 * ノードの結合を実施
	 * @param x
	 * @param y
	 */
	public void union(int x, int y) {

		// 引数の根を取得
		x = root(x);
		y = root(y);

		// 根が異なる場合
		if (x != y) {

			// 根のインデックスが小さいノードをルートに設定する
			if (data[y] < data[x]) {
				final int t = x;
				x = y;
				y = t;
			}

			// xに接続されているノード数を負の数で表現
			data[x] += data[y];

			// yの親ノードをxに設定
			data[y] = x;
		}
	}

	/**
	 * xとyが同じ木に属しているかを判定
	 * @param x
	 * @param y
	 * @return
	 */
	public boolean same(final int x, final int y) {
		return root(x) == root(y);
	}

	/**
	 * xに接続されているノード数を返却
	 * @param x
	 * @return
	 */
	public int size(int x) {

		// 接続ノード数は負数で表現されているため 符号変換して返却
		return -data[root(x)];
	}
}
