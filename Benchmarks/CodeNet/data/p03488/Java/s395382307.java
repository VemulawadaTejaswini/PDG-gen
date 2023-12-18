import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

 
public class Main {
	static final long MOD1=1000000007;
	static final long MOD2=998244353;
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		InputReader sc=new InputReader(System.in);
		char[] cs=sc.next().toCharArray();
		int x=sc.nextInt();
		int y=sc.nextInt();
		boolean[][][] dpx=new boolean[cs.length+1][16001][3];//右、左、縦
		dpx[0][8000][0]=true;
		for (int i = 1; i < dpx.length; i++) {
			for (int j = 0; j <= 16000; j++) {
				if (cs[i-1]=='F') {
					dpx[i][j][2]|=dpx[i-1][j][2];
					if(j-1>=0)dpx[i][j][0]|=dpx[i-1][j-1][0];
					if(j+1<=16000)dpx[i][j][1]|=dpx[i-1][j+1][1];
				}else {
					dpx[i][j][2]=(dpx[i-1][j][0]|dpx[i-1][j][1]);
					dpx[i][j][1]=dpx[i-1][j][2];
					dpx[i][j][0]=dpx[i-1][j][2];
				}
			}
		}
		boolean[][][] dpy=new boolean[cs.length+1][16001][3];//上、下、横
		dpy[0][8000][2]=true;
		for (int i = 1; i < dpy.length; i++) {
			for (int j = 0; j <= 16000; j++) {
				if (cs[i-1]=='F') {
					dpy[i][j][2]|=dpy[i-1][j][2];
					if(j-1>=0)dpy[i][j][0]|=dpy[i-1][j-1][0];
					if(j+1<=16000)dpy[i][j][1]|=dpy[i-1][j+1][1];
				}else {
					dpy[i][j][2]=(dpy[i-1][j][0]|dpy[i-1][j][1]);
					dpy[i][j][1]=dpy[i-1][j][2];
					dpy[i][j][0]=dpy[i-1][j][2];
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (dpx[cs.length][x+8000][i]&&dpy[cs.length][y+8000][j]) {
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");
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
