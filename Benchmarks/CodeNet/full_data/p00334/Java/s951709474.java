import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Geometric Data
 */
public class Main {

	static final int BASE = 1009;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] p = new int[3];
		Set<Long> set = new HashSet<>();
		int count = 0;

		for (int i = 0; i < N; i++) {
			p[0] = sc.nextInt();
			p[1] = sc.nextInt();
			p[2] = sc.nextInt();

			Arrays.sort(p);

			long hash = 0;
			hash += p[0] * BASE * BASE;
			hash += p[1] * BASE;
			hash += p[2];

			if (set.contains(hash)) {
				count++;
				continue;
			}

			set.add(hash);
		}

		System.out.println(count);
	}
}

