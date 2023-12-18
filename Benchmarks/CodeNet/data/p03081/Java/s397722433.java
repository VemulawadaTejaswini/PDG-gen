import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
	static final long MOD=1000000007;//998244353;
	static long ans;
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		InputReader sc=new InputReader(System.in);
		int N=sc.nextInt();
		int Q=sc.nextInt();
		char[] cs=sc.next().toCharArray();
		String[] t=new String[Q];
		String[] d=new String[Q];
		for (int i = 0; i < d.length; i++) {
			t[i]=sc.next();
			d[i]=sc.next();
		}
		int ans=0;
		int from=0;
		int to=N;
		while ((to-from)>=1) {
			int mid=(to-from)/2+from;
			if (f1(cs, mid, t, d)) {
				to=mid;
			}
			else {
				from=mid+1;
			}
		}
		ans=to;
		from=0;
		to=N;
		while ((to-from)>=1) {
			int mid=(to-from)/2+from;
			if (f2(cs, mid, t, d)) {
				to=mid;
			}
			else {
				from=mid+1;
			}
		}
		System.out.println(to-ans);
 	}
	static boolean f1(char[] cs,int mid,String[] t,String[] d) {
		if (mid==cs.length) {
			return true;
		}
		int now=mid;
		for (int i = 0; i < d.length; i++) {
			if (String.valueOf(cs[now]).equals(t[i])) {
				if (d[i].equals("L")) {
					now--;
				}else {
					now++;
				}
			}
			if (now<0) {
				return false;
			}
			if (now>=cs.length) {
				return true;
			}
		}
		return true;
	}
	static boolean f2(char[] cs,int mid,String[] t,String[] d) {
		if (mid==cs.length) {
			return true;
		}
		int now=mid;
		for (int i = 0; i < d.length; i++) {
			if (String.valueOf(cs[now]).equals(t[i])) {
				if (d[i].equals("L")) {
					now--;
				}else {
					now++;
				}
			}
			if (now<0) {
				return false;
			}
			if (now>=cs.length) {
				return true;
			}
		}
		return false;
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
