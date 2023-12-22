import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Computation of Salary
 * PCK2013 ??¬???2
 */
public class Main {

	static final int MAX = 50_001;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		line = br.readLine();

		int N, M;
		N = parseInt(line.substring(0, line.indexOf(' ')));
		M = parseInt(line.substring(line.indexOf(' ') + 1));

		int[] s = new int[MAX];
		int[] t = new int[MAX];
		int[] e = new int[MAX];

		int i = 0;
		do {
			words = line.split(" ");
			s[i] = parseInt(words[0]);
			t[i] = parseInt(words[1]);
			e[i] = parseInt(words[2]);
			i++;
		} while ((s[i - 1] | t[i - 1] | e[i - 1]) != 0);

		int L = parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		for (int j = 0; j < L; j++) {

			words = br.readLine().split(" ");

			long[] S = new long[N + 1];
			int[] T = new int[M + 1];

			for (int k = 0; k < words.length; k++) {
				T[k + 1] = parseInt(words[k]);
			}

			for (int k = 0; k < i; k++) {
				S[s[k]] += T[t[k]] * e[k];
			}

			//out
			for (int k = 1; k < S.length; k++) {
				if (k > 1) sb.append(' ');
				sb.append(S[k]);
			}
			sb.append('\n');
		}
		System.out.print(sb.toString());
	}//end main
}