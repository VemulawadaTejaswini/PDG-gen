import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<Integer>();

		int N = scanner.nextInt();
		for (int i = 0 ; i < N ; i++) {
			a.add(scanner.nextInt());
		}
		double average = (double)a.stream().mapToInt(x -> x).sum() / N;

		System.out.println(calc_cost(a, (int)Math.round(average)));

		scanner.close();
	}

	private static int calc_cost(ArrayList<Integer> a, int rewrite_num) {
		return a.stream().map(i -> (int)Math.pow((rewrite_num - i), 2))
				.mapToInt(x -> x)
				.sum();
	}
}
