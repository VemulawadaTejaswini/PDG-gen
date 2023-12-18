import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		FastReader fr = new FastReader();
		int n = fr.nextInt();
		String s = fr.nextLine();
		int[][] freq = new int[26][n];
		for (int i=0; i<n; i++) {
			for (int j=0; j<26; j++) {
				if (s.charAt(i) == 'a' + j) {
					freq[j][i] = i>0 ? freq[j][i-1] + 1 : 1;
				} else {
					freq[j][i] = i>0 ? freq[j][i-1] : 0;
				}
			}
			
		}
		int max = 0;
		for (int i=1; i<n; i++) {
			int temp = 0;
			for (int j=0; j<26; j++) {
				temp += freq[j][i-1] > 0 && freq[j][n-1] - freq[j][i-1] > 0 ? 1 : 0;
			}
			max = Math.max(max, temp);
		}
		System.out.println(max);
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
