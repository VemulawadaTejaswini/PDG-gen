import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		FastReader fr = new FastReader();
		int[] a = new int[100002];
		int n = fr.nextInt();
		int max = Integer.MIN_VALUE;
		for (int i=0; i<n; i++) {
			int x = fr.nextInt();
			a[x]++;
			a[x+1]++;
			max =Math.max(max, Math.max(a[x], a[x+1]));
			if (x > 0) {
				a[x-1]++;
				max = Math.max(max, Math.max(a[x], a[x-1]));
			}
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
