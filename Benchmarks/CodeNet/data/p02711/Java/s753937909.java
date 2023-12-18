import java.util.Scanner;

public class Main {

	static Main instance = new Main();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値
		int N = scan.nextInt();

		//WK変数
		String result = "No";

		//演算
		if (N / 100 == 7 || (N / 10) % 10 == 7 || N % 10 == 7) {
			result = "Yes";
		}

		//結果出力
		System.out.println(result);
	}
}