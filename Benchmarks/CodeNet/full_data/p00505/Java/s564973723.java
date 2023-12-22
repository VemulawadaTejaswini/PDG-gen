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

		int t1 = 0;//直角三角形
		int t2 = 0;//鋭角三角形
		int t3 = 0;//鈍角三角形

		outer:
		while ((line = br.readLine()) != null && !line.isEmpty()) {
			StringTokenizer st = new StringTokenizer(line);
			int[] e = new int[3];
			for (int i = 0; i < 3; i++) {
				e[i] = parseInt(st.nextToken());
			}
			for (int i = 0; i < 3; i++) {
				if (!(e[i % 3] < e[(i + 1) % 3] + e[(i + 2) % 3])) {
					break outer;
				}
			}
			Arrays.sort(e);
			int t = e[2] * e[2] - e[0] * e[0] - e[1] * e[1];
			if (t == 0) {
				t1++;
			} else if (t < 0) {
				t2++;
			} else {
				t3++;
			}
		}
		System.out.format("%d %d %d %d\n", t1 + t2 + t3, t1, t2, t3);
	}
}