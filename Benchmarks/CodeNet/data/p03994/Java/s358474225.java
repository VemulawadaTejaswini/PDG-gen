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
				}
				else {
					sb.append(c);
				}
			}
			else {
				int delta = 'z' - c;
				if (limit > delta) {
					sb.append('a');
					limit -= delta + 1;
					if (limit == 0 && i + 1 < s.length()) {
						sb.append(s.substring(i + 1));
						break;
					}
				}
				else {
					if (i == s.length() - 1) {
						char new_c = (char) (((int) c) + Math.min(delta, limit));
						sb.append(new_c);
					}
					else {
						sb.append(c);
					}
					continue;
					
				}

			}
		}
		System.out.println(sb);	
	}

}
