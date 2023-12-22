import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;


public class Main {

	public static void main(String[] args) {
		InputReader sc = new InputReader(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int startx = sc.nextInt() - 1;
		int starty = sc.nextInt() - 1;
		int destx = sc.nextInt() - 1;
		int desty = sc.nextInt() - 1;
		Pair start = new Pair(startx, starty);
		Pair dest = new Pair(destx, desty);
		char[][] s = new char[n][m];
		int[][] w = new int[n][m];
		for(int i = 0 ; i < n; i++){
			s[i] = sc.readString().toCharArray();
			Arrays.fill(w[i], Integer.MAX_VALUE);
		}
		
		LinkedList<Pair> pq = new LinkedList<>();
		pq.add(start);
		w[start.x][start.y] = 0;
		
		int[] dx = {1, 0 , -1, 0};
		int[] dy = {0, 1, 0 , -1};
		int ans = -1;
		while(!pq.isEmpty()){
			Pair curr = pq.poll();			
			if(curr.equals(dest)){
				ans = w[curr.x][curr.y];
				break;
			}
						
			for(int i = 0; i < 4; i++){
				int nx = curr.x + dx[i];
				int ny = curr.y + dy[i];
				if(nx >= 0 && nx < n && ny >= 0 && ny < m && s[nx][ny] != '#' && w[nx][ny] > w[curr.x][curr.y]){					
					Pair p = new Pair(nx, ny);					
					pq.addFirst(p);										
					w[nx][ny] = w[curr.x][curr.y];
				}
			}


				for(int i = -2; i <= 2; i++){
					for(int j = -2; j<= 2; j++){
						if(i != 0 && j != 0){
							int nx = curr.x + i;
							int ny = curr.y + j;
							if(nx >= 0 && nx < n && ny >= 0 && ny < m && s[nx][ny] != '#' && w[nx][ny] > w[curr.x][curr.y]+1){
								Pair p = new Pair(nx, ny);								
								pq.addLast(p);						
								w[nx][ny] = w[curr.x][curr.y] + 1;
							}
						}						
					}
				}
		
			
		}
	
		pw.println(ans);
		
		pw.close();
	}
	
	static class Pair {
		int x, y;
		
		public Pair(int x1, int y1){
			x = x1;
			y = y1;			
		}
		
		public boolean equals(Pair p){
			return this.x == p.x && this.y == p.y;
		}			
	}
	
	static class InputReader {
		private InputStream stream;
		private byte[] buf = new byte[5];
		private int curChar;
		private int numChars;
		private SpaceCharFilter filter;

		public InputReader(InputStream stream) {
			this.stream = stream;
		}

		public int read() {
			if (numChars == -1)
				throw new InputMismatchException();
			if (curChar >= numChars) {
				curChar = 0;
				try {
					numChars = stream.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}

				if (numChars <= 0)
					return -1;
			}

			return buf[curChar++];
		}

		public String nextLine() {
			BufferedReader br = new BufferedReader(new InputStreamReader(stream));
			String stock = "";
			try {
				stock = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return stock;
		}

		public int nextInt() {
			int c = read();
			while (isSpaceChar(c))
				c = read();

			int sgn = 1;

			if (c == '-') {
				sgn = -1;
				c = read();
			}

			int res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = read();
			} while (!isSpaceChar(c));

			return res * sgn;
		}

		public long nextLong() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			long res = 0;

			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = read();
			} while (!isSpaceChar(c));
			return res * sgn;
		}

		public double nextDouble() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			double res = 0;
			while (!isSpaceChar(c) && c != '.') {
				if (c == 'e' || c == 'E')
					return res * Math.pow(10, nextInt());
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = read();
			}
			if (c == '.') {
				c = read();
				double m = 1;
				while (!isSpaceChar(c)) {
					if (c == 'e' || c == 'E')
						return res * Math.pow(10, nextInt());
					if (c < '0' || c > '9')
						throw new InputMismatchException();
					m /= 10;
					res += (c - '0') * m;
					c = read();
				}
			}
			return res * sgn;
		}

		public String readString() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isSpaceChar(c));

			return res.toString();
		}

		public boolean isSpaceChar(int c) {
			if (filter != null)
				return filter.isSpaceChar(c);
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		public String next() {
			return readString();
		}

		public interface SpaceCharFilter {
			public boolean isSpaceChar(int ch);
		}
	}

}
