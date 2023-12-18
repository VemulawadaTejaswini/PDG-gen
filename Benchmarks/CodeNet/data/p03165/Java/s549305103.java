import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;

import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) throws IOException {
		try(final Scanner sc = new Scanner(System.in)){
			final char[] S = sc.next().toCharArray();
			final char[] T = sc.next().toCharArray();
			
			long[][] DP = new long[S.length + 1][T.length + 1];
			int[][] prev_i = new int[S.length + 1][T.length + 1];
			int[][] prev_j = new int[S.length + 1][T.length + 1];
			
			for(int i = 1; i <= S.length; i++) {
				for(int j = 1; j <= T.length; j++) {
					if(S[i - 1] == T[j - 1]) {
						DP[i][j] = DP[i - 1][j - 1] + 1;
						prev_i[i][j] = i - 1;
						prev_j[i][j] = j - 1;
					}else {
						DP[i][j] = Math.max(DP[i][j - 1], DP[i - 1][j]);
						
						if(DP[i][j - 1] > DP[i - 1][j]) {
							prev_i[i][j] = i;
							prev_j[i][j] = j - 1;
						}else {
							prev_i[i][j] = i - 1;
							prev_j[i][j] = j;
						}
					}
				}
			}
			
			LinkedList<Character> answer = new LinkedList<Character>();
			{
				int i = S.length, j = T.length;
				while(i > 0 && j > 0) {
					if(prev_i[i][j] == i || prev_j[i][j] == j) {
						final int old_i = i, old_j = j;
						i = prev_i[old_i][old_j];
						j = prev_j[old_i][old_j];
					}else {
						answer.addFirst(S[i - 1]);
						final int old_i = i, old_j = j;
						i = prev_i[old_i][old_j];
						j = prev_j[old_i][old_j];
					}
				}
			}
			
			StringBuilder sb = new StringBuilder();
			for(final char ch : answer) { sb.append(ch); }
			System.out.println(sb.toString());
		}
	}

	public static class Scanner implements Closeable {
		private BufferedReader br;
		private StringTokenizer tok;

		public Scanner(InputStream is) throws IOException {
			br = new BufferedReader(new InputStreamReader(is));
		}

		private void getLine() throws IOException {
			while(!hasNext()){
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