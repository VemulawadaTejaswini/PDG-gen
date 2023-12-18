import java.io.*;
import java.util.*;

public class Main {
	void run() {
		int n = in.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[2 * n];
		for (int i = 0; i < n; i++) {
			c[2 * i] = a[i] = in.nextInt();
			c[2 * i + 1] = b[i] = in.nextInt();
		}
		Arrays.sort(c);
		long ans = 0;
		for (int i = 0; i < n; i++) {
			ans += c[i];
		}
		int level = c[n];
		boolean bad = true;
		boolean haveSmallLeft = false;
		boolean haveSmallRight = false;
		for (int i = 0; i < n; i++) {
			boolean smallLeft = a[i] < level;
			boolean smallRight = b[i] < level;
			haveSmallLeft |= smallLeft;
			haveSmallRight |= smallRight;
			if (smallLeft && smallRight) {
				bad = false;
			}
		}
		if (!haveSmallLeft || !haveSmallRight) {
			bad = false;
		}
		if (bad) {
			ans += c[n] - c[n - 1];
		}
		out.println(ans);
	}
	
	static MyScanner in;
	static PrintWriter out;

	public static void main(String[] args) throws IOException {
		boolean stdStreams = true;
		String fileName = Main.class.getSimpleName().replaceFirst("_.*", "").toLowerCase();
		String inputFileName = fileName + ".in";
		String outputFileName = fileName + ".out";
		
		Locale.setDefault(Locale.US);
		BufferedReader br;
		if (stdStreams) {
			br = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(System.out);
		} else {
			br = new BufferedReader(new FileReader(inputFileName));
			out = new PrintWriter(outputFileName);
		}
		in = new MyScanner(br);
		int tests = 1;//in.nextInt();
		for (int test = 0; test < tests; test++) {
			new Main().run();
		}
		br.close();
		out.close();
	}
	
	static class MyScanner {
		BufferedReader br;
		StringTokenizer st;

		MyScanner(BufferedReader br) {
			this.br = br;
		}
		
		void findToken() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
		}
		
		String next() {
			findToken();
			return st.nextToken();
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
	}
}
