import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();

		boolean[] flg = new boolean[n * m + 1];
		for (int i = 0; i < flg.length; i++) {
			flg[i] = false;
		}

		for (int i = 0; i <= m; i ++) {
			if (m - 2 * i == 0) {
				flg[i * n] = true;
			} else if (m - 2 * i > 0) {
				for (int j = 0; i * n + j < n * m -i * n; j += (m - 2 * i)) {
					flg[i * n + j] = true;
				}
			} else {
				for (int j = 0; i * n + j >= n * m - i * n; j += (m - 2 * i)) {
					flg[i * n + j] = true;
				}
			}
		}

		if (flg[k] == true) {
			System.out.print("Yes");
		} else {
			System.out.print("No");
		}
	}
}
