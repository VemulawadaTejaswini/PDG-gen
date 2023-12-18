import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

import javax.sound.midi.Synthesizer;

public class ELR {

	static class Pair {
		int f,s;
		public Pair (int f,int s) {
			this.f = f;
			this.s = s;
		}
	}
	static ArrayList<Pair> g[];
	static int n,m;
	public static void main(String[]args) throws Throwable {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		g = new ArrayList[n];
		for (int i = 0 ; i < n ; ++i) {
			g[i] = new ArrayList();
		}
		for (int i = 0 ; i < m ; ++i) {
			int u = sc.nextInt() - 1, v = sc.nextInt() - 1, s = sc.nextInt();
			g[u].add(new Pair(v,s));
			g[v].add(new Pair(u,s));
		}
		long d[][] = new long[n][2];
//		for (int i = 0 ; i < n ; ++i) {
//			d[i][0] = d[i][1] = -1;
//		}
		boolean vis[][] = new boolean[n][2];
		Queue<Pair> q = new LinkedList();
		q.add(new Pair(0,0));
		d[0][0] = 0;
		vis[0][0] = true;
		while (!q.isEmpty()) {
			Pair p = q.poll();
			int u = p.f;
			int nxt = p.s ^ 1;
			for (Pair pr : g[u]) {
				int v = pr.f, s = pr.s;
				long res = s - (d[p.f][p.s]);
				if (vis[v][nxt]) {
					if (res != d[v][nxt]) {
						System.out.println("0");
						return;
					}
				} else {
					vis[v][nxt] = true;
					d[v][nxt] = res;
					q.add(new Pair(v,nxt));
				}

			}
		}
		long lower = 0;
		long upper = 1L << 59;
		long val = 1L << 59;
		boolean here = false;
		for (int i = 0 ; i < n ; ++i) {
		
			d[i][0] *= -1;
			if (vis[i][1]) {

				if (d[i][1] - 1 <= 0) {
					System.out.println("0");
					return;
				}
			
				
				upper = Math.min(upper, d[i][1] - 1);
			}
			if (vis[i][0]) {
				lower = Math.max(lower, d[i][0] + 1);
			}
			if (vis[i][0] && vis[i][1]) {

				if (val == 1L << 59) {
					val = (d[i][1] + d[i][0]) / 2;
				} else {
					here = true;
					if (val != ((d[i][1] + d[i][0]) / 2)) {
						System.out.println("0");
						return;
					}
				}

			}
		}	

		if (here) {
			if (lower <= val && val <= upper) {
				System.out.println("1");
				return;
			}
			System.out.println("0");
			return;
		}
		
		if (upper >= lower) {
			System.out.println(upper - lower + 1);
		} else {
			System.out.println("0");
		}


	}

	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public Scanner(String s) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(new File(s)));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public boolean ready() throws IOException {
			return br.ready();
		}
	}

}
