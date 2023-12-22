import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			String[] input = sc.nextLine().split(",");
			int largestKukanNum = input.length - 2;

			// 区間の長さの合計
			int kukanSum = 0;
			for (int i = 0; i < largestKukanNum ; i++) {
				kukanSum += Integer.parseInt(input[i]);
			}

			// 区間1側の終端駅を出発した電車の速度
			double v1 = Integer.parseInt(input[input.length - 2]);
			// 反対側の終端駅を出発した電車の速度
			double v2 = Integer.parseInt(input[input.length - 1]);

			// 電車がすれ違うまでの距離を区間1から測る
			double pass = kukanSum / (v1 + v2) * v1;

			// すれ違う区間を出力する
			int passKukan = 0;
			for (int i = 0; i < largestKukanNum - 1; i++) {
				passKukan += Integer.parseInt(input[i]);
				if (passKukan > pass) {
					System.out.println(i + 1);
					break;
				}
			}

		} finally {
			sc.close();
		}
	}
}