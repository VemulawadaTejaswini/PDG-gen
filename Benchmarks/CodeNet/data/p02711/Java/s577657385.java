import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		boolean flg = false;

		while (true) {
			if (A % 10 == 7) {
				flg = true;
				break;
			}
			A = A / 10;
			if (A == 0) {
				break;
			}
		}

		if (flg) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}