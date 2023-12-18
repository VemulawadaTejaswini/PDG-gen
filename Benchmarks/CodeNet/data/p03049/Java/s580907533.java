import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			
			final String[] strs = new String[N];
			for(int i = 0; i < N; i++) {
				strs[i] = sc.next();
			}
			
			int count = 0;
			int BA = 0, _A = 0, B_ = 0;
			for(final String str : strs) {
				
				for(int i = 0; i < str.length(); i++) {
					if(str.startsWith("AB", i)) { count += 1; }
				}
				
				if(str.endsWith("A") && str.startsWith("B")) {
					BA += 1;
				}else if(str.endsWith("A")) {
					_A += 1;
				}else if(str.startsWith("B")) {
					B_ += 1;
				}
			}
			
			if(BA >= 1) {
				final int BA_ONLY = Math.max(0, BA - 1);
				if(B_ > 0 && _A > 0) {
					System.out.println(count + BA_ONLY + 2 + Math.min(_A - 1, B_ - 1));
				}else if(_A > 0) {
					System.out.println(count + BA_ONLY + 1 + Math.min(_A - 1, B_));
				}else if(_B > 0){
					System.out.println(count + BA_ONLY + 1 + Math.min(_A, B_ - 1));
				}else {
					System.out.println(count + BA_ONLY + 0 + Math.min(_A, B_));
				}
			}else {
				System.out.println(count + 0 + 0 + Math.min(_A, B_));
			}
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