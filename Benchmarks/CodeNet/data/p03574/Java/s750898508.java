import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int h = sc.nextInt();
		final int w = sc.nextInt();

		HashMap<Integer, ArrayList<String>> map = new HashMap<Integer, ArrayList<String>>();
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				list.add(sc.next());
			}
			map.put(i + 1, list);
		}

		for (int k = 1; k <= h; k++) {
			ArrayList<String> list2 = map.get(k);

			int count = 0;
			for (int l = 0; l < h; l++) {
				final String masu = list2.get(l);
				if (masu.equals("#")) {
					continue;
				}

				// 左右
				if (l != 0 && list2.get(l - 1).equals("#")) {
					count++;
				}
				if (l < (w - 1) && list2.get(l + 1).equals("#")) {
					count++;
				}

				// 上下、ななめ
				if (k > 0) {
					final ArrayList<String> list3 = map.get(k - 1);
					if (list3.get(l).equals("#")) {
						count++;
					}
					if (l > 0 && list3.get(l - 1).equals("#")) {
						count++;
					}
					if (list3.size() > l + 1 && list3.get(l + 1).equals("#")) {
						count++;
					}
				}
				if (k + 1 < h) {
					final ArrayList<String> list4 = map.get(k + 1);
					if (list4.get(l).equals("#")) {
						count++;
					}
					if (l > 0 && list4.get(l - 1).equals("#")) {
						count++;
					}
					if (list4.size() > l + 1 && list4.get(l + 1).equals("#")) {
						count++;
					}
				}
				list2.set(l, String.valueOf(count));
			}

			map.put(k, list2);

		}

		for (int j = 0; j < h; j++) {
			System.out.print(map.get(j));
		}
	}

}
