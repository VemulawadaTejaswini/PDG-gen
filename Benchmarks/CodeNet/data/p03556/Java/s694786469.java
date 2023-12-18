import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int square = 0;
		int max = 1;

		for (int i = 1; i < N; i++) {
			square = i * i;
			if (square > N) {
				break;
			}
			max = square;
		}
		System.out.println(max);
	}

}
