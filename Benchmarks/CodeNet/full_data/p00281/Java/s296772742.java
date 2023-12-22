import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Computation of Salary
 * PCK2013 ??¬???2
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		line = br.readLine();

		int N, M;
		N = parseInt(line.substring(0, line.indexOf(' ')));
		M = parseInt(line.substring(line.indexOf(' ') + 1));
		int[][] R = new int[N + 1][M + 1];

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			words = line.split(" ");

			int s, t, e;
			s = parseInt(words[0]);
			t = parseInt(words[1]);
			e = parseInt(words[2]);
			if ((s | t | e) == 0) break;

			R[s][t] = e;

		}//end while

		int L;
		L = parseInt(br.readLine());
		for (int i = 0; i < L; i++) {

			words = br.readLine().split(" ");

			//calc
			int[] S = new int[N + 1];
			for (int j = 1; j < S.length; j++) {
				for (int k = 0; k < words.length; k++) {
					S[j] += R[j][k + 1] * parseInt(words[k]);
				}
			}

			//out
			StringBuilder sb = new StringBuilder();
			for (int j = 1; j < S.length; j++) {
				if (j > 1) sb.append(" ");
				sb.append(S[j]);
			}
			System.out.println(sb.toString());
		}

	}//end main
}