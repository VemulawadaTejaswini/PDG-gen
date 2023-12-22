import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double a = scan.nextLong();
		double b = scan.nextDouble();

		double ans = 0;
		ans = Math.floor(a * b);
		System.out.println(ans);

		scan.close();

	}

}
