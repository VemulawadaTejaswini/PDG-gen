import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		FastScanner in = new FastScanner(System.in);
		int n = in.nextInt();
		int k= in.nextInt();
		long [] freq= new long[100001];
		
		for(int i=0; i<n; i++){
			int num= in.nextInt();
			int copies= in.nextInt();
			freq[num] += copies;
		}
		
		for(int i=1; i<=freq.length;i++){
			if(k<= freq[i]){
				System.out.println(i);
				break;
			}
			k-= freq[i];
		}
		
	}
	static class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner(InputStream in) {
			br = new BufferedReader(new InputStreamReader(in));
			st = new StringTokenizer("");
		}

		public double nextDouble() throws NumberFormatException, IOException {
			return Double.parseDouble(next());
		}

		public String next() throws IOException {
			if (!st.hasMoreTokens()) {
				st = new StringTokenizer(br.readLine());
				return next();
			}
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
	}
}
