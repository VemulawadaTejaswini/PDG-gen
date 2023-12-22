import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {
	int H, W;
	boolean[][] isSearched;
	boolean[][] MAP;
	
	int[] dirX = {-1,  0, 0, 1};
	int[] dirY = { 0, -1, 1, 0};
	
	class Node{
		int x, y;
		
		public Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			Node node = (Node) o;
			return x == node.x && y == node.y;
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(x, y);
		}
	}
	
	public Main() {
		FastScanner scanner = new FastScanner();
		H = scanner.nextInt();
		W = scanner.nextInt();
		
		MAP        = new boolean[W][H];
		isSearched = new boolean[W][H];
		
		int SY = scanner.nextInt() - 1;
		int SX = scanner.nextInt() - 1;
		int GY = scanner.nextInt() - 1;
		int GX = scanner.nextInt() - 1;
		
		for (int y = 0; y < H; y++) {
			StringBuilder S = scanner.nextStringBuilder();
			
			for (int x = 0; x < W; x++) {
				MAP[x][y] = S.charAt(x) == '.';
			}
		}
		
		LinkedList<Node> openList   = new LinkedList<>();
		HashSet<Node>    closeList  = new HashSet<>();
		
		openList.add( new Node(SX, SY) );
		
		int warpNum = 0;
		
		while( true ) {
			
			//コスト0で移動できる場所を埋める．
			while ( !openList.isEmpty() ) {
				Node node = openList.poll();
				
				if ( closeList.contains(node) ) continue;
				
				int x, y;
				for (int i = 0; i < 4; i++) {
					x = node.x + dirX[i];
					y = node.y + dirY[i];
					
					if( ((0 <= x && x < W) && (0 <= y && y < H) ) && MAP[x][y] ){
						openList.add( new Node(x, y) );
					}
				}
				
				isSearched[node.x][node.y] = true;
				closeList.add(node);
			}
			
			if ( isSearched[GX][GY] ){
				System.out.println(warpNum);
				return;
			}
			
			warpNum++;
			
			if ( closeList.isEmpty() ) break;
			
			for ( Node node : closeList) {
				for (int x = node.x-2; x <= node.x+2; x++) {
					for (int y = node.y-2; y <= node.y+2; y++) {
						
						if( ( x < 0 || W <= x) || ( y < 0 || H <= y ) ) continue;
						
						if ( !isSearched[x][y] && MAP[x][y]){
							openList.add( new Node(x, y) );
							isSearched[x][y] = true;
						}
					}
				}
			}
			
			closeList.clear();
		}
		
		System.out.println(-1);
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
	
	public StringBuilder nextStringBuilder() {
		if (!hasNext()) throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb;
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
