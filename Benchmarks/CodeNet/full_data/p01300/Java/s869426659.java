import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;

/**
 * Eleven Lover
 */
public class Main {

	static String line;
	static Map<Long, Integer> cache;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String line;

		cache = new HashMap<>();

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			if (line.equals("0")) break;
			line += "_";

			int count = 0;
			for (int i = 0; i < line.length() - 2; i++) {
				for (int j = i + 2; j < line.length(); j++) {
					if (line.charAt(i) == '0') continue;
					//
					long mod = 0;
					if (j - i > 18) {
						mod = mod11(i, j);
					} else {
						mod = num(i, j, 0) % 11;
					}
					if (mod == 0) count++;
				}
			}
			System.out.println(count);
		} //end while
	} //end main

	static long mod11(int i, int j) {

		int mod = 0;
		for (; i < j; i += 17) {
			long _num = 0;
			if (i + 17 < j) {
				_num = num(i, i + 17, mod);
			} else {
				_num = num(i, j, mod);
			}
			if (cache.containsKey(_num)) {
				mod = cache.get(_num);
			} else {
				mod = (int) (_num % 11);
				cache.put(_num, mod);
			}
		}
		return mod;
	}

	static long num(int i, int j, int s) {
		long l = s;
		for (; i < j; i++) {
			l *= 10;
			l += line.charAt(i) - '0';
		}
		return l;
	}

}