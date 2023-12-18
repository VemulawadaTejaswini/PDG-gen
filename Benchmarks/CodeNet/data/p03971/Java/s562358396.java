import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		FastReader fr = new FastReader();
		int n = fr.nextInt();
		int a = fr.nextInt();
		int b = fr.nextInt();
		String s = fr.nextLine();
		int curPassCount = 0;
		int overSeasRank = 1;
		for (int i=0; i<n; i++) {
			if (s.charAt(i) == 'c') {
				System.out.println("No");
			} else if (s.charAt(i) == 'b') {
				if (overSeasRank <= b && curPassCount < a + b) {
					curPassCount++;
					overSeasRank++;
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			} else {
				if (curPassCount < a + b) {
					curPassCount++;
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			}
		}
	}
	

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		public String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

		public String nextLine() {
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
