import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double N = sc.nextDouble();
		double K = sc.nextDouble();
		double log = Math.log(N) / Math.log(K);
		
		if (Math.floor(log) == log) {
			System.out.println((int)(log + 1));
		} else {
			System.out.println((int)Math.ceil(log));
		}

	}
}