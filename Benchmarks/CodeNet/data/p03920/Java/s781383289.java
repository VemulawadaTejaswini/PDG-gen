import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// standard input
		int numProblems = sc.nextInt();

		// solve
		long sum = 0;
		int max = 0;
		for (int i = 1; i <= numProblems; i++) {
			sum += i;
			if (sum >= numProblems) {
				max = i;
				break;
			}
		}

		// standard output
		for (int i = max; i > 0; i--) {
			if (i <= numProblems) {
				System.out.println(i);
				numProblems -= i;
			}

			if (numProblems <= 0) {
				break;
			}
		}
	}
}
