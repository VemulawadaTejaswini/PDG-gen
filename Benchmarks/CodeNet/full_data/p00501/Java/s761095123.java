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
			outer:
			for (int j = 0; j < src.length(); j++) {
				if (src.charAt(j) == top) {
					for (int k = 0; ; k++) {
						for (int l = 0; l < dst.length(); l++) {
							if (j + (k * l) >= src.length()) {
								break outer;
							}
							if (dst.charAt(l) != src.charAt(j + (k * l))) break;
							if (l == dst.length() - 1) {
								count++;
								break outer;
							}
						}
					}
				}
			}
		}
		System.out.println(count);
	}
}