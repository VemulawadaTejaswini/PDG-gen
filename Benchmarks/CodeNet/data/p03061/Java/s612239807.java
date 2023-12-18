import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	
	public static int gcd(int a, int b){
		return b == 0 ? a : gcd(b, a % b);
	}
	
	public static void main(String[] args) throws IOException {
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			
			int[] as = new int[N];
			for(int i = 0; i < N; i++) {
				as[i] = sc.nextInt();
			}
			
			int[] l_gcd = new int[N];
			int[] r_gcd = new int[N];
			
			l_gcd[0] = as[0]; r_gcd[N - 1] = as[N - 1];
			for(int i = 1; i < N; i++) {
				l_gcd[i] = gcd(l_gcd[i - 1], as[i]);
			}
			for(int i = N - 2; i >= 0; i--) {
				r_gcd[i] = gcd(r_gcd[i + 1], as[i]);
			}
			
			int answer = Math.max(l_gcd[N - 2], r_gcd[1]);
			for(int i = 1; i < N - 1; i++) {
				answer = Math.max(answer, gcd(l_gcd[i - 1], r_gcd[i + 1]));
			}
			
			System.out.println(answer);
		}
	}

	public static class Scanner implements Closeable {
		private BufferedReader br;
		private StringTokenizer tok;

		public Scanner(InputStream is) throws IOException {
			br = new BufferedReader(new InputStreamReader(is));
		}

		private void getLine() throws IOException {
			while(!hasNext()){
				tok = new StringTokenizer(br.readLine());
			}
		}

		private boolean hasNext() {
			return tok != null && tok.hasMoreTokens();
		}

		public String next() throws IOException {
			getLine();
			return tok.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public int[] nextIntArray(int n) throws IOException {
			final int[] ret = new int[n];
			for(int i = 0; i < n; i++){
				ret[i] = this.nextInt();
			}
			return ret;
		}

		public long[] nextLongArray(int n) throws IOException {
			final long[] ret = new long[n];
			for(int i = 0; i < n; i++){
				ret[i] = this.nextLong();
			}
			return ret;
		}

		public void close() throws IOException {
			br.close();
		}
	}
}