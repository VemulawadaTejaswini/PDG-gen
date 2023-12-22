import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	
	public static int swap_itr(final int n, final int deep, final int next_pos, int[] array){
		final int length = next_pos - deep;
		
		if(length == 0){
			return naive(n, deep + 1, array);
		}
		
		int min = Integer.MAX_VALUE;
		
		for(int prob = 1; prob <= length; prob++){
			final int prev_pos = next_pos - prob;
			
			int tmp = array[next_pos];
			array[next_pos] = array[prev_pos];
			array[prev_pos] = tmp; 
			
			min = Math.min(min, swap_itr(n, deep, next_pos - prob, array) + array[next_pos] + array[prev_pos]);
			
			tmp = array[next_pos];
			array[next_pos] = array[prev_pos];
			array[prev_pos] = tmp;  
		}
		
		return min;
	}
	
	public static int naive(final int n, final int deep, int[] array) {
		if(deep >= n){
			return 0;
		}
		
		int min = array[deep];
		int min_pos = deep;

		for (int next = deep + 1; next < n; next++) {
			if (array[next] < min) {
				min = array[next];
				min_pos = next;
			}
		}

		if (min_pos != deep) {
			return swap_itr(n, deep, min_pos, array);
		}else{
			return naive(n, deep + 1, array);
		}
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		final int n = sc.nextInt();
		int[] array = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.println(naive(n, 0, array));
	}

	public static class Scanner {
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

		public void close() throws IOException {
			br.close();
		}
	}

}