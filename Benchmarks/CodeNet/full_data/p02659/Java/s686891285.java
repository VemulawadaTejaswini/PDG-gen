import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		double b = scan.nextDouble();

		long lAns = 0;
		double dAns = (double) a * b;
		lAns = (long) Math.floor(dAns);
		System.out.println(lAns);

		scan.close();

	}

}
