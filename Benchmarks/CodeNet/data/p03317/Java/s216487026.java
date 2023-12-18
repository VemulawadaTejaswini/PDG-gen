import java.util.Scanner;

/*
 * AtCoder Beginner Contest 101 C
 */
public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double N = scanner.nextDouble();
		double K = scanner.nextDouble();

		int count = (int) Math.ceil((N - 1) / (K - 1));
		System.out.println(count);

		scanner.close();
	}

}
