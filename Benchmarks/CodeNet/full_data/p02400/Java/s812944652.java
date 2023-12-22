import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		double PI = Math.PI;
		scan.close();

		if (0 < r && r < 10000) {
			double res1 = (double) (r * r * PI);
			double res2 = (double) (2 * r * PI);

			System.out.printf("%.6f",res1);
			System.out.print(" ");
			System.out.printf("%.6f",res2);
		}

	}

}