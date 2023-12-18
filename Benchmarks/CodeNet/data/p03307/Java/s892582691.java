import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		if (n % 2 == 0) {
			System.out.println(n);
		} else {
			System.out.println(n * 2);
		}
	}

}
