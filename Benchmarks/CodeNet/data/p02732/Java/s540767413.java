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
		int max = 0;
		List<Integer> balls = new ArrayList<>();
		Map<Integer, Long> size = new HashMap<>();
		Set<Integer> contain = new HashSet<>();
		for (int i = 0; i < N; i++) {
			int num = scanner.nextInt();
			balls.add(num);
			contain.add(num);
			try {
				size.put(num, size.get(num) + 1);
			}
			catch (NullPointerException e) {
				size.put(num, 1l);
			}
			if (num > max) max = num;
		}

		for (int i = 0; i < N; i++) {
			int removed = balls.get(i);
			int answer = 0;

			for (int k : contain) {
				if (!size.containsKey(k)) continue;
				long sizeI = k == removed ? size.get(k) - 1 : size.get(k);

				answer += (sizeI * (sizeI - 1l)) / 2;
			}

			System.out.println(answer);
		}
	}
}
