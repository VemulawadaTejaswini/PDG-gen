import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		double area = r * r * Math.PI;
		double circumference = 2 * r * Math.PI;
		String output = String.format("%6f %6f", area, circumference);
		System.out.println(output);
	}

}