import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;

 
public class Main {
	static final long MOD1=1000000007;
	static final long MOD2=998244353;
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		InputReader sc=new InputReader(System.in);
		int N=sc.nextInt();
		char[] cs=sc.next().toCharArray();
		char[] csW=new char[N];
		csW[N-1]='S';
		csW[0]='S';
		for (int i = 0; i < cs.length-2; i++) {
			if (csW[i]=='S') {
				if (cs[i]=='o') {
					csW[i+1]=csW[(i-1+N)%N];
				}else {
					if (csW[(i-1+N)%N]=='S') {
						csW[i+1]='W';
					}else {
						csW[i+1]='S';
					}
				}
			}else {
				if (cs[i]=='o') {
					if (csW[(i-1+N)%N]=='S') {
						csW[i+1]='W';
					}else {
						csW[i+1]='S';
					}
				}else {
					csW[i+1]=csW[(i-1+N)%N];
				}
			}
		}
		boolean[] flag=new boolean[2];
		for (int i = 0; i <= 1; i++) {
			if (csW[N-2+i]=='S') {
				if (cs[N-2+i]=='o') {
					if (csW[N-3+i]==csW[(N-1+i)%N]) {
						flag[i]=true;
					}
				}else {
					if (csW[N-3+i]!=csW[(N-1+i)%N]) {
						flag[i]=true;
					}
				}
			}else {
				if (cs[N-2+i]!='o') {
					if (csW[N-3+i]==csW[(N-1+i)%N]) {
						flag[i]=true;
					}
				}else {
					if (csW[N-3]!=csW[(N-1+i)%N]) {
						flag[i]=true;
					}
				}
			}
		}
		if (flag[0]&&flag[1]) {
			System.out.println(String.valueOf(csW));
			return;
		}
		csW[N-1]='W';
		csW[0]='S';
		for (int i = 0; i < cs.length-2; i++) {
			if (csW[i]=='S') {
				if (cs[i]=='o') {
					csW[i+1]=csW[(i-1+N)%N];
				}else {
					if (csW[(i-1+N)%N]=='S') {
						csW[i+1]='W';
					}else {
						csW[i+1]='S';
					}
				}
			}else {
				if (cs[i]=='o') {
					if (csW[(i-1+N)%N]=='S') {
						csW[i+1]='W';
					}else {
						csW[i+1]='S';
					}
				}else {
					csW[i+1]=csW[(i-1+N)%N];
				}
			}
		}
		Arrays.fill(flag, false);
		for (int i = 0; i <= 1; i++) {
			if (csW[N-2+i]=='S') {
				if (cs[N-2+i]=='o') {
					if (csW[N-3+i]==csW[(N-1+i)%N]) {
						flag[i]=true;
					}
				}else {
					if (csW[N-3+i]!=csW[(N-1+i)%N]) {
						flag[i]=true;
					}
				}
			}else {
				if (cs[N-2+i]!='o') {
					if (csW[N-3+i]==csW[(N-1+i)%N]) {
						flag[i]=true;
					}
				}else {
					if (csW[N-3]!=csW[(N-1+i)%N]) {
						flag[i]=true;
					}
				}
			}
		}
		if (flag[0]&&flag[1]) {
			System.out.println(String.valueOf(csW));
			return;
		}
		csW[N-1]='S';
		csW[0]='W';
		for (int i = 0; i < cs.length-2; i++) {
			if (csW[i]=='S') {
				if (cs[i]=='o') {
					csW[i+1]=csW[(i-1+N)%N];
				}else {
					if (csW[(i-1+N)%N]=='S') {
						csW[i+1]='W';
					}else {
						csW[i+1]='S';
					}
				}
			}else {
				if (cs[i]=='o') {
					if (csW[(i-1+N)%N]=='S') {
						csW[i+1]='W';
					}else {
						csW[i+1]='S';
					}
				}else {
					csW[i+1]=csW[(i-1+N)%N];
				}
			}
		}
		Arrays.fill(flag, false);
		for (int i = 0; i <= 1; i++) {
			if (csW[N-2+i]=='S') {
				if (cs[N-2+i]=='o') {
					if (csW[N-3+i]==csW[(N-1+i)%N]) {
						flag[i]=true;
					}
				}else {
					if (csW[N-3+i]!=csW[(N-1+i)%N]) {
						flag[i]=true;
					}
				}
			}else {
				if (cs[N-2+i]!='o') {
					if (csW[N-3+i]==csW[(N-1+i)%N]) {
						flag[i]=true;
					}
				}else {
					if (csW[N-3]!=csW[(N-1+i)%N]) {
						flag[i]=true;
					}
				}
			}
		}
		if (flag[0]&&flag[1]) {
			System.out.println(String.valueOf(csW));
			return;
		}
		csW[N-1]='W';
		csW[0]='W';
		for (int i = 0; i < cs.length-2; i++) {
			if (csW[i]=='S') {
				if (cs[i]=='o') {
					csW[i+1]=csW[(i-1+N)%N];
				}else {
					if (csW[(i-1+N)%N]=='S') {
						csW[i+1]='W';
					}else {
						csW[i+1]='S';
					}
				}
			}else {
				if (cs[i]=='o') {
					if (csW[(i-1+N)%N]=='S') {
						csW[i+1]='W';
					}else {
						csW[i+1]='S';
					}
				}else {
					csW[i+1]=csW[(i-1+N)%N];
				}
			}
		}
		Arrays.fill(flag, false);
		for (int i = 0; i <= 1; i++) {
			if (csW[N-2+i]=='S') {
				if (cs[N-2+i]=='o') {
					if (csW[N-3+i]==csW[(N-1+i)%N]) {
						flag[i]=true;
					}
				}else {
					if (csW[N-3+i]!=csW[(N-1+i)%N]) {
						flag[i]=true;
					}
				}
			}else {
				if (cs[N-2+i]!='o') {
					if (csW[N-3+i]==csW[(N-1+i)%N]) {
						flag[i]=true;
					}
				}else {
					if (csW[N-3]!=csW[(N-1+i)%N]) {
						flag[i]=true;
					}
				}
			}
		}
		if (flag[0]&&flag[1]) {
			System.out.println(String.valueOf(csW));
			return;
		}
		System.out.println(-1);
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
