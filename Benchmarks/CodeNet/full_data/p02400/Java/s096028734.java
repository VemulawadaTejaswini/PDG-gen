import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();

		double area = (double) r * r * Math.PI;
		double length = (double) 2 * r * Math.PI;

		System.out.printf(String.format("%.5f",area) + " " + String.format("%.5f",length));
	}

}