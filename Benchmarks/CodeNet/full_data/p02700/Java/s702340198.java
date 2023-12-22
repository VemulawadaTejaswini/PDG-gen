import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();

		int A_mod = A / D;
		if (A % D > 0) {
			A_mod++;
		}

		int B_mod = C / B;
		if (C % B > 0) {
			B_mod++;
		}

		if (A_mod >= B_mod) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}
}