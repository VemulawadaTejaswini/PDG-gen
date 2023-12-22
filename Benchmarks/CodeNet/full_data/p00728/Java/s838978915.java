import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// Scannerクラスのインスタンスを作成
		// 引数で標準入力System.inを指定する
		Scanner scanner = new Scanner(System.in);

		//
		List<Integer> output = new ArrayList<Integer>();

		boolean flag = true;
		//数字の場合
		while (flag) {
			int cnt = scanner.nextInt();

			if (cnt == 0) {
				flag = false;
			}
			if (flag == false)
				break;
			int[] score = new int[cnt];

			//点数の入力
			for (int i = 0; i < score.length; i++) {
				int num = scanner.nextInt();
				score[i] = num;
			}

			int max = 0;
			for (int i = 0; i < score.length; i++) {

				if (max < score[i]) {
					max = score[i];
				}
			}

			int min = 10000;
			for (int i = 0; i < score.length; i++) {
				if (min > score[i]) {
					min = score[i];
				}
			}

			//最大値と最小値の初期化
			for (int i = 0; i < score.length; i++) {

				if (score[i] == max) {
					score[i] = 0;
					break;
				}
			}
			for (int i = 0; i < score.length; i++) {
				if (score[i] == min) {
					score[i] = 0;
					break;
				}
			}

			//合計
			int sum = 0;
			for (int num : score) {
				sum = sum + num;
			}
			int cnt2 = cnt - 2;
			int number = sum / cnt2;
			output.add(number);
		}

		// Scannerクラスのインスタンスをクローズ
		scanner.close();

		for (int sum : output) {
			System.out.println(sum);
		}
	}
}
