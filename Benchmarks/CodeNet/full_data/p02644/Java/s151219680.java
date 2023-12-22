import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static int di[] = {0, 0, 1, -1};
	static int dj[] = {1, -1, 0, 0};
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int K = sc.nextInt();
		char[][] grid = new char[H][];
		int iFrom = sc.nextInt() - 1;
		int jFrom = sc.nextInt() - 1;
		int iTo = sc.nextInt() - 1;
		int jTo = sc.nextInt() - 1;
		for (int i = 0; i < H; i++) {
			grid[i] = sc.next().toCharArray();
		}
		int[][] dist = new int[H][W];
		for (int i = 0; i < H; i++) {
			Arrays.fill(dist[i], Integer.MAX_VALUE);
		}
		int[][] forb = new int[H][W];
		Deque<Integer> cola = new ArrayDeque<>();
		dist[iFrom][jFrom] = 0;
		cola.addLast(iFrom * W + jFrom);
		while (!cola.isEmpty()) {
			int val = cola.pollFirst();
			int ii = val / W;
			int jj = val % W;
			int nextDist = dist[ii][jj] + 1;
			for (int k = 0; k < 4; k++) if ((forb[ii][jj] & (1<<k)) == 0) {
				for (int steps = 1; steps <= K; steps++) {
					int ni = ii + di[k]*steps;
					int nj = jj + dj[k]*steps;
					if (0 <= ni && ni < H && 0 <= nj && nj < W && grid[ni][nj] == '.') {
						if (dist[ni][nj] > nextDist) {
							if (steps < K) {
								forb[ni][nj] |= 1 << k;
							}
							dist[ni][nj] = nextDist;
							cola.addLast(ni * W + nj);
						}
					} else break;
				}
			}
		}
		out.println(dist[iTo][jTo] == Integer.MAX_VALUE ? -1 : dist[iTo][jTo]);
		
		out.flush();
	}
	
	static class MyScanner {
		private BufferedReader br;
		private StringTokenizer tokenizer;
		
		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		
		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}
		
		public int nextInt() {
			return Integer.parseInt(next());
		}
		
		public long nextLong() {
			return Long.parseLong(next());
		}
	}
}
