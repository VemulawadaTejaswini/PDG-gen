import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		if (B > A && D > C) {
			System.out.println(A + C);
		} else if (A > B && D > C) {
			System.out.println(B + C);
		} else if (A > B && C > D) {
			System.out.println(B + D);
		} else if (B > A && C > D) {
			System.out.println(A + D);
		}
	}
}