import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner();
		PrintWriter out = new PrintWriter(System.out);
		int [] deg = new int[4];
		for (int i = 0; i < 3; ++i) {
			int u = sc.nextInt()-1, v = sc.nextInt()-1;
			deg[u]++;
			deg[v]++;
		}
		int odd = 0;
		for (int i = 0; i < deg.length; ++i) {
			if(deg[i] % 2 != 0)
				odd++;
		}
		out.println(odd == 2?"YES":"NO");
		out.close();
	}
	
	static class Scanner {
		BufferedReader br;
		StringTokenizer st;

		public Scanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens()) {
				st = new StringTokenizer(br.readLine());
			}
			return st.nextToken();
		}

		public int nextInt() throws NumberFormatException, IOException {
			return Integer.parseInt(next());
		}
	}

}
