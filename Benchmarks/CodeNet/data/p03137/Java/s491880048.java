import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int N = sc.nextInt();
		final int M = sc.nextInt();
		sc.nextLine();

		if (N >= M) {
			System.out.println("0");
			return;
		}

		final int[] Xs = new int[M];
		int min = Integer.MAX_VALUE;
		int max = -1;
		for (int i = 0; i < M; i++) {
			final int X = sc.nextInt();
			Xs[i] = X;

			if (X > max) {
				max = X;
			}

			if (X < min) {
				min = X;
			}
		}

		Arrays.sort(Xs);

		final Map<Integer, Integer> dist = new HashMap<>();
		for (int i = 0; i < M - 1; i++) {
			dist.put(i, Math.abs(Xs[i + 1] - Xs[i]));
		}
		List<Map.Entry<Integer, Integer>> sortedDist = dist.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(new Comparator<Integer>() {

					@Override
					public int compare(Integer arg0, Integer arg1) {
						return Integer.compare(arg1, arg0);
					}

				})).collect(Collectors.toList());

		final int[] pos = new int[N];
		pos[0] = Xs[0];

		for (int i = 1; i < N; i++) {
			final Map.Entry<Integer, Integer> e = sortedDist.get(i - 1);
			pos[i] = Xs[e.getKey() + 1];
		}

		Arrays.sort(pos);
		
		int posCounter = 0;
		int currentStone = pos[0];
		int op = 0;
		for (int i = 0; i < M; i++) {
			final int X = Xs[i];
			if (X == currentStone) {
				continue;
			}

			if (posCounter == N - 1) {
				op += X - currentStone;
				currentStone = X;
			} else {
				final int rightStone = pos[posCounter + 1];
				if (X >= rightStone) {
					posCounter++;
					op += X - rightStone;
					currentStone = X;
				} else {
					op += X - currentStone;
					currentStone = X;
				}
			}
		}

		System.out.println(op);
	}

}