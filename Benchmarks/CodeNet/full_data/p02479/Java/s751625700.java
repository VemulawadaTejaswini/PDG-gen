import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner A = new Scanner(System.in);
		double r = A.nextDouble();
		double pi = Math.PI;
		double S = r * r * pi;
		double l = 2 * r * pi;
		System.out.printf("%f %f", S, l);

	}
}