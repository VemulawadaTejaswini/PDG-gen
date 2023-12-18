import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n;
		int bits = 0;

		try (Scanner scanner = new Scanner(System.in)) {
			n = scanner.nextInt();

			for (int i = 0; i < n; i++) {
				bits |= scanner.nextInt();
			}
		}

		System.out.println(Integer.numberOfTrailingZeros(bits));
	}
}