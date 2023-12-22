import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int MAX = 1000;
		Scanner sc = new Scanner(System.in);
		String input = "";
		String[] data_nx = new String[2]; // 入力されたn,xの値を一時的に格納するための配列
		int n = 0;
		int x = 0;
		int[] output = new int[MAX]; // 組み合わせの個数を出力するための配列
		int count_data = 0; // 入力されたデータ（n, x)の個数ををカウントするための変数
		int[] number = new int[3];
		boolean judge = true; // 入力されたデータ(n, x)が

		out: for (int i = 0; i < MAX; i++) {
			input = sc.nextLine();
			data_nx = input.split(" ");
			n = Integer.parseInt(data_nx[0]);
			x = Integer.parseInt(data_nx[1]);

			// 入力終了チェック
			if (n == 0 && x == 0) {
				break out;
			}

			// nが条件範囲内に収まっているかのチェック
			if (n < 3 && n > 100) {
				judge = false;
				break out;
			}

			// xが条件範囲内に収まっているかのチェック
			if (x < 0 && x > 300) {
				judge = false;
				break out;
			}

			count_data++;

			// ここから各データにおける合計が x となる組み合わせの数を求めるプログラム
			for (int j = 1; j <= (n - 2); j++) {
				number[0] = j;
				for (int k = j + 1; k <= n - 1; k++) {
					number[1] = k;
					for (int m = k + 1; m <= n; m++) {
						number[2] = m;

						if ((number[0] + number[1] + number[2]) == x) {
							output[i]++;
						}

					}

				}

			} // 各データにおける合計が x となる組み合わせの数を求めるプログラム ここまで!

		}

		if (judge == true) {
			for (int p = 0; p < count_data; p++) {
				System.out.println(output[p]);

			}
		}

	}

}

