import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String answer = scanner.next();
		int Q = scanner.nextInt();

		for (int i = 0; i < Q; i++) {
			int T = scanner.nextInt();
			StringBuilder sb = new StringBuilder(answer);

			if (T == 1) answer = sb.reverse().toString();
			else {
				int F = scanner.nextInt();
				String C = scanner.next();

				if (F == 1) answer = sb.insert(0, C).toString();
				else answer = sb.append(C).toString();
			}
		}

		System.out.println(answer);
	}
}
