import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {
	static IO io = new IO();
	public static void main(String[] args) {
		int d = io.nextInt();
		for(int i=0;i<d;i++) solve();
		io.flush();
	}

	public static void solve() {
		int n = io.nextInt();
		ArrayList<Wall> walls = new ArrayList<>();
		walls.add(new Wall(0,51));
		for(int i=0;i<n;i++) {
			walls.add(new Wall(io.nextInt(),io.nextInt()));
		}
		walls.add(new Wall(100,50));
		ArrayList<Pool> pools = new ArrayList<>();
		for(int i=0;i<walls.size()-1;i++) {
			pools.add(new Pool(walls.get(i),walls.get(i+1)));
		}
		ArrayList<Faucet> faucets = new ArrayList<>();
		int m = io.nextInt();
		for(int i=0;i<m;i++) {
			faucets.add(new Faucet(io.nextInt(), io.nextInt()));
		}
		ArrayList<Query> queries = new ArrayList<>();
		int l = io.nextInt();
		for(int i=0;i<l;i++) {
			queries.add(new Query(io.nextInt(),io.nextInt(),i));
		}
		queries.sort((q1,q2)->Integer.compare(q1.t, q2.t));

		Tank tank = new Tank(pools);
		int idxQ = 0;
		int t = 0;
		double[] ans = new double[l];
		do {
//			System.err.println(tank);
			while(idxQ < queries.size() && queries.get(idxQ).t == t) {
				Query q = queries.get(idxQ);
				ans[q.i] = tank.height(q.x);
				idxQ++;
			}
			t++;
		} while(tank.simulate(faucets));
		for(int i=idxQ;i<l;i++) {
			ans[queries.get(idxQ).i] = 50;
		}
		for(int i=0;i<l;i++) {
			io.println(String.format("%.9f", ans[i]));
		}
	}
}
class Wall {
	int x,h;
	public Wall(int x, int h) {
		super();
		this.x = x;
		this.h = h;
	}
}
class Faucet {
	int x,f;
	public Faucet(int x, int f) {
		super();
		this.x = x;
		this.f = f;
	}
}
class Query {
	int x,t,i;

	public Query(int x, int t, int i) {
		super();
		this.x = x;
		this.t = t;
		this.i = i;
	}

}
class Pool {
	Wall left,right;
	int water;
	public Pool(Wall left, Wall right) {
		super();
		this.left = left;
		this.right = right;
	}
	public double height() {
		return (double) water / 30 / (right.x - left.x);
	}
	public boolean isFull() {
		return water >= capacity();
	}
	public int capacity() {
		return (right.x - left.x) * Math.min(left.h, right.h) * 30;
	}
	public int fill(int amount) {
		int capacity = capacity();
		int flow = Math.min(amount, capacity - water);
		water += flow;
		return flow;
	}
	public void mergeRight(Pool other) {
		right = other.right;
		water += other.water;
	}
	public String toString() {
		return "(" + water + "/" + capacity() + ")";
	}
}
class Tank {
	ArrayList<Pool> pools;

	public Tank(ArrayList<Pool> pools) {
		super();
		this.pools = pools;
	}
	public double height(int x) {
		return pools.get(indexOfPool(x)).height();
	}
	public boolean simulate(ArrayList<Faucet> faucets) {
		for(Faucet f: faucets) {
			int idx = indexOfPool(f.x);
			int flow = f.f;
			while(flow > 0) {
				int flowTo = flowTo(idx);
				if (flowTo >= pools.size()) {
					return false; //overflow
				}
				Pool p = pools.get(flowTo);
				flow -= p.fill(flow);
				if (p.isFull()) {
					if (p.left.h <= p.right.h) {
						Pool left = pools.get(flowTo-1);
						if (p.height() == left.height()) {
							left.mergeRight(p);
							pools.remove(flowTo);
						}
					}else if (flowTo + 1 < pools.size()) {
						Pool right = pools.get(flowTo + 1);
						if (p.height() == right.height()) {
							p.mergeRight(right);
							pools.remove(flowTo+1);
						}
					}
				}
			}
		}
		return true;
	}

	private int indexOfPool(int xPos) {
		for(int i=0;i<pools.size();i++) {
			Pool p = pools.get(i);
			if (p.left.x < xPos && xPos < p.right.x) {
				return i;
			}
		}
		throw new RuntimeException();
	}
	private int flowTo(int poolIdx) {
		int cur = poolIdx;
		while(cur < pools.size() && pools.get(cur).isFull()) {
			Pool p = pools.get(cur);
			if (p.left.h <= p.right.h) {
				cur--;
			}else{
				cur++;
			}
		}
		return cur;
	}
	public String toString() {
		return pools.toString();
	}
}
class IO extends PrintWriter {
	private final InputStream in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;

	public IO() { this(System.in);}
	public IO(InputStream source) { super(System.out); this.in = source;}
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
	private static boolean isNewLine(int c) { return c == '\n' || c == '\r';}
	public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
	public boolean hasNextLine() { while(hasNextByte() && isNewLine(buffer[ptr])) ptr++; return hasNextByte();}
	public String next() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while(isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	public char[] nextCharArray(int len) {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		char[] s = new char[len];
		int i = 0;
		int b = readByte();
		while(isPrintableChar(b)) {
			if (i == len) {
				throw new InputMismatchException();
			}
			s[i++] = (char) b;
			b = readByte();
		}
		return s;
	}
	public String nextLine() {
		if (!hasNextLine()) {
			throw new NoSuchElementException();
		}
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while(!isNewLine(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	public long nextLong() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
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
	public int nextInt() {
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) {
			throw new NumberFormatException();
		}
		return (int) nl;
	}
	public char nextChar() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		return (char) readByte();
	}
	public double nextDouble() { return Double.parseDouble(next());}
	public int[] nextIntArray(int n) { int[] a = new int[n]; for(int i=0;i<n;i++) a[i] = nextInt(); return a;}
	public long[] nextLongArray(int n) { long[] a = new long[n]; for(int i=0;i<n;i++) a[i] = nextLong(); return a;}
	public double[] nextDoubleArray(int n) { double[] a = new double[n]; for(int i=0;i<n;i++) a[i] = nextDouble(); return a;}
	public void nextIntArrays(int[]... a) { for(int i=0;i<a[0].length;i++) for(int j=0;j<a.length;j++) a[j][i] = nextInt();}
	public int[][] nextIntMatrix(int n,int m) { int[][] a = new int[n][]; for(int i=0;i<n;i++) a[i] = nextIntArray(m); return a;}
	public char[][] nextCharMap(int n,int m) { char[][] a = new char[n][]; for(int i=0;i<n;i++) a[i] = nextCharArray(m); return a;}
	public void close() { super.close(); try {in.close();} catch (IOException e) {}}
}


