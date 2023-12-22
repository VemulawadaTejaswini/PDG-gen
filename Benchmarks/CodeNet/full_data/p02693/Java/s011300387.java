
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int K = scan.nextInt();
		int A = scan.nextInt();
		int B = scan.nextInt();

		if (A % K == 0) {

			System.out.println("OK");

		} else if ((K - A % K) + A < B) {

			System.out.println("OK");

		} else {

			System.out.println("NG");

		}

		System.out.println("K=" + K);
		System.out.println("A=" + A);
		System.out.println("B=" + B);
		scan.close();
	}
}
