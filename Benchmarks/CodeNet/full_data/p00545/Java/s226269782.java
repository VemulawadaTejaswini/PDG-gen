import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;

/**
 * Walking in JOI Kingdom
 */
public class Main {

	static final int E = 1;
	static final int W = -1;
	static final long NONSTOP = (long) Math.pow(10, 19);

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		words = br.readLine().split(" ");

		int N, T, Q;
		N = parseInt(words[0]);
		T = parseInt(words[1]);
		Q = parseInt(words[2]);

		long[][] ps = new long[N][4];

		for (int i = 0; i < N; i++) {
			words = br.readLine().split(" ");
			ps[i][0] = parseLong(words[0]);
			ps[i][1] = parseLong(words[1]) == E ? E : W;
			ps[i][2] = NONSTOP;
		}

		boolean changed;
		do {
			changed = false;
			for (int i = 0; i < N; i++) {
				if (ps[i][1] == E) {
					for (int j = i + 1; j < N; j++) {
						if (ps[j][1] == W) {
							ps[i][3] = ps[i][2];
							ps[i][2] = ps[j][2] = (ps[j][0] - ps[i][0]) / 2;
							if (ps[i][3] != ps[i][2]) changed = true;
							break;
						} else {
							if (ps[i][2] > ps[j][2]) {
								ps[i][3] = ps[i][2];
								ps[i][2] = ps[j][0] - ps[i][0] + ps[j][2];
								if (ps[i][3] != ps[i][2]) changed = true;
								break;
							}
						}
					}
				} else {
					for (int j = i - 1; j >= 0; j--) {
						if (ps[j][1] == E) {
							ps[i][3] = ps[i][2];
							ps[i][2] = ps[j][2] = (ps[i][0] - ps[j][0]) / 2;
							if (ps[i][3] != ps[i][2]) changed = true;
							break;
						} else {
							if (ps[i][2] > ps[j][2]) {
								ps[i][3] = ps[i][2];
								ps[i][2] = ps[i][0] - ps[j][0] + ps[j][2];
								if (ps[i][3] != ps[i][2]) changed = true;
								break;
							}
						}
					}
				}
			}
		} while (changed);

		for (int i = 0; i < Q; i++) {
			int q = parseInt(br.readLine());
			if (ps[q - 1][2] != NONSTOP) {
				System.out.println(ps[q - 1][0] + ps[q - 1][1] * ps[q - 1][2]);
			} else {
				System.out.println(ps[q - 1][0] + ps[q - 1][1] * T);
			}
		}
	}
}