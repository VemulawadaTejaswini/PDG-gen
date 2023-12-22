import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		
		scanner.close();
		
		if (A < 30) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}

}
