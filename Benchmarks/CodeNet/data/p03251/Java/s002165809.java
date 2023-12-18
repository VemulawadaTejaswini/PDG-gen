import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N, n, M, m, X, Y;
		int xmax = -101, ymin = 101;
		N = scanner.nextInt();
		M = scanner.nextInt();
		X = scanner.nextInt();
		Y = scanner.nextInt();

		for (n = 0; n < N; n++) {
			int num = scanner.nextInt();
			xmax = Math.max(xmax, num);
		}
		for (m = 0; m < M; m++) {
			int num = scanner.nextInt();
			ymin = Math.min(ymin, num);
		}
		
		scanner.close();
		
		if (xmax <= ymin && X < xmax && ymin <= Y) {
			System.out.println("No War");
		} else {
			System.out.println("War");
		}

	}
}
