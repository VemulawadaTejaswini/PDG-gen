import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Change of the Era Name
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			if (line.equals("#")) break;

			words = line.split(" ");

			int y, m;
			y = parseInt(words[1]);
			m = parseInt(words[2]);

			if (y < 31 || (y <= 31 && m <= 4)) {
				System.out.println(line);
			} else {
				y -= 30;
				System.out.printf("%s %d %s %s%n", "?", y, words[2], words[3]);
			}
		}
	}
}
