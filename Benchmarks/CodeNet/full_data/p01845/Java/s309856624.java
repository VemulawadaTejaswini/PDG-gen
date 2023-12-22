import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Curry Making
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			words = line.split(" ");

			int R0, W0, C, R;
			R0 = parseInt(words[0]);
			W0 = parseInt(words[1]);
			C = parseInt(words[2]);
			R = parseInt(words[3]);
			if ((R0 | W0 | C | R) == 0) break;

			int X = 0;
			while (C > R0 / W0) {
				R0 += R;
				X++;
			}

			System.out.println(X);
		}

	} //end main
}