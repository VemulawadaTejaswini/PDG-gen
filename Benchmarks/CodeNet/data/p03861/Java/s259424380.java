import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long numA = scan.nextInt();
		long numB = scan.nextInt();
		long numX = scan.nextInt();

		System.out.println((numB / numX) - ((numA - 1) / numX));
	}
}
