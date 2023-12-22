import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			if (n == 0 && x == 0) break;
			int cnt = 0;
			for (int i = 1; i <= n - 3; i++) {
				for (int j = i + 1; j <= n - 2; j++) {
					for (int k = j + 1; k <= n; k++)
						cnt = i + j + k == x ? cnt + 1 : cnt;
				}
			}
			System.out.println(cnt);
		}

	}

}