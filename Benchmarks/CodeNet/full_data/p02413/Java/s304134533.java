import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String input1 = "";
		String input2 = "";
		String[] input_rc = new String[2];
		int r = 0;
		int c = 0;
		boolean judge = true;

		input1 = sc.nextLine();
		input_rc = input1.split(" ");
		r = Integer.parseInt(input_rc[0]);
		c = Integer.parseInt(input_rc[1]);

		if (r < 1 || r > 100) {
			judge = false;
		}

		if (c < 1 || c > 100) {
			judge = false;
		}

		if (judge == true) {
			// String[] outputstring = new String[r + 1];
			int[][] output_data = new int[r + 1][c + 1];
			String[] string_data = new String[c];

			// 1行ずつ入力される行列データを処理する
			out: for (int i = 0; i < r; i++) {
				input2 = sc.nextLine(); // 1行ずつ入力される各行のデータを受け取る
				string_data = input2.split(" "); // 1行ずつ入力される各行のデータを半角区切りで分けて格納する

				// 各行の各列のデータの処理を行う
				for (int j = 0; j < c; j++) {
					output_data[i][j] = Integer.parseInt(string_data[j]);
					if (output_data[i][j] < 0 || output_data[i][j] > 100) {
						judge = false;
						break out;
					}
					output_data[r][j] += output_data[i][j];
					output_data[i][c] += output_data[i][j];
					output_data[r][c] += output_data[i][j];
				}

			}

			if (judge == true) {
				for (int k = 0; k < (r + 1); k++) {
					for (int m = 0; m < (c + 1); m++) {
						if (m == 0) {
							System.out.print("" + output_data[k][m]);
						} else {
							System.out.print(" " + output_data[k][m]);
						}

					}
					System.out.println();

				}
			}

		}
	}
}

