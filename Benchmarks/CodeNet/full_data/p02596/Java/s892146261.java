import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static final List<Integer> LIST = Arrays.asList(2, 5);

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int k = scanner.nextInt();
			for (Integer integer : LIST) {
				if (0 == (k % integer)) {
					System.out.println(-1);
					return;
				}
			}
			System.out.println(getResult(k));
		}
	}

	private static int getResult(int k) {
		if (0 == (k % 7)) {
			k /= 7;
		}
		long now = 1L;
		for (int i = 1;; i++) {
			if (0 == (now % k)) {
				return i;
			}
			now = (now * 10 + 1) % k;
		}
	}
}
