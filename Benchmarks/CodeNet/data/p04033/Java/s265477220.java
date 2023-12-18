import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int a, b, m = 1;
		a = scanner.nextInt();
		b = scanner.nextInt();
		m = IntStream.rangeClosed(a, b).parallel().reduce(1, (c, d) -> c * d);
		if(m == 0) System.out.println("Zero");
		else if(m > 0) System.out.println("Positive");
		else System.out.println("Negative");
	}
}
