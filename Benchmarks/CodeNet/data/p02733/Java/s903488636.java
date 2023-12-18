


import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {

	
	private static int r, c;
	private static int k;
	private static int[][] g;
	
	public static void main(String[] args) {
		r = in.nextInt();
		c = in.nextInt();
		k = in.nextInt();
		g = new int[r][c];
		for(int i=0; i<r; i++) {
			String s = in.readString();
			for(int j=0; j<c; j++) {
				g[i][j] = s.charAt(j)-'0';
			}
		}
		
//		for(int i=0; i<r; i++) {
//			for(int j=0; j<c; j++) {
//				System.out.print(g[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		int ans = (int)1e9;
		
		next:
		for(int i=0; i<(1<<(r)); i++) {
			
			int u = Integer.bitCount(i);
			
			
			int[] rowToTrack = new int[r];
			
			int count = 0;
			
			for(int k=0; k<r; k++) {
				rowToTrack[k] = count;
				if ((i&(1<<k))!=0) {
					count++;
				}
			}
//			System.out.println("FOR : "+Integer.toBinaryString(i));
//			for(int k=0; k<r; k++) {
//				System.out.print(rowToTrack[k]+" ");
//			}
//			System.out.println();
			
			int cuts = 0;
			int[] cycle = new int[c];

			int[] sum = new int[u+1];
			for(int j=0; j<c; j++) {
				if (cycle[j]==3) continue next;
//				System.out.println(j);
				for(int k=0; k<r; k++) {
					sum[rowToTrack[k]] += g[k][j];
				}
//				System.out.println("FOR colmn: "+j);
//				for(int x=0; x<sum.length; x++) {
//					System.out.print(sum[x]+" ");
//				}
//				System.out.println();
				for(int x=0; x<=u; x++) {
					if (sum[x]>k) {
						cuts++;
						cycle[j]++;
						j--;
//						if (cycle[j]==3) {
//							continue next;
//						}
						Arrays.fill(sum, 0);
						break;
					}
				}
				
			}
//			System.out.println("HERE "+(cuts));
//			
//			System.out.println(Integer.toBinaryString(i)+" "+cuts);
			ans = Math.min(ans, (cuts+u));
			
		}
		
		System.out.println(ans);
		
		out.flush();
		out.close();
		
	}
	
	
	

	//NONPROBLEM CODE
	
	private static InputReader in = new InputReader(System.in);
	private static PrintWriter out = new PrintWriter(System.out);
	
	private static class InputReader {
		 
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
	
	private static void debug(Object... o) {
		for(Object x: o) {
			out.write(x+" ");
		}
		out.write("\n");
		out.flush();
	}
	
}
