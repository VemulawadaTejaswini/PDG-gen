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
		N[0] = Integer.valueOf("0111111", 2);
		N[1] = Integer.valueOf("0000110", 2);
		N[2] = Integer.valueOf("1011011", 2);
		N[3] = Integer.valueOf("1001111", 2);
		N[4] = Integer.valueOf("1100110", 2);
		N[5] = Integer.valueOf("1101101", 2);
		N[6] = Integer.valueOf("1111101", 2);
		N[7] = Integer.valueOf("0100111", 2);
		N[8] = Integer.valueOf("1111111", 2);
		N[9] = Integer.valueOf("1101111", 2);
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
				System.out.println(Integer.toBinaryString(((1 << 7) + c) ^ N[d]).substring(1));
				c = N[d];
			}
		}

	}
}