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
		int A=sc.nextInt();
		int B=sc.nextInt();
		long[] v=sc.nextLongArray(N);
		Arrays.sort(v);
		HashMap<Long, Integer> hashMap=new HashMap<>();
		for (int i = 0; i < v.length; i++) {
			if (hashMap.containsKey(v[i])) {
				hashMap.put(v[i], hashMap.get(v[i])+1);
			}else {
				hashMap.put(v[i], 1);
			}
		}
		int a=upper_bound(v, 0, N-1, v[N-A]);
		int sum_a=N-a;
		long sum=0;
		long[][] nCk=new long[51][51];
		for (int i = 0; i <= 50; i++) {
			for (int j = 0; j <= i; j++) {
				if (j==0||(j==i)) {
					nCk[i][j]=1L;
				}
				else {
					nCk[i][j]=nCk[i-1][j]+nCk[i-1][j-1];
				}
			}
		}
		int c=hashMap.get(v[N-A]);
		for (int i = A; i <= B; i++) {
			int x=i-sum_a;
			sum+=nCk[c][x];
			if (sum_a!=0) {
				break;
			}
		}
		double ave=0;
		for (int i = N-A; i < N; i++) {
			ave+=v[i];
		}
		System.out.println(ave/(double)A);
		System.out.println(sum);
 	}
	
	public static int upper_bound(long[] a, int fromIndex, int toIndex, long val) {
		if (val >= a[toIndex])
			return toIndex + 1;
		if (val < a[fromIndex])
			return fromIndex;
		int lb = fromIndex - 1, ub = toIndex;
		while (ub - lb > 1) {
			int mid = (ub - lb)/2+lb;
			if (a[mid] > val) {
				ub = mid;
			} else {
				lb = mid;
			}
		}
		return ub;
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
