

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int count = 0;
		int[] ans = new int[n + 1];

		for (int i = 1; i <= n; i++) {

			if (i < 6) {
				ans[i] = 0;
				continue;
			}

			for (int j = 1; j <= Math.sqrt(i); j++) {
				if (i < j * j + 2 * j + 2)
					break;
				for (int k = 1; k <= Math.sqrt(i); k++) {
					if (i < j * j + k * k + j * k + j + k + 1)
						break;
					for (int l = 1; l <= Math.sqrt(i); l++) {
						int a = j * j + k * k + l * l + j * k + k * l + l * j;
						if (i < a)
							break;
						if (i == a)
							count++;
					}
				}
			}
			ans[i] = count;
			count = 0;
		}

		for (int i = 1; i <= n; i++) {
			System.out.println(ans[i]);

		}

	}

}
