import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	public static void solve() {
		int n=s.nextInt();
		int[] arr = new int[n];
		int mod = (int)1e9+7;
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int[] count = new int[n+1];
		count[0]=3;
		long ans = 1;
		for(int i =0;i<n;i++) {
			int current= arr[i];
			int last = arr[i]-1;
			int vc = count[current+1];
			int vl = count[last+1];
			ans = (ans*(vl-vc))%mod;
			count[current+1]++;
		}
		out.println(ans);
	}

	public static void main(String[] args) {
		out = new PrintWriter(new BufferedOutputStream(System.out));
		s = new FastReader();
		solve();
		out.close();
	}

	public static FastReader s;
	public static PrintWriter out;

	public static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	
}
