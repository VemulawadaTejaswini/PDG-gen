import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int r = scan.nextInt();

		double face  =r * r * 3.14;


		System.out.println((int)(face / 3.14));
	}
}