import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		int H = sc.nextInt();
		int A = sc.nextInt();

		// 攻撃回数
		int count = 0;

		// 結果の出力
		while (H > 0) {
			count++;
			H -= A;
		}
		System.out.println(count);

		sc.close();
	}
}
