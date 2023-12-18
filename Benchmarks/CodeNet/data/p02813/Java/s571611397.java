import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			List<Integer> p = new ArrayList<>(), q = new ArrayList<>();
			IntStream.range(0, n).forEach(i -> p.add(scanner.nextInt() - 1));
			IntStream.range(0, n).forEach(i -> q.add(scanner.nextInt() - 1));
			System.out.println(Math.abs(calcOrder(p) - calcOrder(q)));
		}
	}

	private static int calcOrder(List<Integer> p) {
		if (p.size() == 1) {
			return 0;
		}
		return p.get(0) * frac(p.size() - 1) + calcOrder(subList(p));
	}

	private static List<Integer> subList(List<Integer> list) {
		int first = list.get(0);
		list.remove(0);
		for (int i = 0; i < list.size(); i++) {
			Integer number = list.get(i);
			list.set(i, (number > first) ? number - 1 : number);
		}
		return list;
	}

	private static int frac(int n) {
		if (n <= 0) {
			return 1;
		}
		int result = 1;
		for (int i = 2; i <= n; i++) {
			result *= i;
		}
		return result;
	}
}
