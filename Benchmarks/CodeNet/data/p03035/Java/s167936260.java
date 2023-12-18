import java.util.Scanner;

public class FerrisWheel {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		int price = scan.nextInt();
		int payment = 0;

		if (price % 2 == 0) {
			if (age >= 13) {
				payment = price;
			} else if (age >= 12 || age <= 6) {
				payment = price / 2;
			} else if (age <= 5) {
				payment = 0;
			}
			System.out.println(payment);
		}
	}
}
