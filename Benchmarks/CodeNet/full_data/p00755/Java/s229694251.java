import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Arrays;

public class Main {
	public static int[][] vec = {{0,1},{0,-1},{1,0},{-1,0}};

	public static void printer(int[][] field) {
		for(int i=0; i<field.length; i++) {
			for(int j=0; j<field[0].length; j++) {
				System.out.print(field[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	public static int counter(int[][] field) {
		int c = field[0][0];
		field[0][0] = 0;
		Queue<int[]> q = new ArrayDeque<int[]>();
		int count = 1;
		int[] def = {0,0};
		q.add(def);
		while(!q.isEmpty()) {
			int[] n = q.remove();
			int x = n[0];
			int y = n[1];
			for(int[] d: vec) {
				int dx = d[0];
				int dy = d[1];
				if(x+dx<0 || field.length<=x+dx || y+dy<0 || field[0].length<=y+dy) continue;
				if(field[x+dx][y+dy]==c) {
					count++;
					field[x+dx][y+dy]=0;
					int[] dn = {x+dx,y+dy};
					q.add(dn);
				}
			}
		}
		return count;
	}

	public static int[][] changeColor(int c, int[][] field) {
		int[][] newField = new int[field.length][field[0].length];
		for(int i=0; i<field.length; i++) {
			for(int j=0; j<field[0].length; j++) {
				newField[i][j] = field[i][j];
			}
		}
		newField[0][0] = c;
		Queue<int[]> q = new ArrayDeque<int[]>();
		boolean[][] changed = new boolean[field.length][field[0].length];
		int[] def = {0,0};
		changed[0][0] = true;
		q.add(def);
		while(!q.isEmpty()) {
			int[] n = q.remove();
			int x = n[0];
			int y = n[1];
			for(int[] d: vec) {
				int dx = d[0];
				int dy = d[1];
				if(x+dx<0 || field.length<=x+dx || y+dy<0 || field[0].length<=y+dy) continue;
				if(field[x+dx][y+dy]==field[0][0]) {
					if(!changed[x+dx][y+dy]) {
						newField[x+dx][y+dy] = c;
						changed[x+dx][y+dy] = true;
						int[] dn = {x+dx,y+dy};
						q.add(dn);
					}
				}
			}
		}
		return newField;
	}

	public static int electro(int count, int[][] field, int last) {
		if(count == 4) {
			int[][] newField = changeColor(last, field);
			return counter(newField);
		}
		int maxSize=0;
		for(int i=1; i<7; i++) {
			int[][] newField = changeColor(i, field);
			maxSize = Math.max(maxSize, electro(count+1, newField, last));
		}
		return maxSize;
	}

	public static void main(String[] args) {
		FS r = new FS();
		while(true) {
			int h = r.nextInt();
			int w = r.nextInt();
			int c = r.nextInt();
			if(h==0) break;
			int[][] field = new int[h][w];
			for(int i=0; i<h; i++) {
				for(int j=0; j<w; j++) {
					field[i][j] = r.nextInt();
				}
			}
			System.out.println(electro(0, field, c));
		}
	}
	
	public static void solver() {
		// write logic
	}
	
	// Read Class
	static class FS {
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
	
		private int readByte() { return hasNextByte() ? buffer[ptr++] : -1;}
		private boolean isPrintableChar(int c) {return 33 <= c && c <= 126;}
		private void skipUnprintable() {while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
	
		public boolean hasNext() { skipUnprintable(); return hasNextByte();}
		public String next() {
			if (!hasNext()) throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while(isPrintableChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}
		public int nextInt() {
			return (int)nextLong();
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
			while(true) {
				if ('0' <= b && b <= '9') {
					n *= 10;
					n += b - '0';
				} else if(b == -1 || !isPrintableChar(b)) {
					return minus ? -n : n;
				} else {
					throw new NumberFormatException();
				}
				b = readByte();
			}
		}
	}
}