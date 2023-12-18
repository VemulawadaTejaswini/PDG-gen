import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {

	static PrintWriter out;
	static InputReader ir;

	static void solve() {
		int n= ir.nextInt();
		int k=ir.nextInt();
		int[][] b=new int[2*k][2*k];
		int[][] w=new int[2*k][2*k];
		for(int i=0;i<n;i++){
			int x=ir.nextInt()%(k*2);
			int y=ir.nextInt()%(k*2);
			if(ir.next().charAt(0)=='W')
				w[x][y]++;
			else
				b[x][y]++;

		}
		int[][] ws=new int[2*k+1][2*k+1];
		int[][] bs=new int[2*k+1][2*k+1];
		for(int i=0;i<2*k;i++){
			for(int j=0;j<2*k;j++){
				ws[i+1][j+1]=w[i][j];
				bs[i+1][j+1]=b[i][j];
			}
		}
		for(int i=0;i<=2*k;i++){
			for(int j=0;j<2*k;j++){
				ws[i][j+1]+=ws[i][j];
				bs[i][j+1]+=bs[i][j];
			}
		}
		for(int i=0;i<2*k;i++){
			for(int j=0;j<=2*k;j++){
				ws[i+1][j]+=ws[i][j];
				bs[i+1][j]+=bs[i][j];
			}
		}
		int ret=0;
		for(int i=0;i<=k;i++){
			for(int j=0;j<=k;j++){
				int tot=sum(0,i,0,j,0,ws,bs)+sum(0,i,j+k,2*k,0,ws,bs)+sum(i,i+k,j,j+k,0,ws,bs)+sum(i+k,2*k,0,j,0,ws,bs)+sum(i+k,2*k,j+k,2*k,0,ws,bs)+sum(0,i,j,j+k,1,ws,bs)+sum(i,i+k,0,j,1,ws,bs)+sum(i,i+k,j+k,2*k,1,ws,bs)+sum(i+k,2*k,j,j+k,1,ws,bs);
				ret=Math.max(ret,Math.max(n-tot,tot));
			}
		}
		out.println(ret);
	}

	static int sum(int a,int b,int c,int d,int col,int[][] ws,int[][] bs){
		if(col==0)
			return ws[b][d]-ws[b][c]-ws[a][d]+ws[a][c];
		return bs[b][d]-bs[b][c]-bs[a][d]+bs[a][c];
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