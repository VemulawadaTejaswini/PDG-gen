import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.*;
import java.util.concurrent.CountDownLatch;
import java.util.logging.Logger;

import javax.sound.midi.MidiMessage;
 
public class Main {
	  static int MAX = 510000;
		static long[] fac=new long[MAX];
		static long[] finv=new long[MAX];
		static long[] inv=new long[MAX];
		static long MOD=(long) (Math.pow(10, 9)+7);
		static boolean[] visited;
	public static void main(String[] args){
		PrintWriter out = new PrintWriter(System.out);
		InputReader sc=new InputReader(System.in);
		int N=sc.nextInt();
		int q=sc.nextInt();
		LazysegTreesum lazysegTreesum=new LazysegTreesum(N);
		for (int i = 0; i < q; i++) {
			int c=sc.nextInt();
			if (c==0) {
				int s=sc.nextInt();
				int t=sc.nextInt()+1;
				long x=sc.nextLong();
				lazysegTreesum.update(s, t, x, 0, 0, lazysegTreesum.size);
			}
			else {
				int s=sc.nextInt();
				int t=sc.nextInt()+1;
				out.println(lazysegTreesum.getsum(s, t, 0, 0, lazysegTreesum.size));
			}
		}
		out.flush();
	}
	static class LazysegTreesum{
		int size;
		long[] dat;
		long[] lazy;
		long MINF=Long.MIN_VALUE;
		public LazysegTreesum(int n) {
			int n_=1;
			while (n_<n) {
				n_*=2;
			}
			size=n_;
			dat=new long[2*n_-1];
			lazy=new long[2*n_-1];
			Arrays.fill(lazy, MINF);
		}
		void propagate(int k,int l,int r) {
			if (lazy[k]!=MINF) {
				dat[k] = lazy[k];
				if(r - l > 1) {
		            lazy[2*k+1] = lazy[k]/2;
		            lazy[2*k+2] = lazy[k]/2;
		        }
		        lazy[k] = MINF;
			}
		}
		void update(int a,int b,long x,int k,int l,int r) {//a<=x<b加算　add(...,0,0,seg.size)で呼ぶ
			this.propagate(k,l,r);
			if (a<=l&&r<=b) {
				lazy[k]=(long)(r-l)*x;
				this.propagate(k,l,r);
			}
			else if (l<b&&a<r) {//交わっている場合
				this.update(a, b, x, k*2+1,l,(l+r)/2);
				this.update(a, b, x, k*2+2, (l+r)/2, r);
				dat[k] = dat[2*k+1]+dat[2*k+2];
			}
		}
		long getsum(int a,int b,int k,int l,int r) {//kが節点番号,l rがその節点番号の範囲
			if (r<=a||b<=l) {
				return 0;
			}
			this.propagate(k, l, r);
			if (a<=l&&r<=b) {
				return dat[k];
			}
			else {
				long vl=this.getsum(a, b, k*2+1,l,(l+r)/2);
				long vr=this.getsum(a, b, k*2+2, (l+r)/2, r);
				return (vl+vr);
			}
		}//getsum(x, y, 0, 0, size)で呼ぶ
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

