
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 0;
		int j = 0;
		int k = 0;
		int ans = 0;
		int answer = 0;

		int[] ary = new int[n];
		for (i = 0; i < n; i++) {
			ary[i] = s.nextInt();

			ans = ans + ary[i];

		}

		int m = s.nextInt();

		int l = 0;
		for (j = 0; j < m; j++) {
			int p = s.nextInt();
			int x = s.nextInt();
			for (l = 0; l < n; l++) {
				if (p-1 == l) {
					if (x < ary[l]) {

						answer = ans - (ary[l]-x);
						System.out.println(answer);
					} else if (x >= ary[l]) {
						answer = ans + (x - ary[l]);
						System.out.println(answer);
					}

				} else {

				}
			}

		}

	}

}