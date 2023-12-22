import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Tournament
 */
public class Main {

	static boolean[] a;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		line = br.readLine();

		int N, M;
		N = parseInt(line.substring(0, line.indexOf(' ')));
		M = parseInt(line.substring(line.indexOf(' ') + 1));

		a = new boolean[N];

		for (int i = 0; i < M; i++) {
			a[parseInt(br.readLine())] = true;
		}

		System.out.println(solve(0, N - 1));
	}

	static long solve(int s, int t) {

		if (s + 1 == t) {
			if (a[s] || a[t]) return 0;
			else return 1;
		}

		int mid = (s + t) / 2;
		long res1 = solve(s, mid);
		long res2 = solve(mid + 1, t);

		if (res1 > 0 && res2 > 0) return res1 + res2 + 1;
		else return res1 + res2;
	}
}