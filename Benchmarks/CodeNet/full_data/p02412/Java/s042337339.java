

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		while (true) {
			String[] num = sc.nextLine().split(" ");

			int n = Integer.parseInt(num[0]);
			int x = Integer.parseInt(num[1]);

			// ????????????
			if (n == 0 && x == 0)
				break;
			int cnt = 0;

			for (int i = 1; i <= n - 2; i++) {
				for (int j = i + 1; j <= n - 1; j++) {
					for (int k = i + 1; k <= n; k++) {
						if ((i + j + k) == x)
							cnt++;
					}
				}
			}
			System.out.println(cnt);

		}

	}
}