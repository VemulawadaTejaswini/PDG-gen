import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[m];
		int[] b = new int[m];
		for (int i = 0; i < m; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		sc.close();

		long nC2 = (long)n * (n-1) / 2;

		Map<Integer, Set<Integer>> setMap = new HashMap<Integer, Set<Integer>>();
		long[] useful = new long[m + 1];
		useful[m] = 0L;
		for (int i = m - 1; i >= 0; i--) {
			int ai = a[i];
			int bi = b[i];
			Set<Integer> setA = setMap.get(ai);
			Set<Integer> setB = setMap.get(bi);

			if (setA == null && setB == null) {
				Set<Integer> set = new HashSet<Integer>();
				set.add(ai);
				set.add(bi);
				setMap.put(ai, set);
				setMap.put(bi, set);
				useful[i] = useful[i + 1] + 1;

			} else if (setA != null && setB == null) {
				useful[i] = useful[i + 1] + setA.size();
				setA.add(bi);
				setMap.put(bi, setA);

			} else if (setA == null && setB != null) {
				useful[i] = useful[i + 1] + setB.size();
				setB.add(ai);
				setMap.put(ai, setB);

			} else if (setA != setB) {
				useful[i] = useful[i + 1] + setA.size() * setB.size();
				if (setA.size() > setB.size()) {
					setA.addAll(setB);
					for (int o : setB) {
						setMap.put(o, setA);
					}
				} else {
					setB.addAll(setA);
					for (int o : setA) {
						setMap.put(o, setB);
					}
				}
			} else {
				useful[i] = useful[i + 1];
			}
		}

		for (int i = 1; i <= m; i++) {
			System.out.println(nC2 - useful[i]);
		}
	}
}
