import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Fishing Competition
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		int h1, h2, k1, k2, a, b, c, d;

		line = br.readLine();
		h1 = parseInt(line.substring(0, line.indexOf(' ')));
		h2 = parseInt(line.substring(line.indexOf(' ') + 1));

		line = br.readLine();
		k1 = parseInt(line.substring(0, line.indexOf(' ')));
		k2 = parseInt(line.substring(line.indexOf(' ') + 1));

		StringTokenizer st = new StringTokenizer(br.readLine());
		a = parseInt(st.nextToken());
		b = parseInt(st.nextToken());
		c = parseInt(st.nextToken());
		d = parseInt(st.nextToken());

		int h, k;
		h = h1 * a + h2 * b + (h1 / 10) * c + (h2 / 20) * d;
		k = k1 * a + k2 * b + (k1 / 10) * c + (k2 / 20) * d;

		System.out.println(h == k ? "even" : (h > k ? "hiroshi" : "kenjiro"));
	}
}