import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Graduation Ceremony
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		String S = br.readLine();
		int K = parseInt(br.readLine());

		int[] count = new int['U' + 1];
		for (char c : S.toCharArray()) count[c]++;

		int ans = Math.max(count['U'], count['D']) + Math.max(count['L'], count['R']);
		int rev = Math.min(count['U'], count['D']) + Math.min(count['L'], count['R']);

		if (rev <= K) {
			ans += rev;
		} else {
			ans -= rev - K;
		}

		System.out.println(ans);
	}
}