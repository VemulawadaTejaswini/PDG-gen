import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
	
	class Edge {
		int det, c = 0;
		
		public Edge(int det) {
			this.det = det;
		}
	}
	
	class Node {
		int parentColor, index;
		
		public Node(int parentColor, int index) {
			this.parentColor = parentColor;
			this.index = index;
		}
	}
	
	public Main() {
		FastScanner scanner = new FastScanner();
		int N = scanner.nextInt();
		int K = 0;
		
		Edge[] E = new Edge[N-1];
		
		ArrayList<ArrayList<Edge>> V = new ArrayList<>();
		
		IntStream.range(0, N).forEach( i -> V.add(new ArrayList<>()));
		
		IntStream.range(0, N-1).forEach( i -> {
			int a = scanner.nextInt()-1;
			int b = scanner.nextInt()-1;
			
			E[i] = new Edge(b);
			
			V.get(a).add(E[i]);
		});
		
		Queue<Node> queue = new LinkedList<>();
		boolean[] searched = new boolean[N];
		
		queue.add( new Node(0,0));
		while ( !queue.isEmpty() ) {
			Node n = queue.poll();
			
			if (searched[n.index]) continue;
			
			ArrayList<Edge> edges = V.get(n.index);
			int c = 1;
			for (Edge e : edges) {
				if (c == n.parentColor) c++;
				e.c = c;
				queue.add( new Node(c, e.det));
				c++;
			}
			
			searched[n.index] = true;
		}
		
		for (Edge edge : E) {
			K = Math.max(K, edge.c);
		}
		
		PrintWriter PW = new PrintWriter(System.out);
		PW.println(K);
		IntStream.range(0, N-1).forEach( i -> PW.println(E[i].c));
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
