import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Obj[] arr = new Obj[n + 1];
		for (int i = 0; i < n; i++) {
			String[] sa = br.readLine().split(" ");
			Obj o = new Obj();
			o.x = Integer.parseInt(sa[0]);
			o.d = Integer.parseInt(sa[1]);
			arr[i] = o;
		}
		br.close();

		Obj o = new Obj();
		o.x = Integer.MAX_VALUE;
		o.d = 0;
		arr[n] = o;
		Arrays.sort(arr, (o1, o2) -> Long.compare(o2.x, o1.x));

		int mod = 998244353;
		SegTree<Integer> st = new SegTree<>(n + 1, Integer.MAX_VALUE, (v1, v2) -> Math.min(v1, v2));

		long[] dp0 = new long[n + 1];
		long[] dp1 = new long[n + 1];
		dp0[0] = 1;
		for (int i = 1; i <= n; i++) {
			dp0[i] = dp0[i - 1] + dp1[i - 1];
			dp0[i] %= mod;
			int idx = binarySearch(arr, arr[i].x + arr[i].d);
			int idx2 = st.query(idx, i);
			if (idx2 == Integer.MAX_VALUE) {
				idx2 = i;
			}
			dp1[i] = dp0[idx2 - 1] + dp1[idx2 - 1];
			dp1[i] %= mod;
			st.update(i, idx2);
		}
		System.out.println((dp0[n] + dp1[n]) % mod);
	}

	static class Obj {
		long x, d;
	}

	static int binarySearch(Obj[] arr, long x) {
		int ok = arr.length;
		int ng = -1;
		while (Math.abs(ok - ng) > 1) {
			int mid = (ok + ng) / 2;
			if (arr[mid].x < x) {
				ok = mid;
			} else {
				ng = mid;
			}
		}
		return ok;
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
