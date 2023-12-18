
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int a;
		int b;
		try (Scanner scanner = new Scanner(System.in)) {
			a = scanner.nextInt();
			b = scanner.nextInt();
		}

		if ((a & b & 1) == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}
}