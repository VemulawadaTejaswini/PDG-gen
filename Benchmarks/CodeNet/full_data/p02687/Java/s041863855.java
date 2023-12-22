import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();
		
		scanner.close();
		
		if ("ABC".equals(name)) {
			System.out.println("ARC");
		} else {
			System.out.println("ABC");
		}
	}

}
