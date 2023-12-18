import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static long get(long[] prefix_sum, int begin, int end) {
		return prefix_sum[end] - prefix_sum[begin];
	}
	
	public static void main(String[] args) throws IOException {
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			final int size = 1 << N;
			
			long[] array = new long[size];
			for(int i = 0; i < size; i++) { array[i] = sc.nextLong(); }
			
			/*
			long[] max_1 = new long[size + 1];
			long[] max_2 = new long[size + 1];
			int[] max_1_index = new int[size + 1];
			int[] max_2_index = new int[size + 1];
			
			for(int i = 0; i < N; i++) {
				final int i_bit = 1 << i;
				
				for(int x_bit = i_bit; x_bit <= size; x_bit = (x_bit + 1) | i_bit) {
					if(max_1[x_bit] < array[i]) {
						max_2_index[x_bit] = max_1_index[x_bit];
						max_2[x_bit] = max_1[x_bit];
						
						max_1_index[x_bit] = i;
						max_1[x_bit] = array[i];
					}else if(max_2[x_bit] < array[i]) {
						max_2_index[x_bit] = i;
						max_2[x_bit] = array[i];
					}
				}
			}
			*/
			
			long[] answers = new long[size + 1];
			answers[size] = array[size - 1] + array[0];
			
			for(int x = size - 1; ; x = (x - 1) & (size - 1)) {
				for(int y = size - 1; ; y = (y - 1) & (size - 1)) {
					if(x < y) {
						final long value = array[x] + array[y];
					
						//if((x | y) == 1) {
						//	System.out.println(x + " " + y + " " + value);
						//}
					
						answers[x | y] = Math.max(answers[x | y], value);
					}
					
					if (y == 0) { break; }
				}
				
				if(x == 0) { break; }
			}
			
			for(int i = 1; i < size; i++) {
				answers[i] = Math.max(answers[i], answers[i - 1]);
			}
			
			for(int i = 1; i < size; i++) {
				System.out.println(answers[i]);
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