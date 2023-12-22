import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	
	public static class Pair implements Comparable<Pair> {
		int x, y;
		
		public Pair(int x, int y){
			this.x = x;
			this.y = y;
		}
		
		@Override public int compareTo(Pair arg0){
			return Integer.compare(this.x, arg0.x);
		}
	}

	public static void main(String[] args) throws IOException {
		final Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		final int m = sc.nextInt();
		
		ArrayList<HashSet<Integer>> upper_most = new ArrayList<HashSet<Integer>>();
		ArrayList<HashSet<Integer>> lower_most = new ArrayList<HashSet<Integer>>();
		for(int i = 0; i < n; i++){
			upper_most.add(new HashSet<Integer>(1));
			lower_most.add(new HashSet<Integer>(1));
		}
		for(int i = 0; i < n; i++){
			upper_most.get(i).add(i);
			lower_most.get(i).add(i);
		}
		
		int[] output = new int[n];
		Arrays.fill(output, 1);
		
		Pair[] pair = new Pair[m];
		for(int i = 0; i < m; i++){
			final int x = sc.nextInt();
			final int y = sc.nextInt() - 1;
			
			pair[i] = new Pair(x, y);
		}
		Arrays.sort(pair);
		
		for(int i = m - 1; i >= 0; i--){
			//final int x = pair[i].x;
			final int y = pair[i].y;
			
			lower_most.get(y + 1).addAll(lower_most.get(y));
			lower_most.get(y).clear();
			
			upper_most.get(y).addAll(upper_most.get(y + 1));
			upper_most.get(y + 1).clear();
		}
		
		//System.out.println(upper_most + " " + lower_most);
		int[] upper = new int[n];
		int[] lower = new int[n];
		for(int i = 0; i < n; i++){
			for(final int x : upper_most.get(i)){
				upper[x] = i;
			}
			
			for(final int x : lower_most.get(i)){
				lower[x] = i;
			}
		}
		
		
		PrintWriter pw = new PrintWriter(System.out);
		for(int i = 0; i < n; i++){
			//pw.println(upper[i] + ", " + lower[i]);
			//*
			pw.print(i == 0 ? "" : " ");
			pw.print(lower[i] - upper[i] + 1);
			//*/
		}
		pw.println();
		pw.flush();
		pw.close();
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

		public void close() throws IOException {
			br.close();
		}
	}
}