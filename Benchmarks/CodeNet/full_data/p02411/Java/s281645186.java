import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		int m, f, r;

		Scanner stdIn = new Scanner(System.in);

		boolean flag = true;
		while (flag) {
			m = stdIn.nextInt();
			f = stdIn.nextInt();
			r = stdIn.nextInt();

			if (m == -1 || f == -1) {
				System.out.println("F");
			} else if (m + f >= 80) {
				System.out.println("A");
			} else if (m + f >= 65) {
				System.out.println("B");
			} else if (m + f >= 50) {
				System.out.println("C");
			} else if (m + f >= 30 || r >= 50) {
				System.out.println("D");
			} else if (m + f + r <= -3) {
				flag = false;
			} else {
				System.out.println("F");
			}
		}
	}
}