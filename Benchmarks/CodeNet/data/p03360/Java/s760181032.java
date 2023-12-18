import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int K = scan.nextInt();

		int max = A, other1 = B, other2 = C;
		if (B > A && C <= A) {
			max = B;
			other1 = A;
		} else if (C > A && B <= A) {
			max = C;
			other2 = A;
		}

		for (int i = 0; i < K; i++) {
			max *= 2;
		}

		System.out.println(other1 + other2 + max);

	}

}
