/**
 * CatChecker
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

import static java.lang.Integer.parseInt;

public class Main {

	static Set<String> cat = new HashSet<>();
	static Set<String> rabbit = new HashSet<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		cat.add("");
		cat.add("mew");

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			System.out.println(isCat(line) ? "Cat" : "Rabbit");
		}
	}

	static boolean isCat(String S) {

		if (cat.contains(S)) return true;
		if (rabbit.contains(S)) return false;

		if (S.charAt(0) == 'm'
				&& S.charAt(S.length() - 1) == 'w'
				&& S.indexOf('e') > 0) {
			boolean ret = false;
			String _S = S.substring(1, S.length() - 1);
			for (int i = 0; i < _S.length(); i++) {
				if (_S.charAt(i) == 'e') {
					ret = isCat(_S.substring(0, i)) & isCat(_S.substring(i + 1));
					if (ret) {
						cat.add(S);
						break;
					} else {
						rabbit.add(S);
					}
				}
			}
			return ret;
		}

		return false;
	}
}