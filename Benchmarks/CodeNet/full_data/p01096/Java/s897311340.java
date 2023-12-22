import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main  {
		public static void main(String[] args){
		PrintWriter out = new PrintWriter(System.out);
		InputReader sc=new InputReader(System.in);
		while (true) {
			int n=sc.nextInt();
			if (n==0) {
				break;
			}
			int[] w=sc.nextIntArray(n);
			boolean[][] possible=new boolean[n][n];
			for (int i = 0; i < possible.length-1; i++) {
				if (Math.abs(w[i]-w[i+1])<=1) {
					possible[i][i+1]=true;
				}
			}
			for (int i = 2; i < possible.length; i++) {
				for (int j = 0; j < possible.length-i; j++) {
					if (possible[j+1][j+i-1]&&Math.abs(w[j]-w[j+i])<=1) {
						possible[j][j+i]=true;
						continue;
					}
					for (int j2 = j+1; j2 < j+i; j2++) {
						if (possible[j][j2]&&possible[j2+1][j+i]) {
							possible[j][j+i]=true;
							break;
						}
					}
				}
			}
			int[][] dp=new int[n][n];
			for (int i = 0; i < dp.length; i++) {
				for (int j = 0; j < dp.length; j++) {
					if (possible[i][j]) {
						dp[i][j]=j-i+1;
					}
				}
			}
			for (int i = 2; i < dp.length; i++) {
				for (int j = 0; j < dp.length-i; j++) {
					for (int j2 = j; j2 < j+i; j2++) {
						dp[j][j+i]=Math.max(dp[j][j+i], dp[j][j2]+dp[j2+1][j+i]);
					}
				}
			}
			out.println(dp[0][n-1]);
		}
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

