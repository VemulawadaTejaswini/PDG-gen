import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long H = scanner.nextInt();
		long W = scanner.nextInt();

		long x = H * W;
		long y = 0;

		if (x % 2 == 0) {
			y = x / 2;
		} else {
			y = x / 2 + 1;
		}

		System.out.println(y);
	}
}
