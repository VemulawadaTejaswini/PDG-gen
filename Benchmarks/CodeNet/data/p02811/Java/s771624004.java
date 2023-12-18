import java.util.Scanner;

class Main{

	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	int k = scanner.nextInt();
	int x = scanner.nextInt();

		String y = "yes";
		String n = "no";
		if (500 * k >= x) {

			System.out.println(y);
		} else {
			System.out.println(n);
		}
	}
}



