import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		MyScanner sc = new MyScanner();
		out = new PrintWriter(new BufferedOutputStream(System.out));
		
		int n = sc.nextInt();
		int yen = sc.nextInt();
		String ans = "-1 -1 -1";
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				int x = i;
				int y = j;
				int z = n - x - y;
				if (z>=0) {
					if (10000*x + 5000*y + 1000*z == yen) {
						ans = String.format("%d %d %d", x, y, z);
						break;
					}
				}
			}
		}
		out.println(ans);
		out.close();
	}

	//-----------http://codeforces.com/blog/entry/7018---------------------------------
	public static PrintWriter out;

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
	//--------------------------------------------------------

}

