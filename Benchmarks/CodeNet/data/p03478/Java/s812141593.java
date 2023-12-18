import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int N = scanner.nextInt();
			int min = scanner.nextInt();
			int max = scanner.nextInt();

			// 下限：上限をみて値をセットする
			List<Integer> integers = new ArrayList<Integer>();
			for (int i = 1; i <= N; i++) {
				int ans = 0;
				int tmp = i;
				for (; tmp > 0;) {
					ans += tmp % 10;
					tmp /= 10;
				}
				if (min <= ans && ans <= max) {
					integers.add(i);
				}
			}
			// 合計
			System.out.println(integers.stream().mapToInt(t -> t).sum());
		}
	}
}