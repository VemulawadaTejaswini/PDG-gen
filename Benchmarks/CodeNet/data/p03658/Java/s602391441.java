import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int N = scanner.nextInt();
			int K = scanner.nextInt();

			// input
			List<Integer> integers = new ArrayList<Integer>();
			for (int i = 0; i < N; i++) {
				integers.add(scanner.nextInt());
			}

			// 長さの最大値
			System.out.println(bouMaxLength(integers, K));
		}
	}

	private static int bouMaxLength(List<Integer> integers, int bouNum) {
		int sum = 0;
		Collections.sort(integers, Comparator.reverseOrder());

		for (int i = 0; i < bouNum; i++) {
			sum += integers.get(i);
		}
		return sum;
	}
}