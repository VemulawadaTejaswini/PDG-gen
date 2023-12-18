import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		int H = sc.nextInt();
		int W = sc.nextInt();
		char[][] grid = new char[H][];
		for (int i = 0; i < grid.length; i++) {
			grid[i] = sc.next().toCharArray();
		}
		short[][][][] max = new short[W][H][H][17];
		int tmp;
		for (int from2 = W-1; from2 >= 0; from2--) {
			for (int from1 = 0; from1 < H; from1++) {
				max[from2][from1][from1][0] = (short)(from2 + 1);
				if (from2 + 1 < W && grid[from1][from2] == grid[from1][from2 + 1]) {
					max[from2][from1][from1][0] = max[from2 + 1][from1][from1][0];
				}
			}
			for (int from1 = 0; from1 < H; from1++) {
				for (int to1 = from1 + 1; to1 < H; to1++) {
					max[from2][from1][to1][0] = (short)from2;
					if (grid[to1-1][from2] == grid[to1][from2]) {
						max[from2][from1][to1][0] = (short)Math.min(max[from2][from1][to1-1][0], max[from2][to1][to1][0]);
					}
				}
			}
		}
		for (int i = 1; i < 17; i++) {
			for (int from2 = 0; from2 < W; from2++) {
				for (int from1 = 0; from1 < H; from1++) {
					int med = from1;
					for (int to1 = from1; to1 < H; to1++) {
						tmp = max[from2][from1][to1][i - 1];
						max[from2][from1][to1][i] = tmp < W ? max[tmp][from1][to1][i - 1] : (short)W;
						int cur = med + 1 <= to1 ? Math.min(max[from2][from1][med][i-1], max[from2][med+1][to1][i-1]) : -1, next;
						while (med + 2 <= to1 && (next = Math.min(max[from2][from1][med+1][i-1], max[from2][med+2][to1][i-1])) >= cur) {
							med++;
							cur = next;
						}
						if (cur != -1) max[from2][from1][to1][i] = (short)Math.max(max[from2][from1][to1][i], cur);
					}
				}
			}
		}
		int ans;
		for (ans = 0; ans < 17; ans++) {
			if (max[0][0][H-1][ans] >= W) break;
		}
		out.println(ans);
		
		out.flush();
	}
	
	static int val(char c) {
		return c == '#' ? 1 : 0;
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
