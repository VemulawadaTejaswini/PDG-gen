import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Shopping
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		StringTokenizer st = new StringTokenizer(br.readLine());

		int m, f, b;
		m = parseInt(st.nextToken());
		f = parseInt(st.nextToken());
		b = parseInt(st.nextToken());

		if (m >= b) {
			System.out.println(0);
		} else if (m + f >= b) {
			System.out.println(b - m);
		} else {
			System.out.println("NA");
		}
	}
}