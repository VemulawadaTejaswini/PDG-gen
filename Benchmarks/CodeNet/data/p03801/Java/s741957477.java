import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
		
	public static void main(String[] args) throws IOException {
		final Scanner sc = new Scanner(System.in);
		
		final int N = sc.nextInt();
		long[] array = new long[N];
		for(int i = 0; i < N; i++){
			array[i] = sc.nextLong();
		}
		
		HashMap<Long, Integer> counts  = new HashMap<Long, Integer>();
		HashMap<Long, Integer> indexes = new HashMap<Long, Integer>();
		for(int i = 0; i < N; i++){
			if(!indexes.containsKey(array[i])){
				indexes.put(array[i], i);
			}
			
			if(!counts.containsKey(array[i])){
				counts.put(array[i], 0);
			}
			counts.put(array[i], counts.get(array[i]) + 1);
		}
		
		long count = 0;
		long[] answer = new long[N + 1];
		
		PriorityQueue<Long> queue = new PriorityQueue<Long>(Collections.reverseOrder());
		queue.addAll(counts.keySet());
		
		while(!queue.isEmpty()){
			final long curr_value = queue.poll();
			final long curr_count = counts.get(curr_value);
			final int curr_index = indexes.get(curr_value);
			//System.out.println(curr_value + " " + curr_count + " " + curr_index);
			
			final long next_value = queue.isEmpty() ? 0 : queue.peek();
			final long do_move = (count + curr_count) * (curr_value - next_value);
				
			answer[curr_index] += do_move;
			count += curr_count;
			
			if(next_value != 0){
				final int next_index = indexes.get(next_value);
				indexes.put(next_value, (Math.min(next_index, curr_index)));
			}
		}
		
		for(int i = 0; i < N; i++){
			System.out.println(answer[i]);
		}
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