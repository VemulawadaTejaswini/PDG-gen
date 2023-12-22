
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;


class a {
	static BufferedReader in;
	static FastScanner sc;
	static PrintWriter out;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		if(a.equals("ABC")) {
			System.out.println("ARC");
		}else {
			System.out.println("ABC");
		}
			}

	class FastScanner {
		BufferedReader in;
		StringTokenizer st;

		public FastScanner(BufferedReader in) {
			this.in = in;
		}

		public String nextToken() throws Exception {
			while (st == null || !st.hasMoreTokens()) {
				st = new StringTokenizer(in.readLine());
			}
			return st.nextToken();
		}

		public int nextInt() throws Exception {
			return Integer.parseInt(nextToken());
		}

		public long nextLong() throws Exception {
			return Long.parseLong(nextToken());
		}

		public double nextDouble() throws Exception {
			return Double.parseDouble(nextToken());
		}
	}
}
