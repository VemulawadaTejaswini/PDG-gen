import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Rectangle Made with Bars
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] sides = new int[101];

		for (int i = 0; i < 12; i++) {
			sides[parseInt(st.nextToken())]++;
		}

		boolean ans = true;

		for (int i = 1; i < sides.length; i++) {
			if (!(sides[i] == 0 || sides[i] == 4 || sides[i] == 8 || sides[i] == 12)) {
				ans = false;
				break;
			}
		}

		System.out.printf(ans ? "yes" : "no");

	} // end main
}