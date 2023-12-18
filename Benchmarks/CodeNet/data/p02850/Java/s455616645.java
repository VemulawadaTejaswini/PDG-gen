import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
	
	class Node implements Comparable<Node>{
		HashSet<Integer> E = new HashSet<>();
		int size = 0;
		
		void add(int index) {
			E.add(index);
			size++;
		}
		
		@Override
		public int compareTo(Node o) {
			return o.size - size;
		}
	}
	
	public Main() {
		FastScanner scanner = new FastScanner();
		int N = scanner.nextInt();
		
		Node[] V = new Node[N];
		
		IntStream.range(0, N).forEach( i -> V[i] = new Node());
		IntStream.range(0, N-1).forEach( i -> {
			int a = scanner.nextInt()-1;
			int b = scanner.nextInt()-1;
			
			V[a].add(i);
			V[b].add(i);
		});
		
		Arrays.sort(V);
		
		int K = 0;
		int[] C = new int[N-1];
		for (int i = 0; i < N; i++) {
			HashSet<Integer> E = V[i].E;
			for (int target : E) {
				if (C[target] != 0) continue;
				int c = 1;
				while(true) {
					boolean isOk = true;
					for (int other : E) {
						if (target == other) continue;
						if (c == C[other]) {
							isOk = false;
							break;
						}
					}
					if (isOk) break;
					c++;
				}
				K = Math.max(K, c);
				C[target] = c;
			}
		}
		
		PrintWriter PW = new PrintWriter(System.out);
		PW.println(K);
		IntStream.range(0, N-1).forEach( i -> PW.println(C[i]));
		PW.flush();
		PW.close();
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
