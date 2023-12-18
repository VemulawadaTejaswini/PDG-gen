import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final int K = s.nextInt();
			final int X = s.nextInt();

			for (int i = X - K + 1; i < X + K - 1; i++) {
				System.out.print(i);
				System.out.print(' ');
			}
			System.out.println(X + K - 1);
		}
	}
}
