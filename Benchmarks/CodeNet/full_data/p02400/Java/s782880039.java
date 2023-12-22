import java.util.Scanner;
public class Main{

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		double r = sc.nextDouble();
		double e = 2 * r * Math.PI;
		double m = r * r * Math.PI;

		System.out.println(String.format("%.6f", m) + " "  + String.format("%.6f", e));
	}
}
