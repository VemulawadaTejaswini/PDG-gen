import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Main myself = new Main();
		myself.execute();

	}

	/**
	 * 実処理メソッド
	 */
	public void execute() {

		// 全テストケース数
		int N = 0;
		// TLEするケース数
		int M = 0;

		try (Scanner scanner = new Scanner(System.in)) {

			N = scanner.nextInt();
			M = scanner.nextInt();
		}

		int fixed = (N - M) * 100;
		double aa = (N - M) * 1900 / 2;

		System.out.println(fixed + (int) aa);

	}

}
