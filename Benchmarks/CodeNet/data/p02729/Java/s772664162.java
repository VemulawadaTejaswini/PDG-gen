import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			System.out.println(c(n, 2) + c(m, 2));
		}
	}

	private static int c(int n, int m) {
		if (m <= n) {
			int answer = 1;
			for (int i = 1; i <= m; i++) {
				answer *= n + 1 - i;
				answer /= i;
			}
			return answer;
		}
		return 0;
	}
}
