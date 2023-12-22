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
		int h = sc.nextInt();
		int w = sc.nextInt();
		int m = sc.nextInt();
		HashMap<Integer, Integer> hmr = new HashMap<>();
		HashMap<Integer, Integer> hmc = new HashMap<>();
		HashMap<Integer, HashSet<Integer>> hm = new HashMap<>();
		int maxr = 0, maxc = 0;
		int keyr = -1, keyc = -1;
		for(int i = 0; i < m ;i ++){
			int r = sc.nextInt();
			int c = sc.nextInt();			
			hmr.put(r, hmr.getOrDefault(r, 0)+1);
			hmc.put(c,  hmc.getOrDefault(c, 0)+1);
			HashSet<Integer> al = hm.getOrDefault(r, new HashSet<Integer>());
			if(hmr.get(r) > maxr){
				maxr = hmr.get(r);
				keyr = r;
			}
			if(hmc.get(c) > maxc){
				maxc = hmc.get(c);
				keyc = c;
			}			
			al.add(c);
			hm.put(r, al);
		}
		int ans = maxr + maxc;
		if(hm.containsKey(keyr) && hm.get(keyr).contains(keyc)){
			ans--;
		}
		pw.println(ans);
		
		
		pw.close();
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
