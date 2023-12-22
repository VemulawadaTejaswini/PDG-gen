import java.util.*;
import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {

	static final Reader in = new Reader();
	static final PrintWriter out = new PrintWriter(System.out,false);
	static boolean debug = false;

	static int[][][] directedGraph(int n, int[] s, int[] t, int[] cost) {
		int[] cnt = new int[n];
		for (int i : s) cnt[i]++;

		int[][][] g = new int[n][][];
		for (int i=0; i<n; i++) g[i] = new int[cnt[i]][2];
		for (int i=0; i<s.length; i++) {
			int from = s[i];
			int to = t[i];

			g[from][--cnt[from]][0] = to;
			g[from][cnt[from]][1] = cost[i];
		}

		return g;
	}

	static int[] dijkstra(int[][][] g, int source) {
		int n = g.length;

		final int[] d = new int[n];
		Arrays.fill(d, 1<<29);
		d[source] = 0;

		TreeSet<Integer> pQ = new TreeSet<Integer>(new Comparator<Integer>(){
			public int compare(Integer a, Integer b) {
				if (d[a] != d[b]) return d[a] - d[b];
				return a - b;
			}
		});
		pQ.add(source);

		while (!pQ.isEmpty()) {
			int cur = pQ.pollFirst();

			for (int i=0; i<g[cur].length; i++) {
				int next = g[cur][i][0];
				int dist = d[cur] + g[cur][i][1];
				if (dist < d[next]) {
					pQ.remove(next);
					d[next] = dist;
					pQ.add(next);
				}
			}
		}

		return d;
	}


	static boolean solve(){
		int w = in.nextInt();
		int h = in.nextInt();
		if (w + h == 0) return false;

		char[][] table = new char[h][w];
		for (int i=0; i<h; i++) {
			for (int j=0; j<w; j++) {
				table[i][j] = in.nextChar();
			}
		}

		int[] rx = {1, 1, 1, 2, 2, 3, 1, 1, 2};
		int[] ry = {0, 1, 2, 1, 0, 0, -1, -2, -1};

		int[] lx = {-1, -1, -1, -2, -2, -3, -1, -1, -2};
		int[] ly = {0, 1, 2, 1, 0, 0, -1, -2, -1};

		ArrayList<Integer> s = new ArrayList<>();
		ArrayList<Integer> t = new ArrayList<>();
		ArrayList<Integer> cost = new ArrayList<>();

		for (int i=0; i<h; i++) {
			for (int j=0; j<w; j++) {
				if (table[i][j] == 'X') continue;

				// r
				for (int k=0; k<9; k++) {
					int ni = i + ry[k];
					int nj = j + rx[k];
					if (ni < 0 || nj < 0 || h <= ni || w <= nj) continue;
					if (table[ni][nj] == 'X') continue;
					s.add(i*w+j);
					t.add(ni*w+nj + h*w);
					cost.add(table[ni][nj] == 'T' ? 0 : table[ni][nj] - '0');
				}

				// l
				for (int k=0; k<9; k++) {
					int ni = i + ly[k];
					int nj = j + lx[k];
					if (ni < 0 || nj < 0 || h <= ni || w <= nj) continue;
					if (table[ni][nj] == 'X') continue;
					s.add(i*w+j + h*w);
					t.add(ni*w+nj);
					cost.add((table[ni][nj] == 'T' ||table[ni][nj] == 'S') ? 0 : (table[ni][nj] - '0'));
				}
			}
		}

		int start = h*w*2;
		int goal = start + 1;

		for (int j=0; j<w; j++) {
			if (table[h-1][j] == 'S') {
				s.add(start);
				t.add((h-1)*w+j);
				cost.add(0);

				s.add(start);
				t.add((h-1)*w+j + h*w);
				cost.add(0);
			}
		}

		for (int j=0; j<w; j++) {
			if (table[0][j] == 'T') {
				s.add(0*w+j);
				t.add(goal);
				cost.add(0);

				s.add(0*w+j + h*w);
				t.add(goal);
				cost.add(0);
			}
		}

		int m = s.size();
		int[] ss = new int[m];
		int[] tt = new int[m];
		int[] cc = new int[m];
		for (int i=0; i<m; i++) {
			ss[i] = s.get(i);
			tt[i] = t.get(i);
			cc[i] = cost.get(i);
		}

		// dump(ss);
		// dump(tt);
		// dump(cc);

		int[][][] g = directedGraph(goal+1, ss, tt, cc);

		// dump(g);

		int[] d = dijkstra(g, start);

		out.println(d[goal] >= 1<<29 ? -1 : d[goal]);

		// dump(d);

		return true;
	}

	public static void main(String[] args) throws Exception {
		debug = args.length > 0;
		long start = System.nanoTime();

		while(solve());
		out.flush();

		long end = System.nanoTime();
		dump((end - start) / 1000000 + " ms");
		in.close();
		out.close();
	}

	static void dump(Object... o) { if (debug) System.err.println(Arrays.deepToString(o)); }
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