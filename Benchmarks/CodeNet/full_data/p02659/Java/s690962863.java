import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		double n = stdIn.nextDouble();
		double m = stdIn.nextDouble();

		System.out.println((long)(n*m));

		stdIn.close();
	}
}
