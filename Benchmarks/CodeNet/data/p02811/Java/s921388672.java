import java.util.Scanner;

class A500Yen {

	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	long k = scanner.nextLong();
	long x = scanner.nextLong();

		String y = "yes";
		String n = "no";
		if (500 * k >= x) {

			System.out.println(y);
		} else {
			System.out.println(n);
		}
	}
}



