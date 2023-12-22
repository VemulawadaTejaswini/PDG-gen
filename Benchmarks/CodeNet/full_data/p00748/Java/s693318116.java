import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;


public class Main {
	static final long MOD=1000000007;
	public static void main(String[] args){
		PrintWriter out = new PrintWriter(System.out);
		InputReader sc=new InputReader(System.in);
		int[] dp=new int[1000001];
		ArrayList<Integer> arrayList=new ArrayList<>();
		ArrayList<Integer> arrayListodd=new ArrayList<>();
		int n=1;
		int[] dp2=new int[1000001];
		Arrays.fill(dp, Integer.MAX_VALUE/2);
		Arrays.fill(dp2, Integer.MAX_VALUE/2);
		dp[0]=0;
		dp2[0]=0;
		while (n*(n+1)*(n+2)/6<=1000001) {
			if (n*(n+1)*(n+2)/6%2==1) {
				arrayListodd.add(n*(n+1)*(n+2)/6);
			}
			arrayList.add(n*(n+1)*(n+2)/6);
			n++;
		}
		for (int i = 1; i < dp.length; i++) {
			for (Integer integer : arrayList) {
				if (i-integer>=0) {
					dp[i]=Math.min(dp[i], dp[i-integer]+1);
				}
			}
		}
		for (int i = 1; i < dp2.length; i++) {
			for (Integer integer : arrayListodd) {
				if (i-integer>=0) {
					dp2[i]=Math.min(dp2[i], dp2[i-integer]+1);
				}
			}
		}
		while (true) {
			int N=sc.nextInt();
			if (N==0) {
				break;
			}
			out.println(dp[N]+" "+dp2[N]);
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

