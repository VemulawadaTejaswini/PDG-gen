import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.ArrayDeque;

public class Main {
	public static boolean isValid(int W, int H, int x, int y) {
		return 0<=x && x<H && 0<=y && y<W;
	}

	public static void walking(char[][] L, char[][] R, int H, int W, int lx, int ly, int rx, int ry) {
		int[][] vec = {{1,0,1,0},{-1,0,-1,0},{0,1,0,-1},{0,-1,0,1}};
		Queue<int[]> q = new ArrayDeque<int[]>();
		boolean[][][][] searched = new boolean[H][W][H][W];
		int[] st = {lx, ly, rx, ry};
		q.add(st);
		searched[lx][ly][rx][ry] = true;
		while(!q.isEmpty()) {
			int[] pos = q.remove();
			// System.out.println("["+pos[0]+","+pos[1]+","+pos[2]+","+pos[3]+"]");
			lx = pos[0];
			ly = pos[1];
			rx = pos[2];
			ry = pos[3];
			for(int[] d: vec) {
				int dlx = d[0];
				int dly = d[1];
				int drx = d[2];
				int dry = d[3];
				if(!isValid(W,H,lx+dlx,ly+dly)) {
					dlx = 0;
					dly = 0;
				}
				if(!isValid(W,H,rx+drx,ry+dry)) {
					drx = 0;
					dry = 0;
				}
				if(L[lx+dlx][ly+dly]=='#') {
					dlx = 0;
					dly = 0;
				}
				if(R[rx+drx][ry+dry]=='#') {
					drx = 0;
					dry = 0;
				}
				int[] newPos = {lx+dlx, ly+dly, rx+drx, ry+dry};
				if(searched[newPos[0]][newPos[1]][newPos[2]][newPos[3]]) continue;
				if(L[newPos[0]][newPos[1]] == '%' && R[newPos[2]][newPos[3]] == '%') {
					System.out.println("Yes");
					return;
				}
				if(L[newPos[0]][newPos[1]] != '%' && R[newPos[2]][newPos[3]] != '%') {
					// System.out.println("("+newPos[0]+","+newPos[1]+","+newPos[2]+","+newPos[3]+")");
					q.add(newPos);
					searched[newPos[0]][newPos[1]][newPos[2]][newPos[3]] = true;
				}
			}
		}
		System.out.println("No");
	}

	public static void main(String[] args) {
		FS r = new FS();
		while(true) {
			int W = r.nextInt();
			int H = r.nextInt();
			if(W==0) break;
			char[][] L = new char[H][W];
			char[][] R = new char[H][W];
			int lx=-1;
			int ly=-1;
			int rx=-1;
			int ry=-1;
			for(int i=0; i<H; i++) {
				String sl = r.next();
				String sr = r.next();
				for(int j=0; j<W; j++) {
					L[i][j] = sl.charAt(j);
					R[i][j] = sr.charAt(j);
					if(L[i][j]=='L') {
						lx = i;
						ly = j;
					}
					if(R[i][j]=='R') {
						rx = i;
						ry = j;
					}
				}
			}
			walking(L,R,H,W,lx,ly,rx,ry);
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