import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double r = scanner.nextDouble();

		System.out.println(r*r*Math.PI + " " + 2*r*Math.PI);
	}
}

