import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	static class Solver {
		
		int H, W, N, a[], g[][], COL = 0, PUT = 0;
		
		void solve(FastScanner s, PrintWriter out) {
			H = s.nextInt(); W = s.nextInt();
			a = s.nextIntArray(N = s.nextInt());
			g = new int[H][W];
			for(int i = 0; i < H; i++) {
				for(int j = 0; j < W; j++) {
					if((i & 1) == 0) {
						g[i][j] = COL + 1;
					} else {
						g[i][W - j - 1] = COL + 1;
					}
					if(++PUT == a[COL]) {
						PUT = 0; COL++;
					}
				}
			}
			for(int[] gg : g) {
				for(int p : gg)
					out.print(p + " ");
				out.println();
			}
		}
		
	}
	
	public static void main(String[] args) {
		FastScanner s = new FastScanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		new Solver().solve(s, out);
		
		out.close();
	}
	
	static class FastScanner {
		
		BufferedReader br; StringTokenizer st;
		FastScanner(InputStream is) {
			br = new BufferedReader(new InputStreamReader(is));
			st = new StringTokenizer("");
		}
		String next() {
			while(!st.hasMoreElements()) {
				try { st = new StringTokenizer(br.readLine()); }
				catch(Exception e) {}
			}
			return st.nextToken();
		}
		
		int nextInt() { return Integer.parseInt(next()); }
		int[] nextIntArray(int N) {
			int[] res = new int[N];
			for(int i = 0; i < N; i++) res[i] = nextInt();
			return res;
		}
		
	}
	
}
