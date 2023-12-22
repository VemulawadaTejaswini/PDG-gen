import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

import static java.lang.Integer.parseInt;

/**
 * ABC Gene
 */
public class Main {

	static final String TARGET = "ABC";
	static final String[] REP = {"A", "B", "C"};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		Deque<String> queue = new ArrayDeque<>();

		queue.offer(br.readLine());
		boolean ans = false;

		while (!queue.isEmpty()) {

			String s = queue.poll();

			System.out.println(s);

			if (s.equals(TARGET)) {
				ans = true;
				break;
			}

			for (String r : REP) {
				String _s = s.replace(TARGET, r);
				if (!_s.equals(s)) {
					queue.offer(_s);
				}
			}
		}

		System.out.println(ans ? "Yes" : "No");

	} //end main

	static String replace(String s, char r) {
		char[] ss = s.toCharArray();
		int count = 0;
		for (int i = 1; i < ss.length - 1; i++) {
			if (ss[i - 1] == 'A' && ss[i] == 'B' && ss[i + 1] == 'C') {
				ss[i] = r;
				ss[i - 1] = '_';
				ss[i + 1] = '_';
				count++;
			}
		}
		if (count == 0) {
			return s;
		}
		char[] _ss = new char[ss.length - count * 2];
		for (int i = 0, j = 0; i < ss.length; i++) {
			if (ss[i] != '_') {
				_ss[j] = ss[i];
				j++;
			}
		}
		return String.valueOf(_ss);
	}

}