import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean result = false;
		int m = sc.nextInt();
		int n = sc.nextInt();
		int k = sc.nextInt();

		if (k == 0) {
			result = true;
		}

		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				int tmp = i * m + j * n - 2 * i * j;
				if (tmp == k) {
					result = true;
				}
			}
		}

		if (result) System.out.println("Yes");
		else System.out.println("No");
	}
}