import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Graph II - Minimum Spanning Tree
 */
public class Main {

	static final int INF = 1 << 29;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		int n = parseInt(br.readLine());

		int[][] a = new int[n][n];

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				a[i][j] = parseInt(st.nextToken());
			}
		}

		//solve
		int cost = 0;
		int size = 0;
		boolean[] S = new boolean[n];

		S[0] = true;
		size++;

		while (size < n) {
			int min = INF;
			int v = -1;
			for (int i = 0; i < n; i++) {
				if (S[i]) {
					for (int j = 0; j < n; j++) {
						if (!S[j] && a[i][j] != -1 && a[i][j] < min) {
							min = a[i][j];
							v = j;
						}
					}
				}
			}
			S[v] = true;
			size++;
			cost += min;
		}

		System.out.println(cost);
	}
}