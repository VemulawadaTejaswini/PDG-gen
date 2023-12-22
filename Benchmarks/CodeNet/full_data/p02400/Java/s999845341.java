import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);

		double r = stdIn.nextDouble();
		
		double s = r * r * Math.PI;
		double l = 2 * r * Math.PI;
		System.out.printf("%.10f %.10f\n", s, l);
	}
}

