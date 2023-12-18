import java.util.Map;
import java.util.Scanner;

import org.apache.commons.collections.map.HashedMap;

/**
 * 遊び
 *
 * @author s-sugimoto
 */
public class WriteAndErase {

	/**
	 * コンストラクタ
	 */
	private WriteAndErase() {
	}

	/**
	 * main
	 *
	 * @param args 起動引数
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();

		Map<Integer, Boolean> resultMap = new HashedMap();
		for (int i = 0; i < count; i++) {
			int input = scanner.nextInt();
			Boolean tmp = resultMap.get(input);
			if (tmp == null) {
				resultMap.put(input, true);
			} else {
				if (tmp) {
					resultMap.put(input, false);
				} else {
					resultMap.put(input, true);
				}
			}
		}

		System.out.println(resultMap.entrySet().stream().map(e -> e.getValue()).filter(e -> e == true).count());
	}
}
