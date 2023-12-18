
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map.Entry;

public class Main {
	InputStream is;

	int __t__ = 1;
	int __f__ = 0;
	int __FILE_DEBUG_FLAG__ = __f__;
	String __DEBUG_FILE_NAME__ = "src/D1";

	FastScanner in;
	PrintWriter out;
	
	static final int PRIME_LIST_SIZE = 1000;
	static int[] primeList;
	static {
		primeList = getPrimeList(PRIME_LIST_SIZE);
	}
	
	static int[] getPrimeList(int n) {
		boolean[] res = new boolean[n+1];
		int[] primeList = new int[n+1];
		int at = 0;
		
		Arrays.fill(res, true);

		res[0] = res[1] = false;
		for (int i = 2; i < res.length; i++) {
			if (!res[i]) continue;
			primeList[at++] = i;
			for (int j = 2 * i; j < res.length; j += i) {
				res[j] = false;
			}
		}
		
		return Arrays.copyOf(primeList, at);
	}
	
	String flipKey(String key) {
		if (key.charAt(0) == '0') return key;
		
		String res = "";
		String[] words = key.split(" ");
		for (String w : words) {
			String[] tmp = w.split(":");
			int prime = Integer.valueOf(tmp[0]);
			int cnt = Integer.valueOf(tmp[1]);
			res += prime + ":" + (3 - cnt) + " ";
		}
		return res;
	}
	
	public void solve() {
		int N = in.nextInt();
		long[] s = in.nextLongArray(N);
		
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < N; i++) {
			StringBuilder key = new StringBuilder();
			long next = s[i];
			for (int p : primeList) {
				if (next == 1) break;
				int cnt = 0;
				
				long p3 = (long) p * p * p;
				while (next % p3 == 0) next /= p3;
				
				while (next % p == 0) {
					next /= p;
					cnt++;
				}
				if (cnt != 0)
					key.append(p + ":" + cnt + " ");
			}
			if (next != 1)
				key.append(next + ":1 ");
			String key_s = key.toString();
			if (key_s.length() == 0) key_s += "0";
			
			// System.out.println(s[i] + " = " + key_s);
			if (map.containsKey(key_s))
				map.put(key_s, map.get(key_s) + 1);
			else
				map.put(key_s, 1);
		}
		
		int res = 0;
		for (Entry<String, Integer> e : map.entrySet()) {
			if (e.getValue() == -1) continue;
			
			String oppKey = flipKey(e.getKey());
			if (oppKey.charAt(0) == '0') {
				res++;
			} else if (!map.containsKey(oppKey)) {
				res += e.getValue();
			} else {
				res += Math.max(e.getValue(), map.get(oppKey));
				map.put(e.getKey(), -1);
				map.put(oppKey, -1);
			}
		}
		System.out.println(res);
	}

	public void run() {
		if (__FILE_DEBUG_FLAG__ == __t__) {
			try {
				is = new FileInputStream(__DEBUG_FILE_NAME__);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			System.out.println("FILE_INPUT!");
		} else {
			is = System.in;
		}
		in = new FastScanner(is);
		out = new PrintWriter(System.out);

		Thread t = new Thread(null, new Runnable() {
			
			@Override
			public void run() {
				solve();
			}
		}, "lul", 1 << 27);
		t.start();
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

		int[][] nextIntMap(int n, int m) {
			int[][] map = new int[n][m];
			for (int i = 0; i < n; i++) {
				map[i] = in.nextIntArray(m);
			}
			return map;
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

		long[][] nextLongMap(int n, int m) {
			long[][] map = new long[n][m];
			for (int i = 0; i < n; i++) {
				map[i] = in.nextLongArray(m);
			}
			return map;
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

		double[][] nextDoubleMap(int n, int m) {
			double[][] map = new double[n][m];
			for (int i = 0; i < n; i++) {
				map[i] = in.nextDoubleArray(m);
			}
			return map;
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


