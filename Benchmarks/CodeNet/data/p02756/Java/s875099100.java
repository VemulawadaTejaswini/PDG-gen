import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String answer = scanner.next();
		int Q = scanner.nextInt();
		boolean didReverse = false;

		for (int i = 0; i < Q; i++) {
			int T = scanner.nextInt();
			if (T == 1) didReverse = !didReverse;
			else {
				StringBuilder sb = new StringBuilder(answer);
				int F = scanner.nextInt();
				String C = scanner.next();

				if ((F == 1 && !didReverse) || (F == 2 && didReverse)) answer = sb.insert(0, C).toString();
				else answer = sb.append(C).toString();
			}
		}

		if (didReverse) {
			StringBuilder sb = new StringBuilder(answer);
			answer = sb.reverse().toString();
		}

		System.out.println(answer);
	}
}
