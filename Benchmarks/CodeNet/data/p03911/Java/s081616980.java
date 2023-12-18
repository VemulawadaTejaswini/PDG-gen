import java.util.*;
import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {

	static final Reader in = new Reader();
	static final PrintWriter out = new PrintWriter(System.out,false);
	static boolean debug = false;

	static void solve(){
		int n = in.nextInt();
		int m = in.nextInt();

		DisjointSet ds = new DisjointSet(n);

		ArrayList[] list = new ArrayList[n];
		for (int i=0; i<n; i++) {
			list[i] = new ArrayList<Integer>();
		}

		HashSet<Pair<Integer, Integer>> set = new HashSet<>();

		for (int i=0; i<n; i++) {
			int k = in.nextInt();
			for (int j=0; j<k; j++) {
				int l = in.nextInt() - 1;
				set.add(new Pair(i, l));
				list[i].add(l);
			}
		}

		for (int i=0; i<n; i++) {
			for (int j=0; j<list[i].size(); j++) {
				int l = (int)list[i].get(j);
				for (int k=i+1; k<n; k++) {
					if (set.contains(new Pair(k, l))) {
						ds.unite(i, k);
						break;
					}
				}
			}
		}

		if (ds.size(0) == n) {
			out.println("YES");
		} else {
			out.println("NO");
		}
	}

	public static void main(String[] args) throws Exception {
		debug = args.length > 0;
		long start = System.nanoTime();

		solve();
		out.flush();

		long end = System.nanoTime();
		dump((end - start) / 1000000 + " ms");
		in.close();
		out.close();
	}

	static void dump(Object... o) { if (debug) System.err.println(Arrays.deepToString(o)); }
}

class Pair <A extends Comparable<? super A>, B extends Comparable<? super B>> implements Comparable<Pair<A, B>> {
	A fst; B snd;

	public Pair(A fst, B snd) {
		this.fst = fst;
		this.snd = snd;
	}

	public int compareTo(Pair<A, B> p) {
		if (fst.compareTo(p.fst) != 0) return fst.compareTo(p.fst);
		return snd.compareTo(p.snd);
	}

	public boolean equals(Object o) {
		Pair p = (Pair)o;
		return fst.equals(p.fst) && snd.equals(p.snd);
	}

	public int hashCode() {
		return Objects.hash(fst, snd);
	}

	public String toString() {
		return "(" + fst.toString() + "," + snd.toString() + ")";
	}
}

class DisjointSet {

	private int[] par, cnt;

	public DisjointSet(int n){
		par = new int[n];
		cnt = new int[n];
		for (int i=0; i<n; i++) {
			par[i] = i;
			cnt[i] = 1;
		}
	}

	public int find(int x){
		return par[x] == x ? x : (par[x] = find(par[x]));
	}

	public boolean same(int x, int y){
		return find(x) == find(y);
	}

	public void unite(int x, int y){
		x = find(x); y = find(y);
		if (x == y) return;
		cnt[x] = cnt[y] = cnt[x] + cnt[y];
		par[x] = y;
	}

	public int size(int x) {
		return cnt[find(x)];
	}

	public String toString() {
		return Arrays.toString(par);
	}
}

class Reader {
	private final InputStream in;
	private final byte[] buf = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;

	public Reader() { this(System.in);}
	public Reader(InputStream source) { this.in = source;}

	private boolean hasNextByte() {
		if (ptr < buflen) return true;
		ptr = 0;
		try{
			buflen = in.read(buf);
		}catch (IOException e) {e.printStackTrace();}
		if (buflen <= 0) return false;
		return true;
	}

	private int readByte() { if (hasNextByte()) return buf[ptr++]; else return -1;}

	private boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}

	private void skip() { while(hasNextByte() && !isPrintableChar(buf[ptr])) ptr++;}

	public boolean hasNext() {skip(); return hasNextByte();}

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
		boolean minus = false;
		long num = readByte();

		if(num == '-'){
			num = 0;
			minus = true;
		}else if (num < '0' || '9' < num){
			throw new NumberFormatException();
		}else{
			num -= '0';
		}

		while(true){
			int b = readByte();
			if('0' <= b && b <= '9')
				num = num * 10 + (b - '0');
			else if(b == -1 || !isPrintableChar(b))
				return minus ? -num : num;
			else
				throw new NoSuchElementException();
		}
	}

	public int nextInt() {
		long num = nextLong();
		if (num < Integer.MIN_VALUE || Integer.MAX_VALUE < num)
			throw new NumberFormatException();
		return (int)num;
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}

	public char nextChar() {
		if (!hasNext()) throw new NoSuchElementException();
		return (char)readByte();
	}

	public String nextLine() {
		while (hasNextByte() && (buf[ptr] == '\n' || buf[ptr] == '\r')) ptr++;
		if (!hasNextByte()) throw new NoSuchElementException();

		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (b != '\n' && b != '\r' && b != -1) {
			sb.appendCodePoint(b);
			b = readByte();
		}

		return sb.toString();
	}

	public int[] nextIntArray(int n) {
		int[] res = new int[n];
		for (int i=0; i<n; i++) res[i] = nextInt();
		return res;
	}

	public char[] nextCharArray(int n) {
		char[] res = new char[n];
		for (int i=0; i<n; i++) res[i] = nextChar();
		return res;
	}

	public void close() {try{ in.close();}catch(IOException e){ e.printStackTrace();}};
}