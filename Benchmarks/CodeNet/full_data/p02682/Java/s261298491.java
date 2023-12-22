import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();

		int total = 0;
		if (K <= A) {
			total = K;
		} else if (K <= A + B) {
			total = A;
		} else {
			total = 2 * A + B - K;
		}

		System.out.println(total);

		sc.close();

	}
}
