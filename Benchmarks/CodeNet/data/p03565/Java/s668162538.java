import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		String T = in.next();
		int index = S.length() - T.length() + 1;
		List<String> list = new ArrayList<>();
		for (int i = 0; i < index; i++) {
			StringBuilder sb = new StringBuilder(S);
			for (int j = 0; j < T.length(); j++) {
				if (i + j > sb.length()) {
					break;
				}
				if (sb.charAt(i + j) == '?' || sb.charAt(i + j) == T.charAt(j)) {
					sb.setCharAt(i + j, T.charAt(j));
				} else {
					break;
				}
				if (j == T.length() - 1) {
					for (int j2 = 0; j2 < sb.length(); j2++) {
						if (sb.charAt(j2) == '?') {
							sb.setCharAt(j2, 'a');
						}
					}
					list.add(sb.toString());
				}
			}
		}
		Collections.sort(list);
		System.out.println(list.size() > 0 ? list.get(0) : "UNRESTORABLE");
		in.close();
	}
}