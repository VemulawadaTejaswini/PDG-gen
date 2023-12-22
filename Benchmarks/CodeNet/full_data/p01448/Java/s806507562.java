import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * A Way to Invite Friends
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		int N, _N;
		_N = N = parseInt(br.readLine());
		_N++;
		int[] friends = new int[N + 1];

		for (int i = 0; i < N; i++) {
			line = br.readLine();
			int a, b;
			a = parseInt(line.substring(0, line.indexOf(' ')));
			b = parseInt(line.substring(line.indexOf(' ') + 1));
			if (a <= _N) {
				friends[a]++;
			} else {
				_N--;
			}
			if (b > a && b <= _N) {
				friends[b]--;
			}
		}

		//
		int max = friends[0];
		for (int i = 1; i <= _N; i++) {
			friends[i] += friends[i - 1];
			max = Math.max(max, friends[i]);
		}
		System.out.println(max);
	}
}