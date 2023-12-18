import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

import javax.crypto.Cipher;
import javax.naming.InitialContext;

public class Main {
	static final long MOD=1000000007;//998244353;
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		InputReader sc=new InputReader(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		long[] num=new long[100001];
		int last=0;
		for (int i = 1; i <= N; i++) {
			if ((long)i*(long)i<=N) {
				last=i;
				continue;
			}
			int j=N/i;
			num[j]=N/j-i+1;
			i=N/j;
		}
		long[][] dp1=new long[K+1][last+1];
		long[][] dp2=new long[K+1][num.length];
		dp1[0][1]=1;
		for (int i = 1; i <= K; i++) {
			long[] sum1=new long[last+1];
			sum1[0]=dp1[i-1][0];
			for (int j = 1; j < sum1.length; j++) {
				sum1[j]=(sum1[j-1]+dp1[i-1][j])%MOD;
			}
			long[] sum2=new long[num.length];
			sum2[sum2.length-1]=dp2[i-1][num.length-1];
			for (int j = num.length-2; j >= 0; j--) {
				sum2[j]=(sum2[j+1]+dp2[i-1][j])%MOD;
			}
			for (int j = 1; j < sum1.length; j++) {
				dp1[i][j]=(sum1[sum1.length-1]+sum2[j])%MOD;
			}
			for (int j = 1; j < sum2.length; j++) {
				if (j>=sum1.length) {
					break;
				}
				dp2[i][j]=(num[j]*sum1[j])%MOD;
			}
		}
		long sum=0;
		for (int i = 0; i <= last; i++) {
			sum=(sum+dp1[K][i])%MOD;
		}
		for (int i = 1; i <= 100000; i++) {
			sum=(sum+dp2[K][i])%MOD;
		}
		System.out.println(sum);
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