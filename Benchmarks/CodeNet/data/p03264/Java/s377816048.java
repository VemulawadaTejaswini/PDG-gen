import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();

		if (k % 2 == 0) {
			System.out.println((k / 2) * (k / 2));
		} else {
			System.out.println((k - 1) / 2 * (k + 1) / 2);
		}
		scan.close();

	}

}
