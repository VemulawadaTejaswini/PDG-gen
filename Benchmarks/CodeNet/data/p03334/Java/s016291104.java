import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	
	static int[] di = {1,1,-1,-1};
	static int[] dj = {1,-1,1,-1};
	
	static int[] ii = {1,0,-1,0};
	static int[] jj = {0,1,0,-1};
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		int N = sc.nextInt();
		int D1 = sc.nextInt();
		int D2 = sc.nextInt();
		int[][] table = new int[2*N][2*N];
		boolean[][] vis = new boolean[2*N][2*N];
		int[] a = new int[2*N + 1], b = new int[2*N + 1];
		int size = 0;
		for (int i = 0; i < 2 * N; i++) {
			for (int j = 0; j < 2 * N; j++) {
				if (i * i + j * j == D1 || i * i + j * j == D2) {
					a[size] = i;
					b[size] = j;
					size++;
				}
			}
		}
		int total = 0;
		int i = 0, j = 0, idx = 0;
		for (int checked = 0; checked < 4 * N * N; checked++) {
			vis[i][j] = true;
			if (table[i][j] == 0) {
				table[i][j] = 1;
				total++;
				for (int k = 0; k < size; k++) {
					for (int l = 0; l < 4; l++) {
						int ni = i + di[l] * a[k];
						int nj = j + dj[l] * b[k];
						if (0 <= ni && ni < 2 * N && 0 <= nj && nj < 2 * N) {
							table[ni][nj] = -1;
						}
					}
				}
			}
			i += ii[idx];
			j += jj[idx];
			if (!(0 <= i && i < 2 * N && 0 <= j && j < 2* N) || vis[i][j]) {
				i -= ii[idx];
				j -= jj[idx];
				idx = (idx + 1) % 4;
				i += ii[idx];
				j += jj[idx];
			}
		}
		if (total < N * N) throw new RuntimeException();
		
		int got = 0;
		for (i = 0; i < 2 * N; i++) {
			for (j = 0; j < 2 * N; j++) {
				if (table[i][j] == 1 && got < N * N) {
					out.println(i + " " + j);
					got++;
				}
			}
		}
		
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
