
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long a = scan.nextLong();
		double b = scan.nextDouble();

		System.out.println((long)Math.floor(a*b));

		scan.close();

	}

}
