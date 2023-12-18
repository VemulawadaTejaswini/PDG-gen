import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	
	public static void main(String[] args) throws IOException {
		try(final Scanner sc = new Scanner(System.in)){
			char[] S = sc.next().toCharArray();
			
			boolean[] used = new boolean[26];
			for(final char s : S){
				used[s - 'a'] = true;
			}
			
			for(int i = 0; i < 26; i++){
				if(used[i]){ continue; }
				
				System.out.println(String.valueOf(S) + (char)('a' + i));
				return;
			}
			
			String orig = String.valueOf(S);
			String min = null;
			
			for(int lst = S.length - 1; lst >= 0; lst--){
				for(int fst = lst - 1; fst >= 0; fst--){
					if(S[lst] > S[fst]){
						S[fst] = S[lst];
						final String new_str = String.valueOf(S).substring(0, fst + 1);
						
						if(new_str.compareTo(orig) > 0){
							if(min == null || new_str.compareTo(min) < 0){
								min = new_str;
							}
						}
						
						S = orig.toCharArray();
					}
				}
				
			}
			
			System.out.println(min == null ? -1 : min);
			/*
			try(final PrintWriter pw = new PrintWriter(System.out)){
				pw.println();
			}
			*/
			
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