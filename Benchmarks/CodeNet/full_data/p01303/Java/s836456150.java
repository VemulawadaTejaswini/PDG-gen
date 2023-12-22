import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Petting Cats
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		int D = parseInt(br.readLine());

		for (int i = 0; i < D; i++) {

			int minx, miny, maxx, maxy;
			int count = 0;

			words = br.readLine().split(" ");

			minx = parseInt(words[0]);
			miny = parseInt(words[1]);
			maxx = minx + parseInt(words[2]);
			maxy = miny + parseInt(words[3]);

			int N = parseInt(br.readLine());

			for (int j = 0; j < N; j++) {

				line = br.readLine();

				int x, y;
				x = parseInt(line.substring(0, line.indexOf(' ')));
				y = parseInt(line.substring(line.indexOf(' ') + 1));

				if (minx <= x && x <= maxx
						&& miny <= y && y <= maxy) count++;
			}

			System.out.println(count);

		}
	}
}