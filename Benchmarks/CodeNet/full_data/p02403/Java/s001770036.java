import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String input = ""; // 入力された(H,W)を一時敵に保持しておくための変数
		String[] inputdata = new String[2]; // inputの変数を配列に保持しておくための変数
		// int H = Integer.parseInt(data[0]);
		// int W = Integer.parseInt(data[1]);
		int Max = 10000;
		int n = 0; // 入力されたデータ(H, W)の組数をカウントするための変数
		int[][] HW_data = new int[Max][2];
		boolean judge = true;
		String output = "#";

		out: for (int i = 0; i < HW_data.length; i++) {

			input = sc.nextLine();
			inputdata = input.split(" ");
			HW_data[i][0] = Integer.parseInt(inputdata[0]);
			HW_data[i][1] = Integer.parseInt(inputdata[1]);

			if ((HW_data[i][0] == 0) && (HW_data[i][1] == 0)) {
				break out;
			}

			if ((HW_data[i][0] < 1 || HW_data[i][0] > 300)
					|| (HW_data[i][1] < 1 || HW_data[i][1] > 300)) {
				judge = false;
				break out;
			}

			n++;

		}
		if (judge == true) {
			for (int i = 0; i < n; i++) {
				for (int j = 1; j <= HW_data[i][0]; j++) {
					for (int k = 1; k <= HW_data[i][1]; k++) {
						System.out.print(output);
					}
					System.out.println();
				}
				System.out.println();
			}
		}

	}

}

