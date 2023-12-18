import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final int X = s.nextInt();
			final int Y = s.nextInt();
			final int Z = s.nextInt();
			final int K = s.nextInt();
			final long A[] = new long[X];
			final long B[] = new long[Y];
			final long C[] = new long[Z];

			for (int i = 0; i < X; i++) {
				A[i] = s.nextLong();
			}
			for (int i = 0; i < Y; i++) {
				B[i] = s.nextLong();
			}
			for (int i = 0; i < Z; i++) {
				C[i] = s.nextLong();
			}

			List<Long> rank = new ArrayList<>(X * Y * Z);
			for (int x = 0; x < X; x++) {
				for (int y = 0; y < Y; y++) {
					for (int z = 0; z < Z; z++) {
						rank.add(A[x] + B[y] + C[z]);
					}
				}
			}
			Collections.sort(rank, Comparator.reverseOrder());
			rank.stream().limit(K).forEach(System.out::println);
		}
	}
}
