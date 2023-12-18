import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Main main = new Main();

		try (Scanner scan = new Scanner(System.in)) {
			main.changingACharchter(scan);
		}
	}

	private void changingACharchter(Scanner scan) {
		int k = scan.nextInt();

		List<String> s = Arrays.asList("A", "B", "C");

		s.set(k - 1, s.get(k - 1).toLowerCase());
		s.stream().forEachOrdered(System.out::print);
		System.out.println();

	}

}
