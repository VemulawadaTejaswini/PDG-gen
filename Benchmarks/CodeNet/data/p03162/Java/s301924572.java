
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	
	static class Vacations {

		int ar[][];
		int dp[][];

		Vacations(int n) {

			ar = new int[n][3];
			dp = new int[n][3];
		}

		public int func(int i, int j) {

			if (i == ar.length - 1)
				return dp[i][j] = ar[i][j];

			if (dp[i][j] != -1)
				return dp[i][j];

			int max = Integer.MIN_VALUE;

			for (int x = 0; x < 3; x++) {

				if (x != j)
					max = Math.max(max, (ar[i][j] + func(i + 1, x)));
			}
			return dp[i][j] = max;
		}
	}

	public static void main(String[] args) throws Exception {
		MyScanner sc = new MyScanner();
		PrintWriter pr = new PrintWriter(System.out);
		int n = sc.nextInt();
		Vacations a = new Vacations(n);

		for (int i = 0; i < n; i++) {

			a.ar[i][0] = sc.nextInt();
			a.ar[i][1] = sc.nextInt();
			a.ar[i][2] = sc.nextInt();

			for (int j = 0; j < 3; j++)
				a.dp[i][j] = -1;
		}

		int x = a.func(0, 0);
		int b = a.func(0, 1);
		int c = a.func(0, 2);
		pr.println(Math.max(x, Math.max(b, c)));
		pr.close();
	}

	public static class MyScanner {
		BufferedReader br;
		StringTokenizer st;

		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
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

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}