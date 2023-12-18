import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
		int n = scanner.nextInt();
		int a = scanner.nextInt();
		if (a > n * n) {
			System.out.println(n * n);
			return;
		}
		System.out.println(n * n - a);
	}

}
