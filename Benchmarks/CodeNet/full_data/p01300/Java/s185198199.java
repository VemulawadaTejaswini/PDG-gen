import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;

/**
 * Eleven Lover
 */
public class Main {

	static String sub;
	static String _sub;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			if (line.equals("0")) break;
			line += "_";

			int count = 0;
			for (int i = 0; i < line.length() - 2; i++) {
				for (int j = i + 2; j < line.length(); j++) {
					sub = line.substring(i, j);
					if (sub.charAt(0) == '0') continue;
					//
					long mod = 0;
					if (sub.length() > 18) {
						mod = mod(sub);
					} else {
						mod = parseLong(sub) % 11;
					}
					if (mod == 0) {
						count++;
					}
				}
			}
			System.out.println(count);
		} //end while
	} //end main

	static long mod(String sub) {

		String mod = "0";
		for (int i = 0; i < sub.length(); i += 17) {
			_sub = "";
			if (i + 17 <= sub.length()) {
				_sub = mod + sub.substring(i, i + 17);
			} else {
				_sub = mod + sub.substring(i);
			}
			mod = String.valueOf(parseLong(_sub) % 11);
		}
		return parseLong(mod);
	}
}