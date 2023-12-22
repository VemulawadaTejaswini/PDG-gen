import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r, s, c;
		r = sc.nextFloat();
		s = r * r * Math.PI;
		c = 2 * r * Math.PI;
		System.out.printf("%f %f", s, c);
	}
}