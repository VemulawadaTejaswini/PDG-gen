import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Double a = scanner.nextDouble();
		
		Double b = scanner.nextDouble();
		
		Double c = scanner.nextDouble();
		
		scanner.close();
		
		Double ab = Math.sqrt(a) + Math.sqrt(b);
		
		if (ab < Math.sqrt(c)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
