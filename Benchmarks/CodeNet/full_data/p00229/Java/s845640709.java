import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/*
 * Problem D: Big Hit !
 * PCK2010 ??¬???4
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			words = line.split(" ");

			int b, r, g, c, s, t;
			b = parseInt(words[0]);
			r = parseInt(words[1]);
			g = parseInt(words[2]);
			c = parseInt(words[3]);
			s = parseInt(words[4]);
			t = parseInt(words[5]);
			if ((b | r | g | c | s | t) == 0) break;

			int sum = 100;
			//use
			sum -= (b + r + g + c + s) * 3;
			sum -= ((b * 5) + (r * 3)) * 2;
			sum -= (t - (b + r + g + c + (s * 2) + (b * 5) + (r * 3))) * 3;
			//get
			sum += b * (1 + 5) * 15;
			sum += r * (1 + 3) * 15;
			sum += g * 7;
			sum += c * 2;

			System.out.println(sum);
		}
	}
}