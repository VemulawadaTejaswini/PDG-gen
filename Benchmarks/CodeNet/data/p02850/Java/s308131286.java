import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.rmi.dgc.Lease;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

import static java.util.Comparator.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
		main.out.close();
	}

	// ======================================================================
	Graph G = new Graph();
	Map<PPKEY, Integer> map = new HashMap<>();
	int[] A, B;
	int max = 0;
	void dfs(int now, int pre, int pc) {
		Set<Integer> set = G.getSet(now);
		int c = 1;
		PPKEY pp;
		for(int key : set) {
			if(key == pre)	continue;
			if(c == pc)	c++;
			if(now < key)	pp = new PPKEY(now, key);
			else			pp = new PPKEY(key, now);
			map.put(pp, c);
			dfs(key, now, c);
			max = Math.max(max, c);
			c++;
		}
	}
	public void solve() {
		int N = ni();
		A = new int[N];
		B = new int[N];
		for (int i = 0; i < N-1; i++) {
			A[i] = ni() - 1;
			B[i] = ni() - 1;
			G.add(A[i], B[i]);
			G.add(B[i], A[i]);
		}
		dfs(0, -1, 0);
		out.println(max);
		PPKEY pp;
		for (int i = 0; i < N-1; i++) {
			pp = new PPKEY(A[i], B[i]);
			out.println(map.get(pp));
		}
	}
	// 重みなし　グラフ
	class Graph {
		// 頂点に紐づく頂点のリスト（多重辺は保存されない）
		private Map<Integer, Set<Integer>> data = new HashMap<Integer, Set<Integer>>();

		/**
		 * 頂点と頂点の繋がりを追加する
		 */
		void add(int from, int to) {
			Set<Integer> set = data.get(from);
			if (set == null) {
				set = new HashSet<Integer>();
				data.put(from, set);
			}
			set.add(to);
		}

		/**
		 * 始点から終点が繋がっていれば切る
		 */
		void del(int from, int to) {
			Set<Integer> set = data.get(from);
			if (set == null) {
				return;
			}
			if (set.contains(to)) {
				set.remove((Object) to);
			}
		}

		/**
		 * 指定された頂点に紐づく、頂点の Set を返す
		 */
		Set<Integer> getSet(int key) {
			return data.get(key);
		}

		/**
		 * 頂点 key が登録されているか？
		 */
		boolean containsKey(int key) {
			return data.containsKey(key);
		}

		/**
		 * 頂点のセットを返す
		 */
		Set<Integer> keySet() {
			return data.keySet();
		}

		/**
		 * from --> to がつながっていれば　true を返す
		 */
		boolean isConnect(int from, int to) {
			Set<Integer> set = data.get(from);
			if (set == null)
				return false;
			else
				return set.contains(to);
		}

		/**
		 * 指定された頂点から、すべての頂点への距離を返す（幅優先　ＢＦＳ）	→　返り値は配列
		 */
		int[] getDistV(int n, int key) { //  n : 頂点数    key : 開始頂点
			int[] dist = new int[n]; // [頂点] = 距離
			Arrays.fill(dist, -1); // 届かない場合　-1
			Deque<PP> deque = new ArrayDeque<>(); // キュー
			deque.offerLast(new PP(key, 0)); // スタートをスタックに保存
			dist[key] = 0;
			while (deque.peekFirst() != null) {
				PP wk = deque.pollFirst(); // キューから次の頂点を取得
				int no = wk.getKey();
				int dd = wk.getVal();
				//				out.println("キューから取り出し　：　<--  [" + no + "][" + dd + "]");
				Set<Integer> set = getSet(no); // つながっている頂点のリストを取得
				if (set != null) {
					for (int next : set) {
						if (dist[next] != -1)
							continue;
						dist[next] = dd + 1; // 距離を登録
						deque.offerLast(new PP(next, dd + 1));
						//						out.println("キューに登録　：　-->  [" + next + "][" + (dd + 1) + "]");
					}
				}
			}
			return dist;
		}

		// ================================================================================
		Map<Integer, Integer> mapCnt = new HashMap<>(); // 項番（何番目に訪れたか）
		Map<Integer, Integer> mapLow = new HashMap<>(); // 初期値は項番、つながっている先の項番が小さければコピーする
														// mapCnt > mapLow なら閉路に含まれる頂点
		Set<Integer> mark = new HashSet<>(); // 処理したら入れる

		// mapCnt, mapLow を設定する
		int bridgeDfs(int now, int pre, int number) {
			mark.add(now);
			mapCnt.put(now, number);
			mapLow.put(now, number);
			int low;
			for (int next : getSet(now)) {
				if (next == pre)
					continue;
				if (mark.contains(next)) {
					if (mapLow.get(now) > mapLow.get(next)) {
						mapLow.put(now, mapLow.get(next));
					}
					continue;
				}
				number++;
				low = bridgeDfs(next, now, number);
				if (mapLow.get(now) > low) {
					mapLow.put(now, low);
				}
			}
			return mapLow.get(now);
		}

		/**
		 * 橋の数を返す  先頭の頂点番号を引数とする
		 */
		int bridgeCnt(int start) {
			mapCnt.clear();
			mapLow.clear();
			mark.clear();
			bridgeDfs(start, start, 0);
			int ans = 0;
			for (int key : mapCnt.keySet()) {
				if (mapCnt.get(key) == mapLow.get(key)) {
					ans++;
				}
			}
			return ans - 1;
		}

		// ================================================================================

		/**
		 * ダンプ
		 * @param out
		 */
		void dump() {
			for (int key : data.keySet()) {
				out.print(key + " : ");
				for (int val : data.get(key)) {
					out.print(val + " ");
				}
				out.println("");
			}
		}
	}
	class PP {
		public int key, val;

		public PP(int key, int val) {
			this.key = key;
			this.val = val;
		}

		public int getKey() {
			return key;
		}

		public void setKey(int key) {
			this.key = key;
		}

		public int getVal() {
			return val;
		}

		public void setVal(int val) {
			this.val = val;
		}
	}
	// HashMap のキーに使う　→　Set に入れるのもこれ（PPでは値での比較が行われない）
	static final class PPKEY {
		private final int key, val;

		public PPKEY(int key, int val) {
			this.key = key;
			this.val = val;
		}
		public int getKey() {	return key; }
		public int getVal() {	return val;	}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof PPKEY) {
				PPKEY dest = (PPKEY) obj;
				return this.key == dest.key && this.val == dest.val;
			} else {
				return false;
			}
		}
		@Override
		public int hashCode() {
			return Objects.hash(key, val);
		}
	}


	// ------------------------------------------
	// ライブラリ
	// ------------------------------------------
	// Print
	private PrintWriter out = new PrintWriter(System.out);

	// Scanner
	private FastScanner scan = new FastScanner();

	int ni() {
		return scan.nextInt();
	}

	int[] ni(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = ni();
		}
		return a;
	}

	int[][] ni(int y, int x) {
		int[][] a = new int[y][x];
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				a[i][j] = ni();
			}
		}
		return a;
	}

	long nl() {
		return scan.nextLong();
	}

	long[] nl(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = nl();
		}
		return a;
	}

	long[][] nl(int y, int x) {
		long[][] a = new long[y][x];
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				a[i][j] = nl();
			}
		}
		return a;
	}

	String ns() {
		return scan.next();
	}

	String[] ns(int n) {
		String[] a = new String[n];
		for (int i = 0; i < n; i++) {
			a[i] = ns();
		}
		return a;
	}

	String[][] ns(int y, int x) {
		String[][] a = new String[y][x];
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				a[i][j] = ns();
			}
		}
		return a;
	}
}

class FastScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;

	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		} else {
			ptr = 0;
			try {
				buflen = in.read(buffer);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (buflen <= 0) {
				return false;
			}
		}
		return true;
	}

	private int readByte() {
		if (hasNextByte())
			return buffer[ptr++];
		else
			return -1;
	}

	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}

	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
		return hasNextByte();
	}

	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	public long nextLong() {
		if (!hasNext())
			throw new NoSuchElementException();
		long n = 0;
		boolean minus = false;
		int b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) {
			throw new NumberFormatException();
		}
		while (true) {
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			} else if (b == -1 || !isPrintableChar(b)) {
				return minus ? -n : n;
			} else {
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}

	public int nextInt() {
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
			throw new NumberFormatException();
		return (int) nl;
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}
}
