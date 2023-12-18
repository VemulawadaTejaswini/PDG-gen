import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			List<Integer> list = IntStream.range(0, 5).mapToObj(i -> {
				int number = scanner.nextInt();
				scanner.nextLine();
				return number;
			}).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
			list.sort((x, y) -> {
				int xremain = x % 10;
				int yremain = y % 10;
				return ((yremain == 0) ? 10 : yremain) - ((xremain == 0) ? 10 : xremain);
			});
			int sum = list.stream().limit(list.size() - 1).mapToInt(i -> ceiling(i)).sum();
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
