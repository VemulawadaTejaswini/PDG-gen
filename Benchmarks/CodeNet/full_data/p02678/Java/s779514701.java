import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[] = new int[m];
		int b[] = new int[m];

		Map<Integer, String> aMap = new HashMap<>();
		Map<Integer, String> bMap = new HashMap<>();

		for (int i = 0; i < m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if (aMap.containsKey(x)) {
				aMap.put(x, aMap.get(x) + ","  + y);
			} else {
				aMap.put(x, String.valueOf(y));
			}
			if (bMap.containsKey(y)) {
				bMap.put(y, bMap.get(y) + ","  + x);
			} else {
				bMap.put(y, String.valueOf(x));
			}
		}

		int array[] = new int[1000000];
		int j = 0;
		for (int i = 1; i <= n; i++) {
			if (aMap.containsKey(i)) {
				if (aMap.get(i).indexOf(",") == -1) {
					array[j] = Integer.valueOf(aMap.get(i));
					j++;
				} else {
					for (String x : aMap.get(i).split(",")) {
						array[j] = Integer.valueOf(x);
						j++;
					}
				}
			}

			if (bMap.containsKey(i)) {
				if (bMap.get(i).indexOf(",") == -1) {
					array[j] = Integer.valueOf(bMap.get(i));
					j++;
				} else {
					for (String x : bMap.get(i).split(",")) {
						array[j] = Integer.valueOf(x);
						j++;
					}
				}
			}
		}

		int answer[] = new int[n + 1];
		Arrays.fill(answer, 0);

		for (int i = 1; i <= 1; i++) {
			if (aMap.containsKey(i)) {
				if (aMap.get(i).indexOf(",") == -1) {
					if (answer[Integer.valueOf(aMap.get(i))] == 0) {
						answer[Integer.valueOf(aMap.get(i))] = i;
					}
				} else {
					for (String x :  aMap.get(i).split(",")) {
						if (answer[Integer.valueOf(x)] == 0) {
							answer[Integer.valueOf(x)] = i;
						}
					}
				}
			}

			if (bMap.containsKey(i)) {
				if (bMap.get(i).indexOf(",") == -1) {
					if (answer[Integer.valueOf(bMap.get(i))] == 0) {
						answer[Integer.valueOf(bMap.get(i))] = i;
					}
				} else {
					for (String x :  bMap.get(i).split(",")) {
						if (answer[Integer.valueOf(x)] == 0) {
							answer[Integer.valueOf(x)] = i;
						}
					}
				}
			}
		}


		for (int i : array) {
			if (aMap.containsKey(i)) {
				if (aMap.get(i).indexOf(",") == -1) {
					if (answer[Integer.valueOf(aMap.get(i))] == 0) {
						answer[Integer.valueOf(aMap.get(i))] = i;
					}
				} else {
					for (String x :  aMap.get(i).split(",")) {
						if (answer[Integer.valueOf(x)] == 0) {
							answer[Integer.valueOf(x)] = i;
						}
					}
				}
			}

			if (bMap.containsKey(i)) {
				if (bMap.get(i).indexOf(",") == -1) {
					if (answer[Integer.valueOf(bMap.get(i))] == 0) {
						answer[Integer.valueOf(bMap.get(i))] = i;
					}
				} else {
					for (String x :  bMap.get(i).split(",")) {
						if (answer[Integer.valueOf(x)] == 0) {
							answer[Integer.valueOf(x)] = i;
						}
					}
				}
			}
		}

		boolean can = false;
		for (int i = 2; i <= n; i++) {
			if (answer[i] == 0) can = false;
		}

		if (!can) {
			for (int i = 2; i <= n; i++) {
				System.out.println("Yes");
				System.out.println(answer[i]);
			}

		} else {
			System.out.println("No");
		}


		sc.close();
	}

}
