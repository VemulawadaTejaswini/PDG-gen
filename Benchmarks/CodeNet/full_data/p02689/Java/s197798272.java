import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();

		int[] nHeightArray = new int[n];

		for (int i = 0; i < n; i++) {

			nHeightArray[i] = scan.nextInt();
		}

		Map<Integer, List<Integer>> mLoadMap = new HashMap<>();

		for (int i = 0; i < m; i++) {

			int a = scan.nextInt();
			int b = scan.nextInt();

			if (mLoadMap.containsKey(a)) {

				mLoadMap.get(a).add(b);

			} else {

				List<Integer> bList = new ArrayList<>();
				bList.add(b);
				mLoadMap.put(a, bList);
			}
			
			if (mLoadMap.containsKey(b)) {

				mLoadMap.get(b).add(a);

			} else {

				List<Integer> bList = new ArrayList<>();
				bList.add(a);
				mLoadMap.put(b, bList);
			}
		}

		int count = 0;

		for (int i = 1; i < n + 1; i++) {

			if (mLoadMap.containsKey(i)) {

				int ownHeight = nHeightArray[i - 1];

				boolean highest = true;

				for (int b : mLoadMap.get(i)) {

					if (ownHeight <= nHeightArray[b - 1]) {

						highest = false;
					}
				}

				if (highest) {
					count++;
				}
			} else {

				count++;
			}
		}

		println(count);
	}

	public static void println(Object target) {
		System.out.println(target);
	}
}
