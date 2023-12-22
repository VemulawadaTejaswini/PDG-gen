import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		double r = stdIn.nextDouble();
		
		double s = r * r * Math.PI;
		double c = 2 * r * Math.PI;
		
		System.out.println(String.format("%.6f",s) + " " + String.format("%.6f", c));
	}
}