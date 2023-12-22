import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Cake Party
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		int N, C;
		line = br.readLine();
		N = parseInt(line.substring(0, line.indexOf(' ')));
		C = parseInt(line.substring(line.indexOf(' ') + 1));

		int sum = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < C; i++) {
			sum += parseInt(st.nextToken());
		}

		int ans = sum / (N + 1);
		if (sum % (N + 1) > 0) { ans++; }

		System.out.println(ans);
	}
}
