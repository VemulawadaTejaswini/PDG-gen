import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			while (sc.hasNext()) {
				int n = sc.nextInt();
				System.out.println(solve(n, 0));
			}
		}
	}

	public static int solve(int n, int d) {
		if (n < 0 || n > (4 - d) * 9 || d > 4) {
			return 0;
		}
		if (d == 4 && n == 0) {
			return 1;
		}
		int result = 0;
		for (int i = 0; i <= 9; i++) {
			result += solve(n - i, d + 1);
		}
		return result;
	}
}