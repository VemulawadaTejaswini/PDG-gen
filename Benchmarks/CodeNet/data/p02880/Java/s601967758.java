import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		for (int a = 1; a < 10; a++) {
			for (int b = 1; b < 10; b++) {

				if (a * b == n) {
					System.out.println("Yes");
				return;
				}
			}
		}
		System.out.println("No");
	}
}