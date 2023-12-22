import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			int sum = 0;
			int result = 0;
			if (n == 0) {
				break;
			}
			for (int i = 1; i <= n; i++) {
				for (int j = i + 1; j <= n; j++) {
					for (int k = j + 1; k <= n; k++) {
						if (i != j && i != k && j != k) {
							sum = i + j + k;
							if (sum == x) {
								result++;
							}
						}
					}
				}
			}
			System.out.println(result);
		}

	}
}
