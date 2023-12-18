import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		int l = Integer.parseInt(sa[2]);
		long[][] d = new long[n][n];
		for (int i = 0; i < n; i++) {
			Arrays.fill(d[i], 100000000000000L);
		}
		for (int i = 0; i < m; i++) {
			sa = br.readLine().split(" ");
			int a = Integer.parseInt(sa[0]) - 1;
			int b = Integer.parseInt(sa[1]) - 1;
			int c = Integer.parseInt(sa[2]);
			if (c <= l) {
				d[a][b] = c;
				d[b][a] = c;
			}
		}
		int q = Integer.parseInt(br.readLine());
		int[] s = new int[q];
		int[] t = new int[q];
		for (int i = 0; i < q; i++) {
			sa = br.readLine().split(" ");
			s[i] = Integer.parseInt(sa[0]) - 1;
			t[i] = Integer.parseInt(sa[1]) - 1;
		}
		br.close();

		int[][] ans = new int[n][n];
		long[][] ansd = new long[n][n];
		for (int i = 0; i < n; i++) {
			Arrays.fill(ans[i], 1000000000);
		}
		for (int i = 0; i < n; i++) {
			Set<Integer> set = new HashSet<>();
			for (int j = 0; j < n; j++) {
				set.add(j);
			}
			PriorityQueue<Node> que = new PriorityQueue<>();
			que.add(new Node(i, 0, 0));
			ans[i][i] = 0;
			while (!que.isEmpty()) {
				Node cur = que.poll();
				set.remove(cur.v);
				for (int j : set) {
					int alta = ans[i][cur.v];
					long c = d[cur.v][j];
					long altd = cur.d + c;
					if (altd >= 100000000000000L) {
						continue;
					}
					if (altd > l) {
						alta++;
						altd = c;
					}
					if (alta < ans[i][j]
							|| alta == ans[i][j] && altd < ansd[i][j]) {
						ans[i][j] = alta;
						ansd[i][j] = altd;
						Node next = new Node(j, alta, altd);
						que.add(next);
					}
				}
			}
		}

		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < q; i++) {
			int o = ans[s[i]][t[i]];
			if (o == 1000000000) {
				pw.println(-1);
			} else {
				pw.println(o);
			}
		}
		pw.flush();
	}

	static class Node implements Comparable<Node> {
		int v;
		int a;
		long d;

		public Node(int v, int a, long d) {
			this.v = v;
			this.a = a;
			this.d = d;
		}

		public int compareTo(Node o) {
			if (a != o.a) {
				return a - o.a;
			}
			return Long.compare(d, o.d);
		}
	}
}
