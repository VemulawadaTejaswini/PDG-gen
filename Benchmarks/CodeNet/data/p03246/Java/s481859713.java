import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);
		int n = sc.nextInt();

		int[][] counter = new int[2][100000];

		for (int i = 0; i < n / 2; i++) {
			counter[0][sc.nextInt()]++;
			counter[1][sc.nextInt()]++;
		}

		int ans = 0;
		for (int i = 0; i < 100000; i++) {
			if (counter[0][i] + n / 2 < ans) {
				continue;
			}
			int oddNokori = n / 2;

			for (int j = 0; j < 100000; j++) {
				oddNokori -= counter[1][j];
				if (i == j) {
					continue;
				}

				if (oddNokori + counter[0][i] < ans) {
					break;
				}

				int tmp = counter[0][i] + counter[1][j];
				if (ans < tmp) {
					ans = tmp;
				}
			}
		}

		out.println(n - ans);

		sc.close();
	}

	public static void main(String[] args) {
		(new Main())._main(args);
	}

}
