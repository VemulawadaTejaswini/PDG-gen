import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = sc.nextInt();
		int i = n % 10;

		if (i == 2 || i == 4 || i == 5 || i == 7 || i == 9) {
			System.out.println("hon");
		} else if (i == 0 || i == 1 || i == 6 || i == 8) {
			System.out.println("pon");
		} else {
			System.out.println("bon");
		}
	}
}