package regional_2014;


import java.io.*;
import java.util.*;

public class Main {
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);

	class State implements Comparable<State> {
		int cnt;
		String s;

		State(int cnt, String s) {
			this.cnt = cnt;
			this.s = s;
		}

		public int compareTo(State s) {
			return cnt - s.cnt;
		}
	}
	
	public void run() {
		int N = in.nextInt(), M = in.nextInt();
		String base = "";
		for (int i = 0; i < N; i++) {
			base += in.nextInt();
		}
		
		String target1 = "", target2 = "";
		for (int i = 0; i < M; i++) {
			int p = in.nextInt();
			for (int j = 0; j < p; j++) {
				target1 += (i % 2 == 0) ? 1 : 0;
				target2 += (i % 2 == 0) ? 0 : 1;
			}
		}
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put(base, 0);
		
		
		PriorityQueue<State> pq = new PriorityQueue<State>();
		pq.add(new State(0, base));
		
		while (!pq.isEmpty()) {
			State st = pq.poll();
			ArrayList<String> list = new ArrayList<String>();
			for (int i = 0; i < N - 1; i++) {
				char[] next = st.s.toCharArray();
				char temp = next[i];
				next[i] = next[i+1];
				next[i+1] = temp;
				list.add(new String(next));
			}
			
			for (String next : list) {
				if (map.containsKey(next)) {
					int pvalue = map.get(next);
					if (st.cnt + 1 < pvalue) {
						map.put(next, st.cnt + 1);
						pq.add(new State(st.cnt + 1, next));	
					}
				} else {
					map.put(next, st.cnt + 1);
					pq.add(new State(st.cnt + 1, next));
				}
			}
		}
		
		int res = Integer.MAX_VALUE;
		if (map.containsKey(target1))
			res = Math.min(res, map.get(target1));
		if (map.containsKey(target2))
			res = Math.min(res, map.get(target2));
		System.out.println(res);
		
		out.close();
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public void mapDebug(int[][] a) {
		System.out.println("--------map display---------");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d ", a[i][j]);
			}
			System.out.println();
		}

		System.out.println("----------------------------");
		System.out.println();
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

		int[] nextIntArray(int n) {
			int[] array = new int[n];
			for (int i = 0; i < n; i++)
				array[i] = nextInt();

			return array;
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		long[] nextLongArray(int n) {
			long[] array = new long[n];
			for (int i = 0; i < n; i++)
				array[i] = nextLong();

			return array;
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		double[] nextDoubleArray(int n) {
			double[] array = new double[n];
			for (int i = 0; i < n; i++)
				array[i] = nextDouble();

			return array;
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

		String[] nextStringArray(int n) {
			String[] array = new String[n];
			for (int i = 0; i < n; i++)
				array[i] = next();

			return array;
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