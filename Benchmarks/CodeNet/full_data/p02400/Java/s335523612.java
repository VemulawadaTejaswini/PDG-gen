import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double r = Double.parseDouble(in.next());
		final double pi = Math.PI;
		double area = Math.pow(r, 2) * pi;
		double length = 2 * r * pi;
		
		System.out.println(String.format("%.6f", area) + " " + String.format("%.6f", length));
	}
}	
