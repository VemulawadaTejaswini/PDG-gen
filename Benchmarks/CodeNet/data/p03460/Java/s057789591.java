import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;
 
public class Main {
	
	public static long get(long[][] sums, final int SIZE, int sx, int sy, int gx, int gy){
		//System.out.println(sx + " " + sy  + " " + gx + " " + gy);
		
		if(sx > gx && sy > gy){
			return get(sums, SIZE, sx, sy, SIZE - 1, SIZE - 1)
					+ get(sums, SIZE, sx, 0, SIZE - 1, gy)
					+ get(sums, SIZE, 0, sy, gx, SIZE - 1)
					+ get(sums, SIZE, 0, 0, gx, gy);
		}else if(sx > gx){
			return get(sums, SIZE, sx, sy, SIZE - 1, gy) + get(sums, SIZE, 0, sy, gx, gy);
		}else if(sy > gy){
			return get(sums, SIZE, sx, sy, gx, SIZE - 1) + get(sums, SIZE, sx, 0, gx, gy);
		}else{
			if(sx == 0 && sy == 0){
				return sums[gy][gx];
			}else if(sx == 0){
				return sums[gy][gx] - sums[sy - 1][gx];
			}else if(sy == 0){
				return sums[gy][sx] - sums[gy][sx - 1];
			}else{
				return sums[gy][gx] - sums[sy - 1][gx] - sums[gy][sx - 1] + sums[sy - 1][sx - 1]; 
			}
 		}
	}
	
	public static void main(String[] args) throws IOException {
		try (Scanner sc = new Scanner(System.in)) {
			final int N = sc.nextInt();
			final int K = sc.nextInt();
			
			final long[] xs = new long[N];
			final long[] ys = new long[N];
			final boolean[] is_black = new boolean[N];
			for(int i = 0; i < N; i++){
				xs[i] = sc.nextLong();
				ys[i] = sc.nextLong();
				is_black[i] = sc.next().equals("B");
			}
			
			final int SIZE = 2 * K;
			long[][] white_prefix_sum = new long[SIZE ][SIZE];
			long[][] black_prefix_sum = new long[SIZE ][SIZE];
			for(int i = 0; i < N; i++){
				final int x_mod = (int)(xs[i] % (SIZE));
				final int y_mod = (int)(ys[i] % (SIZE));
				if(is_black[i]){
					black_prefix_sum[y_mod][x_mod]++;
				}else{
					white_prefix_sum[y_mod][x_mod]++;
				}
			}
			
			for(int y = 0; y < SIZE; y++){
				for(int x = 0; x < SIZE; x++){
					if(y != 0){ 
						white_prefix_sum[y][x] += white_prefix_sum[y - 1][x];
						black_prefix_sum[y][x] += black_prefix_sum[y - 1][x];
					}
					if(x != 0){
						white_prefix_sum[y][x] += white_prefix_sum[y][x - 1];
						black_prefix_sum[y][x] += black_prefix_sum[y][x - 1];
					}
					if(y != 0 && x != 0){
						white_prefix_sum[y][x] -= white_prefix_sum[y - 1][x - 1];
						black_prefix_sum[y][x] -= black_prefix_sum[y - 1][x - 1];
					}
				}
			}
			
			long answer = 0;
			for(int x_offset = 0; x_offset < SIZE; x_offset++){
				for(int y_offset = 0; y_offset < SIZE; y_offset++){
					
					final long white_ll = get(white_prefix_sum, SIZE, (x_offset + 0) % SIZE, (y_offset + 0) % SIZE, (x_offset + 1 * K - 1) % SIZE, (y_offset + 1 * K - 1) % SIZE);
					final long white_rr = get(white_prefix_sum, SIZE, (x_offset + K) % SIZE, (y_offset + K) % SIZE, (x_offset + 2 * K - 1) % SIZE, (y_offset + 2 * K - 1) % SIZE);
					
					final long black_lr = get(black_prefix_sum, SIZE, (x_offset + 0) % SIZE, (y_offset + K) % SIZE, (x_offset + 1 * K - 1) % SIZE, (y_offset + 2 * K - 1) % SIZE);
					final long black_rl = get(black_prefix_sum, SIZE, (x_offset + K) % SIZE, (y_offset + 0) % SIZE, (x_offset + 2 * K - 1) % SIZE, (y_offset + 1 * K - 1) % SIZE);
					
					//System.out.println((white_ll + white_rr) + " " + (black_lr + black_rl));
					
					answer = Math.max(answer, white_ll + black_rl + black_lr + white_rr);
				}
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
			for (int i = 0; i < n; i++) {
				ret[i] = this.nextInt();
			}
			return ret;
		}
 
		public long[] nextLongArray(int n) throws IOException {
			final long[] ret = new long[n];
			for (int i = 0; i < n; i++) {
				ret[i] = this.nextLong();
			}
			return ret;
		}
 
		public void close() throws IOException {
			br.close();
		}
	}
}