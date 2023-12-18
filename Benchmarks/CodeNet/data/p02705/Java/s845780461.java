import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double r = scanner.nextDouble();
		
		scanner.close();
		
		System.out.println(r * 6.28);
	}

}
