import java.io.*;
import java.util.*;



public class Main {
	
	static InputReader in = new InputReader(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	static int MOD = 1000000007;
	static int M = 505;
	static int oo = (int)1e9;
	
	
	public static void main(String[] args) throws IOException {
		
		Queue<String> ca = new ArrayDeque<>();
		Queue<String> ba = new ArrayDeque<>();
		Queue<String> bc = new ArrayDeque<>();
		Queue<String> d = new ArrayDeque<>();
		
		int n = in.nextInt();
		for(int i=0; i < n; ++i) {
			String s = in.readString();
			if(s.charAt(0) == 'B') {
				if(s.charAt(s.length()-1) == 'A')
					ba.add(s);
				else
					bc.add(s);
			}
			else if(s.charAt(s.length()-1) == 'A')
				ca.add(s);
			else
				d.add(s);
		}
		
		char last = 'D';
		StringBuilder sb = new StringBuilder();
		while(true) {
			String append;
			if(last == 'A') {
				if(!ba.isEmpty())
					append = ba.poll();
				else if(!bc.isEmpty())
					append = bc.poll();
				else
					break;
			}
			else {
				if(!ca.isEmpty())
					append = ca.poll();
				else if(!ba.isEmpty())
					append = ba.poll();
				else
					break;
			}
			sb.append(append);
			last = append.charAt(append.length() - 1);
		}
		
		while(!ca.isEmpty())
			sb.append(ca.poll());
		while(!ba.isEmpty())
			sb.append(ba.poll());
		while(!bc.isEmpty())
			sb.append(bc.poll());
		while(!d.isEmpty())
			sb.append(d.poll());
		
//		System.out.println(sb);
		
		int cnt = 0;
		for(int i=1; i < sb.length(); ++i) {
			if( sb.charAt(i-1) == 'A' && sb.charAt(i) == 'B' )
				cnt++;
		}
		System.out.println(cnt);
		
		out.close();
	}
	
	
	
	static void shuffle(int[] a) {
		Random r = new Random();
		for(int i = a.length - 1; i > 0; --i) {
			int si = r.nextInt(i);
			int t = a[si];
			a[si] = a[i];
			a[i] = t;
		}
	}
	
	static int lower_bound(int[] a, int n, int k) {
		int s = 0;
		int e = n;
		int m;
		while (e - s > 0) {
			m = (s + e) / 2;
			if (a[m] < k)
				s = m + 1;
			else
				e = m;
		}
		return e;
	}
	static int lower_bound(long[] a, int n, long k) {
		int s = 0;
		int e = n;
		int m;
		while (e - s > 0) {
			m = (s + e) / 2;
			if (a[m] < k)
				s = m + 1;
			else
				e = m;
		}
		return e;
	}
	
	static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}
	static long gcd(long a, long b) {
		return b == 0 ? a : gcd(b, a % b);
	}
	
	static class Pair implements Comparable<Pair> {
		int first, second;

		public Pair(int first, int second) {
			super();
			this.first = first;
			this.second = second;
		}

		@Override
		public int compareTo(Pair o) {
			return this.first != o.first ? this.first - o.first : this.second - o.second;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + first;
			result = prime * result + second;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Pair other = (Pair) obj;
			if (first != other.first)
				return false;
			if (second != other.second)
				return false;
			return true;
		}
	}
	
	
}



class InputReader {

	private final InputStream stream;
	private final byte[] buf = new byte[8192];
	private int curChar, snumChars;

	public InputReader(InputStream st) {
		this.stream = st;
	}

	public int read() {
		if (snumChars == -1)
			throw new InputMismatchException();
		if (curChar >= snumChars) {
			curChar = 0;
			try {
				snumChars = stream.read(buf);
			} catch (IOException e) {
				throw new InputMismatchException();
			}
			if (snumChars <= 0)
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
		int res = 0;
		do {
			res *= 10;
			res += c - '0';
			c = read();
		} while (!isSpaceChar(c));
		return res * sgn;
	}

	public long nextLong() {
		int c = read();
		while (isSpaceChar(c)) {
			c = read();
		}
		int sgn = 1;
		if (c == '-') {
			sgn = -1;
			c = read();
		}
		long res = 0;
		do {
			res *= 10;
			res += c - '0';
			c = read();
		} while (!isSpaceChar(c));
		return res * sgn;
	}

	public int[] nextIntArray(int n) {
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = nextInt();
		}
		return a;
	}

	public String readString() {
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
		while (isSpaceChar(c))
			c = read();
		StringBuilder res = new StringBuilder();
		do {
			res.appendCodePoint(c);
			c = read();
		} while (!isEndOfLine(c));
		return res.toString();
	}

	public boolean isSpaceChar(int c) {
		return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
	}

	private boolean isEndOfLine(int c) {
		return c == '\n' || c == '\r' || c == -1;
	}

}