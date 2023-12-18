import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			final int N = in.nextInt();
			int d = 8*N + 1;
			int dr = (int)Math.sqrt(d);
			if (dr * dr != d) {
				System.out.println("No");
				return;
			}

			final int k = (1 + dr) / 2;
			List<Integer>[] sets = new List[k];
			for (int i = 0; i < k; ++i) {
				sets[i] = new ArrayList<>(k);
			}

			int n = 1;
			for (int i = 1; i < k; ++i) {
				for (int j = 0; j < i; ++j) {
					sets[j].add(n);
					sets[i].add(n);
					++n;
				}
			}

			System.out.println("Yes");
			System.out.println(k);
			for (int i = 0; i < k; ++i) {
				System.out.print(sets[i].size());
				for (int v : sets[i]) {
					System.out.printf(" %d", v);
				}
				System.out.println();
			}
		}
	}
}
