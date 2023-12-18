import java.util.*;
import java.io.*;

public class Main {

	void solve() {
		int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt(), e = in.nextInt(), f = in.nextInt();
		int result = 0, resSugar = 0;
		double ans = 0;
		for (int cntA = 0; cntA * a * 100 <= f; cntA++ ){
			for (int cntB = 0; cntA * a * 100 + cntB * b * 100 <= f; cntB++ ){
				for (int cntC = 0; cntA * a * 100 + cntB * b * 100 + cntC * c <= f; cntC++ ){
					for (int cntD = 0; cntA * a * 100 + cntB * b * 100 + cntC * c + cntD * d <= f; cntD++ ){
						int sugar = cntC * c + cntD * d;
						int water = 100 * (cntA * a + cntB * b);
						if (sugar * 100 <= water * e && sugar * 1.0 / (sugar + water) > ans) {
							ans = sugar  *1.0 / (sugar + water);
							result = sugar + water;
							resSugar = sugar;
						}
					}	
				}	
			}	
		}
		out.println(result + " " + resSugar);
	}

	FastScanner in;
	PrintWriter out;

	void run() {
		in = new FastScanner();
		out = new PrintWriter(System.out);
		solve();
		out.close();
	}

	class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		public FastScanner(String s) {
			try {
				br = new BufferedReader(new FileReader(s));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public String nextToken() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
				}
			}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(nextToken());
		}

		public long nextLong() {
			return Long.parseLong(nextToken());
		}

		public double nextDouble() {
			return Double.parseDouble(nextToken());
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
