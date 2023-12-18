import java.util.HashSet;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashSet<Integer> numbers = new HashSet<Integer>();
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			numbers.add(scan.nextInt());
		}
		System.out.println(numbers.size());

	}

}
