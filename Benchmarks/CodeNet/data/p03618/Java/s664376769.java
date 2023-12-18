import java.io.*;
import java.util.*;
import java.math.*;

public class Main implements Runnable {
	private static BufferedReader in;
	private static PrintWriter out;
	private static StringTokenizer st;
	private static Random rnd;

	private void solve() throws IOException {
		String initialString = nextToken();
		char[] letters = initialString.toCharArray();
		long result = 1;
		int length = letters.length;
//		Set<String> different = new TreeSet<>();
//		List<String> simple = new ArrayList<>();
//		different.add(initialString);
//		simple.add(initialString);
		long[] count = new long[26];
		for (int i = 0; i < length; i++) {
//			for (int j = i; j < length; j++) {
//				char[] copy = letters.clone();
//				boolean ok = copy[i] != copy[j];
//				reverse(copy, i, j);
//				String newString = new String(copy);
//				if (!newString.equals(initialString)) {
//					out.println(i + " " + j + " " + newString + " " + different.contains(newString));
//					different.add(newString);
//					if (ok)
//						simple.add(newString);
//				}
//			}
			int k = letters[i] - 'a';
			for (int j = 0; j < count.length; j++) {
				if (j != k) {
					result += count[j];
				}
			}
			count[k] += 1;
		}
//		out.println(different.size());
//		out.println(simple.size());
		out.println(result);
	}

	private void reverse(char[] copy, int i, int j) {
		while (i < j) {
			char t = copy[i];
			copy[i] = copy[j];
			copy[j] = t;
			++i;
			--j;
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public void run() {
		try {
			in = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(System.out);

			rnd = new Random();

			solve();

			out.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

	private String nextToken() throws IOException {
		while (st == null || !st.hasMoreTokens()) {
			String line = in.readLine();

			if (line == null)
				return null;

			st = new StringTokenizer(line);
		}

		return st.nextToken();
	}

	private int nextInt() throws IOException {
		return Integer.parseInt(nextToken());
	}

	private long nextLong() throws IOException {
		return Long.parseLong(nextToken());
	}

	private double nextDouble() throws IOException {
		return Double.parseDouble(nextToken());
	}
}