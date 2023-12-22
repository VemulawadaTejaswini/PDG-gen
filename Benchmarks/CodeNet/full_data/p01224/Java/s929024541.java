import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Perfect Number
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int N = parseInt(line);
			if (N == 0) break;

			int sum = 0;

			for (int i = 1; i * i <= N; i++) {
				if (N % i == 0) {
					if (i * i == N) sum += i;
					else sum += i + N / i;
				}
			}

			sum -= N;

			if (N == sum) System.out.println("perfect number");
			else if (N > sum) System.out.println("deficient number");
			else if (N < sum) System.out.println("abundant number");

		}
	}
}