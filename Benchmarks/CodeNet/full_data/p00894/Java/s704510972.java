
import java.io.*;
import java.util.*;

public class Main {
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);

	long convert(String date, String time) {
		long res = 0;
		String[] w1 = date.split("/"), w2 = time.split(":");

		res += Integer.valueOf(w1[0]) * 60 * 24 * 30;
		res += Integer.valueOf(w1[1]) * 60 * 24;
		res += Integer.valueOf(w2[0]) * 60;
		res += Integer.valueOf(w2[1]);
		
		return res;
	}
	
	public void run() {
		while (true) {
			int n = in.nextInt();
			if (n == 0) break;
			
			String[] dat = new String[n];
			for (int i = 0; i < n; i++) {
				dat[i] = in.nextLine();
			}
			
			ArrayList<Long> entrance = new ArrayList<Long>();
			ArrayList<Long> exit = new ArrayList<Long>();
			
			for (String s : dat) {
				String[] words = s.split(" ");
				if (Integer.valueOf(words[3]) != 0) continue;
				
				long time = convert(words[0], words[1]);
				if (words[2].charAt(0) == 'I') {
					entrance.add(time);
				} else {
					exit.add(time);
				}
			}
			
			int MAX = 1001;
			long[] sum = new long[MAX];
			long[] come = new long[MAX];
			
			for (String s : dat) {
				String[] words = s.split(" ");
				int id = Integer.valueOf(words[3]);
				if (id == 0) continue;
				
				long time = convert(words[0], words[1]);
				if (words[2].charAt(0) == 'I') {
					come[id] = time;
				} else {
					for (int i = 0; i < exit.size(); i++) {
						long en = entrance.get(i), ex = exit.get(i);
						long meet = Math.min(time, ex) - Math.max(en, come[id]);
						if (meet > 0) sum[id] += meet;
					}
				}
			}
			
			long res = 0;
			for (int i = 0; i < MAX; i++) {
				res = Math.max(res, sum[i]);
			}
			System.out.println(res);
		}
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