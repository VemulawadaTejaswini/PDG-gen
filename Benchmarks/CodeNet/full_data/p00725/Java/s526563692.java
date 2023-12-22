import java.util.*;
import java.io.*;

public class Main {
	static IO io = new IO();
	public static void main(String[] args) {
		
		while (true) {
			
			int xs = io.nextInt();
			int ys = io.nextInt();
			if (xs==0 && ys==0) break;
			int map[][] = new int[xs][ys];
			int start[] = new int[2];
			int goal[] = new int[2];
			for (int j=0; j<ys; j++) {
				for (int i=0; i<xs; i++) {
					map[i][j] = io.nextInt();
					if (map[i][j]==2) {
						start[0] = i;
						start[1] = j;
						map[i][j] = 0;
					} else if (map[i][j]==3) {
						goal[0] = i;
						goal[1] = j;
					}
				}
			}
			
			// [0][i][j]???????????????[1][0][0]???x??§?¨????[2][0][0]???y??§?¨????[3][0][0]???????????§????§?????????°
			Deque<int[][][]> que = new ArrayDeque<int[][][]>();
			int starts[][][] = new int[4][xs][ys];
			starts[0] = map.clone();
			starts[1][0][0] = start[0];
			starts[2][0][0] = start[1];
			que.offer(starts);
			int dx[] = {0, 1, 0, -1};
			int dy[] = {1, 0, -1, 0};
			int ans = -1;
			
			root: while (!que.isEmpty()) {
				int poll[][][] = que.pollLast();
				int x = poll[1][0][0];
				int y = poll[2][0][0];
				int times = poll[3][0][0];
				if (times==10) continue;
				int mapn[][] = poll[0];
				for (int i=0; i<4; i++) {
					int k = 1;
					// 0??\?????????????????\????????????????????????????????§??????
					while (0<=x+k*dx[i] && x+k*dx[i]<xs && 0<=y+k*dy[i] && y+k*dy[i]<ys
							&& mapn[x+k*dx[i]][y+k*dy[i]]==0) {
						k++;
					}
					// ??????????????????????????????
					if (0>x+k*dx[i] || x+k*dx[i]>=xs || 0>y+k*dy[i] || y+k*dy[i]>=ys) {
						continue;
					}
					// ??´???????????????????????????
					else if (mapn[x+k*dx[i]][y+k*dy[i]]==3) {
						ans = times + 1;
						break root;
					}
					// ????????£?????????????????§??????????????????
					else if (k==1) continue;
					// ?????????????????¶?????????????????????
					else if (mapn[x+k*dx[i]][y+k*dy[i]]==1) {
						int mapnext[][] = mapn.clone();
						mapnext[x+k*dx[i]][y+k*dy[i]] = 0;
						int next[][][] = new int[4][xs][ys];
						next[0] = mapnext;
						next[1][0][0] = x+(k-1)*dx[i];
						next[2][0][0] = y+(k-1)*dy[i];
						next[3][0][0] = times+1;
						que.offer(next);
					}
				}
			}
			
			System.out.println(ans);
			
		}
		
	}

	static class IO extends PrintWriter {
		private final InputStream in;
		private final byte[] buffer = new byte[1024];
		private int ptr = 0;
		private int buflen = 0;

		public IO() { this(System.in);}
		public IO(InputStream source) { super(System.out); this.in = source;}
		private boolean hasNextByte() {
			if (ptr < buflen) {
				return true;
			}else{
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
		private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
		private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
		private static boolean isNewLine(int c) { return c == '\n' || c == '\r';}
		private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
		private void skipNewLine() { while(hasNextByte() && isNewLine(buffer[ptr])) ptr++;}
		public boolean hasNext() { skipUnprintable(); return hasNextByte();}
		public boolean hasNextLine() { skipNewLine(); return hasNextByte();}
		public String next() {
			if (!hasNext()) {
				throw new NoSuchElementException();
			}
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while(isPrintableChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}
		public char[] nextCharArray(int len) {
			if (!hasNext()) {
				throw new NoSuchElementException();
			}
			char[] s = new char[len];
			int i = 0;
			int b = readByte();
			while(isPrintableChar(b)) {
				if (i == len) {
					throw new InputMismatchException();
				}
				s[i++] = (char) b;
				b = readByte();
			}
			return s;
		}
		public String nextLine() {
			if (!hasNextLine()) {
				throw new NoSuchElementException();
			}
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while(!isNewLine(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}
		public long nextLong() {
			if (!hasNext()) {
				throw new NoSuchElementException();
			}
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
			while(true){
				if ('0' <= b && b <= '9') {
					n *= 10;
					n += b - '0';
				}else if(b == -1 || !isPrintableChar(b)){
					return minus ? -n : n;
				}else{
					throw new NumberFormatException();
				}
				b = readByte();
			}
		}
		public int nextInt() {
			long nl = nextLong();
			if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) {
				throw new NumberFormatException();
			}
			return (int) nl;
		}
		public char nextChar() {
			if (!hasNext()) {
				throw new NoSuchElementException();
			}
			return (char) readByte();
		}
		public double nextDouble() { return Double.parseDouble(next());}
		public int[] arrayInt(int n) { int[] a = new int[n]; for(int i=0;i<n;i++) a[i] = nextInt(); return a;}
		public long[] arrayLong(int n) { long[] a = new long[n]; for(int i=0;i<n;i++) a[i] = nextLong(); return a;}
		public double[] arrayDouble(int n) { double[] a = new double[n]; for(int i=0;i<n;i++) a[i] = nextDouble(); return a;}
		public void arrayInt(int[]... a) {for(int i=0;i<a[0].length;i++) for(int j=0;j<a.length;j++) a[j][i] = nextInt();}
		public int[][] matrixInt(int n,int m) { int[][] a = new int[n][]; for(int i=0;i<n;i++) a[i] = arrayInt(m); return a;}
		public char[][] charMap(int n,int m) { char[][] a = new char[n][]; for(int i=0;i<n;i++) a[i] = nextCharArray(m); return a;}
		public void close() {
			super.close();
			try {
				in.close();
			} catch (IOException e) {}
		}
	}
}