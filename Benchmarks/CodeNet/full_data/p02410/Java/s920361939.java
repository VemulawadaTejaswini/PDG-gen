import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		String input1 = sc.nextLine();
		String input2 = "";
		String[] NM = input1.split(" ");

		int n = Integer.parseInt(NM[0]);
		int m = Integer.parseInt(NM[1]);
		boolean judge = true;
		int value = 0; // 入力された行列Aと列Bの数値を一時的に保持するための変数

		if ((n >= 1 && n <= 100) && (m >= 1 && m <= 100)) {

			int[][] A = new int[n][m];
			int[] b = new int[m];
			int[] c = new int[n];

			String[] AString = new String[m];
			String[] BString = new String[m];

			out: for (int i = 0; i < n; i++) {
				input2 = sc.nextLine();
				AString = input2.split(" ");
				for (int j = 0; j < AString.length; j++) {
					value = Integer.parseInt(AString[j]);
					if (value < 0 || value > 1000) {
						judge = false;
						break out;

					}
					A[i][j] = value;
				}
			}

			if (judge == true) {

				out: for (int i = 0; i < m; i++) {
					BString[i] = sc.nextLine();
					value = Integer.parseInt(BString[i]);
					if (value < 0 || value > 1000) {
						judge = false;
						break out;
					}
					b[i] = value;
				}
			}

			if (judge == true) {
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < m; j++) {
						c[i] += A[i][j] * b[j];

					}

				}

				for (int k = 0; k < n; k++) {
					System.out.println(c[k]);

				}

			}
		}

	}

}

