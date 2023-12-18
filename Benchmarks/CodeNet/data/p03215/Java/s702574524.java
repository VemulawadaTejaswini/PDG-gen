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
	
	public static class Move {
		int fx, fy, gx, gy;
		
		public Move(int fx, int fy, int gx, int gy) {
			this.fx = fx;
			this.fy = fy;
			this.gx = gx;
			this.gy = gy;
		}
		
		public String toString() {
			return this.fy + " " + this.fx + " " + this.gy + " " + this.gx;
		}
	}
	
	public static int[][] move_dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
	public static boolean in_range(int x, int y, int W, int H) {
		return 0 <= x && x < W && 0 <= y && y < H;
	}
	
	public static void main(String[] args) throws IOException {
		try(final Scanner sc = new Scanner(System.in)){
			
			final int N = sc.nextInt();
			final int K = sc.nextInt();
			
			long[] array = new long[N];
			for(int i = 0; i < N; i++) {
				array[i] = sc.nextLong();
			}
			
			ArrayList<Long> alls = new ArrayList<Long>();
			
			for(int st = 0; st < N; st++) {
				long sum = 0;
				
				for(int x = st; x < N; x++) {
					sum += array[x];
					alls.add(sum);
				}
			}
			
			boolean[] used = new boolean[alls.size()];
			Arrays.fill(used, true);
			
			for(int idx = 63; idx >= 0; idx--){
				
				int cnt = 0;
				for(int i = 0; i < alls.size(); i++) {
					if(!used[i]) { continue; }
					
					cnt += (alls.get(i) & (1l << idx)) != 0 ? 1 : 0;
				}
				
				if(cnt < K) { continue; }
				
				for(int i = 0; i < alls.size(); i++) {
					if(!used[i]) { continue; }
					
					used[i] = (alls.get(i) & (1l << idx)) != 0 ? true : false;
				}
			}
			
			boolean first = true;
			long answer = 0;
			for(int i = 0; i < alls.size(); i++) {
				if(!used[i]) { continue; }
				
				if(first) {
					first = false;
					answer = alls.get(i);
				}else {
					answer &= alls.get(i);
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