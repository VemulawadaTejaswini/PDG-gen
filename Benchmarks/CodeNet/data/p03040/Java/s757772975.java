import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 解説通りに作成したソースコード
 */
public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			long b = 0L;
			List<Long> aList = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				int command = scanner.nextInt();
				if (1 == command) {
					long a = scanner.nextLong();
					int index = Collections.binarySearch(aList, a);
					aList.add((index < 0) ? ~index : index, a);
					b += scanner.nextLong();
				} else {
					long middle = getMiddle(aList);
					System.out
							.println(middle + " " + (aList.stream().mapToLong(ai -> Math.abs(middle - ai)).sum() + b));
				}
			}
		}
	}

	/**
	 * listの中間値を取得する
	 * 
	 * @param list
	 * @return listの中間値
	 */
	private static long getMiddle(List<Long> list) {
		return list.get((list.size() - 1) / 2);
	}
}
