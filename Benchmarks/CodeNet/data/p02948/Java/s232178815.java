import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;

import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	
	public static class State implements Comparable<State> {
		int benefit;
		int delay;
		
		public State(int benefit, int delay) {
			this.benefit = benefit;
			this.delay = delay;
		}

		@Override
		public int compareTo(State o) {
			if(Integer.compare(o.benefit, this.benefit) != 0) {
				return Integer.compare(o.benefit, this.benefit);
			}else {
				return Integer.compare(o.delay, this.delay);
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			final int M = sc.nextInt();
			
			PriorityQueue<State> queue = new PriorityQueue<State>();
			for(int i = 0; i < N; i++) {
				final int a = sc.nextInt();
				final int b = sc.nextInt();
				
				queue.add(new State(b, a));
			}
			
			long answer = 0;
			for(int day = 0; day < M; day++) {				
				while(!queue.isEmpty()) {
					final State state = queue.poll();
				
					final int next = day + state.delay;
					if(next <= M) { 
						//System.out.println(day + " : " + state.benefit + " "  + next);
						answer += state.benefit;
						break;
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