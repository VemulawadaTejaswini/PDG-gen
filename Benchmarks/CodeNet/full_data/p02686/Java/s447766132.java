import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map.Entry;

import java.util.PriorityQueue;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;


public class Main {
	
	public static class Brackets implements Comparable<Brackets> {
		String brackets;
		long closes;
		long opens;
		
		public Brackets(String brackets, long closes, long opens) {
			this.brackets = brackets;
			this.closes = closes;
			this.opens = opens;
		}

		@Override
		public int compareTo(Brackets o) {
			if(Long.compare(this.closes, o.closes) != 0) {
				return Long.compare(this.closes, o.closes);
			}else {
				return -Long.compare(this.opens, o.opens);
			}
		}
	}
	
	public static void main(String[] args) throws IOException {	
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			
			Brackets[] brackets = new Brackets[N];
			for(int i = 0; i < N; i++) {
				final String s = sc.next();
				
				long min = 0, sum = 0;
				for(int j = 0; j < s.length(); j++) {
					final char ch = s.charAt(j);
					
					if(ch == '(') {
						sum += 1;
					}else {
						sum -= 1;
					}
					
					min = Math.min(min, sum);
				}
				
				brackets[i] = new Brackets(s, -min, sum);
			}
			
			Arrays.sort(brackets);
			/*
			for(int i = 0; i < N; i++) {
				System.out.println(brackets[i].brackets + " " + brackets[i].closes + " " + brackets[i].opens);
			}
			*/
			
			{
				long sum = 0;
				for(int i = 0; i < N; i++) {
					final String s = brackets[i].brackets;
				
					for(int j = 0; j < s.length(); j++) {
						final char ch = s.charAt(j);
					
						if(ch == '(') {
							sum += 1;
						}else {
							sum -= 1;
						}
					
						if(sum < 0) {
							System.out.println("No");
							return;
						}
					}
				}
				
				System.out.println(sum == 0 ? "Yes" : "No");
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
