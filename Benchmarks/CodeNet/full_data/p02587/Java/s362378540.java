import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[][] s = new String[n][2];
		int[] c = new int[n];
		for (int i = 0; i < n; i++) {
			s[i][0] = sc.next();
			s[i][1] = new StringBuilder(s[i][0]).reverse().toString();
			c[i] = sc.nextInt();
		}
		sc.close();

		long ans = Long.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			long[][][] d = new long[n][2][21];
			for (int i2 = 0; i2 < n; i2++) {
				for (int j2 = 0; j2 < 2; j2++) {
					Arrays.fill(d[i2][j2], Long.MAX_VALUE);
				}
			}
			d[i][0][0] = c[i];
			PriorityQueue<Node> que = new PriorityQueue<>();
			que.add(new Node(i, 0, 0, c[i]));
			while (!que.isEmpty()) {
				Node cur = que.poll();
				String str = s[cur.i][cur.j].substring(cur.idx);
				if (isKaibun(str)) {
					ans = Math.min(ans, cur.d);
					break;
				}
				if (cur.d > d[cur.i][cur.j][cur.idx]) {
					continue;
				}
				int j2 = 1 - cur.j;
				for (int i2 = 0; i2 < n; i2++) {
					int ni = -1;
					int nj = -1;
					int nidx = -1;
					if (s[i2][j2].startsWith(str)) {
						ni = i2;
						nj = j2;
						nidx = str.length();
					}
					if (str.startsWith(s[i2][j2])) {
						ni = cur.i;
						nj = cur.j;
						nidx = cur.idx + s[i2][j2].length();
					}
					if (ni != -1) {
						long alt = cur.d + c[i2];
						if (alt < d[ni][nj][nidx]) {
							d[ni][nj][nidx] = alt;
							que.add(new Node(ni, nj, nidx, alt));
						}
					}
				}
			}
		}
		if (ans == Long.MAX_VALUE) {
			System.out.println(-1);
		} else {
			System.out.println(ans);
		}
	}

	static boolean isKaibun(String str) {
		char[] ss = str.toCharArray();
		for (int j = 0; j < ss.length; j++) {
			if (ss[j] != ss[ss.length - 1 - j]) {
				return false;
			}
		}
		return true;
	}

	static class Node implements Comparable<Node> {
		int i, j, idx;
		long d;

		public Node(int i, int j, int idx, long d) {
			this.i = i;
			this.j = j;
			this.idx = idx;
			this.d = d;
		}

		public int compareTo(Node o) {
			return Long.compare(d, o.d);
		}
	}
}
