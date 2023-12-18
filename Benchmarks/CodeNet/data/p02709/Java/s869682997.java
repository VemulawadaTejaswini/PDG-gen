import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		FasterScanner sc = new FasterScanner(System.in);

		int n = sc.nextInt();
		PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			long val = sc.nextInt();
			a[i] = val;
			pq.add(new Pair(i, val));
		}
		long total = 0;
		
		int minIndex = 0;
		int maxIndex = n-1;
		while(!pq.isEmpty()) {
			Pair p = pq.poll();
			int index = p.index;
			long val = p.val;
			long leftVal = ((long) (index-minIndex))*val;
			for (int i = 0; i < index; i++) {
				if (a[i] < val) leftVal += a[i];
			}
			long rightVal = ((long) (maxIndex-index))*val;
			for (int i = index+1; i < n; i++) {
				if (a[i] <= val) rightVal += a[i];
			}
			//System.out.println(leftVal + " " + rightVal);
			if (leftVal > rightVal) {
				//System.out.println("L");
				total += ((long) (index-minIndex))*val;
				minIndex++;
			} else {
				//System.out.println("H");
				total += ((long) (maxIndex-index))*val;
				maxIndex--;
			}
		}
		
		System.out.println(total);
		
		sc.close();
	}
	
	class Pair implements Comparable<Pair>{
		int index;
		long val;
		public Pair(int index, long val) {
			this.index = index;
			this.val = val;
		}
		public int compareTo(Pair p) {
			if (this.val != p.val) return (int) (p.val - this.val);
			return this.index-p.index;
		}
	}
	
	class FasterScanner {
		private InputStream mIs;
		private byte[] buf = new byte[1024];
		private int curChar;
		private int numChars;

		public FasterScanner() {
			this(System.in);
		}

		public FasterScanner(InputStream is) {
			mIs = is;
		}

		public int read() {
			if (numChars == -1)
				throw new InputMismatchException();
			if (curChar >= numChars) {
				curChar = 0;
				try {
					numChars = mIs.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (numChars <= 0)
					return -1;
			}
			return buf[curChar++];
		}

		public String nextLine() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isEndOfLine(c));
			return res.toString();
		}

		public String nextString() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isSpaceChar(c));
			return res.toString();
		}

		public long nextLong() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			long res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = read();
			} while (!isSpaceChar(c));
			return res * sgn;
		}

		public int nextInt() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = read();
			} while (!isSpaceChar(c));
			return res * sgn;
		}

		public boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		public boolean isEndOfLine(int c) {
			return c == '\n' || c == '\r' || c == -1;
		}

		public void close() {
			try {
				mIs.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
