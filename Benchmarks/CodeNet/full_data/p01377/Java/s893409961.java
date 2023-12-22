/**
 * (iwi)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		int count = 0;
		int len = 0;

		line = br.readLine();
		len = line.length();
		if (len % 2 == 1) {
			char c = line.charAt(len / 2);
			if (c == '(' || c == ')') count++;
		}
		for (int i = 0; i < len / 2; i++) {
			char l = line.charAt(i);
			char r = line.charAt(len - 1 - i);
			if (l == 'i' || l == 'w') {
				if (l != r) count++;
			} else {
				if (l == r) count++;
			}
		}
		System.out.println(count);
	} // end main
}