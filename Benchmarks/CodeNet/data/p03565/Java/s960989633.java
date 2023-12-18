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

import javax.swing.text.Segment;

public class Main {

	public static void main(String[] args) throws IOException {
		try (Scanner sc = new Scanner(System.in)) {
			final char[] S = sc.next().toCharArray();
			final char[] T = sc.next().toCharArray();
			
			String answer = null;
			
			LOOP:
			for(int start = 0; start <= (S.length - T.length); start++){
				for(int index = 0; index < T.length; index++){
					final char S_ch = S[start + index];
					final char T_ch = T[index];
					
					if(!(S_ch == '?' || S_ch == T_ch)){ continue LOOP; }
				}
				
				StringBuilder sb = new StringBuilder();
				for(int i = 0; i < start; i++){ 
					if(S[i] == '?'){
						sb.append('a');
					}else{
						sb.append(S[i]);
					}
				}
				for(int i = 0; i < T.length; i++){ sb.append(T[i]); }
				for(int i = start + T.length; i < S.length; i++){
					if(S[i] == '?'){
						sb.append('a');
					}else{
						sb.append(S[i]);
					}
				}
				
				final String curr = sb.toString();
				if(answer == null || answer.compareTo(curr) > 0){
					answer = curr;
				}
			}
			
			if(answer != null){
				System.out.println(answer);
			}else{
				System.out.println("UNRESTORABLE");
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