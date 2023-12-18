import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		final int a = sc.nextInt();
		final int b = sc.nextInt();
		final int k = sc.nextInt();

		int listCount = Math.abs(b - a + 1);
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < listCount; i++) {
			list.add(a + i);
		}

		List<Integer> resultList = new ArrayList<Integer>();

		for (int j = 1; j <= list.size(); j++) {
			if (j <= k) {
				resultList.add(list.get(j - 1));
			} else {
				break;
			}
		}

		Collections.reverse(list);
		for (int l = 1; l <= list.size(); l++) {
			if (l <= k && !resultList.contains(list.get(l - 1))) {
				resultList.add(list.get(l - 1));
			} else {
				break;
			}
		}

		Collections.sort(resultList);

		for (final int item : resultList) {
			System.out.println(item);
		}

	}

}
