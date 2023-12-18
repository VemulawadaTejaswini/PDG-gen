import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		if (n / 1000 == 0) {
			System.out.println("ABC");
		} else {
			System.out.println("ABD");
		}
	}

}
