import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			int x = scanner.nextInt();

			Set<Integer> costSet = new HashSet<>(m);
			for (int i = 0; i < m; i++) {
				int a = scanner.nextInt();
				costSet.add(a);
			}

			int costA = 0;
			for (int pos = x; pos > 0; pos--) {
				if (costSet.contains(pos)) {
					costA++;
				}
			}

			int costB = 0;
			for (int pos = x; pos < n; pos++) {
				if (costSet.contains(pos)) {
					costB++;
				}
			}

			System.out.println(Math.min(costA, costB));
		}
	}
}
