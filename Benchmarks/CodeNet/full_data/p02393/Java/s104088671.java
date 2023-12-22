import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String output = "";
		String[] sdata = input.split(" ");
		int[] idata = new int[3];
		boolean condition = true; // 入力された数値が条件範囲内かを確認するための変数
		int temp = 0; // 一時的にデータを保存しておく変数
		int number = 0; // 一時的にデータの要素番号を保存しておく変数

		for (int i = 0; i < sdata.length; i++) {
			idata[i] = Integer.parseInt(sdata[i]);
			if (idata[i] <= 0 || idata[i] > 10000) {
				condition = false;
				break;
			}
		}

		if (condition) {
			for (int i = 0; i < idata.length - 1; i++) {
				temp = idata[i];
				for (int j = i + 1; j < idata.length; j++) {
					if (idata[j] < temp) {
						temp = idata[j];
						number = j;
					}
				}
				idata[number] = idata[i];
				idata[i] = temp;

			}

			output += "" + idata[0];

			for (int i = 1; i < idata.length; i++) {
				output += " " + idata[i];

			}
			System.out.println(output);
		}
	}

}

