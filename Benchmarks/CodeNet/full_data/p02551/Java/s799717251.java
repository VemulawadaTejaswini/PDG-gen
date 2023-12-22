import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.util.Locale.FilteringMode;

 
public class Main {
	static final long MOD1=1000000007;
	static final long MOD2=998244353;
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		InputReader sc=new InputReader(System.in);
		int N=sc.nextInt();
		int Q=sc.nextInt();
		LazysegTreemin xTreemin=new LazysegTreemin(N-1);
		LazysegTreemin yTreemin=new LazysegTreemin(N-1);
		long ans=0;
		long xmin=Integer.MAX_VALUE;
		long ymin=Integer.MAX_VALUE;
		xTreemin.update(0, N-1, (long)N-1, 0, 0, xTreemin.size);
		yTreemin.update(0, N-1, (long)N-1, 0, 0, xTreemin.size);
		for (int i = 0; i < Q; i++) {
			int c=sc.nextInt();
			int xx=sc.nextInt()-1;
			if (c==1) {
				long m=xTreemin.getmin(xx, xx+1, 0, 0, xTreemin.size);
				ans+=m-1;
				if (xmin>=xx) {
					yTreemin.update(0, (int)m+1, (long)xx, 0, 0, yTreemin.size);
					xmin=xx;
				}
			}else {
				long m=yTreemin.getmin(xx, xx+1, 0, 0, yTreemin.size);
				ans+=m-1;
				if (ymin>=xx) {
					xTreemin.update(0, (int)m+1, (long)xx, 0, 0, yTreemin.size);
					ymin=xx;
				}
			}
		}
		System.out.println((long)(N-2)*(long)(N-2)-ans);
	}
	static class LazysegTreemin{
		int size;
		long[] dat;
		long[] lazy;
		long INF=Long.MAX_VALUE/2;
		public LazysegTreemin(int n) {
			int n_=1;
			while (n_<n) {
				n_*=2;
			}
			size=n_;
			dat=new long[2*n_-1];
			lazy=new long[2*n_-1];
			Arrays.fill(dat, INF);
			Arrays.fill(lazy, INF);
		}
		void propagate(int k,int l,int r) {
			if (lazy[k]!=INF) {
				dat[k] = lazy[k];
				if(r - l > 1) {
		            lazy[2*k+1] = lazy[k];
		            lazy[2*k+2] = lazy[k];
		        }
		        lazy[k] = INF;
			}
		}
		void update(int a,int b,long x,int k,int l,int r) {//a<=x<b加算　add(...,0,0,seg.size)で呼ぶ
			this.propagate(k,l,r);
			if (a<=l&&r<=b) {
				lazy[k]=x;
				this.propagate(k,l,r);
			}
			else if (l<b&&a<r) {//交わっている場合
				this.update(a, b, x, k*2+1,l,(l+r)/2);
				this.update(a, b, x, k*2+2, (l+r)/2, r);
				dat[k] = Math.min(dat[2*k+1],dat[2*k+2]);
			}
		}
		long getmin(int a,int b,int k,int l,int r) {//kが節点番号,l rがその節点番号の範囲
			if (r<=a||b<=l) {
				return INF;
			}
			this.propagate(k, l, r);
			if (a<=l&&r<=b) {
				return dat[k];
			}
			else {
				long vl=this.getmin(a, b, k*2+1,l,(l+r)/2);
				long vr=this.getmin(a, b, k*2+2, (l+r)/2, r);
				return (Math.min(vl, vr));
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
