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
import java.util.Queue;
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
	int[] dx = { 0, 0, -1, 1 };
	int[] dy = { -1, 1, 0, 0 };
	
	int H, W;													// マップの　縦　と　横
	char[][] map = null;										// マップ
	int[][] ans = null;											// 何番目かを保存（通ったかどうかのフラグも兼ねる）
	Queue<PP> que = new ArrayDeque<>();							// キュー
	
	// スタートとゴールの位置を受け取り、各マスまでの移動距離を設定する
	int bfs(int s_h, int s_w, int g_h, int g_w) {
		int h, w, n_h, n_w;
		PP p = null;
		for(int i=0; i < H; i++) {								// 値の初期化
			Arrays.fill(ans[i], -1);
		}
		ans[s_h][s_w] = 0;										// スタートの値が　０
		que.clear();
		que.add(new PP(s_h, s_w));								// スタートをキューに入れる
		while(que.peek() != null) {
			p = que.poll();
			h = p.getKey();
			w = p.getVal();
//			out.println("  y = " + h + "  x = " + w);
			if(h == g_h && w == g_w) {							// ゴールかの判定
//			out.println(" goal  -->   ans(" + h + ", " + w + ") = " + ans[h][w]);
				break;
			}
			for(int i=0; i < 4; i++) {
				n_h = h + dy[i];
				n_w = w + dx[i];
				if(n_h < 0 || n_h >= H || n_w < 0 || n_w >= W) {
					continue;
				}
				if(ans[n_h][n_w] == -1 && map[n_h][n_w] != '#') {	// まだ　通っていなければ
					que.add(new PP(n_h, n_w));						// キューに追加する
					ans[n_h][n_w] = ans[h][w] + 1;					// 何番目かを設定する
				}
//				out.println("ans[" + n_h + "][" + n_w + "] = " + ans[n_h][n_w]);
			}
		}
		return ans[g_h][g_w];										// ゴールが何番目を返す
	}
	
	public void solve() {
		H = ni();
		W = ni();
		map = new char[H][];
		ans = new int[H][W];
		int cntW = 0;
		for (int i = 0; i < H; i++) {
			map[i] = ns().toCharArray();
			for (int j = 0; j < W; j++) {
				if(map[i][j] == '.')		cntW++;
			}
		}
		bfs(0, 0 , H-1, W-1);
		if(ans[H-1][W-1] == -1)				out.println(-1);
		else if(ans[H-1][W-1]+1 < cntW)		out.println(cntW - ans[H-1][W-1] - 1);
		else								out.println(0);
	}
	// Set に入れるなら　PPKEY　を使う！
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
