import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		int[] ts = new int[3];

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			StringTokenizer st = new StringTokenizer(line);
			int[] es = new int[3];
			for (int i = 0; i < 3; i++) {
				es[i] = parseInt(st.nextToken());
			}
			Arrays.sort(es);
			if (es[2] >= es[0] + es[1]) break;
			ts[typeIs(es)]++;
		}
		System.out.printf("%d %d %d %d\n", ts[0] + ts[1] + ts[2], ts[0], ts[1], ts[2]);
	}

	static int typeIs(int[] es) {
		int t = es[2] * es[2] - es[0] * es[0] - es[1] * es[1];
		return t == 0 ? 0 : t < 0 ? 1 : 2;
	}
}