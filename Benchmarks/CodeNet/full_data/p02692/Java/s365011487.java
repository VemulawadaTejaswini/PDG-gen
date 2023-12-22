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
	
	public static void main(String[] args) throws IOException {	
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			long A = sc.nextLong();
			long B = sc.nextLong();
			long C = sc.nextLong();
			
			boolean ok = true;
			LinkedList<String> answer = new LinkedList<String>();
			
			String[] ops = new String[N];
			for(int i = 0; i < N; i++) {
				ops[i] = sc.next();
			}
			
			for(int i = 0; i < N; i++) {
				final String op = ops[i];
				
				if(op.equals("AB")) {
					if(A == 0 && B == 0) {
						ok = false; break;
					}else if(i < N - 1 && ops[i + 1].equals("AC") && B > 0 && C == 0) {
						answer.add("A");
						A++; B--;
					}else if(i < N - 1 && ops[i + 1].equals("BC") && A > 0 && C == 0) {
						answer.add("B");
						A--; B++;
					}else if(A <= B) {
						answer.add("A");
						A++; B--;
					}else {
						answer.add("B");
						A--; B++;
					}
				}else if(op.equals("BC")) {
					if(B == 0 && C == 0) {
						ok = false; break;
					}else if(i < N - 1 && ops[i + 1].equals("AB") && C > 0 && A == 0) {
						answer.add("B");
						B++; C--;
					}else if(i < N - 1 && ops[i + 1].equals("AC") && B > 0 && A == 0) {
						answer.add("C");
						B--; C++;
					}else if(B <= C) {
						answer.add("B");
						B++; C--;
					}else {
						answer.add("C");
						B--; C++;
					}
				}else if(op.equals("AC")) {
					if(A == 0 && C == 0) {
						ok = false; break;
					}else if(i < N - 1 && ops[i + 1].equals("AB") && C > 0 && B == 0) {
						answer.add("A");
						A++; C--;
					}else if(i < N - 1 && ops[i + 1].equals("BC") && A > 0 && B == 0) {
						answer.add("C");
						A--; C++;
					}else if(A <= C) {
						answer.add("A");
						A++; C--;
					}else {
						answer.add("C");
						A--; C++;
					}
				}
			}
			
			if(!ok) {
				System.out.println("No"); return;
			}else {
				System.out.println("Yes");
			}
			
			for(final String s : answer) {
				System.out.println(s);
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
