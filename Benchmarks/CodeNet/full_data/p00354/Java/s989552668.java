import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Day of Week
 */
public class Main {

	static final String[] DAY = {
			"sat",
			"sun",
			"mon",
			"tue",
			"wed",
			"thu",
			"fri",
	};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		int X = parseInt(br.readLine());

		System.out.println(DAY[(((X - 9) % 7) + 7) % 7]);
	}
}