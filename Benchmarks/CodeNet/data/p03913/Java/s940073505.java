import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class Main {
	
	public static long calc_time(long A, long N, long curr_time, long curr_cokkie, long can_bake){
		return curr_time + Math.max(0, ((N - curr_cokkie) + (can_bake - 1))) / can_bake;
	}
	
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			
			final long BIG_N = sc.nextLong();
			final long BIG_A = sc.nextLong();
			
			assert(BIG_N <= 1000000 && BIG_A <= 1000000);
			
			final int N = (int)(BIG_N);
			final int A = (int)(BIG_A);
			
			long[] bake_time = new long[2 * N + 1];
			long[] next_time = new long[2 * N + 1];
			
			Arrays.fill(bake_time, Long.MAX_VALUE / 2);
			bake_time[1] = 1;
			next_time[0] = bake_time[0] = 0;
			while(true){
				boolean updated = false;
				
				System.arraycopy(bake_time, 1, next_time, 1, bake_time.length - 1);
				
				for(int curr = 1; curr < N; curr++){
					if(next_time[curr + 1] > bake_time[curr] + 1){
						updated = true;
						next_time[curr + 1] = bake_time[curr] + 1;
					}
				}
				for(int curr = 1; curr <= (N + curr) / 2; curr++){
					int count = 1;
					
					for(int next = curr * 2; next <= N + curr; next += curr){
						if(next_time[next] > bake_time[curr] + A + (count + 1)){
							updated = true;
							next_time[next] = bake_time[curr] + A + (count + 1);
						}
						
						count++;
					}
				}
				
				/*
				for(int i = 0; i < 30; i++){
					System.out.print(bake_time[i] + " ");
				}
				*/
				//System.out.println(bake_time[N]);
				
				if(!updated){ break; }
				
				{
					long[] tmp = bake_time;
					bake_time = next_time;
					next_time = tmp;
				}
			}
			
			long min = Long.MAX_VALUE;
			for(int i = N; i < bake_time.length; i++){
				min = Math.min(min, bake_time[i]);
			}
			System.out.println(min);
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
		// 他のnextXXXもXXX.parseXXX()メソッドを使って作れるので省略

		public void close() {
			try{ br.close(); } catch (IOException e){ /*ignore*/ }
		}
	}
}
