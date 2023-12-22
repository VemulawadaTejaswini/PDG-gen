import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		
		final int N = sc.nextInt();
		final char[] input = sc.next().toCharArray();
		
		int[] counts = new int[26];
		for(int i = 0; i < N; i++){
			if(!Character.isAlphabetic(input[i])){ continue; }
			counts[input[i] - 'a']++;
		}
		
		//System.out.println(Arrays.toString(counts));
		
		boolean all_same = true;
		int same_value = -1;
		{
			for(int i = 0; i < 26; i++){
				if(counts[i] == 0){ continue; }
				else if(same_value < 0){ same_value = counts[i]; }
				else if(same_value != counts[i]){ all_same = false; break; }
			}
		}
		
		int s = 0;
		for(int i = 0; i < 26; i++){
			s += counts[i] > 0 ? 1 : 0;
		}
		//System.out.println(s);
		
		int t = 0;
		for(int i = 0; i < 26; i++){
			t += (counts[i] <= 0 ? 0 : counts[i] == 1 ? 1 : 3);
		}
		//System.out.println(t);
		
		System.out.println(Math.min(t + s - 1, all_same ? (same_value == 1 ? 2 : 4) * (s + s - 1) : (Integer.MAX_VALUE)));
		
	}

	public static class Scanner implements Closeable {
		private BufferedReader br;
		private StringTokenizer tok;

		public Scanner(InputStream is) {
			br = new BufferedReader(new InputStreamReader(is));
		}

		private void getLine() {
			try {
				while (!hasNext()) {
					tok = new StringTokenizer(br.readLine());
				}
			} catch (IOException e) { /* ignore */
			}
		}

		private boolean hasNext() {
			return tok != null && tok.hasMoreTokens();
		}

		public String next() {
			getLine();
			return tok.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

		public void close() {
			try {
				br.close();
			} catch (IOException e) { /* ignore */
			}
		}
	}
}