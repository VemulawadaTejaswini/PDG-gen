import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NavigableSet;
import java.util.TreeSet;

import static java.lang.Integer.parseInt;

/**
 * Darts
 * JOI 2008 ??¬???3
 */
public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

//		long ts = System.nanoTime();

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int N, M;
			N = parseInt(line.substring(0, line.indexOf(' ')));
			M = parseInt(line.substring(line.indexOf(' ') + 1));
			if ((N | M) == 0) break;

			int[] Pa = new int[N + 1];
			NavigableSet<Integer> Pt = new TreeSet<>();

			for (int i = 1; i <= N; i++) {
				Pa[i] = parseInt(br.readLine());
			}

			for (int i = 0; i < Pa.length; i++) {
				for (int j = 0; j < Pa.length; j++) {
					if (i <= j && Pa[i] + Pa[j] <= M) Pt.add(Pa[i] + Pa[j]);
				}
			}

			Pa = new int[Pt.size()];
			int _i = 0;
			for (int p : Pt) {
				Pa[_i] = p;
				_i++;
			}

			int max = 0;
			for (int i = 0; i < Pa.length; i++) {
				if (Pa[i] > M / 2) break;
				max = Math.max(max, Pa[i] + Pt.floor(M - Pa[i]));
			}
			System.out.println(max);
		}
//		System.out.println((System.nanoTime() - ts) / 1000 / 1000);
	}//end main
}