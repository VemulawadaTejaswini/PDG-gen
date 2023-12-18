import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int[][] a = new int[3][3];
		int[] b = new int[10];
		boolean[][] match = new boolean[3][3];
		int n;
		boolean result = false;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {

			String arg1 = sc.nextLine();
			String[] column = arg1.split(" ");
			int[] ia = new int[column.length];

			for (int j = 0; j < column.length; j++) {
				ia[j] = Integer.parseInt(column[j]);
				a[i][j] = ia[j];
			}
		}

		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				match[i][j] = false;

				for (int k = 0; k < b.length; k++) {
					if (a[i][j] == b[k]) {
						match[i][j] = true;
					}
				}

			}
		}

		for (int i = 0; i < 3; i++) {
			if (match[i][0] && match[i][1] && match[i][2]) {
				result = true;
			}
		}

		for (int i = 0; i < 3; i++) {
			if (match[0][i] && match[1][i] && match[0][i]) {
				result = true;
			}
		}

		if (match[0][0] && match[1][1] && match[2][2]) {
			result = true;
		}
		if (match[0][2] && match[1][1] && match[2][0]) {
			result = true;
		}

		System.out.println(result ? "Yes" : "No");

		sc.close();

	}
}