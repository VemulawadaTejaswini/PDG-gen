import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.BitSet;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Osenbei
 * JOI 7th, Pre 5
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			StringTokenizer st = new StringTokenizer(line);

			int R, C;
			R = parseInt(st.nextToken());
			C = parseInt(st.nextToken());
			if ((R | C) == 0) break;

			BitSet[] CR = new BitSet[C];
			for (int i = 0; i < C; i++) {
				CR[i] = new BitSet(R);
			}

			for (int i = 0; i < R; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < C; j++) {
					if (st.nextToken().equals("1")) CR[j].set(i);
				}
			}

			//solve
			int max = 0;

			for (int i = 0; i < 1 << R; i++) {
				BitSet[] _CR = CR.clone();
				BitSet flip = new BitSet(R);
				for (int j = 0; j < R; j++) {
					if ((i >> j & 1) == 1) flip.set(j);
				}
				//
				int count = 0;
				for (int j = 0; j < C; j++) {
					_CR[j].xor(flip);
					count += (_CR[j].cardinality() > R - _CR[j].cardinality() ? _CR[j].cardinality() : R - _CR[j].cardinality());
				}
				max = Math.max(max, count);
			}

			System.out.println(max);
		}
	}
}