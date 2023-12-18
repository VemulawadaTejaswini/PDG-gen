import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		String T = in.next();
		Map<Character, Character> ma = new HashMap<>();
		Map<Character, Character> ima = new HashMap<>();
		boolean isOk = true;
		for (int i = 0; i < S.length(); i++) {
			char s = S.charAt(i);
			char t = T.charAt(i);
			if (ma.containsKey(s)) {
				if (ma.get(s) != t) {
					isOk = false;
				}
			}
			if (ima.containsKey(t)) {
				if (ima.get(t) != s) {
					isOk = false;
				}
			}
			ma.put(s, t);
			ima.put(t, s);
		}
		System.out.println(isOk ? "Yes" : "No");
		in.close();
	}
}