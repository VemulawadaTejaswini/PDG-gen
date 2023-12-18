import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			String[] a = new String[n];
			String[] b = new String[m];
			IntStream.range(0, n).forEach(i -> a[i] = scanner.next());
			IntStream.range(0, m).forEach(i -> b[i] = scanner.next());
			int line = 0;
			Set<Integer> preIndexSet = new HashSet<>();
			boolean found = false;
			for (int i = 0; i < n; i++) {
				Set<Integer> indexSet = getIndexSet(a[i], b[line]);
				if (indexSet.size() > 0) {
					if (line == 0) {
						line++;
						preIndexSet.addAll(indexSet);
					} else {
						preIndexSet.retainAll(indexSet);
						if (preIndexSet.size() > 0) {
							line++;
						}
					}
					if (line >= m) {
						found = true;
						break;
					}
				} else {
					line = 0;
					preIndexSet.clear();
				}
			}
			System.out.println(found ? "Yes" : "No");
		}
	}

	/**
	 * @param a
	 * @param b
	 * @return bがaの中で出現するindexのセット
	 */
	private static Set<Integer> getIndexSet(String a, String b) {
		Set<Integer> set = new HashSet<>();
		int from = 0;
		int index;
		while ((index = a.indexOf(b, from)) > 0) {
			set.add(index);
			from = index + 1;
		}
		return set;
	}
}
