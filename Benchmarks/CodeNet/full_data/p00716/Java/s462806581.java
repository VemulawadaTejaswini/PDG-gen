import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Ohgas' Fortune
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		int m = parseInt(br.readLine());

		for (int i = 0; i < m; i++) {

			int b = parseInt(br.readLine());
			int y = parseInt(br.readLine());
			int max = -1;

			int n = parseInt(br.readLine());
			for (int j = 0; j < n; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());

				int t = parseInt(st.nextToken());
				double r = Double.parseDouble(st.nextToken());
				int c = parseInt(st.nextToken());

				if (t == 0) {
					max = Math.max(max, simple(b, y, r, c));
				} else {
					max = Math.max(max, compound(b, y, r, c));
				}
			}

			System.out.println(max);
		}
	}

	static int simple(int b, int y, double r, int c) {
		int _i = 0;
		for (int i = 0; i < y; i++) {
			_i += b * r;
			b -= c;
		}
		return b + _i;
	}

	static int compound(int b, int y, double r, int c) {
		for (int i = 0; i < y; i++) {
			int _i = 0;
			_i += b * r;
			b += _i;
			b -= c;
		}
		return b;
	}
}