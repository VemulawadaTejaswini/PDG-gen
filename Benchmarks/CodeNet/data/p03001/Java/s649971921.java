import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final int W = s.nextInt();
			final int H = s.nextInt();
			final int x = s.nextInt();
			final int y = s.nextInt();

			System.out.printf("%f %d%n", W * H / 2.0,
					(W == 1 || W == x * 2) && (H == 1 || H == y * 2) ? 1 : 0);
		}
	}
}
