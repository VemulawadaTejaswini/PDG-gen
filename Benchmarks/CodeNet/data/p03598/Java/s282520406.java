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
		// ボールの数
		int n = scanner.nextInt();
		// Bのy座標
		int k = scanner.nextInt();
		List<Integer> x = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			x.add(scanner.nextInt());
		}

		int result = 0;
		for (int i = 0; i < n; i++) {
			// Bからのボールの距離
			int tmp = k - x.get(i);
			if (Math.abs(tmp) < x.get(i)) {
				result = result + tmp * 2;
			} else {
				result = result + x.get(i) * 2;
			}
		}
		System.out.println(result);
	}

}
