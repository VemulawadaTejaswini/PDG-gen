import java.util.Scanner;

/**
 * お遊び
 *
 * @author s-sugimoto
 */
public class Main {

	/**
	 * 隠蔽
	 */
	private Main() {
	}

	/**
	 * main
	 *
	 * @param args 起動引数
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();

		int output = getLogic(num1, num2);
		System.out.println(output);
	}

	/**
	 * ロジック群
	 */
	private static int getLogic(int num1, int num2) {
		if (num1 < num2) {
			return 0;
		}
		int result = num1 - num2;
		return result;
	}
}
