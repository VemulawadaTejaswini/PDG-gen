import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {

			StringBuffer sb = new StringBuffer(sc.next());
			for (int i = 0; i < sb.length() - 1; i++) {
				char c = sb.charAt(i);
				if (c == '?') {
					if (sb.charAt(i + 1) == '?') {
						sb.setCharAt(i, 'P');
						sb.setCharAt(i + 1, 'D');

					} else if (sb.charAt(i + 1) == 'D') {
						sb.setCharAt(i, 'P');
					} else {
						sb.setCharAt(i, 'D');
					}
				} else {
					sb.setCharAt(i, c);
				}
			}

			if (sb.charAt(sb.length() - 1) == '?') {
				sb.setCharAt(sb.length() - 1, 'D');
			}
			System.out.println(sb.toString());

		} catch (Exception e) {
		}

	}

}
