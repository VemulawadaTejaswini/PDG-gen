import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long r = scan.nextLong();
		
		double men = 2 * r * Math.PI;
		double en = r * r * Math.PI;
		
		System.out.println(String.format("%f %f", men, en));
	}
}