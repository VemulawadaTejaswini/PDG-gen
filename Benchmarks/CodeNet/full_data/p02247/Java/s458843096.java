import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * String Search - Naive String Search
 */
public class Main {

	static final int B = 37;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		char[] T, P;
		T = br.readLine().toCharArray();
		P = br.readLine().toCharArray();

		int t = 0, p = 0;
		for (int i = 0; i < P.length; i++) {
			t = t * B + T[i];
			p = p * B + P[i];
		}


		//solve
		if (t == p) System.out.println(0);
		for (int i = 1; i < T.length - P.length + 1; i++) {
			t = t * B + T[i + P.length - 1] - T[i - 1] * power(B, P.length);
			if (t == p) System.out.println(i);
		}
	}

	static int power(int x, int n) {
		if (n == 0) return 1;
		int ret = power(x * x, n / 2);
		if ((n & 1) == 1) ret *= x;
		return ret;
	}

}