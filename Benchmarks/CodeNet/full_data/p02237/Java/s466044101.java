import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.StringTokenizer;

class Main {
	static class Graph {
		public void graph (InputReader ir) {
			
			// 頂点数入力
			int n = ir.nextInt();
			
			// グラフ
			int[][] data = new int[n][n];
			
			for (int i = 0; i < n; i++) {
				int u = ir.nextInt();
				int k = ir.nextInt();
				u--;
				for (int j = 0; j < k; j++) {
					int a = ir.nextInt();
					a--;
					data[u][a] = 1;
				}
			}
			
			StringBuilder sb = new StringBuilder ();
			
			for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if(j != 0) sb.append(" ");
	                sb.append(data[i][j]);
	            }
	            sb.append("\n");
	        }
			
			System.out.print(sb);
			
		}
	}

	static class InputReader {
		BufferedReader br;
		StringTokenizer st;
		
		public String nextString() {
			
			 while (!st.hasMoreTokens()) {
	                try {
	                    st = new StringTokenizer(br.readLine(), " ");
	                } catch (IOException e) {
	                    throw new InputMismatchException();
	                }
	            }
			return st.nextToken();
		}
		
		public int nextInt() {
			return Integer.parseInt(nextString());
		}
					
		public InputReader (InputStream inputStream) {
			br = new BufferedReader (new InputStreamReader (inputStream));
			st = new StringTokenizer ("");
		}
		
	}
	
	public static void main (String[] args) {
		InputStream inputStream = System.in;
		InputReader in = new InputReader (inputStream);
		Graph obj = new Graph ();
		obj.graph (in);
	}
}

