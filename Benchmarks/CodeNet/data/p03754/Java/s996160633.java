import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	
	public static void main(String[] args) throws IOException {
		try(Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			ArrayList<HashSet<Integer>> adj = new ArrayList<HashSet<Integer>>();
			
			for(int i = 0; i < N; i++){
				adj.add(new HashSet<Integer>());
			}
			
			for(int i = 0; i < N - 1; i++){
				final int A = sc.nextInt() - 1;
				final int B = sc.nextInt() - 1;
				
				adj.get(A).add(B);
				adj.get(B).add(A);
			}
			
			int leafs = 0;
			for(int i = 0; i < N; i++){
				if(adj.get(i).size() == 1){ leafs++; }
			}
			
			if(leafs != 2){ throw new RuntimeException(); }
			
			int[] heads = new int[leafs];
			for(int i = 0, count = 0; i < N; i++){
				if(adj.get(i).size() == 1){
					heads[count++] = i;
				}
			}
			
			int[][] distance = new int[N][2];
			LinkedList<Integer> queue = new LinkedList<Integer>();
			for(int i = 0; i < heads.length; i++){
				final int start = heads[i];
				queue.clear();
				
				queue.add(start);
				queue.add(-1);
				queue.add(0);
				
				while(!queue.isEmpty()){
					final int pos = queue.poll();
					final int prev = queue.poll();
					final int depth = queue.poll();
					
					distance[pos][i] = depth;
					for(final int next : adj.get(pos)){
						if(next == prev){ continue; }
						
						queue.add(next);
						queue.add(pos);
						queue.add(depth + 1);
					}
				}
			}
			
			for(int i = 0; i < N; i++){
				double answer = 0;
				
				if(distance[i][0] == 0){
					answer += distance[i][1];
				}else if(distance[i][1] == 0){
					answer += distance[i][0];
				}else{
					answer += (distance[i][0] / 2.0) + (distance[i][1] / 2.0);
				}
				
				System.out.printf("%.12f\n", answer);
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