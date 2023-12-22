import java.util.Scanner;

class Main {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		int y = scan.nextInt();
		int d;
		int e;
		if (x >= y) {
			d = x % y;
			e = y;
		} else {
			d = y % x;
			e = x;
		}
		if (d == 0) {
			System.out.println(e);
		} else {
			for (int i = d; d > 0; i--) {
				if (d % i == 0 && e % i == 0) {
					System.out.println(i);
					break;
				}
			}
		}
		scan.close();

	}

}
