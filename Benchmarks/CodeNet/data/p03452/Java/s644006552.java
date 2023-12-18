import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {

	static PrintWriter out;
	static InputReader ir;

	static void solve() {
		int n=ir.nextInt();
		int m=ir.nextInt();
		int[][] a=new int[m][3];
		for(int i=0;i<m;i++){
			a[i]=new int[]{ir.nextInt()-1,ir.nextInt()-1,ir.nextInt()};
		}
		Arrays.sort(a,new Comparator<int[]>(){
			public int compare(int[] a,int[] b){
				if(a[0]!=b[0])
					return a[0]-b[0];
				else
					return a[1]-b[1];
			}
		});
		long INF=Long.MAX_VALUE;
		long[] di=new long[n];
		Arrays.fill(di, INF);
		for(int i=0;i<m;i++){
			int l=a[i][0];
			int r=a[i][1];
			if(di[l]==INF&&di[r]==INF){
				di[l]=0;
				di[r]=a[i][2];
			}
			else if(di[l]==INF){
				di[l]=di[r]-a[i][2];
			}
			else if(di[r]==INF){
				di[r]=di[l]+a[i][2];
			}
			else{
				if(di[r]!=di[l]+a[i][2]){
					out.println("No");
					return;
				}
			}
		}
		out.println("Yes");
	}

	static int[] par;
	static int[] rank;

	static void init(int n){
		par=new int[n];
		rank=new int[n];
		for(int i=0;i<n;i++){
			par[i]=i;
			rank[i]=0;
		}
	}

	static int find(int x){
		if(par[x]==x){
			return x;
		}
		return par[x]=find(par[x]);
	}

	static void unite(int x,int y){
		int nx=find(x);
		int ny=find(y);
		if(nx==ny)
			return;
		if(rank[nx]<rank[y])
			par[nx]=par[ny];
		else{
			par[ny]=par[nx];
			if(rank[nx]==rank[ny])
				rank[nx]++;
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