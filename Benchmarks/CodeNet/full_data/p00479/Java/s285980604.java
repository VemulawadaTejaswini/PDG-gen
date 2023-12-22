import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Tile
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		int N, K;
		N = parseInt(br.readLine());
		K = parseInt(br.readLine());

		for (int i = 0; i < K; i++) {
			line = br.readLine();
			
			int a, b;
			a = parseInt(line.substring(0, line.indexOf(' ')));
			b = parseInt(line.substring(line.indexOf(' ') + 1));

			int min;
			min = Math.min(Math.min(a - 1, N - a), Math.min(b - 1, N - b));
			System.out.println((min % 3) + 1);
		}
	}
}