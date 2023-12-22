import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Arrays;

public class Main {
	public static int[][] bfs(int h, int w, int[][] matrix, int[] start) {
		ArrayDeque<int[]> q = new ArrayDeque<int[]>();
		int[][] dist = new int[h][w];
		for(int i=0; i<h; i++) {
			for(int j=0; j<w; j++) {
				dist[i][j] = Integer.MAX_VALUE;
			}
		}
		dist[start[0]][start[1]] = 0;
		int[][] d = {{1,0}, {-1,0}, {0,1}, {0,-1}};
		q.addLast(start);
		while(q.size()>0) {
			int[] pos = q.pollFirst();
			for(int[] delta: d) {
				if(pos[0]+delta[0]<0 || pos[1]+delta[1]<0 || h<=pos[0]+delta[0] || w<=pos[1]+delta[1]) continue;
				if(matrix[pos[0]+delta[0]][pos[1]+delta[1]] == -1) continue;
				if(dist[pos[0]+delta[0]][pos[1]+delta[1]] <= dist[pos[0]][pos[1]]+1) continue;
				dist[pos[0]+delta[0]][pos[1]+delta[1]] = dist[pos[0]][pos[1]]+1;
				int[] next = {pos[0]+delta[0], pos[1]+delta[1]};
				q.addLast(next);
			}
		}
		return dist;
	}

	public static void main(String[] args) {
		FS r = new FS();
		while(true) {
			int w = r.nextInt();
			int h = r.nextInt();
			int dirt = 0;
			int[][] pos = new int[10][2];
			if(w==0) break;
			int[][] matrix = new int[h][w];
			for(int i=0; i<h; i++) {
				String s = r.next();
				for(int j=0; j<w; j++) {
					switch(s.charAt(j)) {
						case 'o':
							pos[0][0] = i;
							pos[0][1] = j;
							break;
						case '*':
							dirt++;
							pos[dirt][0] = i;
							pos[dirt][1] = j;
							matrix[i][j] = dirt;
							break;
						case 'x':
							matrix[i][j] = -1;
							break;
						case '.':
						default:
					}
				}
			}
			int[][] distMatrix = new int[dirt+1][dirt+1];
			for(int i=0; i<=dirt; i++) {
				int[][] dist = bfs(h, w, matrix, pos[i]);
				for(int j=0; j<=dirt; j++) {
					distMatrix[i][j] = dist[pos[j][0]][pos[j][1]];
				}
			}
			int[] bitDP = new int[(int)Math.pow(2, dirt)];
			for(int i=0; i<bitDP.length; i++) {
				bitDP[i] = Integer.MAX_VALUE;
			}
			bitDP[0] = 0;
			for(int i=0; i<dirt; i++) {
				bitDP[(int)Math.pow(2, i)] = distMatrix[0][i+1];
			}
			for(int i=0; i<bitDP.length; i++) {
				for(int j=0; j<dirt; j++) {
					if((i & (int)Math.pow(2, j)) > 0) {
						for(int k=0; k<dirt; k++) {
							if((i & (int)Math.pow(2, k)) > 0 && j != k) {
								bitDP[i] = Math.min(bitDP[i], bitDP[i-(int)Math.pow(2, j)]+distMatrix[k+1][j+1]);
							}
						}
					}
				}
			}
			if(bitDP[bitDP.length-1] == Integer.MAX_VALUE) bitDP[bitDP.length-1] = -1;

			System.out.println(bitDP[bitDP.length-1]);
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