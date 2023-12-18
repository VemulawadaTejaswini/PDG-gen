import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<String> nList = new ArrayList<String>();
		List<String> mList = new ArrayList<String>();

		final int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			nList.add(sc.next());
		}
		final int m = sc.nextInt();
		for (int j = 0; j < m; j++) {
			mList.add(sc.next());
		}

		HashMap<String, Integer> resultList = new HashMap<String, Integer>();
		for (final String nItem : nList) {
			if (resultList.containsKey(nItem)) {
				final int point = resultList.get(nItem);
				resultList.put(nItem, point + 1);
			} else {
				resultList.put(nItem, 1);
			}
		}
		resultList.put("99999999999", 0);
		for (final String mItem : mList) {
			if (resultList.containsKey(mItem)) {
				final int point = resultList.get(mItem);
				resultList.put(mItem, point - 1);
			} else {
				resultList.put(mItem, -1);
			}
		}

		int result = resultList.get("99999999999");
		for (final String key : resultList.keySet()) {
			final int resultPoint = resultList.get(key);
			if (result < resultPoint) {
				result = resultPoint;
			}
		}
		System.out.print(result);

	}

}
