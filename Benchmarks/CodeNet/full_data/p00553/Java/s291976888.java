import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Microwave
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		int A, B, C, D, E;
		A = parseInt(br.readLine());
		B = parseInt(br.readLine());
		C = parseInt(br.readLine());
		D = parseInt(br.readLine());
		E = parseInt(br.readLine());

		int elapse = 0;
		int temp = A;

		if (temp < 0) {
			elapse += -temp * C;
			temp = 0;
		}

		if (temp == 0) {
			elapse += D;
		}

		elapse += (B - temp) * E;

		System.out.println(elapse);

	}
}