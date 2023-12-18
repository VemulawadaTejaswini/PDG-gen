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
	
	public static class Apple implements Comparable<Apple> {
		long value;
		int color;
		
		public Apple(long value, int color) {
			this.value = value;
			this.color = color;
		}

		@Override
		public int compareTo(Apple o) {
			return -Long.compare(this.value, o.value);
		}
	}
	
	public static void main(String[] args) throws IOException {	
		try(final Scanner sc = new Scanner(System.in)){
			final int X = sc.nextInt();
			final int Y = sc.nextInt();
			final int A = sc.nextInt();
			final int B = sc.nextInt();
			final int C = sc.nextInt();
			
			PriorityQueue<Apple> queue = new PriorityQueue<>();
			for(int i = 0; i < A; i++) {
				queue.add(new Apple(sc.nextLong(), 0));
			}
			for(int i = 0; i < B; i++) {
				queue.add(new Apple(sc.nextLong(), 1));
			}
			for(int i = 0; i < C; i++) {
				queue.add(new Apple(sc.nextLong(), 2));
			}
			
			long answer = 0;
			int rest_X = X, rest_Y = Y;
			while(!queue.isEmpty()) {
				final Apple apple = queue.poll();
				
				if(rest_X <= 0 && apple.color == 0) { continue; }
				if(rest_Y <= 0 && apple.color == 1) { continue; }
				if(rest_X <= 0 && rest_Y <= 0) { break; }
				
				if(apple.color == 0) {
					rest_X--;
					answer += apple.value;
				}else if(apple.color == 1){
					rest_Y--;
					answer += apple.value;
				}else {
					if(rest_X > rest_Y) {
						rest_X--;
						answer += apple.value;
					}else {
						rest_Y--;
						answer += apple.value;
					}
				}
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
