
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("/");
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		LocalDate date = LocalDate.of(year, month, day);
		if(date.isBefore(LocalDate.of(2019, 5, 1))) {
			System.out.println("Heisei");
		} else {
			System.out.println("TBD");
		}
	}
}
