import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int N = scanner.nextInt();
		String S = scanner.next();
		final int Q = scanner.nextInt();

		int type, l, r;
		String c;

		for (int i = 0; i < Q; i++) {
			type = scanner.nextInt();
			if (type == 1) {
				l = scanner.nextInt();
				c = scanner.next();
				StringBuilder stringBuilder = new StringBuilder(S);
				stringBuilder.setCharAt(l - 1, c.charAt(0));
				S = new String(stringBuilder);
			} else if (type == 2) {
				l = scanner.nextInt();
				r = scanner.nextInt();
				Set<Character> set = S.substring(l - 1, r).chars().mapToObj(o -> (char) o).collect(Collectors.toSet());
				System.out.println(set.size());
			}
		}

	}
}