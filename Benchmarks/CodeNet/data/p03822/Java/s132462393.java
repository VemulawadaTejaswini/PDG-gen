import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	
	
	public static void main(String[] args) throws IOException {
		final Scanner sc = new Scanner(System.in);
		
		final int N = sc.nextInt();
		
		int[] as = new int[N];
		for(int i = 1; i < N; i++){
			as[i] = sc.nextInt() - 1;
		}
		
		int[] win_count = new int[N];
		for(int i = 1; i < N; i++){ win_count[as[i]]++; }
		//System.out.println(Arrays.toString(win_count));
		
		int[] depth = new int[N];
		int[] rest_win_count = new int[N];
		System.arraycopy(win_count, 0, rest_win_count, 0, N);
		
		LinkedList<Integer> queue = new LinkedList<Integer>();
		for(int i = 0; i < N; i++){
			if(win_count[i] == 0){
				depth[i]--;
				queue.add(i);
			}
		}
		
		while(!queue.isEmpty()){
			final int lose_person = queue.poll();
			//System.out.println(lose_person + 1);
			
			depth[lose_person]++;
			
			if(lose_person == 0){ continue; }
			
			final int win_person = as[lose_person];
			//System.out.println((lose_person + 1) + " < " + (win_person + 1));
			
			depth[win_person] = Math.max(depth[win_person], depth[lose_person] + (rest_win_count[win_person] - 1));
			//System.out.println(depth[win_person]);
			
			rest_win_count[win_person]--;
			if(rest_win_count[win_person] == 0){
				queue.add(win_person);
			}
		}
		
		System.out.println(Arrays.stream(depth).max().getAsInt());
	}
	
	public static class Scanner implements Closeable {
		private BufferedReader br;
		private StringTokenizer tok;
 
		public Scanner(InputStream is) throws IOException {
			br = new BufferedReader(new InputStreamReader(is));
		}
 
		private void getLine() throws IOException {
			while (!hasNext()) {
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
 
		public void close() throws IOException {
			br.close();
		}
	}
}