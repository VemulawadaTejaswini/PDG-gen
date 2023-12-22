import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
	static final int MAX = 300000;
	
	public Main() {
		FastScanner scanner = new FastScanner();
		int N = scanner.nextInt();
		int K = scanner.nextInt();
		
		int[] A = new int[N];
		IntStream.range(0, N).forEach( i -> A[i] = scanner.nextInt()-1);
		
		LazySegmentTree LST = new LazySegmentTree(MAX);
		
		IntStream.range(0, N).forEach(i -> LST.set(A[i], 1L));
		LST.build();
		
		IntStream.range(0, N).forEach( i -> {
			long v = LST.get(A[i], A[i]+1)+1;
			LST.update(A[i]-K,A[i]+K+1, v);
		});
		
		System.out.println(LST.get(0, N));
	}
	
	public static void main(String[] args) {
		new Main();
	}
}

class LazySegmentTree {
	//何も数値が無いことを表す定数、単位元がおすすめ
	private static final long INF = Long.MIN_VALUE;
	
	//データと遅延評価
	long[] data, lazy;
	
	//葉の長さ
	int len;
	
	public LazySegmentTree(int n) {
		//葉の個数を決める
		int x = 1;
		while (n > x) x <<= 1;
		len = x;
		
		//全体のノード数は(葉のノード数)*2-1
		data = new long[2 * x - 1];
		lazy = new long[2 * x - 1];
		
		//単位元で埋める
		Arrays.fill(lazy, INF);
		Arrays.fill(data, INF);
	}
	
	//葉の左からi番目にvを入れる．セグメント木構築用、buildと合わせて使う．
	void set(int i, long v) {
		data[i + len - 1] = v;
	}
	
	//セグメント木の構築:O(N)
	void build() {
		for (int i = len - 2; i >= 0; i--) {
			data[i] = Math.max(data[2 * i + 1], data[2 * i + 2]);
		}
	}
	
	//遅延評価の解決
	private void evaluate(int i) {
		if (lazy[i] == INF) return;
		
		//葉でなければ子にも遅延評価を伝搬させる
		if (i < len - 1) {
			lazy[i*2+1] = Math.max(lazy[i*2+1], lazy[i]);
			lazy[i*2+2] = Math.max(lazy[i*2+2], lazy[i]);
		}
		
		//ここは更新法や扱うモノイドの種類に合わせて変更する．
		data[i] = lazy[i];
		
		lazy[i] = INF;
	}
	
	long get(int left, int right) {
		return get(left, right, 0, 0, len);
	}
	
	private long get(int A, int B, int i, int l, int r) {
		evaluate(i);
		
		if (r <= A || B <= l) {
			return INF;
		} else if (A <= l && r <= B) {
			return data[i];
		} else {
			long vl = get(A, B, i * 2 + 1, l, (l + r) / 2);
			long vr = get(A, B, i * 2 + 2, (l + r) / 2, r);
			
			//要変更
			return Math.max(vl, vr);
		}
	}
	
	//[left, right)の区間をvalにする．
	void update(int left, int right, long val) {
		update(left, right, val, 0, 0, len);
	}
	
	private void update(final int L, final int R, final long V, int i, int l, int r) {
		//先に値を評価する
		evaluate(i);
		
		if (L <= l && r <= R) {
			//更新範囲の内部である場合更新
			lazy[i] = Math.max(lazy[i], V);
			evaluate(i);
		} else if (L < r && l < R) {
			//更新範囲が一部被っている場合は再帰
			update(L, R, V, i * 2 + 1, l, (l + r) / 2);
			update(L, R, V, i * 2 + 2, (l + r) / 2, r);
			
			//要変更
			data[i] = Math.max(data[i * 2 + 1], data[i * 2 + 2]);
		}
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
		if (hasNextByte()) return buffer[ptr++];
		else return -1;
	}
	
	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}
	
	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
		return hasNextByte();
	}
	
	public String next() {
		if (!hasNext()) throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	
	public long nextLong() {
		if (!hasNext()) throw new NoSuchElementException();
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
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
		return (int) nl;
	}
	
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}
