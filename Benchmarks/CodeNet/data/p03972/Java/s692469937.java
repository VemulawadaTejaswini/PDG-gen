import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.NoSuchElementException;

public class Main {
	static FastScanner sc = new FastScanner();
	static PrintStream out = System.out;
	static long sumX[];
	static long sumY[];
	static RMQ RMQ_X, RMQ_Y;

	public static void main(String args[]) {
		int W = ni();
		int H = ni();
		int p[] = na(W);
		int q[] = na(H);
		sumX = new long[W+1];
		sumY = new long[H+1];
		for (int x=0;x<W;x++) {
			sumX[x+1] = sumX[x] + p[x];
		}
		for (int y=0;y<H;y++) {
			sumY[y+1] = sumY[y] + q[y];
		}

		RMQ_X = new RMQ();
		RMQ_X.init(W);
		RMQ_Y = new RMQ();
		RMQ_Y.init(H);

		for (int i=0;i<W;i++) {
			RMQ_X.update(i, p[i]);
		}
		for (int i=0;i<H;i++) {
			RMQ_Y.update(i, q[i]);
		}

		System.out.println(f(0, 0, W, H, p, q, 0, 0, 0, 0));
	}

	private static long f(int x0, int y0, int x1, int y1, int p[], int q[], int maxX, int maxY, int maxXidx, int maxYidx) {
		if (x0 == x1) {
			long ret = 0;
			ret = sumY[y1] - sumY[y0];
			return ret;
		} else if (y0 == y1) {
			long ret = 0;
			ret = sumX[x1] - sumX[x0];
			return ret;
		}

		if (maxX == 0) {
			int r[] = RMQ_X.query(x0, x1-1);
			maxX = r[0];
			maxXidx = r[1];
		}

		if (maxY == 0) {
			int r[] = RMQ_Y.query(y0, y1-1);
			maxY = r[0];
			maxYidx = r[1];
		}

		if (maxX > maxY) {
			long ret =
					f(x0, y0, maxXidx, y1, p, q, 0, maxY, 0, maxYidx) + 
					f(maxXidx+1, y0, x1, y1, p, q, 0, maxY, 0, maxYidx) + 
					maxX;
			return ret;
		} else {
			long ret =
					f(x0, y0, x1, maxYidx, p, q, maxX, 0, maxXidx, 0) + 
					f(x0, maxYidx+1, x1, y1, p, q, maxX, 0, maxXidx, 0) + 
					maxY;
			return ret;
		}
	}

	private static String next() {
		return sc.next();
	}

	private static int ni() {
		return sc.nextInt();
	}

	private static long nl() {
		return sc.nextLong();
	}

	private static int[] na(int n) {
		int[] a = new int[n];
		for(int i = 0;i < n;i++) a[i] = ni();
		return a;
	}

	private static long[] nal(int n) {
		long[] a = new long[n];
		for(int i = 0;i < n;i++) a[i] = ni();
		return a;
	}

	private static double nd() {
		return Double.parseDouble( next() );
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
		}else{
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
	private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
	private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
	private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
	public boolean hasNext() { skipUnprintable(); return hasNextByte();}
	public String next() {
		if (!hasNext()) throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while(isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	public int nextInt() {
		if (!hasNext()) throw new NoSuchElementException();
		int n = 0;
		boolean minus = false;
		int b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) {
			throw new NumberFormatException();
		}
		while(true){
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			}else if(b == -1 || !isPrintableChar(b)){
				return minus ? -n : n;
			}else{
				throw new NumberFormatException();
			}
			b = readByte();
		}
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
		while(true){
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			}else if(b == -1 || !isPrintableChar(b)){
				return minus ? -n : n;
			}else{
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}
}

class RMQ{
	static final int MAX_N = 1 << 17;
	int n, dat[] = new int[2*MAX_N-1], idx[] = new int[2*MAX_N-1];

	int[] rec(int a,int b,int k,int l,int r){
		if(b <= l || r <= a){
			return new int[]{Integer.MIN_VALUE, -1};
		}

		if(a<=l && r<=b){
			return new int[]{dat[k], idx[k]};
		}else{
			int rl[] = rec(a,b,2*k+1,l,(l+r)/2);
			int rr[] = rec(a,b,2*k+2,(l+r)/2,r);
			if (rl[0] > rr[0]) {
				return rl;
			} else {
				return rr;
			}
		}
	}

	void init(int n_){
		n=1;
		while(n < n_) n*=2;

		for(int i=0;i<2*n-1;i++){
			dat[i] = Integer.MIN_VALUE;
		}
	}

	//kをaに変更
	void update(int k, int a){
		int reaf = k + n - 1;
		dat[reaf] = a;
		idx[reaf] = k;
		while(reaf > 0){
			reaf = (reaf - 1) / 2;
			if (dat[reaf*2+1] > dat[2*reaf+2]) {
				dat[reaf] = dat[reaf*2+1];
				idx[reaf] = idx[reaf*2+1];
			} else {
				dat[reaf] = dat[reaf*2+2];
				idx[reaf] = idx[reaf*2+2];
			}
		}
	}

	//query[a,b]の範囲内の最小値を返す
	int[] query(int a,int b){
		return rec(a,b+1,0,0,n);
	}
};
