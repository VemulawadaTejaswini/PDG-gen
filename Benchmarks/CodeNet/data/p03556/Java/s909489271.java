import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Main myself = new Main();
		int answer = myself.execute();

		System.out.print(answer);
	}

	/**
	 * 実処理メソッド
	 */
	public int execute() {

		try (Scanner scanner = new Scanner(System.in)) {

			final int N = scanner.nextInt();

			// iはテスト数
			for (int i = N; 0 < i; i--) {

				for (int j = 10000; 0 < j; j--) {

					if (j * j == i) {
						return i;
					}
				}
			}

			return 0;
		}

	}

}
