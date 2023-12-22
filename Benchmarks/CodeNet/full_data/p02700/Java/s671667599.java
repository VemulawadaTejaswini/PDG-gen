import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int D = scan.nextInt();

		while (true) {
			C = atk(B, C);
			if (C <= 0) {
				System.out.println("Yes");
				break;
			} else {
				A = atk(D, A);
				if (A <= 0) {
					System.out.println("No");
					break;
				}
			}
		}


	}

	public static int atk(int atk, int hp) {

		hp -= atk;

		return hp;
	}

}

