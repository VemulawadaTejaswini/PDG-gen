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

	public static final int V_MAX = 100 * 4;
	
	public static void main(String[] args) throws IOException {
		try (Scanner sc = new Scanner(System.in)) {
			final int N = sc.nextInt();
			
			int[] ts = new int[N];
			for(int i = 0; i < N; i++){ ts[i] = sc.nextInt(); }
			int[] vs = new int[N];
			for(int i = 0; i < N; i++){ vs[i] = sc.nextInt(); }
			
			for(int i = 0; i < N; i++){
				ts[i] *= 4;
				vs[i] *= 4;
			}
			
			double[][] DP = new double[N + 1][V_MAX + 1];
			for(int i = 0; i <= N; i++){
				for(int v = 0; v <= V_MAX; v++){
					DP[i][v] = -1;
				}
			}
			DP[0][0] = 0;
			
			for(int i = 0; i < N; i++){ // 10^2
				for(int begin_v = 0; begin_v <= vs[i]; begin_v++){ // 10^2
					if(DP[i][begin_v] < 0){ continue; }
					
					final int v_limit = vs[i];
					final int time = ts[i];
					
					for(int end_v = 0; end_v <= v_limit; end_v++){ // 10^2
						final int diff = Math.abs(begin_v - end_v);
						if(time < diff){ continue; }
						
						final int can_v = Math.min(vs[i], Math.min(begin_v + time, end_v + time));
						for(int in_max_v = 0; in_max_v <= can_v; in_max_v++){
							final int first_step_time = Math.abs(in_max_v - begin_v);
							final int last_step_time = Math.abs(in_max_v - end_v);
							
							final int flat_time = time - (first_step_time + last_step_time);							
							
							if(flat_time < 0){ continue; }
							//if(i == 0)System.out.println(begin_v + " " + first_step_time + " " + flat_time + " " + last_step_time + " " + in_max_v);
							
							double dist = 0;
							dist += (begin_v + in_max_v) * first_step_time / 2;
							dist += in_max_v * flat_time;
							dist += (end_v + in_max_v) * last_step_time / 2;
							
							//if(i == 0)System.out.println("[" + i + "] (" + begin_v + ", " + end_v + ") " + in_max_v + " : " + dist);
							
							DP[i + 1][end_v] = Math.max(DP[i + 1][end_v], DP[i][begin_v] + dist);
						}
					}
				}
			}
			
			System.out.println(DP[N][0] / 16.0);
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