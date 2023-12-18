import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	
	public static void main(String[] args){
		try(final Scanner sc = new Scanner(System.in)){
			int a_count = 0, b_count = 0, c_count = 0;
			for(final char c : sc.next().toCharArray()){
				switch (c) {
				case 'a': a_count++; break;
				case 'b': b_count++; break;
				case 'c': c_count++; break;
				}
			}
			
			final int sum = a_count + b_count + c_count;
			final int max_count = Math.max(a_count, Math.max(b_count, c_count));
			final int min_count = Math.min(a_count, Math.min(b_count, c_count));
			final int mid_count = sum - max_count - min_count;
			
			final int rest_count = sum - max_count;
			
			if(max_count >= rest_count){
				final int diff = max_count - rest_count;
				
				if(min_count == 0){
					System.out.println(diff <= 0 ? "YES" : "NO");
				}else{
					System.out.println(diff <= 1 ? "YES" : "NO");
				}
			}else{
				final int can_make_pair = Math.min(mid_count, min_count);
				final int can_use_pair = Math.min(max_count / 2, can_make_pair);
				
				final int new_max = max_count - can_use_pair * 2;
				final int new_mid = mid_count - can_use_pair;
				final int new_min = min_count - can_use_pair;
				
				//System.out.println(can_use_pair);
				//System.out.println(new_max + " " + new_mid + " " + new_min);
				
				if(new_max == 0){
					final int diff = new_mid - new_min;
					if(diff <= 2){
						System.out.println("YES");
					}else{
						System.out.println("NO");
					}
				}else{ // new_min == 0
					final int diff = new_max - new_mid;
					if(diff <= 2){
						System.out.println("YES");
					}else{
						System.out.println("NO");
					}
				}
			}
		}
	}
	
	public static class Scanner implements AutoCloseable {
		private BufferedReader br;
		private StringTokenizer tok;

		public Scanner(InputStream is) {
			br = new BufferedReader(new InputStreamReader(is));
		}

		private void getLine() {
			try {
				while (!hasNext()) {tok = new StringTokenizer(br.readLine());}
			} catch(IOException e){ /* ignore */ }
		}

		private boolean hasNext() {
			return tok != null && tok.hasMoreTokens();
		}

		public String next() {
			getLine(); return tok.nextToken();
		}

		public int nextInt(){
			return Integer.parseInt(next());
		}
		public long nextLong(){
			return Long.parseLong(next());
		}
		public double nextDouble(){
			return Double.parseDouble(next());
		}
		
		public int[] nextIntArray(int n){
			int[] ret = new int[n];
			for(int i = 0; i < n; i++){ ret[i] = nextInt(); }
			return ret;
		}
		public long[] nextLongArray(int n){
			long[] ret = new long[n];
			for(int i = 0; i < n; i++){ ret[i] = nextLong(); }
			return ret;
		}
		public double[] nextDoubleArray(int n){
			double[] ret = new double[n];
			for(int i = 0; i < n; i++){ ret[i] = nextDouble(); }
			return ret;
		}

		public void close() {
			try{ br.close(); } catch (IOException e){ /*ignore*/ }
		}
	}
}
