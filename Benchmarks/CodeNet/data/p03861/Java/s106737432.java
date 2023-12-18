import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long numA = scan.nextLong();
		long numB = scan.nextLong();
		long numX = scan.nextLong();

		System.out.println((numB / numX) - ((numA - 1L) / numX));
	}
}
