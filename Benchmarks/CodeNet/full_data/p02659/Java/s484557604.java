import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		double b = scan.nextDouble();

		long ans = 0;
		ans = (long) Math.floor((double) a * b);
		System.out.println(ans);

		scan.close();

	}

}
