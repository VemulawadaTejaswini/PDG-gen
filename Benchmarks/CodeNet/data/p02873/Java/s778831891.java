import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		FastReader fr = new FastReader();
		String s = fr.nextLine();
		long sum = 0;
		int n = s.length() + 1;
		long[] a = new long[n];
		for (int i=1; i<n; i++) {
			if (s.charAt(i-1) == '<') {
				a[i] = a[i-1] + 1;
			} else if (i < n-1 && s.charAt(i-1) == '>' && s.charAt(i) == '<') {
				a[i] = 0;
			}
		}
		for (int i=n-1; i>=0; i--) {
			if (i < n-1 && s.charAt(i) == '>') {
				a[i] = Math.max(a[i], a[i+1]+1);
			}
			sum += a[i];
		}
		System.out.println(sum);
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
