import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class Main {

	static PrintWriter out;
	static InputReader ir;
	static final int INF=Integer.MAX_VALUE;

	static void solve() {
		int n = ir.nextInt();
		int m=ir.nextInt();
		int[] a=ir.nextIntArray(n);
		UnionFindTree uf=new UnionFindTree(n,a);
		for(int i=0;i<m;i++)
			uf.unite(ir.nextInt(), ir.nextInt());
		PriorityQueue<int[]> pq=new PriorityQueue<int[]>(new Comparator<int[]>(){
			public int compare(int[] a,int[] b){
				return a[1]!=b[1]?a[1]-b[1]:b[2]-a[2];
			}
		});
		PriorityQueue<Integer> val=new PriorityQueue<>();
		long ret=0;
		for(int i=0;i<n;i++)
			if(uf.par[i]<0)
				pq.add(new int[]{i,uf.smv(i),uf.size(i)});
		int[] s=pq.poll();
		for(int i=0;i<uf.st[s[0]].size();i++){
			val.add(a[uf.st[s[0]].get(i)]);
		}
		while(!pq.isEmpty()){
			s=pq.poll();
			int mv=uf.mv(s[0]);
			ret+=mv;
			if(val.isEmpty()){
				out.println("Impossible");
				return;
			}
			ret+=val.poll();
			boolean f=false;
			for(int i=0;i<uf.st[s[0]].size();i++){
				int p=uf.st[s[0]].get(i);
				if(!f&&a[p]==mv){
					f=true;
				}
				else
					val.add(a[p]);
			}
		}
		out.println(ret);
	}

	static class Set extends ArrayList<Integer>{}

	static class UnionFindTree {

		public int[] par;
		private int[] mi,smi;
		public Set[] st;

		public UnionFindTree(int size,int[] a) {
			par = new int[size];
			mi=new int[size];
			smi=new int[size];
			st=new Set[size];
			for (int i = 0; i < size; i++){
				par[i] = -1;
				mi[i]=a[i];
				st[i]=new Set();
				st[i].add(i);
			}
			Arrays.fill(smi, INF);
		}

		private int mv(int x){
			return mi[find(x)];
		}

		private int smv(int x){
			return smi[find(x)];
		}

		private int find(int x) {
			if (par[x] < 0)
				return x;
			else
				return par[x] = find(par[x]);
		}

		public void unite(int x, int y) {
			x = find(x);
			y = find(y);
			if (x == y)
				return;
			if (par[x] > par[y]) {
				int t = x;
				x = y;
				y = t;
			}
			st[x].addAll(st[y]);
			par[x] += par[y];
			par[y] = x;
			smi[x]=Math.min(mi[x], mi[y])==mi[y]?Math.min(mi[x], smi[y]):Math.min(mi[y], smi[x]);
			mi[x]=Math.min(mi[x], mi[y]);
		}

		public boolean same(int x, int y) {
			return find(x) == find(y);
		}

		public int size(int x) {
			return -par[find(x)];
		}
	}

	public static void main(String[] args) throws Exception {
		ir = new InputReader(System.in);
		out = new PrintWriter(System.out);
		solve();
		out.flush();
	}

	static class InputReader {

		private InputStream in;
		private byte[] buffer = new byte[1024];
		private int curbuf;
		private int lenbuf;

		public InputReader(InputStream in) {
			this.in = in;
			this.curbuf = this.lenbuf = 0;
		}

		public boolean hasNextByte() {
			if (curbuf >= lenbuf) {
				curbuf = 0;
				try {
					lenbuf = in.read(buffer);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (lenbuf <= 0)
					return false;
			}
			return true;
		}

		private int readByte() {
			if (hasNextByte())
				return buffer[curbuf++];
			else
				return -1;
		}

		private boolean isSpaceChar(int c) {
			return !(c >= 33 && c <= 126);
		}

		private void skip() {
			while (hasNextByte() && isSpaceChar(buffer[curbuf]))
				curbuf++;
		}

		public boolean hasNext() {
			skip();
			return hasNextByte();
		}

		public String next() {
			if (!hasNext())
				throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (!isSpaceChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		public int nextInt() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}

		public long nextLong() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			long res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

		public int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		public long[] nextLongArray(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}

		public char[][] nextCharMap(int n, int m) {
			char[][] map = new char[n][m];
			for (int i = 0; i < n; i++)
				map[i] = next().toCharArray();
			return map;
		}
	}
}