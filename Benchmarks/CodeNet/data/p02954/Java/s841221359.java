import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		FastReader fr = new FastReader();
		String s = fr.nextLine();
		int n = s.length();
		int[] res = new int[n];
		for (int i=0; i<n-1; i++) {
			if (s.charAt(i) == 'R' && s.charAt(i+1) == 'L') {
				for (int j=i; j>=0 && s.charAt(j) == 'R'; j--) {
					res[i + (i-j)%2]++;
				}
				for (int j=i+1; j<n && s.charAt(j) == 'L'; j++) {
					res[i+1 - (j-i-1)%2]++;
				}
			}
		}
		for (int i=0; i<n; i++) {
			System.out.print(res[i]+" ");
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
