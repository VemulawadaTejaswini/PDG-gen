import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		String str = scanner.next();
		int answer = 0;

		for (int k = 3; k <= N; k++) {
			for (int j = 2; j < k; j++) {
				if (str.charAt(j - 1) == str.charAt(k - 1)) continue;
				for (int i = 1; i < j; i++) {
					if (j - i == k - j) continue;
					if (str.charAt(i - 1) == str.charAt(j - 1)) continue;
					if (str.charAt(k - 1) == str.charAt(i - 1)) continue;

					answer++;
				}
			}
		}

		System.out.println(answer);

	}
}
