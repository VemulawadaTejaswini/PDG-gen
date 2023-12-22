import java.util.*;
import java.io.*;

public class Main {
	static FastReader f = new FastReader();
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		solve();
		out.close();
	}

	static void solve() {
		int n = f.nextInt(), m = f.nextInt();
		Dsu dsu = new Dsu(n);
		while(m-- > 0) {
			int u = f.nextInt() - 1, v = f.nextInt() - 1;
			dsu.join(u, v);
		}

		int[] cnt = new int[n];
		for(int i=0;i<n;i++) {
			cnt[dsu.getPar(i)]++;
		}

		int max = 0;
		for(int i=0;i<n;i++) {
			max = Math.max(max, cnt[i]);
		}

		out.println(max);
 	}

 	static class Dsu {
 		int[] size;
 		int[] par;

 		Dsu(int n) {
 			size = new int[n];
 			par = new int[n];
 			for(int i=0;i<n;i++) {
 				size[i] = 1;
 				par[i] = i;
 			}
 		}

 		int getPar(int x) {
 			if(x == par[x]) {
 				return x;
 			}
 			return par[x] = getPar(par[x]);
 		}

 		void join(int a, int b) {
 			a = getPar(a);
 			b = getPar(b);

 			if(a != b) {
 				if(size[a] < size[b]) {
 					int temp = a;
 					a = b;
 					b = temp;
 				}
 				size[a] += size[b];
 				par[b] = a;
 			}
 		}
 	}

	static class FastReader {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String next() {
			while(st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		String nextLine() {
			String str = "";

			try {
				str = br.readLine();
			} catch(IOException e) {
				e.printStackTrace();
			}
			return str;
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}
	}
}