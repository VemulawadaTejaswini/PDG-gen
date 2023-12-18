import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {



	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] g = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				g[i][j] = sc.nextInt() - 1;
			}
		}

		for (int i = 1; i <= n; i++) {
			int[] p = new int[n];
			boolean[] f = new boolean[m];
			int[] count = new int[m];

			for (int j = 0; j < n; j++) 
				count[g[j][0]]++; 

			for (int j = 0; j < m; j++) {
				if(count[j] > i)
					f[j] = true;
			}


			while(true) {

				for (int j = 0; j < n; j++) {
					while(p[j] < m && f[g[j][p[j]]]) {
						p[j]++;
						if(p[j] < m) {
							count[g[j][p[j] - 1]]--;
							count[g[j][p[j]]]++;
						}
					}
				}
				
				
				boolean can = true;
				boolean finish = true;
				for (int j = 0; j < n; j++) {
					if(p[j] == m) {
						can = false;
					}
				}
				
				for (int j = 0; j < m; j++) {
					if(count[j] > i) {
						f[j] = true;
						finish = false;
					}
				}
				
				if(!can)
					break;
				
				if(finish) {
					out.println(i);
					out.flush();
					return;
				}
			}
		}

		out.flush();
	}


	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public String next() throws IOException {
			while(st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public int nextInt() throws NumberFormatException, IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}
	}	

}