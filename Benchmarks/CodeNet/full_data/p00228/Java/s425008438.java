import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Seven Segments
 */
public class Main {

	static int[] N = new int[10];

	static {
		N[0] = Integer.valueOf("01111111", 2);
		N[1] = Integer.valueOf("00000110", 2);
		N[2] = Integer.valueOf("10111011", 2);
		N[3] = Integer.valueOf("10011111", 2);
		N[4] = Integer.valueOf("11100110", 2);
		N[5] = Integer.valueOf("11101101", 2);
		N[6] = Integer.valueOf("11111101", 2);
		N[7] = Integer.valueOf("01100111", 2);
		N[8] = Integer.valueOf("11111111", 2);
		N[9] = Integer.valueOf("11101111", 2);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = parseInt(line);
			if (n == -1) break;

			int c = 0;
			for (int i = 0; i < n; i++) {
				int d = parseInt(br.readLine());
				System.out.println(Integer.toBinaryString((1 << 8) + c ^ N[d]).substring(1));
				c = N[d];
			}
		}

	}
}