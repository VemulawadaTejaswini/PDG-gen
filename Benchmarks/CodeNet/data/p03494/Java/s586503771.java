import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int n = Integer.parseInt(sc.nextLine());
			List<Integer> list = new ArrayList<Integer>();

			for (int i = 0; i < n; i++) {
				int a = sc.nextInt();
				int count = 0;
				while (true) {
					if (a % 2 == 0) {
						a = a / 2;
						count++;
					} else {
						break;
					}
				}
				if (count == 0) {
					// 0の場合はすでに最小のため残りは処理不要
					System.out.println(0);
					return;
				}
				// listに入力値を割れる回数を格納
				list.add(count);
			}
			Collections.sort(list);
			System.out.println(list.get(0));

		} finally {
			sc.close();
		}
	}
}