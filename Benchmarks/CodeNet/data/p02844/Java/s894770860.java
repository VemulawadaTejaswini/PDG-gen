import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;

import java.util.PriorityQueue;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) throws IOException {	
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			final char[] chs = sc.next().toCharArray();
			
			int[] counts = new int[10];
			for(int i = chs.length - 1; i >= 0; i--) {
				counts[chs[i] - '0']++;
			}
			
			HashSet<String> answer = new HashSet<String>();
			
			boolean[] i_pat = new boolean[10];
			boolean[][] j_pat = new boolean[10][10];
			
			for(int i = 0; i < N; i++) {
				final int c1 = chs[i] - '0';
				counts[c1]--;
				
				if(i_pat[c1]) { continue; }
				int[] backup = counts.clone();
				
				for(int j = i + 1; j < N; j++) {
					final int c2 = chs[j] - '0';
					counts[c2]--;
					
					if(j_pat[c1][c2]) { continue; }
					
					for(int val = 0; val < 10; val++) {
						if(counts[val] <= 0) { continue; }
						
						answer.add(c1 + "" + c2 + "" + val);
					}
					
					j_pat[c1][c2] = true;
				}
				
				i_pat[c1] = true;
				counts = backup;
			}
			
			System.out.println(answer.size());
			
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