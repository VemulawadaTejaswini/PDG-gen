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
import java.util.Map;
import java.util.Map.Entry;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;

import java.util.PriorityQueue;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	
	public static long naive(int limit, int deep, char[] stack, char[] options) {
		if(deep >= 3 && (
				stack[deep - 3] == 'A' && stack[deep - 2] == 'G' && stack[deep - 1] == 'C'
				|| stack[deep - 3] == 'A' && stack[deep - 2] == 'C' && stack[deep - 1] == 'G'
				|| stack[deep - 3] == 'G' && stack[deep - 2] == 'A' && stack[deep - 1] == 'C'
			)) {
			System.out.println(deep + " : " + Arrays.toString(stack));
			return 0;
		}else if(deep >= limit) {
			System.out.println(Arrays.toString(stack));
			return 1;
		}
		
		long answer = 0;
		for(final char opt : options) {
			stack[deep] = opt;
			answer += naive(limit, deep + 1, stack, options);
		}
		
		return answer;
	}
	
	public static char[] pat_map = {'A', 'C', 'G', 'T'};
	public static char pat_to_ch(int x) {
		if(x >= pat_map.length) {
			return '?';
		}else {
			return pat_map[x];
		}
	}
	
	public static long[] init_pattern() {
		// A -> 0, C -> 1, G -> 2, T -> 3 とする
		long[] patterns = new long[256];
		
		for(int fst = 0; fst < 4; fst++) {
			for(int snd = 0; snd < 4; snd++) {
				for(int thd = 0; thd < 4; thd++) {
					final int index = (fst * 4 + snd) * 4 + thd;
					
					if(fst == 0 && snd == 2 && thd == 1) { continue; } // AGC
					if(fst == 0 && snd == 1 && thd == 2) { continue; } // ACG
					if(fst == 2 && snd == 0 && thd == 1) { continue; } // GAC
					
					patterns[index] = 1;
				}
			}
		}
		
		return patterns;
	}
	
	public static long[] next_pattern(long[] curr_pattern) {
		long[] next_pattern = new long[256];
		
		// A -> 0, C -> 1, G -> 2, T -> 3 とする
		for(int fst = 0; fst < 4; fst++) {
			for(int snd = 0; snd < 4; snd++) {
				for(int thd = 0; thd < 4; thd++) {
					final int index = (fst * 4 + snd) * 4 + thd;
					if(curr_pattern[index] == 0) { continue; }
					
					for(int fur = 0; fur < 4; fur++) {
						final int next_index = ((snd * 4) + thd) * 4 + fur;
						
						if(fst == 0 && snd == 2 && fur == 1) { continue; } // AG[ATG] C
						if(fst == 0 && thd == 2 && fur == 1) { continue; } // A[ACG]G C
						if(snd == 0 && thd == 2 && fur == 1) { continue; } // [ATGC]AG C
						if(snd == 0 && thd == 1 && fur == 2) { continue; } // [ATC]AC G
						if(snd == 2 && thd == 0 && fur == 1) { continue; } // [ATGC]GA C
						
						//System.out.println(pat_to_ch(fst) + "" + pat_to_ch(snd) + "" + pat_to_ch(thd) + ":" + pat_to_ch(fur));
						
						next_pattern[next_index] += curr_pattern[index];
						next_pattern[next_index] %= 1000000007;
					}
				}
			}
		}
		
		return next_pattern;
	}
	
	public static void main(String[] args) throws IOException {
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			
			//System.out.println(naive(4, 0, new char[4], new char[] {'A', 'T', 'C', 'G'}));
			
			long[] pattern = init_pattern();
			for(int i = 3; i < N; i++) {
				pattern = next_pattern(pattern);
			}
			
			long answer = 0;
			for(final long p : pattern) {
				answer += p;
				answer %= 1000000007;
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