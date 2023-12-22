import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

/**
 * Pollock's conjecture
 */
public class Main {

	static final int MAX = 1000000;
	static final int MAX3 = 1500;
	static final int MAX4 = 200;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		int[] R3 = new int[MAX3];
		int[] R4 = new int[MAX4];
		int[] R4O;

		R3[1] = 1;
		for (int i = 2; i < R3.length; i++) {
			R3[i] = R3[i - 1] + i;
		}

		R4[1] = 1;
		for (int i = 2; i < R4.length; i++) {
			R4[i] = R4[i - 1] + R3[i];
		}

		R4O = Arrays.stream(R4).filter(x -> x % 2 != 0).toArray();

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = parseInt(line);
			if (n == 0) break;

			int[] dp = new int[n + 1];
			int[] dpo = new int[n + 1];
			for (int i = 0; i < dp.length; i++) dp[i] = i;
			for (int i = 0; i < dpo.length; i++) dpo[i] = i;

			outer:
			for (int i = 2; i < R4.length; i++) {
				for (int j = 1; j <= dp.length / R4[i]; j++) {
					if (R4[i] * j > n) continue outer;
					for (int k = R4[i] * j; k < dp.length; k++) {
						dp[k] = Math.min(dp[k], dp[k - R4[i] * j] + j);
					}
				}
			}

			outer:
			for (int i = 1; i < R4O.length; i++) {
				for (int j = 1; j <= dpo.length / R4O[i]; j++) {
					if (R4O[i] * j > n) continue outer;
					for (int k = R4O[i] * j; k < dpo.length; k++) {
						dpo[k] = Math.min(dpo[k], dpo[k - R4O[i] * j] + j);
					}
				}
			}

			System.out.println(dp[n] + " " + dpo[n]);

		}//end while
	}//end main
}