import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// 入力値を取得
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int k = sc.nextInt();

		// 差分の最大値
		int[] data = {Math.abs(a - b), Math.abs(a - c), Math.abs(a - d),
				Math.abs(a - e), Math.abs(b - c), Math.abs(b - d),
				Math.abs(b - e), Math.abs(c - d), Math.abs(c - e),
				Math.abs(d - e)};
		int BigDifference = data[0];
		for (int i = 0; i < data.length; i++) {
			int value = data[i];
			if (value > BigDifference) {
				BigDifference = value;
			}
		}

		// 差分の最大値とkを比較
		if (BigDifference > k) {
			System.out.println(":(");
		} else {
			System.out.println("Yay!");
		}

		// クローズ
		sc.close();

	}
}
