import java.util.Scanner;

public class Main {

	static Main instance = new Main();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値
		int N = scan.nextInt();

		//WK変数
		long sum = 0L;

		//演算
		for (int i = 1; i <= N; i++) {
			if (i % 3 != 0 && i % 5 != 0) {
				sum += i;
			}
		}

		//結果出力
		System.out.println(sum);
	}
}