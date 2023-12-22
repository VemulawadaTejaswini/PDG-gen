import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int q = Integer.parseInt(sa[1]);
		sa = br.readLine().split(" ");
		int[] c = new int[n];
		for (int i = 0; i < n; i++) {
			c[i] = Integer.parseInt(sa[i]);
		}
		int[] l = new int[q];
		int[] r = new int[q];
		for (int i = 0; i < q; i++) {
			sa = br.readLine().split(" ");
			l[i] = Integer.parseInt(sa[0]) - 1;
			r[i] = Integer.parseInt(sa[1]);
		}
		br.close();

		SegTree<Obj> st = new SegTree<>(n, new Obj(), (v1, v2) -> {
			Obj o = new Obj();
			o.set.addAll(v1.set);
			o.set.addAll(v2.set);
			return o;
		});
		for (int i = 0; i < n; i++) {
			Obj o = new Obj();
			o.set.add(c[i]);
			st.update(i, o);
		}
		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < q; i++) {
			Obj o = st.query(l[i], r[i]);
			pw.println(o.set.size());
		}
		pw.flush();
	}

	static class Obj {
		Set<Integer> set = new HashSet<>();
	}

	static class SegTree<T> {
		// 親へのアクセス：(n - 1) / 2
		// 子へのアクセス：n * 2 + 1、n * 2 + 2
		int n = 2; // 要素（葉）の数
		int n2; // 全ノード数
		T NA;
		List<T> list;
		BiFunction<T, T, T> func;

		/**
		 * 初期化 O(N)
		 * @param num 要素（葉）の数
		 * @param na 単位元
		 * @param func 区間に対する操作が可能な関数（戻り値は新規オブジェクト）
		 */
		public SegTree(int num, T na, BiFunction<T, T, T> func) {
			while (n < num) n <<= 1;
			n2 = n * 2 - 1;
			NA = na;
			list = new ArrayList<T>(n2);
			for (int i = 0; i < n2; i++) list.add(NA);
			this.func = func;
		}

		/**
		 * 更新 O(logN)
		 * @param i インデックス（0～n-1）
		 * @param x 更新値
		 */
		void update(int i, T x) {
			i += n - 1; // arr上でのインデックス
			list.set(i, x);
			while (i > 0) {
				i = (i - 1) / 2;
				list.set(i, func.apply(list.get(i * 2 + 1), list.get(i * 2 + 2)));
			}
		}

		/**
		 * 取得 O(logN)
		 * インデックスl以上r未満の区間の値
		 */
		T query(int l, int r) {
			return query(l, r, 0, 0, n);
		}

		/**
		 * 取得 O(logN)
		 * インデックスl以上r未満の区間の値、beg, endにはノードkに対応する区間
		 * query(l, r, 0, 0, n);
		 */
		private T query(int l, int r, int k, int beg, int end) {
			if (end <= l || r <= beg) return NA; // 交差しない
			if (l <= beg && end <= r) return list.get(k); // 完全に含む
			T v1 = query(l, r, k * 2 + 1, beg, (beg + end) / 2);
			T v2 = query(l, r, k * 2 + 2, (beg + end) / 2, end);
			return func.apply(v1, v2);
		}
	}
}
