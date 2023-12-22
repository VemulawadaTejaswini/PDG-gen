import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {
	
	static class Node {
		int LX, RX, DY, UY;
		
		Node(int LX, int RX, int DY, int UY) {
			this.LX = LX;
			this.RX = RX;
			this.DY = DY;
			this.UY = UY;
		}
		
		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			Node node = (Node) o;
			return LX == node.LX &&
					RX == node.RX &&
					UY == node.UY &&
					DY == node.DY;
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(LX, RX, UY, DY);
		}
	}
	
	public Main() {
		FastScanner scanner = new FastScanner();
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		
		long[] A = new long[N], B = new long[N], C = new long[N];
		long[] D = new long[M], E = new long[M], F = new long[M];
		
		//同じ座標を排除するためのHashSet
		HashSet<Long> inX = new HashSet<>();
		HashSet<Long> inY = new HashSet<>();
		for (int i = 0; i < N; i++) {
			inX.add( (A[i] = scanner.nextLong()) );
			inX.add( (B[i] = scanner.nextLong()) );
			inY.add( (C[i] = scanner.nextLong()) );
		}
		
		for (int i = 0; i < M; i++) {
			inX.add( (D[i] = scanner.nextLong()) );
			inY.add( (E[i] = scanner.nextLong()) );
			inY.add( (F[i] = scanner.nextLong()) );
		}
		
		//INFを検出するために最大値最小値を加えておく
		inX.add(Long.MIN_VALUE);
		inX.add(Long.MAX_VALUE);
		inY.add(Long.MIN_VALUE);
		inY.add(Long.MAX_VALUE);
		
		//座標圧縮
		long[] X = new long[inX.size()];
		long[] Y = new long[inY.size()];
		{
			int i =0;
			for (long l : inX) {
				X[i] = l;
				i++;
			}
			i=0;
			for (long l : inY) {
				Y[i] = l;
				i++;
			}
		}
		
		Arrays.sort(X);
		Arrays.sort(Y);
		
		//x~x+1の間に壁があるか、どうか0なら無い、1以上なら有る
		int[][] hLines = new int[X.length-1][Y.length];
		//y~y+1の間に壁があるか、どうか0なら無い、1以上なら有る
		int[][] vLines = new int[X.length][Y.length-1];
		
		for (int i = 0; i < N; i++) {
			int AX = BS(X, A[i]);
			int BX = BS(X, B[i]);
			int CY = BS(Y, C[i]);
			
			hLines[AX][CY] += 1;
			hLines[BX][CY] -= 1;
		}
		
		for (int i = 0; i < M; i++) {
			int DX = BS(X, D[i]);
			int EY = BS(Y, E[i]);
			int FY = BS(Y, F[i]);
			
			vLines[DX][EY] += 1;
			vLines[DX][FY] -= 1;
		}
		
		for (int y = 0, lenY = Y.length; y < lenY; y++) {
			for (int x = 0, lenX = X.length-2; x < lenX; x++) {
				hLines[x+1][y] += hLines[x][y];
			}
		}
		
		for (int x = 0, lenX = X.length; x < lenX; x++) {
			for (int y = 0, lenY = Y.length-2; y < lenY; y++) {
				vLines[x][y+1] += vLines[x][y];
			}
		}
		
		long Ans = 0L;
		Queue<Node>   openList  = new LinkedList<>();
		HashSet<Node> closeList = new HashSet<>();
		{
			int LX, RX, DY, UY;
			int left = -1, right = X.length;
			while (right-left > 1) {
				int mid = left + (right-left)/2;
				if (0L < X[mid]) {
					right = mid;
				} else {
					left = mid;
				}
			}
			LX = left;
			RX = right;
			
			left = -1; right = Y.length;
			while (right-left > 1) {
				int mid = left + (right-left)/2;
				if (0L < Y[mid]) {
					right = mid;
				} else {
					left = mid;
				}
			}
			DY = left;
			UY = right;
			
			openList.add(new Node(LX, RX, DY, UY));
		}
		
		while ( !openList.isEmpty() ) {
			Node n = openList.poll();
			
			if ( closeList.contains(n) ) continue;
			
			if ( (n.LX == 0 || n.RX == X.length-1) || (n.DY == 0 || n.UY == Y.length-1) ){
				System.out.println("INF");
				return;
			}
			
			Ans += (X[n.RX]-X[n.LX]) * (Y[n.UY]-Y[n.DY]);
			
			//上に移動
			if ( hLines[n.LX][n.UY] == 0 ) {
				openList.add( new Node(n.LX, n.RX, n.DY+1, n.UY+1) );
			}
			//下に移動
			if ( hLines[n.LX][n.DY] == 0 ) {
				openList.add( new Node(n.LX, n.RX, n.DY-1, n.UY-1) );
			}
			//左に移動
			if ( vLines[n.LX][n.DY] == 0 ) {
				openList.add( new Node(n.LX-1, n.RX-1, n.DY, n.UY) );
			}
			//右に移動
			if ( vLines[n.RX][n.DY] == 0 ) {
				openList.add( new Node(n.LX+1, n.RX+1, n.DY, n.UY) );
			}
			
			closeList.add(n);
		}
		
		System.out.println(Ans);
	}
	
	int BS(long[] T, long V) {
		int left = 0, right = T.length;
		while (left <= right) {
			int mid = left + (right - left)/2;
			if (T[mid] == V) {
				return mid;
			} else if (V < T[mid]) {
				right = mid - 1;
			} else {
				left  = mid + 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		new Main();
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
