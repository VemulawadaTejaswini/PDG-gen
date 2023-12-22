import java.io.IOException;
import java.util.Scanner;

class Main {

	public static void main(String[] args) throws IOException {

		Scanner scane = new Scanner(System.in);

		double px1 = scane.nextDouble();

		double py1 = scane.nextDouble();

		double p2x1 = scane.nextDouble();

		double p2y1 = scane.nextDouble();


		System.out.println(Math.hypot((p2x1-px1),(p2y1-py1)));

	}

}