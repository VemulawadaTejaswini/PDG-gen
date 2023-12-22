import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
	
	class UnionFind {
		int[] Parent;
		int N;
		
		UnionFind(int N){
			this.N = N;
			Parent = new int[N];
			IntStream.range(0, N).forEach( i -> Parent[i] = -1);
		}
		
		int root(int A) {
			if (Parent[A] < 0) return A;
			return Parent[A] = root( Parent[A] );
		}
		
		int size(int A) {
			return -Parent[root(A)];
		}
		
		boolean connect(int A, int B) {
			A = root(A);
			B = root(B);
			if ( A == B ) return false;
			if (size(A) < size(B)) {
				A = A ^ B;
				B = A ^ B;
				A = A ^ B;
			}
			Parent[A] += Parent[B];
			Parent[B] = A;
			return true;
		}
		
	}
	
	public Main() {
		FastScanner scanner = new FastScanner();
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		
		UnionFind UN = new UnionFind(N);
		
		for (int i = 0; i < M; i++) {
			int A = scanner.nextInt()-1;
			int B = scanner.nextInt()-1;
			UN.connect(A, B);
		}
		
		int Ans = 0;
		for (int i = 1; i < N; i++) {
			if (UN.connect(0, i)) {
				Ans++;
			}
		}
		System.out.println(Ans);
	}
	
	public static void main(String[] args) {
		new Main();
	}
}

class FastScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;
	
	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		} else {
			ptr = 0;
			try {
				buflen = in.read(buffer);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (buflen <= 0) {
				return false;
			}
		}
		return true;
	}
	
	private int readByte() {
		if (hasNextByte()) return buffer[ptr++];
		else return -1;
	}
	
	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}
	
	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
		return hasNextByte();
	}
	
	public String next() {
		if (!hasNext()) throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	
	public long nextLong() {
		if (!hasNext()) throw new NoSuchElementException();
		long n = 0;
		boolean minus = false;
		int b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) {
			throw new NumberFormatException();
		}
		while (true) {
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			} else if (b == -1 || !isPrintableChar(b)) {
				return minus ? -n : n;
			} else {
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}
	
	public int nextInt() {
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
		return (int) nl;
	}
	
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}
