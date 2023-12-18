import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static final String NOT_FOUND = "UNRESTORABLE";

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);

		final String sDash = sc.next();
		final String T = sc.next();
		List<String> candidates = new ArrayList<>();
		for (int i = 0, bound = sDash.length() - T.length(); i <= bound; i++) {
			if (fuzzyMatch(sDash.substring(i, i + T.length()), T)) {
				String c = sDash.substring(0, i).replace('?', 'a') + T
						+ sDash.substring(i + T.length(), sDash.length()).replace('?', 'a');
				candidates.add(c);
			}
		}

		if (candidates.size() > 0) {
			Collections.sort(candidates);
			System.out.println(candidates.get(0));
		} else {
			System.out.println(NOT_FOUND);
		}
		sc.close();
	}

	private boolean fuzzyMatch(String s, String t) {
		for (int i = 0, len = s.length(); i < len; i++) {
			if (s.charAt(i) != '?' && s.charAt(i) != t.charAt(i)) {
				return false;
			}
		}
		return true;
	}

}