import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		List<Integer> balls = new ArrayList<>();
		Map<Integer, Long> sizes = new HashMap<>();
		Set<Integer> contain = new HashSet<>();
		long temp = 0;

		for (int i = 0; i < N; i++) {
			int num = scanner.nextInt();
			balls.add(num);
			contain.add(num);
			try {
				sizes.put(num, sizes.get(num) + 1);
			}
			catch (NullPointerException e) {
				sizes.put(num, 1l);
			}
		}

		for (int k : contain) {
			temp += sizes.get(k) * (sizes.get(k) - 1) / 2;
		}

		for (int i = 0; i < N; i++) {
			int ball = balls.get(i);
			long answer = 0;
			long size = sizes.get(ball);

			answer = temp - (size * (size - 1) / 2) + ((size - 1) * (size - 2) / 2);
			System.out.println(answer);
		}
	}
}