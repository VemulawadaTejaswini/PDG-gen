import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N, K, C;
	String S;
	List<Integer> result;

	public static void main(String[] args) throws IOException {
		//InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		//BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(null);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		FasterScanner sc = new FasterScanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		C = sc.nextInt();
		S = sc.nextString();
//		String[] tokens = in.readLine().split(" ");
//		N = Integer.parseInt(tokens[0]);
//		K = Integer.parseInt(tokens[1]);
//		C = Integer.parseInt(tokens[2]);
//		S = in.readLine();
	}

	List<Integer> searchFromTop(int currentIndex) {
		if (currentIndex >= N) {
			return new ArrayList<Integer>();
		} else if (S.charAt(currentIndex) == 'o') {
			List<Integer> result = searchFromTop(currentIndex + C + 1);
			result.add(currentIndex);
			return result;
		} else {
			return searchFromTop(currentIndex + 1);
		}
	}

	List<Integer> searchFromEnd(int currentIndex) {
		if (currentIndex < 0) {
			return new ArrayList<Integer>();
		} else if (S.charAt(currentIndex) == 'o') {
			List<Integer> result = searchFromEnd(currentIndex - C - 1);
			result.add(currentIndex);
			return result;
		} else {
			return searchFromEnd(currentIndex - 1);
		}
	}

	void calc() {
		List<Integer> indexes = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			if (S.charAt(i) == 'o') {
				indexes.add(i);
				i += C;
			}
		}
		List<Integer> indexes2 = new ArrayList<>();
		for (int i = N - 1; i >= 0; i--) {
			if (S.charAt(i) == 'o') {
				indexes2.add(i);
				i -= C;
			}
		}
		result = new ArrayList<>();
		int n = indexes.size();
		for (int i = 0; i < indexes.size(); ++i) {
			if (indexes.get(i) == indexes2.get(n - 1 - i)) {
				result.add(indexes.get(i));
			}
		}
		if (result.size() > K) {
			result.clear();
		}
	}

	void showResult() {
		for (int i = 0; i < result.size(); ++i) {
			System.out.println((result.get(i) + 1));
		}
	}
	
	static class FasterScanner {
		private InputStream mIs;
		private byte[] buf = new byte[1024];
		private int curChar;
		private int numChars;
 
		public FasterScanner() {
			this(System.in);
		}
 
		public FasterScanner(InputStream is) {
			mIs = is;
		}
 
		public int read() {
			if (numChars == -1)
				throw new InputMismatchException();
			if (curChar >= numChars) {
				curChar = 0;
				try {
					numChars = mIs.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (numChars <= 0)
					return -1;
			}
			return buf[curChar++];
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
 
		public String nextString() {
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
 
		public boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}
 
		public boolean isEndOfLine(int c) {
			return c == '\n' || c == '\r' || c == -1;
		}
 
		public void close() {
			try {
				mIs.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}