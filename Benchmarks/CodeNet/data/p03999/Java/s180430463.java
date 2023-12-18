import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Objects;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author vincent trần
 */

public class Main {
	
	public static void main(String[] args) throws Exception{
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        StdIn in = new StdIn(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Solution solver = new Solution();
        solver.solve(1, in, out);
        out.close();
    }

    static class Solution {
    	
		public void solve(int testNumber, StdIn in, PrintWriter out) throws Exception {
			char []a = in.next().trim().toCharArray();
			int max = 1 << (a.length - 1);
			long ans = 0;
			for(int x = 0; x < max; ++x) {
				long cur = 0;
				for(int i = 0; i < a.length; ++i) {
					if((x & (1 << i)) > 0) cur = cur * 10 + a[i] - '0'; 
					else {
						ans += cur * 10 + a[i] - '0';
						cur = 0;
					}
				}
			}
			out.println(ans);
        }
    }
	
	static long mul_mod(long a, long b, long m) {
		if (a >= m)
			a %= m;
		if (b >= m)
			b %= m;
		double x = a;
		long c = (long) (x * b / m);
		long r = (long) (a * b - c * m) % m;
		return r < 0 ? r + m : r;
	}

	static long pow_mod(long a, long b, long m) {
		long res = 1;
		a %= m;
		while (b > 0) {
			if (b % 2 != 0)
				res = mul_mod(res, a, m);
			b >>= 1;
			a = mul_mod(a, a, m);
		}
		return res;
	}

	static class Pair<T extends Comparable<T>, K extends Comparable<K>> implements Comparable<Pair<T, K>>{
		public T x;
		public K y;
		
		public Pair() { }
		public Pair(T first, K second) {
			this.x = first;
			this.y = second;
		}
		
		@Override
		public int compareTo(Pair<T, K> o) {
			int cmp = x.compareTo(o.x);
			return cmp != 0 ? cmp : y.compareTo(y);
		}
		
		@Override
		public boolean equals(Object obj) {
			if (!(obj instanceof Pair)) {
	            return false;
	        }
	        Pair<?, ?> p = (Pair<?, ?>) obj;
	        return Objects.equals(p.x, x) && Objects.equals(p.y, y);
		}
		
		@Override
		public int hashCode() {
			return x.hashCode() * 31 + y.hashCode() * 10000007;
		}
		
		@Override
		public String toString() {
			return "( " + x.toString() + " , " + y.toString() + " )";
		}
	}
	
	static class PairInt extends Pair<Integer, Integer> {
		public PairInt() { super(0, 0); }
		public PairInt(int a, int b) { super(a, b); }
	}
	static class PairLong extends Pair<Long, Long> {
		public PairLong() { super(0L, 0L); }
		public PairLong(long a, long b) { super(a, b); }
	}

	static class StdIn {
		final private int BUFFER_SIZE = 1 << 17;
		private DataInputStream din;
		private byte[] buffer;
		private int bufferPointer, bytesRead;

		public StdIn() {
			din = new DataInputStream(System.in);
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public StdIn(InputStream in) {
			try {
				din = new DataInputStream(in);
			} catch (Exception e) {
				throw new RuntimeException();
			}
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public StdIn(String fileName) {
			InputStream in;
			try {
				in = new FileInputStream(new File(fileName));
				din = new DataInputStream(in);
			} catch (Exception e) {
				throw new RuntimeException();
			}
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public String next() {
			int c;
			while ((c = read()) != -1 && (c == ' ' || c == '\n' || c == '\r'))
				;
			StringBuilder s = new StringBuilder();
			while (c != -1) {
				if (c == ' ' || c == '\n' || c == '\r')
					break;
				s.append((char) c);
				c = read();
			}
			return s.toString();
		}

		public String nextLine() {
			int c;
			while ((c = read()) != -1 && (c == ' ' || c == '\n' || c == '\r'))
				;
			StringBuilder s = new StringBuilder();
			while (c != -1) {
				if (c == '\n' || c == '\r')
					break;
				s.append((char) c);
				c = read();
			}
			return s.toString();
		}

		public int nextInt() {
			int ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do
				ret = ret * 10 + c - '0';
			while ((c = read()) >= '0' && c <= '9');

			if (neg)
				return -ret;
			return ret;
		}

		public int[] readIntArray(int n) {
			int[] ar = new int[n];
			for (int i = 0; i < n; ++i)
				ar[i] = nextInt();
			return ar;
		}

		public long nextLong() {
			long ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do
				ret = ret * 10 + c - '0';
			while ((c = read()) >= '0' && c <= '9');
			if (neg)
				return -ret;
			return ret;
		}

		public long[] readLongArray(int n) {
			long[] ar = new long[n];
			for (int i = 0; i < n; ++i)
				ar[i] = nextLong();
			return ar;
		}

		public double nextDouble() {
			double ret = 0, div = 1;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do
				ret = ret * 10 + c - '0';
			while ((c = read()) >= '0' && c <= '9');
			if (c == '.')
				while ((c = read()) >= '0' && c <= '9')
					ret += (c - '0') / (div *= 10);
			if (neg)
				return -ret;
			return ret;
		}

		private void fillBuffer() throws IOException {
			bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
			if (bytesRead == -1)
				buffer[0] = -1;
		}

		private byte read() {
			try {
				if (bufferPointer == bytesRead)
					fillBuffer();
				return buffer[bufferPointer++];
			} catch (IOException e) {
				throw new RuntimeException();
			}
		}

		public void close() throws IOException {
			if (din == null)
				return;
			din.close();
		}
	}
}