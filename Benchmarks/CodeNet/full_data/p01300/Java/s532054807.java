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

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			if (line.equals("0")) break;
			line += "_";

			int count = 0;
			for (int i = 0; i < line.length() - 2; i++) {
				for (int j = i + 2; j < line.length(); j++) {
					if (line.charAt(0) == '0') continue;
					//
					long mod = 0;
					if (j - i > 18) {
						mod = mod(line.substring(i, j));
					} else {
						mod = parseLong(line.substring(i, j)) % 11;
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
			P2182.sub = "";
			if (i + 17 <= sub.length()) {
				P2182.sub = mod + sub.substring(i, i + 17);
			} else {
				P2182.sub = mod + sub.substring(i);
			}
			mod = String.valueOf(parseLong(P2182.sub) % 11);
		}
		return parseLong(mod);
	}
}