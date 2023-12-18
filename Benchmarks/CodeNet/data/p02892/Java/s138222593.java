import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.Math.max;
import static java.lang.System.exit;
import static java.util.Arrays.fill;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	static void solve() throws Exception {
		int n = scanInt();
		boolean edge[][] = new boolean[n][n];
		for (int i = 0; i < n; i++) {
			String l = scanString();
			for (int j = 0; j < n; j++) {
				edge[i][j] = l.charAt(j) == '1';
			}
		}
		int dist[] = new int[n], queue[] = new int[n];
		int maxDist = 0;
		for (int i = 0; i < n; i++) {
			fill(dist, Integer.MAX_VALUE);
			dist[i] = 0;
			queue[0] = i;
			int queueHead = 0, queueTail = 1;
			do {
				int cur = queue[queueHead++];
				for (int j = 0; j < n; j++) {
					if (edge[cur][j] && dist[j] == Integer.MAX_VALUE) {
						maxDist = max(maxDist, dist[j] = dist[cur] + 1);
						queue[queueTail++] = j;
					} else if (edge[cur][j] && dist[j] == dist[cur]) {
						out.print(-1);
						return;
					}
				}
			} while (queueHead != queueTail);
		}
		out.print(maxDist + 1);
	}

	static int scanInt() throws IOException {
		return parseInt(scanString());
	}

	static long scanLong() throws IOException {
		return parseLong(scanString());
	}

	static String scanString() throws IOException {
		while (tok == null || !tok.hasMoreTokens()) {
			tok = new StringTokenizer(in.readLine());
		}
		return tok.nextToken();
	}

	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer tok;

	public static void main(String[] args) {
		try {
			in = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(System.out);
			solve();
			in.close();
			out.close();
		} catch (Throwable e) {
			e.printStackTrace();
			exit(1);
		}
	}
}