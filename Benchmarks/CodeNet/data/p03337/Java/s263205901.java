

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int AB = A + B;
		if (A * B >= AB) {
			System.out.println(A - B);
		} else if (A - B >= AB) {
			System.out.println(A * B);
		} else {
			System.out.println(AB);
		}
	}
}
