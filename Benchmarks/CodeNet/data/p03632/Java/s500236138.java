import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt(), D = sc.nextInt();
		sc.close();
		if (B > D) {
			B = D;
		}
		if (A > C) {
			C = A;
		}
		if (B - C > 0) {
			System.out.println(B - C);
		} else {
			System.out.println(0);
		}
	}
}
