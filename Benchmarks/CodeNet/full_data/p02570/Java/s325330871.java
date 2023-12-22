import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double D = scanner.nextDouble();
		double T = scanner.nextDouble();
		double S = scanner.nextDouble();
		
		scanner.close();
		
		double tmp = D / S;
		
		if (tmp <= T) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
