
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);
	
	int parseNumber(String s, int index) {
		int res = 0;
		while (s.charAt(index) != ']') {
			res = res * 10 + s.charAt(index++) - '0';
		}
		
		return res;
	}
	
	int culculate(ArrayList<Integer> stage) {
		int res = 0;
		Integer[] array = stage.toArray(new Integer[0]);
		
		Arrays.sort(array);
		
		/*
		System.out.println("array info");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		*/
		for (int i = 0; i < array.length / 2 + 1; i++) {
			res += array[i] / 2 + 1;
		}
		
		stage.clear();
		return res;
	}
	
	int culculate2(ArrayList<Integer> stage) {
		int res = 0;
		Integer[] array = stage.toArray(new Integer[0]);
		
		Arrays.sort(array);
		
		/*
		System.out.println("array info_ cul2");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		*/
		
		for (int i = 0; i < array.length / 2 + 1; i++) {
			res += array[i];
		}
		
		stage.clear();
		return res;
	}
	
	public void run() {
		int n = in.nextInt();
		for (int caseN = 0; caseN < n; caseN++) {
			String s = in.next();
			int stageNum = 0;
			
			for (stageNum = 0; ; stageNum++) {
				if (s.charAt(stageNum) != '[') break;
			}
			ArrayList<Integer>[] stages = new ArrayList[stageNum+1];
			for (int i = 0; i <= stageNum; i++)
				stages[i] = new ArrayList<Integer>();
			
			int cur = 0;
			for (int i = 0; i < s.length(); i++) {
				//System.out.println("cursor : " + cur);
				if (s.charAt(i) == '[') cur++;
				else if (s.charAt(i) == ']') {
					if (cur+1 == stageNum)
						stages[cur].add(culculate(stages[cur+1]));
					else
						stages[cur].add(culculate2(stages[cur+1]));
					cur--;
				}
				else {
					stages[cur].add(parseNumber(s, i));
					while (s.charAt(i) != ']') i++;
					cur--;
				}
			}
			
			System.out.println(stages[1].get(0));
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public void debug(Object... obj) {
		System.out.println(Arrays.deepToString(obj));
	}

	class FastScanner {
		private InputStream stream;
		private byte[] buf = new byte[1024];
		private int curChar;
		private int numChars;

		public FastScanner(InputStream stream) {
			this.stream = stream;
			//stream = new FileInputStream(new File("dec.in"));

		}

		int read() {
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

		boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		boolean isEndline(int c) {
			return c == '\n' || c == '\r' || c == -1;
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String next() {
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

		String nextLine() {
			int c = read();
			while (isEndline(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isEndline(c));
			return res.toString();
		}
	}
}