import java.text.ParseException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		long[] incremental = new long[m];
		int sum = 0;

		HashMap<Integer, HashSet<Integer>> map = new HashMap<>();

		int[] arrayA = new int[m];
		int[] arrayB = new int[m];

		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			arrayA[i] = a;
			arrayB[i] = b;
		}

		for (int i = m - 1; i >= 0; i--) {
			int a = arrayA[i];
			int b = arrayB[i];

			map.putIfAbsent(a, new HashSet<>());
			map.putIfAbsent(b, new HashSet<>());

			HashSet<Integer> setA = map.get(a);
			HashSet<Integer> setB = map.get(b);

			setA.add(a);
			setB.add(b);

			long prevASize = setA.size();
			long prevBSize = setB.size();

			setA.addAll(setB);

			for (Integer integer : setA) {
				map.put(integer, setA);
			}

			long size = setA.size();

			incremental[i] = (size - prevASize) * (size - prevBSize);

			sum += incremental[i];

			// System.out.println(incremental[i]);
			// System.out.println(map);

		}

		// System.out.println(sum);

		long ans[] = new long[m];

		for (int i = m - 1; i >= 0; i--) {
			ans[i] = sum;
			sum -= incremental[i];
		}

		for (long l : ans) {
			System.out.println(l);
		}

		sc.close();
	}

}
