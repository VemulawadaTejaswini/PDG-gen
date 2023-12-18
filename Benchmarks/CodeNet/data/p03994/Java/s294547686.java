import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Integer limit = sc.nextInt();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'a') {
				if (i == s.length() - 1) {
					char new_c = (char) (((int) c) + Math.min('z' - c, limit));
					sb.append(new_c);
					limit -= 25;
				} else {
					sb.append(c);
				}
			} else {
				int delta = 'z' - c;
				if (limit > delta) {
					sb.append('a');
					limit -= delta + 1;
					if (limit == 0 && i + 1 < s.length()) {
						sb.append(s.substring(i + 1));
						break;
					}
				} else {
					if (i == s.length() - 1) {
						char new_c = (char) (((int) c) + Math.min(delta, limit));
						sb.append(new_c);
						limit -= delta;
					} else {
						sb.append(c);
					}
					continue;

				}

			}
		}
		if (limit > 0) {
			s = sb.toString();
			char c = s.charAt(s.length() - 1);
			if (c == 'z') {
				c = 'a';
				limit--;
			}
			int delta = limit % 26;
			if (c + delta > 'z') {
				delta -= 'z' - c;
				c = (char) ((int) 'a' + delta);
			}
			else {
				c += delta;
			}
			System.out.println(s.substring(0, s.length() - 1)
					+ c);
		} else {
			System.out.println(sb);
		}
	}

}
