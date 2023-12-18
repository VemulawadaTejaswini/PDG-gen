
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();

		boolean flag = false;

		if (A == B && B != C) {
			flag = true;
		}
		if (B == C && C != A) {
			flag = true;
		}
		if (A == C && B != A) {
			flag = true;
		}

		if (flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}
