/**
 * Tree - Rooted Trees
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class Main {

	static final int NIL = -1;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String line;

		int n = parseInt(br.readLine());
		int[] p = new int[n];
		int[] l = new int[n];
		int[] r = new int[n];
		int[] d = new int[n];

		Arrays.fill(p, NIL);
		Arrays.fill(l, NIL);
		Arrays.fill(r, NIL);

		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int u = parseInt(st.nextToken());
			int k = parseInt(st.nextToken());
			int c, _c = -1;
			for (int j = 0; j < k; j++) {
				c = parseInt(st.nextToken());
				if (j == 0) l[u] = c;
				p[c] = u;
				if (j > 0) r[_c] = c;
				_c = c;
			}
		}

		Deque<int[]> q = new ArrayDeque<int[]>();
		q.push(new int[]{0, 0});
		while (!q.isEmpty()) {
			int[] u = q.pop();
			d[u[0]] = u[1];
			if (r[u[0]] != NIL) q.push(new int[]{r[u[0]], u[1]});
			if (l[u[0]] != NIL) q.push(new int[]{l[u[0]], u[1] + 1});
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append("node " + i + ": ");
			sb.append("parent = " + p[i] + ", ");
			sb.append("depth = " + d[i] + ", ");
			if (p[i] == NIL) {
				sb.append("root, ");
			} else if (l[i] != NIL) {
				sb.append("internal node, ");
			} else {
				sb.append("leaf, ");
			}
			sb.append("[");
			if (l[i] != NIL) {
				int c = l[i];
				sb.append(c);
				while (r[c] != NIL) {
					sb.append(", " + r[c]);
					c = r[c];
				}
			}
			sb.append("]\n");
		}
		System.out.println(sb.toString());
	} //end main
}