import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < 5; i++) {
				list.add(scanner.nextInt());
				scanner.nextLine();
			}
			list.sort((x, y) -> {
				int xremain = x % 10;
				int yremain = y % 10;
				return ((yremain == 0) ? 10 : yremain) - ((xremain == 0) ? 10 : xremain);
			});
			int sum = 0;
			for (int i = 0; i < list.size() - 1; i++) {
				sum += ceiling(list.get(i));
			}
			sum += list.get(list.size() - 1);
			System.out.println(sum);
		}
	}

	private static int ceiling(int integer) {
		int remain = integer % 10;
		if (remain == 0) {
			return integer;
		} else {
			return integer + 10 - remain;
		}
	}
}