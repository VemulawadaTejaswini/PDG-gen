import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
public class Main {
	static long MOD=1000000007;
	static int[] dx= {-1,0,1};
	static int[] dy= {-1,0,1};
	public static void main(String[] args){
		PrintWriter out = new PrintWriter(System.out);
		InputReader sc=new InputReader(System.in);
		while (true) {
			int W=sc.nextInt();
			int H=sc.nextInt();
			if (H==0&&W==0) {
				break;
			}
			boolean[][] visited=new boolean[H][W];
			int[][] c=new int[H][W];
			for (int i = 0; i < c.length; i++) {
				c[i]=sc.nextIntArray(W);
			}
			int ans=0;
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					if (c[i][j]==1&&!visited[i][j]) {
						dfs(i, j, visited, H, W,c);
						ans++;
					}
				}
			}
			out.println(ans);
		}
		out.flush();
	}
	static void dfs(int h,int w,boolean[][] visited,int H,int W,int[][] c) {
		visited[h][w]=true;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (dx[i]==0&&dy[j]==0) {
					continue;
				}
				if (h+dy[j]>=0&&h+dy[j]<H&&w+dx[i]>=0&&w+dx[i]<W) {
					if (!visited[h+dy[j]][w+dx[i]]&&c[h+dy[j]][w+dx[i]]==1) {
						dfs(h+dy[j], w+dx[i], visited, H, W,c);
					}
				}
			}
		}
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

