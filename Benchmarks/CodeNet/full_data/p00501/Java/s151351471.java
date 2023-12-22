import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Unique number
 * JOI 12th, Pre 3
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		int N = parseInt(br.readLine());
		String dst = br.readLine();
		char top = dst.charAt(0);

		int count = 0;
		for (int i = 0; i < N; i++) {
			String src = br.readLine();
			outer1:
			for (int j = 0; j < src.length(); j++) {
				outer2:
				if (src.charAt(j) == top) {
					for (int k = 0; ; k++) {
						for (int l = 0; l < dst.length(); l++) {
							if (j + l + (k * l) >= src.length()) {
								break outer2;
							}
							if (dst.charAt(l) != src.charAt(j + l + (k * l))) break;
							if (l == dst.length() - 1) {
								count++;
								break outer1;
							}
						}
					}
				}
			}
		}
		System.out.println(count);
	}
}