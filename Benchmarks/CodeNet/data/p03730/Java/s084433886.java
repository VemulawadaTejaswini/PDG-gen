import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B, C;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();

		for (int i = 0; i <= B * A; i += A) {
			if(i % B == C) {
				System.out.print("YES");
				return;
			}
		}
		System.out.print("NO");
	}
}
