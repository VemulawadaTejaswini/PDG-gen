
import java.util.*;

import java.io.*;

public class Main {
	
	public static class FastReader {
		 
		private InputStream stream;
		private byte[] buf = new byte[4096];
		private int curChar, snumChars;
 
		public FastReader(InputStream stream) {
			this.stream = stream;
		}
 
		public int read() {
			if (snumChars == -1) {
				throw new InputMismatchException();
			}
			if (curChar >= snumChars) {
				curChar = 0;
				try {
					snumChars = stream.read(buf);
				} catch (IOException E) {
					throw new InputMismatchException();
				}
			}
			if (snumChars <= 0) {
				return -1;
			}
			return buf[curChar++];
		}
 
		public int nextInt() {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			int number = 0;
			do {
				number *= 10;
				number += c - '0';
				c = read();
			} while (!isSpaceChar(c));
			return number * sgn;
		}
 
		public long nextLong() {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			long sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			long number = 0;
			do {
				number *= 10L;
				number += (long) (c - '0');
				c = read();
			} while (!isSpaceChar(c));
			return number * sgn;
		}
 
		public int[] nextIntArray(int n) {
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = this.nextInt();
			}
			return arr;
		}
 
		public long[] nextLongArray(int n) {
			long[] arr = new long[n];
			for (int i = 0; i < n; i++) {
				arr[i] = this.nextLong();
			}
			return arr;
		}
 
		public String next() {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isSpaceChar(c));
			return res.toString();
		}
 
		public String nextLine() {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isEndofLine(c));
			return res.toString();
		}
 
		public boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}
 
		public boolean isEndofLine(int c) {
			return c == '\n' || c == '\r' || c == -1;
		}
 
	}
 
	public static FastReader sc;
	public static PrintWriter out;
	public static void main(String[] args) {
		new Thread(null, null, "Thread", 1 << 28) {
			public void run() {
				try {
					out = new PrintWriter(new BufferedOutputStream(System.out));
					sc = new FastReader(System.in);
					new Main().solve();
					out.close();
				} catch (Exception e) {
					e.printStackTrace();
					System.exit(1);
				}
			}
		}.start();
	}

	long mod = (long) (1e9+7);
	
	public void solve() {
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		int max = 0;
		for(int i=0;i<n;++i) {
			a[i] = sc.nextInt();
			max = Math.max(max, a[i]);
		}
		int l=1,r=max;
		int ans = 0;
		while(l<=r) {
			int mid = (l+r)>>1;
		    if(check(mid,k,a)) {
		    	ans = mid;
		    	r = mid-1;
		    }else l = mid+1;
		}
		out.print(ans);
		
	}
	
	boolean check(int mid,int k,int[] a) {
		long cnt = 0;
		for(int i=0;i<a.length;++i) {
			cnt+=(a[i]-1)/mid;
		}
		return cnt <= k;
	}
	
}

