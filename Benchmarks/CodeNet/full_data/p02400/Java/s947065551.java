import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double r = scanner.nextDouble();
		
		System.out.print(String.format("%.6f", r * r * Math.PI) + " " + String.format("%.6f", 2 * r * Math.PI));
	}
} 

